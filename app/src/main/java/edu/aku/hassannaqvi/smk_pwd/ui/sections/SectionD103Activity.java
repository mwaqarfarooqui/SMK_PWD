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
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionD103Binding;

import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;

public class SectionD103Activity extends AppCompatActivity {

    ActivitySectionD103Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_d103);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {
        radioGroupListener(bi.da2211, bi.da2211a, bi.da2212);
        radioGroupListener(bi.da2221, bi.da2221a, bi.da2222);
        radioGroupListener(bi.da2231, bi.da2231a, bi.da2232);
        radioGroupListener(bi.da2241, bi.da2241a, bi.da2242);
        radioGroupListener(bi.da2251, bi.da2251a, bi.da2252);
        radioGroupListener(bi.da2261, bi.da2261a, bi.da2262);
        radioGroupListener(bi.da2271, bi.da2271a, bi.da2272);
        radioGroupListener(bi.da2281, bi.da2281a, bi.da2282);

        radioGroupListener(bi.da2311, bi.da2311a, bi.da2312);
        radioGroupListener(bi.da2321, bi.da2321a, bi.da2322);
        radioGroupListener(bi.da2331, bi.da2331a, bi.da2332);
        radioGroupListener(bi.da2341, bi.da2341a, bi.da2342);

        radioGroupListener(bi.da2411, bi.da2411a, bi.da2412);
        radioGroupListener(bi.da2421, bi.da2421a, bi.da2422);
        radioGroupListener(bi.da2431, bi.da2431a, bi.da2432);
        radioGroupListener(bi.da2441, bi.da2441a, bi.da2442);
        radioGroupListener(bi.da2451, bi.da2451a, bi.da2452);
        radioGroupListener(bi.da2461, bi.da2461a, bi.da2462);
        radioGroupListener(bi.da2471, bi.da2471a, bi.da2472);
        radioGroupListener(bi.da2481, bi.da2481a, bi.da2482);
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
            startActivity(new Intent(this, SectionD2Activity.class));
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
