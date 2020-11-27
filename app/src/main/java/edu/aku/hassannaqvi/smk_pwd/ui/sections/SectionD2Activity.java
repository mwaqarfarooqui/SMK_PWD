package edu.aku.hassannaqvi.smk_pwd.ui.sections;

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

import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.contracts.FormsContract;
import edu.aku.hassannaqvi.smk_pwd.core.DatabaseHelper;
import edu.aku.hassannaqvi.smk_pwd.core.MainApp;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionD2Binding;
import edu.aku.hassannaqvi.smk_pwd.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_pwd.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;

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

      /*  bi.d0201.setOnCheckedChangeListener(((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvd0202);
            Clear.clearAllFields(bi.cvd0203);
        }));*/
        bi.da14.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.da14b.getId()) {
                Clear.clearAllFields(bi.fldGrpskipda14b);
            }
        }));
        bi.da19aa.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.da19aab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda19af);
            }
        }));
        bi.da19ba.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.da19bab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda19bf);
            }
        }));
        bi.da19ca.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.da19cab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda19cf);
            }
        }));
        bi.da19da.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da19dab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda19df);
            }
        }));
        bi.da20aa.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da20aab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda20af);
            }
        }));
        bi.da20ba.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da20bab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda20bf);
            }
        }));
        bi.da20ca.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da20cab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda20cf);
            }
        }));
        bi.da20da.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da20dab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda20df);
            }
        }));
        bi.da20ea.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da20eab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda20ef);
            }
        }));
        bi.da20fa.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da20fab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda20ff);
            }
        }));
        bi.da20ga.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da20gab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda20gf);
            }
        }));
        bi.da21aa.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da21aab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda21af);
            }
        }));
        bi.da21ba.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da21bab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda21bf);
            }
        }));
        bi.da21ca.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da21cab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda21cf);
            }
        }));
        bi.da21da.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da21dab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda21df);
            }
        }));
        bi.da22aa.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da22aab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda22af);
            }
        }));
        bi.da22ba.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da22bab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda22bf);
            }
        }));
        bi.da22ca.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da22cab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda22cf);
            }
        }));
        bi.da22da.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da22dab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda22df);
            }
        }));
        bi.da22ea.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da22eab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda22ef);
            }
        }));
        bi.da22fa.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da22fab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda22ff);
            }
        }));
        bi.da22ga.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da22gab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda22gf);
            }
        }));
        bi.da22ha.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da22hab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda22hf);
            }
        }));
        bi.da23aa.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da23aab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda23af);
            }
        }));
        bi.da23ba.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da23bab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda23bf);
            }
        }));
        bi.da23ca.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da23cab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda23cf);
            }
        }));
        bi.da23da.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da23dab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda23df);
            }
        }));
        bi.da24aa.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da24aab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda24af);
            }
        }));
        bi.da24ba.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da24bab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda24bf);
            }
        }));
        bi.da24ca.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da24cab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda24cf);
            }
        }));
        bi.da24da.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da24dab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda24df);
            }
        }));
        bi.da24ea.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da24eab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda24ef);
            }
        }));
        bi.da24fa.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da24fab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda24ff);
            }
        }));
        bi.da24ga.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da24gab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda24gf);
            }
        }));
        bi.da24ha.setOnCheckedChangeListener(((radioGroup,i)->{
            if (i == bi.da24hab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVda24hf);
            }
        }));



    }


    private boolean UpdateDB() {
       /* DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SD, MainApp.fc.getsD());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show();
            return false;
        }*/return false;
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
            startActivity(new Intent(this, SectionD3Activity.class));
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
