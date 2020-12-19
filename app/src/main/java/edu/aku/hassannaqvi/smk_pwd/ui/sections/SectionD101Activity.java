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

import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.contracts.FormsContract;
import edu.aku.hassannaqvi.smk_pwd.core.DatabaseHelper;
import edu.aku.hassannaqvi.smk_pwd.core.MainApp;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionD101Binding;

import static edu.aku.hassannaqvi.smk_pwd.core.MainApp.form;


public class SectionD101Activity extends AppCompatActivity {

    ActivitySectionD101Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_d101);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {
        rgListener(bi.da01, bi.da01b, bi.llda01b);
    }


    public void rgListener(@NotNull RadioGroup rg, RadioButton rb, ViewGroup vg) {
        rg.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(vg);
            vg.setVisibility(View.VISIBLE);
            if (i == rb.getId()) vg.setVisibility(View.GONE);
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


        form.setDa01(bi.da01a.isChecked() ? "1"
                : bi.da01b.isChecked() ? "2"
                : "-1");

        form.setDa02(bi.da02a.isChecked() ? "1"
                : bi.da02b.isChecked() ? "2"
                : "-1");

        form.setDa03(bi.da03a.isChecked() ? "1"
                : bi.da03b.isChecked() ? "2"
                :  "-1");

        form.setDa04( bi.da04a.isChecked() ? "1"
                : bi.da04b.isChecked() ? "2"
                :  "-1");

        form.setDa05( bi.da05a.isChecked() ? "1"
                : bi.da05b.isChecked() ? "2"
                :  "-1");

        form.setDa06( bi.da06a.isChecked() ? "1"
                : bi.da06b.isChecked() ? "2"
                :  "-1");

        form.setDa07( bi.da07a.isChecked() ? "1"
                : bi.da07b.isChecked() ? "2"
                :  "-1");

        form.setDa08( bi.da08a.isChecked() ? "1"
                : bi.da08b.isChecked() ? "2"
                :  "-1");

        form.setDa09( bi.da09a.isChecked() ? "1"
                : bi.da09b.isChecked() ? "2"
                :  "-1");

        form.setDa10( bi.da10a.isChecked() ? "1"
                : bi.da10b.isChecked() ? "2"
                :  "-1");

        form.setDa11( bi.da11a.isChecked() ? "1"
                : bi.da11b.isChecked() ? "2"
                :  "-1");

        form.setDa12( bi.da12a.isChecked() ? "1"
                : bi.da12b.isChecked() ? "2"
                : bi.da12c.isChecked() ? "3"
                :  "-1");

        form.setDa13( bi.da13a.isChecked() ? "1"
                : bi.da13b.isChecked() ? "2"
                : bi.da13c.isChecked() ? "3"
                :  "-1");

    }


    public void BtnContinue() {
        if (!formValidation()) return;
        SaveDraft();
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, bi.da01b.isChecked() ? SectionD2Activity.class : SectionD102Activity.class));
        }
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

}
