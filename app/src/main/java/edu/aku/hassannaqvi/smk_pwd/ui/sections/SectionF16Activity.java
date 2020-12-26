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
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionF16Binding;
import edu.aku.hassannaqvi.smk_pwd.ui.other.SectionMainActivity;

import static edu.aku.hassannaqvi.smk_pwd.core.MainApp.form;
import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;

public class SectionF16Activity extends AppCompatActivity {

    ActivitySectionF16Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_f16);
        bi.setCallback(this);
        setupSkips();
    }

    private void setupSkips() {
        radioGroupListener(bi.fp01a, bi.fp01ab, new ViewGroup[]{bi.cvfp01b, bi.cvfp01c, bi.cvfp01e});
        radioGroupListener(bi.fp01c, bi.fp01cb, new ViewGroup[]{bi.cvfp01e});
    }


    public void radioGroupListener(@NotNull RadioGroup rg, RadioButton rb, ViewGroup[] vgArray) {
        rg.setOnCheckedChangeListener((radioGroup, i) -> {
            for (ViewGroup vg : vgArray) {
                Clear.clearAllFields(vg);
                vg.setVisibility(View.VISIBLE);
                if (i == rb.getId()) vg.setVisibility(View.GONE);
            }
        });
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

        form.setFp01a(bi.fp01aa.isChecked() ? "1"
                : bi.fp01ab.isChecked() ? "2"
                : "-1");

        form.setFp01b(bi.fp01ba.isChecked() ? "1"
                : bi.fp01bb.isChecked() ? "2"
                : "-1");

        form.setFp01c(bi.fp01ca.isChecked() ? "1"
                : bi.fp01cb.isChecked() ? "2"
                : "-1");

        form.setFp01dd(bi.fp01dd.getText().toString().trim().length() > 0 ? bi.fp01dd.getText().toString() : "-1");
        form.setFp01dm(bi.fp01dm.getText().toString().trim().length() > 0 ? bi.fp01dm.getText().toString() : "-1");

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
        openSectionMainActivity(this, "F");
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }


}