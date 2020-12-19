package edu.aku.hassannaqvi.smk_pwd.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.contracts.FormsContract;
import edu.aku.hassannaqvi.smk_pwd.core.DatabaseHelper;
import edu.aku.hassannaqvi.smk_pwd.core.MainApp;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionH3Binding;
import edu.aku.hassannaqvi.smk_pwd.ui.other.SectionMainActivity;

import static edu.aku.hassannaqvi.smk_pwd.core.MainApp.form;
import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;


public class SectionH3Activity extends AppCompatActivity {

    ActivitySectionH3Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_h3);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {
        radioGroup(bi.hc01);
        radioGroup(bi.hc02);
        radioGroup(bi.hc03);
        radioGroup(bi.hc04);
        radioGroup(bi.hc05);
    }


    public void radioGroup(RadioGroup grp) {
        grp.setOnCheckedChangeListener(((radioGroup, i) -> {
            Clear.clearAllFields(bi.fldGrpCVhc06);
            bi.fldGrpCVhc06.setVisibility(View.GONE);
            if (bi.hc01b.isChecked()
                    || bi.hc02b.isChecked()
                    || bi.hc03b.isChecked()
                    || bi.hc04b.isChecked()
                    || bi.hc05b.isChecked()) {
                Clear.clearAllFields(bi.fldGrpCVhc06);
                bi.fldGrpCVhc06.setVisibility(View.VISIBLE);
            }
        }));

    }


    public void BtnContinue() {
        if (!formValidation()) return;
        SaveDraft();
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, SectionMainActivity.class));
        }
    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SH, form.sHtoString());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private void SaveDraft() {

        form.setHc01(bi.hc01a.isChecked() ? "1"
                : bi.hc01b.isChecked() ? "2"
                : "-1");

        form.setHc02(bi.hc02a.isChecked() ? "1"
                : bi.hc02b.isChecked() ? "2"
                : "-1");

        form.setHc03(bi.hc03a.isChecked() ? "1"
                : bi.hc03b.isChecked() ? "2"
                :  "-1");

        form.setHc04( bi.hc04a.isChecked() ? "1"
                : bi.hc04b.isChecked() ? "2"
                :  "-1");

        form.setHc05( bi.hc05a.isChecked() ? "1"
                : bi.hc05b.isChecked() ? "2"
                :  "-1");

        form.setHc06a(bi.hc06a.isChecked() ? "1" : "-1");

        form.setHc06b(bi.hc06b.isChecked() ? "2" : "-1");

        form.setHc06c(bi.hc06c.isChecked() ? "3" : "-1");

        form.setHc06d(bi.hc06d.isChecked() ? "4" : "-1");

        form.setHc06e(bi.hc06e.isChecked() ? "5" : "-1");

        form.setHc0696(bi.hc0696.isChecked() ? "96" : "-1");

        form.setHc0696x(bi.hc0696x.getText().toString());

    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    public void BtnEnd() {
        openSectionMainActivity(this, "H");
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }


}
