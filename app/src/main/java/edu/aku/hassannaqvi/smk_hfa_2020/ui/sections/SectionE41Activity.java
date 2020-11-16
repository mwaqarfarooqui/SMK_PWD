package edu.aku.hassannaqvi.smk_hfa_2020.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivitySectionE41Binding;
import edu.aku.hassannaqvi.smk_hfa_2020.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_hfa_2020.utils.UtilKt.openSectionMainActivity;

public class SectionE41Activity extends AppCompatActivity {

    ActivitySectionE41Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_e41);
        bi.setCallback(this);
        setupSkips();
    }

    private void setupSkips() {

        bi.e41.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.e41b.getId()) {
                Clear.clearAllFields(bi.llgrpsec01);
            }
        }));

    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SE, fc.getsE());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("e41", bi.e41a.isChecked() ? "1"
                : bi.e41b.isChecked() ? "2"
                : "-1");

        json.put("e42", bi.e42a.isChecked() ? "1"
                : bi.e42b.isChecked() ? "2"
                : "-1");

        json.put("e43a", bi.e43aa.isChecked() ? "1"
                : bi.e43ab.isChecked() ? "2"
                : bi.e43ac.isChecked() ? "3"
                : bi.e43ad.isChecked() ? "4"
                :  "-1");

        json.put("e43b", bi.e43ba.isChecked() ? "1"
                : bi.e43bb.isChecked() ? "2"
                : bi.e43bc.isChecked() ? "3"
                : bi.e43bd.isChecked() ? "4"
                :  "-1");

        json.put("e43c", bi.e43ca.isChecked() ? "1"
                : bi.e43cb.isChecked() ? "2"
                : bi.e43cc.isChecked() ? "3"
                : bi.e43cd.isChecked() ? "4"
                :  "-1");

        json.put("e44",  "-1");

        json.put("e44a", bi.e44aa.isChecked() ? "1"
                : bi.e44ab.isChecked() ? "2"
                : bi.e44ac.isChecked() ? "3"
                : bi.e44ad.isChecked() ? "4"
                :  "-1");

        json.put("e44b", bi.e44ba.isChecked() ? "1"
                : bi.e44bb.isChecked() ? "2"
                : bi.e44bc.isChecked() ? "3"
                : bi.e44bd.isChecked() ? "4"
                :  "-1");

        json.put("e44c", bi.e44ca.isChecked() ? "1"
                : bi.e44cb.isChecked() ? "2"
                : bi.e44cc.isChecked() ? "3"
                : bi.e44cd.isChecked() ? "4"
                :  "-1");

        json.put("e44d", bi.e44da.isChecked() ? "1"
                : bi.e44db.isChecked() ? "2"
                : bi.e44dc.isChecked() ? "3"
                : bi.e44dd.isChecked() ? "4"
                :  "-1");

        json.put("e44e", bi.e44ea.isChecked() ? "1"
                : bi.e44eb.isChecked() ? "2"
                : bi.e44ec.isChecked() ? "3"
                : bi.e44ed.isChecked() ? "4"
                :  "-1");

        json.put("e44f", bi.e44fa.isChecked() ? "1"
                : bi.e44fb.isChecked() ? "2"
                : bi.e44fc.isChecked() ? "3"
                : bi.e44fd.isChecked() ? "4"
                :  "-1");

        json.put("e44g", bi.e44ga.isChecked() ? "1"
                : bi.e44gb.isChecked() ? "2"
                : bi.e44gc.isChecked() ? "3"
                : bi.e44gd.isChecked() ? "4"
                :  "-1");

        json.put("e44h", bi.e44ha.isChecked() ? "1"
                : bi.e44hb.isChecked() ? "2"
                : bi.e44hc.isChecked() ? "3"
                : bi.e44hd.isChecked() ? "4"
                :  "-1");

        try {
            JSONObject json_merge = JSONUtils.mergeJSONObjects(new JSONObject(fc.getsE()), json);

            fc.setsE(String.valueOf(json_merge));

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
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
            startActivity(new Intent(this, bi.e41b.isChecked() ? SectionE5Activity.class : SectionE42Activity.class));
        }
    }


    public void BtnEnd() {
        openSectionMainActivity(this, "E");
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
