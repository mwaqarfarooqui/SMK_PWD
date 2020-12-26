package edu.aku.hassannaqvi.smk_pwd.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.jetbrains.annotations.NotNull;

import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.contracts.FormsContract;
import edu.aku.hassannaqvi.smk_pwd.core.DatabaseHelper;
import edu.aku.hassannaqvi.smk_pwd.core.MainApp;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionD2Binding;
import edu.aku.hassannaqvi.smk_pwd.ui.other.SectionMainActivity;

import static edu.aku.hassannaqvi.smk_pwd.core.MainApp.form;
import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;

/*import edu.aku.hassannaqvi.smk_pwd.contracts.FormsContract;
import edu.aku.hassannaqvi.smk_pwd.core.DatabaseHelper;
import edu.aku.hassannaqvi.smk_pwd.core.MainApp;*/
/*import edu.aku.hassannaqvi.smk_pwd.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_pwd.core.MainApp.fc;*/

public class SectionD2Activity extends AppCompatActivity {

    ActivitySectionD2Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_d2);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {
        rgListener(bi.db01, bi.db01b, bi.lldb01b);
        rgListener(bi.db13, bi.db13b, bi.lldb13b);
    }


    public void rgListener(@NotNull RadioGroup rg, RadioButton rb, ViewGroup vg) {
        rg.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(vg);
            vg.setVisibility(View.VISIBLE);
            if (i == rb.getId()) {
                vg.setVisibility(View.GONE);
            }
        });
    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SD, form.sDtoString());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private void SaveDraft() {

        form.setDb01(bi.db01a.isChecked() ? "1"
                : bi.db01b.isChecked() ? "2"
                : "-1");

        form.setDb02(bi.db02a.isChecked() ? "1"
                : bi.db02b.isChecked() ? "2"
                : "-1");

        form.setDb03(bi.db03a.isChecked() ? "1"
                : bi.db03b.isChecked() ? "2"
                : "-1");

        form.setDb04(bi.db04a.isChecked() ? "1"
                : bi.db04b.isChecked() ? "2"
                : "-1");

        form.setDb05(bi.db05a.isChecked() ? "1"
                : bi.db05b.isChecked() ? "2"
                : "-1");

        form.setDb06(bi.db06a.isChecked() ? "1"
                : bi.db06b.isChecked() ? "2"
                : "-1");

        form.setDb07(bi.db07a.isChecked() ? "1"
                : bi.db07b.isChecked() ? "2"
                : "-1");

        form.setDb08(bi.db08a.isChecked() ? "1"
                : bi.db08b.isChecked() ? "2"
                : "-1");

        form.setDb09(bi.db09a.isChecked() ? "1"
                : bi.db09b.isChecked() ? "2"
                : "-1");

        form.setDb10(bi.db10a.isChecked() ? "1"
                : bi.db10b.isChecked() ? "2"
                : "-1");

        form.setDb11(bi.db11a.isChecked() ? "1"
                : bi.db11b.isChecked() ? "2"
                : "-1");

        form.setDb12(bi.db12a.isChecked() ? "1"
                : bi.db12b.isChecked() ? "2"
                : bi.db12c.isChecked() ? "3"
                : "-1");

        form.setDb13(bi.db13a.isChecked() ? "1"
                : bi.db13b.isChecked() ? "2"
                : "-1");

        form.setDb14(bi.db14.getText().toString().trim().isEmpty() ? "-1" : bi.db14.getText().toString());

        form.setDb15(bi.db15.getText().toString().trim().isEmpty() ? "-1" : bi.db15.getText().toString());

        form.setDb16(bi.db16a.isChecked() ? "1"
                : bi.db1696.isChecked() ? "96"
                : "-1");

        form.setDb1696x(bi.db1696x.getText().toString().trim().isEmpty() ? "-1" : bi.db1696x.getText().toString());


        /*try {
            JSONObject json_merge = JSONUtils.mergeJSONObjects(new JSONObject(fc.getsD()), json);

            fc.setsD(String.valueOf(json_merge));

        } catch (JSONException e) {
            e.printStackTrace();
        }*/


    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    public void BtnContinue() {
        if (!formValidation()) return;
        SaveDraft();
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, SectionMainActivity.class));
        }
    }


    public void BtnEnd() {
        openSectionMainActivity(this, "D");
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
