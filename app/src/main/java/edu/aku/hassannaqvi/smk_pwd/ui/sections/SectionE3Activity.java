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
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionE3Binding;
import edu.aku.hassannaqvi.smk_pwd.ui.other.SectionMainActivity;

import static edu.aku.hassannaqvi.smk_pwd.core.MainApp.form;
import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;

public class SectionE3Activity extends AppCompatActivity {

    ActivitySectionE3Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_e3);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {
        rgListener(bi.ec01a, bi.ec01y, bi.cvec02s);
        rgListener(bi.ec03a, bi.ec03y, bi.cvec04s);
        rgListener(bi.ec05a, bi.ec05y, bi.cvec06s);
        rgListener(bi.ec07a, bi.ec07y, bi.cvec08s);
        rgListener(bi.ec09a, bi.ec09y, bi.cvec10s);
        rgListener(bi.ec11a, bi.ec11y, bi.cvec12s);
    }


    public void rgListener(@NotNull RadioGroup rg, RadioButton rb, ViewGroup vg) {
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
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SE, form.sEtoString());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private void SaveDraft() {

        form.setEc01a(bi.ec01y.isChecked() ? "1"
                : bi.ec01n.isChecked() ? "2"
                : "-1");

        form.setEc02d(bi.ec02d.getText().toString().trim().isEmpty() ? "-1" : bi.ec02d.getText().toString());
        form.setEc02m(bi.ec02m.getText().toString().trim().isEmpty() ? "-1" : bi.ec02m.getText().toString());

        form.setEc03a(bi.ec03y.isChecked() ? "1"
                : bi.ec03n.isChecked() ? "2"
                : "-1");

        form.setEc04d(bi.ec04d.getText().toString().trim().isEmpty() ? "-1" : bi.ec04d.getText().toString());
        form.setEc04m(bi.ec04m.getText().toString().trim().isEmpty() ? "-1" : bi.ec04m.getText().toString());

        form.setEc05a(bi.ec05y.isChecked() ? "1"
                : bi.ec05n.isChecked() ? "2"
                : "-1");

        form.setEc06d(bi.ec06d.getText().toString().trim().isEmpty() ? "-1" : bi.ec06d.getText().toString());
        form.setEc06m(bi.ec06m.getText().toString().trim().isEmpty() ? "-1" : bi.ec06m.getText().toString());

        form.setEc07a(bi.ec07y.isChecked() ? "1"
                : bi.ec07n.isChecked() ? "2"
                : "-1");

        form.setEc08d(bi.ec08d.getText().toString().trim().isEmpty() ? "-1" : bi.ec08d.getText().toString());
        form.setEc08m(bi.ec08m.getText().toString().trim().isEmpty() ? "-1" : bi.ec08m.getText().toString());

        form.setEc09a(bi.ec09y.isChecked() ? "1"
                : bi.ec09n.isChecked() ? "2"
                : "-1");

        form.setEc10d(bi.ec10d.getText().toString().trim().isEmpty() ? "-1" : bi.ec10d.getText().toString());
        form.setEc10m(bi.ec10m.getText().toString().trim().isEmpty() ? "-1" : bi.ec10m.getText().toString());

        form.setEc11a(bi.ec11y.isChecked() ? "1"
                : bi.ec11n.isChecked() ? "2"
                : "-1");

        form.setEc12d(bi.ec12d.getText().toString().trim().isEmpty() ? "-1" : bi.ec12d.getText().toString());
        form.setEc12m(bi.ec12m.getText().toString().trim().isEmpty() ? "-1" : bi.ec12m.getText().toString());

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
        openSectionMainActivity(this, "E");
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

}
