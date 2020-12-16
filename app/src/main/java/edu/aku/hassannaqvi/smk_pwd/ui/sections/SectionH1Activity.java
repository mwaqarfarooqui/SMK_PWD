package edu.aku.hassannaqvi.smk_pwd.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionH1Binding;

public class SectionH1Activity extends AppCompatActivity {

    ActivitySectionH1Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_h1);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {
        radioGroup(bi.ha01);
        radioGroup(bi.ha02);
        radioGroup(bi.ha03);
        radioGroup(bi.ha04);
        radioGroup(bi.ha05);
        radioGroup(bi.ha06);
        radioGroup(bi.ha07);
        radioGroup(bi.ha08);
        radioGroup(bi.ha09);
        radioGroup(bi.ha10);
        radioGroup(bi.ha11);
        radioGroup(bi.ha12);
        radioGroup(bi.ha13);
    }


    public void radioGroup(RadioGroup grp) {
        grp.setOnCheckedChangeListener(((radioGroup, i) -> {
            Clear.clearAllFields(bi.fldGrpCVha14);
            bi.fldGrpCVha14.setVisibility(View.GONE);
            if (bi.ha01b.isChecked() || bi.ha02b.isChecked() || bi.ha03b.isChecked()
                    || bi.ha04b.isChecked() || bi.ha05b.isChecked() || bi.ha06b.isChecked()
                    || bi.ha07b.isChecked() || bi.ha08b.isChecked() || bi.ha09b.isChecked()
                    || bi.ha10b.isChecked() || bi.ha11b.isChecked() || bi.ha12b.isChecked()
                    || bi.ha13b.isChecked()) {
                Clear.clearAllFields(bi.fldGrpCVha14);
                bi.fldGrpCVha14.setVisibility(View.VISIBLE);
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
            startActivity(new Intent(this, SectionH2Activity.class));
        }
    }


    private boolean UpdateDB() {
        /*DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SH, MainApp.fc.getsH());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show();
            return false;
        }*/
        return true;
    }


    private void SaveDraft() throws JSONException {


        /*form.setHa01( bi.ha01a.isChecked() ? "1"
                : bi.ha01b.isChecked() ? "2"
                :  "-1");

        form.setHa02( bi.ha02a.isChecked() ? "1"
                : bi.ha02b.isChecked() ? "2"
                :  "-1");

        form.setHa03( bi.ha03a.isChecked() ? "1"
                : bi.ha03b.isChecked() ? "2"
                :  "-1");

        form.setHa04( bi.ha04a.isChecked() ? "1"
                : bi.ha04b.isChecked() ? "2"
                :  "-1");

        form.setHa05( bi.ha05a.isChecked() ? "1"
                : bi.ha05b.isChecked() ? "2"
                :  "-1");

        form.setHa06( bi.ha06a.isChecked() ? "1"
                : bi.ha06b.isChecked() ? "2"
                :  "-1");

        form.setHa07( bi.ha07a.isChecked() ? "1"
                : bi.ha07b.isChecked() ? "2"
                :  "-1");

        form.setHa08( bi.ha08a.isChecked() ? "1"
                : bi.ha08b.isChecked() ? "2"
                :  "-1");

        form.setHa09( bi.ha09a.isChecked() ? "1"
                : bi.ha09b.isChecked() ? "2"
                :  "-1");

        form.setHa10( bi.ha10a.isChecked() ? "1"
                : bi.ha10b.isChecked() ? "2"
                :  "-1");

        form.setHa11( bi.ha11a.isChecked() ? "1"
                : bi.ha11b.isChecked() ? "2"
                :  "-1");

        form.setHa12( bi.ha12a.isChecked() ? "1"
                : bi.ha12b.isChecked() ? "2"
                :  "-1");

        form.setHa13( bi.ha13a.isChecked() ? "1"
                : bi.ha13b.isChecked() ? "2"
                :  "-1");

        form.setHa14a(bi.ha14a.isChecked() ? "1" : "-1");

        form.setHa14b(bi.ha14b.isChecked() ? "2" : "-1");

        form.setHa14c(bi.ha14c.isChecked() ? "3" : "-1");

        form.setHa14d(bi.ha14d.isChecked() ? "4" : "-1");

        form.setHa14e(bi.ha14e.isChecked() ? "5" : "-1");

        form.setHa14f(bi.ha14f.isChecked() ? "6" : "-1");

        form.setHa1496(bi.ha1496.isChecked() ? "96" : "-1");

        form.setHa1496x(bi.ha1496x.getText().toString());*/

    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

}
