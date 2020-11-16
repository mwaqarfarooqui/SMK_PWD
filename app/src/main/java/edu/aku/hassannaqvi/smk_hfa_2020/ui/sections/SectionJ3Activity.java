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
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivitySectionJ3Binding;
import edu.aku.hassannaqvi.smk_hfa_2020.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_hfa_2020.utils.UtilKt.openSectionMainActivity;

public class SectionJ3Activity extends AppCompatActivity {

    ActivitySectionJ3Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_j3);
        bi.setCallback(this);
        setupSkips();
    }

    private void setupSkips() {
        radioGroup(bi.j31);
        radioGroup(bi.j32);
        radioGroup(bi.j33);
        radioGroup(bi.j34);
        radioGroup(bi.j35);
        radioGroup(bi.j36a);
        radioGroup(bi.j36b);
        radioGroup(bi.j36c);
        radioGroup(bi.j36d);
        radioGroup(bi.j36e);
        radioGroup(bi.j36f);
        radioGroup(bi.j36g);
        radioGroup(bi.j36h);
    }


    public void radioGroup(RadioGroup grp) {

        grp.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (bi.j31b.isChecked() || bi.j32b.isChecked() || bi.j33b.isChecked()
                    || bi.j34b.isChecked() || bi.j35b.isChecked() || bi.j36ab.isChecked()
                    || bi.j36bb.isChecked() || bi.j36cb.isChecked() || bi.j36db.isChecked()
                    || bi.j36eb.isChecked() || bi.j36fb.isChecked() || bi.j36gb.isChecked() || bi.j36hb.isChecked()) {
                Clear.clearAllFields(bi.fldGrpCVj37);
                bi.fldGrpCVj37.setVisibility(View.VISIBLE);
            } else {
                Clear.clearAllFields(bi.fldGrpCVj37);
                bi.fldGrpCVj37.setVisibility(View.GONE);
            }
        }));
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
            startActivity(new Intent(this, SectionJ4Activity.class));
        }
    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SJ, MainApp.fc.getsJ());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("j31", bi.j31a.isChecked() ? "1"
                : bi.j31b.isChecked() ? "2"
                : "-1");

        json.put("j32", bi.j32a.isChecked() ? "1"
                : bi.j32b.isChecked() ? "2"
                : "-1");

        json.put("j33", bi.j33a.isChecked() ? "1"
                : bi.j33b.isChecked() ? "2"
                : "-1");

        json.put("j34", bi.j34a.isChecked() ? "1"
                : bi.j34b.isChecked() ? "2"
                : "-1");

        json.put("j35", bi.j35a.isChecked() ? "1"
                : bi.j35b.isChecked() ? "2"
                : "-1");

        json.put("j36a", bi.j36aa.isChecked() ? "1"
                : bi.j36ab.isChecked() ? "2"
                : "-1");

        json.put("j36b", bi.j36ba.isChecked() ? "1"
                : bi.j36bb.isChecked() ? "2"
                : "-1");

        json.put("j36c", bi.j36ca.isChecked() ? "1"
                : bi.j36cb.isChecked() ? "2"
                : "-1");

        json.put("j36d", bi.j36da.isChecked() ? "1"
                : bi.j36db.isChecked() ? "2"
                : "-1");

        json.put("j36e", bi.j36ea.isChecked() ? "1"
                : bi.j36eb.isChecked() ? "2"
                : "-1");

        json.put("j36f", bi.j36fa.isChecked() ? "1"
                : bi.j36fb.isChecked() ? "2"
                : "-1");

        json.put("j36g", bi.j36ga.isChecked() ? "1"
                : bi.j36gb.isChecked() ? "2"
                : "-1");

        json.put("j36h", bi.j36ha.isChecked() ? "1"
                : bi.j36hb.isChecked() ? "2"
                : "-1");

        json.put("j37a", bi.j37a.isChecked() ? "1" : "-1");
        json.put("j37b", bi.j37b.isChecked() ? "2" : "-1");
        json.put("j37c", bi.j37c.isChecked() ? "3" : "-1");
        json.put("j37d", bi.j37d.isChecked() ? "4" : "-1");
        json.put("j37e", bi.j37e.isChecked() ? "5" : "-1");
        json.put("j37f", bi.j37f.isChecked() ? "6" : "-1");
        json.put("j37x", bi.j37x.isChecked() ? "96" : "-1");
        json.put("j37xx", bi.j37xx.getText().toString().trim().length() > 0 ? bi.j37xx.getText().toString() : "-1");

        try {
            JSONObject json_merge = JSONUtils.mergeJSONObjects(new JSONObject(fc.getsJ()), json);

            fc.setsJ(String.valueOf(json_merge));

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    public void BtnEnd() {
        openSectionMainActivity(this, "J");
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }


    public void showTooltip(@NotNull View view) {
        if (view.getId() != View.NO_ID) {
            String package_name = getApplicationContext().getPackageName();
            String infoid = view.getResources().getResourceName(view.getId()).replace(package_name + ":id/q_", "");
            int stringRes = this.getResources().getIdentifier(infoid + "_info", "string", getApplicationContext().getPackageName());
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
