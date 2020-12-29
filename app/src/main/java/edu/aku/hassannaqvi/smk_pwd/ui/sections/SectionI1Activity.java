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
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionI1Binding;

import static edu.aku.hassannaqvi.smk_pwd.core.MainApp.form;


public class SectionI1Activity extends AppCompatActivity {

    ActivitySectionI1Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_i1);
        bi.setCallback(this);
        setupSkips();
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
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SI, form.sItoString());
        if (updcount == 1) {
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

        form.setIa01(bi.ia01a.isChecked() ? "1"
                : bi.ia01b.isChecked() ? "2"
                : bi.ia01c.isChecked() ? "3"
                : "-1");

        form.setIa02(bi.ia02a.isChecked() ? "1"
                : bi.ia02b.isChecked() ? "2"
                : bi.ia02c.isChecked() ? "3"
                : "-1");

        form.setIa03(bi.ia03a.isChecked() ? "1"
                : bi.ia03b.isChecked() ? "2"
                : "-1");

        form.setIa04(bi.ia04a.isChecked() ? "1"
                : bi.ia04b.isChecked() ? "2"
                : "-1");

        form.setIa05(bi.ia05a.isChecked() ? "1"
                : bi.ia05b.isChecked() ? "2"
                : bi.ia05c.isChecked() ? "3"
                : bi.ia05d.isChecked() ? "4"
                : "-1");

        form.setIa06(bi.ia06a.isChecked() ? "1"
                : bi.ia06b.isChecked() ? "2"
                : "-1");

        form.setIa07(bi.ia07a.isChecked() ? "1"
                : bi.ia07b.isChecked() ? "2"
                : "-1");

    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


}
