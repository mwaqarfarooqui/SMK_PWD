package edu.aku.hassannaqvi.smk_hfa_2020.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.smk_hfa_2020.R;
import edu.aku.hassannaqvi.smk_hfa_2020.contracts.FormsContract;
import edu.aku.hassannaqvi.smk_hfa_2020.core.DatabaseHelper;
import edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp;
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivitySectionJ5Binding;
import edu.aku.hassannaqvi.smk_hfa_2020.ui.other.SectionMainActivity;
import edu.aku.hassannaqvi.smk_hfa_2020.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_hfa_2020.utils.UtilKt.openSectionMainActivity;

public class SectionJ5Activity extends AppCompatActivity {

    ActivitySectionJ5Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_j5);
        bi.setCallback(this);
        setupSkips();
    }

    private void setupSkips() {
        radioGroup(bi.j500a);
        radioGroup(bi.j501);
        radioGroup(bi.j502);
        radioGroup(bi.j503);
        radioGroup(bi.j504);
        radioGroup(bi.j505);
    }


    public void radioGroup(RadioGroup grp) {

        grp.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (bi.j500ab.isChecked() || bi.j501b.isChecked() || bi.j502b.isChecked()
                    || bi.j503b.isChecked() || bi.j504b.isChecked() || bi.j505b.isChecked()) {
                Clear.clearAllFields(bi.fldGrpCVj506);
                bi.fldGrpCVj506.setVisibility(View.VISIBLE);
            } else {
                Clear.clearAllFields(bi.fldGrpCVj506);
                bi.fldGrpCVj506.setVisibility(View.GONE);
            }
        }));
    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SJ, fc.getsJ());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("j50a", bi.j50a.getText().toString().trim().length() > 0 ? bi.j50a.getText().toString() : "-1");
        json.put("j50b", bi.j50b.getText().toString().trim().length() > 0 ? bi.j50b.getText().toString() : "-1");

        json.put("j500a", bi.j500aa.isChecked() ? "1"
                : bi.j500ab.isChecked() ? "2"
                : "-1");

        json.put("j501", bi.j501a.isChecked() ? "1"
                : bi.j501b.isChecked() ? "2"
                : "-1");

        json.put("j502", bi.j502a.isChecked() ? "1"
                : bi.j502b.isChecked() ? "2"
                :  "-1");

        json.put("j503", bi.j503a.isChecked() ? "1"
                : bi.j503b.isChecked() ? "2"
                :  "-1");

        json.put("j504", bi.j504a.isChecked() ? "1"
                : bi.j504b.isChecked() ? "2"
                :  "-1");

        json.put("j505", bi.j505a.isChecked() ? "1"
                : bi.j505b.isChecked() ? "2"
                : "-1");

        json.put("j506a", bi.j506a.isChecked() ? "1" : "-1");
        json.put("j506b", bi.j506b.isChecked() ? "2" : "-1");
        json.put("j506c", bi.j506c.isChecked() ? "3" : "-1");
        json.put("j506d", bi.j506d.isChecked() ? "4" : "-1");
        json.put("j506e", bi.j506e.isChecked() ? "5" : "-1");
        json.put("j506x", bi.j506x.isChecked() ? "96" : "-1");
        json.put("j506xx", bi.j506xx.getText().toString().trim().length() > 0 ? bi.j506xx.getText().toString() : "-1");

        try {
            JSONObject json_merge = JSONUtils.mergeJSONObjects(new JSONObject(fc.getsJ()), json);

            fc.setsJ(String.valueOf(json_merge));

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }


    public void BtnContinue() {
        if (!formValidation()) return;
        try {
            SaveDraft();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, SectionMainActivity.class));
        }
    }


    public void BtnEnd() {
        openSectionMainActivity(this, "J");
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    public void showTooltip(@NotNull View view) {
        if (view.getId() != View.NO_ID) {
            String package_name = getApplicationContext().getPackageName();
            String infoid = view.getResources().getResourceName(view.getId()).replace(package_name + ":id/q_", "");
            int stringRes = this.getResources().getIdentifier(infoid + "_info", "string", getApplicationContext().getPackageName());
            //String infoText = (String) getResources().getText(stringRes);
            if (stringRes != 0) {
                String infoText = (String) getResources().getText(stringRes);

                new AlertDialog.Builder(this)
                        .setTitle("Info: " + infoid.toUpperCase())
                        .setMessage(infoText)
                        .setIcon(android.R.drawable.ic_dialog_info)
                        .show();
            } else {
                Toast.makeText(this, "No information available on this question.", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "No ID Associated with this question.", Toast.LENGTH_SHORT).show();

        }
    }

}