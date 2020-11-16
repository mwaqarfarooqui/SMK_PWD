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
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivitySectionE42Binding;
import edu.aku.hassannaqvi.smk_hfa_2020.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_hfa_2020.utils.UtilKt.openSectionMainActivity;


public class SectionE42Activity extends AppCompatActivity {

    ActivitySectionE42Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_e42);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {

        bi.e47d.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.e47dc.getId()) {
                Clear.clearAllFields(bi.fldGrpe447d);
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

        json.put("e45a", bi.e45aa.isChecked() ? "1"
                : bi.e45ab.isChecked() ? "2"
                : bi.e45ac.isChecked() ? "3"
                : bi.e45ad.isChecked() ? "4"
                :  "-1");

        json.put("e45b", bi.e45ba.isChecked() ? "1"
                : bi.e45bb.isChecked() ? "2"
                : bi.e45bc.isChecked() ? "3"
                : bi.e45bd.isChecked() ? "4"
                :  "-1");

        json.put("e45c", bi.e45ca.isChecked() ? "1"
                : bi.e45cb.isChecked() ? "2"
                : bi.e45cc.isChecked() ? "3"
                : bi.e45cd.isChecked() ? "4"
                :  "-1");

        json.put("e45d", bi.e45da.isChecked() ? "1"
                : bi.e45db.isChecked() ? "2"
                : bi.e45dc.isChecked() ? "3"
                : bi.e45dd.isChecked() ? "4"
                :  "-1");

        json.put("e45e", bi.e45ea.isChecked() ? "1"
                : bi.e45eb.isChecked() ? "2"
                : bi.e45ec.isChecked() ? "3"
                : bi.e45ed.isChecked() ? "4"
                :  "-1");

        json.put("e45f", bi.e45fa.isChecked() ? "1"
                : bi.e45fb.isChecked() ? "2"
                : bi.e45fc.isChecked() ? "3"
                : bi.e45fd.isChecked() ? "4"
                :  "-1");

        json.put("e45g", bi.e45ga.isChecked() ? "1"
                : bi.e45gb.isChecked() ? "2"
                : bi.e45gc.isChecked() ? "3"
                : bi.e45gd.isChecked() ? "4"
                :  "-1");

        json.put("e45h", bi.e45ha.isChecked() ? "1"
                : bi.e45hb.isChecked() ? "2"
                : bi.e45hc.isChecked() ? "3"
                : bi.e45hd.isChecked() ? "4"
                :  "-1");

        json.put("e46", bi.e46a.isChecked() ? "1"
                : bi.e46b.isChecked() ? "2"
                : bi.e46c.isChecked() ? "3"
                :  "-1");

    //    json.put("e47",  "-1");

        json.put("e47a", bi.e47aa.isChecked() ? "1"
                : bi.e47ab.isChecked() ? "2"
                : bi.e47ac.isChecked() ? "3"
                :  "-1");

        json.put("e47b", bi.e47ba.isChecked() ? "1"
                : bi.e47bb.isChecked() ? "2"
                : bi.e47bc.isChecked() ? "3"
                :  "-1");

        json.put("e47c", bi.e47ca.isChecked() ? "1"
                : bi.e47cb.isChecked() ? "2"
                : bi.e47cc.isChecked() ? "3"
                : "-1");

        json.put("e47d", bi.e47da.isChecked() ? "1"
                : bi.e47db.isChecked() ? "2"
                : bi.e47dc.isChecked() ? "3"
                : "-1");

        json.put("e48", bi.e48.getText().toString().trim().isEmpty() ? "-1" : bi.e48.getText().toString());

        json.put("e49", bi.e49a.isChecked() ? "1"
                : bi.e49x.isChecked() ? "96"
                : "-1");
        json.put("e49xx", bi.e49xx.getText().toString().trim().isEmpty() ? "-1" : bi.e49xx.getText().toString());

        json.put("e410a", bi.e410aa.isChecked() ? "1"
                : bi.e410ab.isChecked() ? "2"
                : bi.e410ac.isChecked() ? "3"
                : "-1");

        json.put("e410b", bi.e410ba.isChecked() ? "1"
                : bi.e410bb.isChecked() ? "2"
                : bi.e410bc.isChecked() ? "3"
                : "-1");

        json.put("e410c", bi.e410ca.isChecked() ? "1"
                : bi.e410cb.isChecked() ? "2"
                : bi.e410cc.isChecked() ? "3"
                :  "-1");

        json.put("e410d", bi.e410da.isChecked() ? "1"
                : bi.e410db.isChecked() ? "2"
                : bi.e410dc.isChecked() ? "3"
                :  "-1");

        json.put("e410e", bi.e410ea.isChecked() ? "1"
                : bi.e410eb.isChecked() ? "2"
                : bi.e410ec.isChecked() ? "3"
                :  "-1");

        json.put("e410f", bi.e410fa.isChecked() ? "1"
                : bi.e410fb.isChecked() ? "2"
                : bi.e410fc.isChecked() ? "3"
                :  "-1");

        json.put("e411", bi.e411a.isChecked() ? "1"
                : bi.e411b.isChecked() ? "2"
                : bi.e411c.isChecked() ? "3"
                : bi.e411d.isChecked() ? "4"
                :  "-1");

        json.put("e412a",bi.e412a.isChecked() ? "1" :"-1");
        json.put("e412b",bi.e412b.isChecked() ? "2" :"-1");
        json.put("e412c",bi.e412c.isChecked() ? "3" :"-1");
        json.put("e412d",bi.e412d.isChecked() ? "4" :"-1");

        json.put("e413", bi.e413a.isChecked() ? "1"
                : bi.e413b.isChecked() ? "2"
                :  "-1");

        json.put("e414", bi.e414a.isChecked() ? "1"
                : bi.e414b.isChecked() ? "2"
                : bi.e414c.isChecked() ? "3"
                :  "-1");

        json.put("e415", bi.e415a.isChecked() ? "1"
                : bi.e415b.isChecked() ? "2"
                : bi.e415c.isChecked() ? "3"
                :  "-1");

        json.put("e416", bi.e416a.isChecked() ? "1"
                : bi.e416b.isChecked() ? "2"
                : bi.e416c.isChecked() ? "3"
                : bi.e416d.isChecked() ? "4"
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
            startActivity(new Intent(this, SectionE5Activity.class));
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
