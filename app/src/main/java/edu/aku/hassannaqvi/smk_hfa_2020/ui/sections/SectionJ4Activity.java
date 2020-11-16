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
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivitySectionJ4Binding;
import edu.aku.hassannaqvi.smk_hfa_2020.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_hfa_2020.utils.UtilKt.openSectionMainActivity;

public class SectionJ4Activity extends AppCompatActivity {

    ActivitySectionJ4Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_j4);
        bi.setCallback(this);
        setupSkips();
    }

    private void setupSkips() {
        radioGroup(bi.j41);
        radioGroup(bi.j401);
        radioGroup(bi.j402);
        radioGroup(bi.j403);
        radioGroup(bi.j404);
        radioGroup(bi.j405);
        radioGroup(bi.j406);
    }


    public void radioGroup(RadioGroup grp) {

        grp.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (bi.j41b.isChecked() || bi.j401b.isChecked() || bi.j402b.isChecked()
                    || bi.j403b.isChecked() || bi.j404b.isChecked() || bi.j405b.isChecked() || bi.j406b.isChecked()) {
                Clear.clearAllFields(bi.fldGrpCVj407);
                bi.fldGrpCVj407.setVisibility(View.VISIBLE);
            } else {
                Clear.clearAllFields(bi.fldGrpCVj407);
                bi.fldGrpCVj407.setVisibility(View.GONE);
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

        json.put("j40a", bi.j40a.getText().toString().trim().length() > 0 ? bi.j40a.getText().toString() : "-1");
        json.put("j40b", bi.j40b.getText().toString().trim().length() > 0 ? bi.j40b.getText().toString() : "-1");

        json.put("j41", bi.j41a.isChecked() ? "1"
                : bi.j41b.isChecked() ? "2"
                : "-1");

        json.put("j401", bi.j401a.isChecked() ? "1"
                : bi.j401b.isChecked() ? "2"
                : "-1");

        json.put("j402", bi.j402a.isChecked() ? "1"
                : bi.j402b.isChecked() ? "2"
                : "-1");

        json.put("j403", bi.j403a.isChecked() ? "1"
                : bi.j403b.isChecked() ? "2"
                : "-1");

        json.put("j404", bi.j404a.isChecked() ? "1"
                : bi.j404b.isChecked() ? "2"
                : "-1");

        json.put("j405", bi.j405a.isChecked() ? "1"
                : bi.j405b.isChecked() ? "2"
                : "-1");

        json.put("j406", bi.j406a.isChecked() ? "1"
                : bi.j406b.isChecked() ? "2"
                : "-1");

        json.put("j407a", bi.j407a.isChecked() ? "1" : "-1");
        json.put("j407b", bi.j407b.isChecked() ? "2" : "-1");
        json.put("j407c", bi.j407c.isChecked() ? "3" : "-1");
        json.put("j407d", bi.j407d.isChecked() ? "4" : "-1");
        json.put("j407x", bi.j407x.isChecked() ? "96" : "-1");
        json.put("j407xx", bi.j407xx.getText().toString().trim().length() > 0 ? bi.j407xx.getText().toString() : "-1");

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
            startActivity(new Intent(this, SectionJ5Activity.class));
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
