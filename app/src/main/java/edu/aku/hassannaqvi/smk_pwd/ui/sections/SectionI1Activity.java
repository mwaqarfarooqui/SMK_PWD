package edu.aku.hassannaqvi.smk_pwd.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.jetbrains.annotations.NotNull;

import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.contracts.PatientsContract;
import edu.aku.hassannaqvi.smk_pwd.core.DatabaseHelper;
import edu.aku.hassannaqvi.smk_pwd.core.MainApp;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionI1Binding;
import edu.aku.hassannaqvi.smk_pwd.models.Patients;
import edu.aku.hassannaqvi.smk_pwd.ui.other.SectionMainActivity;

import static edu.aku.hassannaqvi.smk_pwd.core.MainApp.form;
import static edu.aku.hassannaqvi.smk_pwd.core.MainApp.psc;


public class SectionI1Activity extends AppCompatActivity {

    ActivitySectionI1Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_i1);
        bi.setCallback(this);
        setupSkips();
        setupContent();
    }


    private void setupContent() {
        psc = new Patients();
        bi.hfType.setText(getString(R.string.hf));
        bi.countG.setText(new StringBuilder("Count: ").append(SectionMainActivity.countG));
    }


    private void setupSkips() {
        radioGroupListener(bi.ia01, bi.ia01c, bi.llia01c);
    }


    public void radioGroupListener(@NotNull RadioGroup rg, RadioButton rb, ViewGroup vg) {
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
        long updcount = db.addPSC(psc);
        psc.set_ID(String.valueOf(updcount));
        if (updcount > 0) {
            psc.set_UID(psc.getDeviceID() + psc.get_ID());
            db.updatesPSCColumn(PatientsContract.PatientsTable.COLUMN_UID, psc.get_UID());
            db.updatesPSCColumn(PatientsContract.PatientsTable.COLUMN_UUID, form.get_UID());
            db.updatesPSCColumn(PatientsContract.PatientsTable.COLUMN_SG, psc.sItoString());
            return true;
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public void BtnContinue() {
        if (!formValidation()) return;
        SaveDraft();
        if (UpdateDB()) {
            startActivity(new Intent(this, SectionI2Activity.class));
            finish();
        }
    }


    private void SaveDraft() {

        psc.setSysdate(new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.getDefault()).format(new Date().getTime()));
        psc.setUsername(MainApp.userName);
        psc.setSerialno(String.valueOf(SectionMainActivity.countG));
        psc.setDeviceID(MainApp.appInfo.getDeviceID());
        psc.setDevicetagID(MainApp.appInfo.getTagName());
        psc.setAppversion(MainApp.appInfo.getAppVersion());
//        psc.setProvince(form.getProvince());
//        psc.setProvinceCode(form.getProvinceCode());
//        psc.setDistrict(form.getDistrict());
        psc.setDistrictCode(form.getDistrictCode());
        psc.setTehsil(form.getTehsil());
        psc.setTehsilCode(form.getTehsilCode());
        psc.setUc(form.getUc());
        psc.setUcCode(form.getUcCode());
        psc.setHf(form.getHf());
        psc.setHfCode(form.getHfCode());
        //MainApp.setGPS(this);

        psc.setIa01(bi.ia01a.isChecked() ? "1"
                : bi.ia01b.isChecked() ? "2"
                : bi.ia01c.isChecked() ? "3"
                : "-1");

        psc.setIa02(bi.ia02a.isChecked() ? "1"
                : bi.ia02b.isChecked() ? "2"
                : bi.ia02c.isChecked() ? "3"
                : "-1");

        psc.setIa03(bi.ia03a.isChecked() ? "1"
                : bi.ia03b.isChecked() ? "2"
                : "-1");

        psc.setIa04(bi.ia04a.isChecked() ? "1"
                : bi.ia04b.isChecked() ? "2"
                : "-1");

        psc.setIa05(bi.ia05a.isChecked() ? "1"
                : bi.ia05b.isChecked() ? "2"
                : bi.ia05c.isChecked() ? "3"
                : bi.ia05d.isChecked() ? "4"
                : "-1");

        psc.setIa06(bi.ia06a.isChecked() ? "1"
                : bi.ia06b.isChecked() ? "2"
                : "-1");

        psc.setIa07(bi.ia07a.isChecked() ? "1"
                : bi.ia07b.isChecked() ? "2"
                : "-1");

    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


}
