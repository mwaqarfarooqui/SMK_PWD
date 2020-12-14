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
import org.json.JSONException;

import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionD102Binding;

import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;

public class SectionD102Activity extends AppCompatActivity {

    ActivitySectionD102Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_d102);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {

        bi.da14.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.da14b.getId()) {
                Clear.clearAllFields(bi.llda14b);
            }
        }));

        radioGroupListener(bi.da1911, bi.da1911a, bi.da1912);
        radioGroupListener(bi.da1921, bi.da1921a, bi.da1922);
        radioGroupListener(bi.da1931, bi.da1931a, bi.da1932);
        radioGroupListener(bi.da1941, bi.da1941a, bi.da1942);
        radioGroupListener(bi.da1951, bi.da1951a, bi.da1952);

        radioGroupListener(bi.da2011, bi.da2011a, bi.da2012);
        radioGroupListener(bi.da2021, bi.da2021a, bi.da2022);
        radioGroupListener(bi.da2031, bi.da2031a, bi.da2032);
        radioGroupListener(bi.da2041, bi.da2041a, bi.da2042);
        radioGroupListener(bi.da2051, bi.da2051a, bi.da2052);
        radioGroupListener(bi.da2061, bi.da2061a, bi.da2062);
        radioGroupListener(bi.da2071, bi.da2071a, bi.da2072);

        radioGroupListener(bi.da2111, bi.da2111a, bi.da2112);
        radioGroupListener(bi.da2121, bi.da2121a, bi.da2122);
        radioGroupListener(bi.da2131, bi.da2131a, bi.da2132);
        radioGroupListener(bi.da2141, bi.da2141a, bi.da2142);
    }


    public void radioGroupListener(@NotNull RadioGroup rg, RadioButton rb, ViewGroup vg) {

        rg.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(vg, false);
            if (i == rb.getId()) {
                Clear.clearAllFields(vg, true);
            }
        });
    }


    private boolean UpdateDB() {
       /* DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SD, MainApp.fc.getsD());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show();
            return false;
        }*/
        return true;
    }


    private void SaveDraft() throws JSONException {

/*
        form.setDb01( bi.db01a.isChecked() ? "1"
                : bi.db01b.isChecked() ? "2"
                :  "-1");

        form.setDb02( bi.db02a.isChecked() ? "1"
                : bi.db02b.isChecked() ? "2"
                :  "-1");

        form.setDb03( bi.db03a.isChecked() ? "1"
                : bi.db03b.isChecked() ? "2"
                :  "-1");

        form.setDb04( bi.db04a.isChecked() ? "1"
                : bi.db04b.isChecked() ? "2"
                :  "-1");

        form.setDb05( bi.db05a.isChecked() ? "1"
                : bi.db05b.isChecked() ? "2"
                :  "-1");

        form.setDb06( bi.db06a.isChecked() ? "1"
                : bi.db06b.isChecked() ? "2"
                :  "-1");

        form.setDb07( bi.db07a.isChecked() ? "1"
                : bi.db07b.isChecked() ? "2"
                :  "-1");

        form.setDb08( bi.db08a.isChecked() ? "1"
                : bi.db08b.isChecked() ? "2"
                :  "-1");

        form.setDb09( bi.db09a.isChecked() ? "1"
                : bi.db09b.isChecked() ? "2"
                :  "-1");

        form.setDb10( bi.db10a.isChecked() ? "1"
                : bi.db10b.isChecked() ? "2"
                :  "-1");

        form.setDb11( bi.db11a.isChecked() ? "1"
                : bi.db11b.isChecked() ? "2"
                :  "-1");

        form.setDb12( bi.db12a.isChecked() ? "1"
                : bi.db12b.isChecked() ? "2"
                : bi.db12c.isChecked() ? "3"
                :  "-1");

        form.setDb13( bi.db13a.isChecked() ? "1"
                : bi.db13b.isChecked() ? "2"
                :  "-1");

        form.setDb14(bi.db14.getText().toString());

        form.setDb15(bi.db15.getText().toString());

        form.setDb16( bi.db16a.isChecked() ? "1"
                : bi.db1696.isChecked() ? "96"
                :  "-1");

        form.setDb1696x(bi.db1696x.getText().toString());*/

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
            startActivity(new Intent(this, SectionD103Activity.class));
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
