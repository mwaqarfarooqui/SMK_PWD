package edu.aku.hassannaqvi.smk_pwd.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.contracts.FormsContract;
import edu.aku.hassannaqvi.smk_pwd.core.DatabaseHelper;
import edu.aku.hassannaqvi.smk_pwd.core.MainApp;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionF1Binding;

import static edu.aku.hassannaqvi.smk_pwd.core.MainApp.form;

public class SectionF1Activity extends AppCompatActivity {

    ActivitySectionF1Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_f1);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {
    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SF, form.sFtoString());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private void SaveDraft() {
        form.setFam1m(bi.fam1m.getText().toString().trim().isEmpty() ? "-1" : bi.fam1m.getText().toString());
        form.setFam1y(bi.fam1y.getText().toString().trim().isEmpty() ? "-1" : bi.fam1y.getText().toString());
        form.setFam2m(bi.fam2m.getText().toString().trim().isEmpty() ? "-1" : bi.fam2m.getText().toString());
        form.setFam2y(bi.fam2y.getText().toString().trim().isEmpty() ? "-1" : bi.fam2y.getText().toString());
        form.setFam3m(bi.fam3m.getText().toString().trim().isEmpty() ? "-1" : bi.fam3m.getText().toString());
        form.setFam3y(bi.fam3y.getText().toString().trim().isEmpty() ? "-1" : bi.fam3y.getText().toString());
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    public void BtnContinue() {
        if (!formValidation()) return;
        SaveDraft();
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, SectionF2Activity.class));
        }
    }


}