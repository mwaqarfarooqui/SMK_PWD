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
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionC7Binding;
import edu.aku.hassannaqvi.smk_pwd.ui.other.SectionMainActivity;

import static edu.aku.hassannaqvi.smk_pwd.core.MainApp.form;
import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;

public class SectionC7Activity extends AppCompatActivity {

    ActivitySectionC7Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_c7);
        bi.setCallback(this);
        setupSkips();

    }


    private void setupSkips() {
        rgListener(bi.cg01, bi.cg01y, bi.cvcg02);
        rgListener(bi.cg03, bi.cg03y, bi.cvcg04);
        rgListener(bi.cg05, bi.cg05y, bi.cvcg06);
        rgListener(bi.cg07, bi.cg07y, bi.cvcg08);
        rgListener(bi.cg09, bi.cg09y, bi.cvcg10);
        rgListener(bi.cg11, bi.cg11y, bi.cvcg12);
        rgListener(bi.cg13, bi.cg13y, bi.cvcg14);
        rgListener(bi.cg15, bi.cg15y, bi.cvcg16);
        rgListener(bi.cg17, bi.cg17y, bi.cvcg18);
        rgListener(bi.cg19, bi.cg19y, bi.cvcg20);
        rgListener(bi.cg21, bi.cg21y, bi.cvcg22);
        rgListener(bi.cg23, bi.cg23y, bi.cvcg24);
        rgListener(bi.cg25, bi.cg25y, bi.cvcg26);
        rgListener(bi.cg27, bi.cg27y, bi.cvcg28);
        rgListener(bi.cg29, bi.cg29y, bi.cvcg30);
        rgListener(bi.cg31, bi.cg31y, bi.cvcg32);
        rgListener(bi.cg33, bi.cg33y, bi.cvcg34);
        rgListener(bi.cg35, bi.cg35y, bi.cvcg36);
        rgListener(bi.cg37, bi.cg37y, bi.cvcg38);
        rgListener(bi.cg39, bi.cg39y, bi.cvcg40);
        rgListener(bi.cg41, bi.cg41y, bi.cvcg42);
        rgListener(bi.cg43, bi.cg43y, bi.cvcg44);
        rgListener(bi.cg45, bi.cg45y, bi.cvcg46);
    }


    public void rgListener(@NotNull RadioGroup rg, RadioButton rb, ViewGroup vg) {
        rg.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(vg);
            vg.setVisibility(View.GONE);
            if (i == rb.getId()) vg.setVisibility(View.VISIBLE);
        });
    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SC, form.sCtoString());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private void SaveDraft() {

        form.setCg01(bi.cg01y.isChecked() ? "1"
                : bi.cg01n.isChecked() ? "2"
                : "-1");

        form.setCg02f(bi.cg02f.getText().toString().trim().isEmpty() ? "-1" : bi.cg02f.getText().toString());

        form.setCg03(bi.cg03y.isChecked() ? "1"
                : bi.cg03n.isChecked() ? "2"
                : "-1");

        form.setCg04f(bi.cg04f.getText().toString().trim().isEmpty() ? "-1" : bi.cg04f.getText().toString());

        form.setCg05(bi.cg05y.isChecked() ? "1"
                : bi.cg05n.isChecked() ? "2"
                : "-1");

        form.setCg06f(bi.cg06f.getText().toString().trim().isEmpty() ? "-1" : bi.cg06f.getText().toString());

        form.setCg07(bi.cg07y.isChecked() ? "1"
                : bi.cg07n.isChecked() ? "2"
                : "-1");

        form.setCg08f(bi.cg08f.getText().toString().trim().isEmpty() ? "-1" : bi.cg08f.getText().toString());

        form.setCg09(bi.cg09y.isChecked() ? "1"
                : bi.cg09n.isChecked() ? "2"
                : "-1");

        form.setCg10f(bi.cg10f.getText().toString().trim().isEmpty() ? "-1" : bi.cg10f.getText().toString());

        form.setCg11(bi.cg11y.isChecked() ? "1"
                : bi.cg11n.isChecked() ? "2"
                : "-1");

        form.setCg12f(bi.cg12f.getText().toString().trim().isEmpty() ? "-1" : bi.cg12f.getText().toString());

        form.setCg13(bi.cg13y.isChecked() ? "1"
                : bi.cg13n.isChecked() ? "2"
                : "-1");

        form.setCg14f(bi.cg14f.getText().toString().trim().isEmpty() ? "-1" : bi.cg14f.getText().toString());

        form.setCg15(bi.cg15y.isChecked() ? "1"
                : bi.cg15n.isChecked() ? "2"
                : "-1");

        form.setCg16f(bi.cg16f.getText().toString().trim().isEmpty() ? "-1" : bi.cg16f.getText().toString());

        form.setCg17(bi.cg17y.isChecked() ? "1"
                : bi.cg17n.isChecked() ? "2"
                : "-1");

        form.setCg18f(bi.cg18f.getText().toString().trim().isEmpty() ? "-1" : bi.cg18f.getText().toString());

        form.setCg19(bi.cg19y.isChecked() ? "1"
                : bi.cg19n.isChecked() ? "2"
                : "-1");

        form.setCg20f(bi.cg20f.getText().toString().trim().isEmpty() ? "-1" : bi.cg20f.getText().toString());

        form.setCg21(bi.cg21y.isChecked() ? "1"
                : bi.cg21n.isChecked() ? "2"
                : "-1");

        form.setCg22f(bi.cg22f.getText().toString().trim().isEmpty() ? "-1" : bi.cg22f.getText().toString());

        form.setCg23(bi.cg23y.isChecked() ? "1"
                : bi.cg23n.isChecked() ? "2"
                : "-1");

        form.setCg24f(bi.cg24f.getText().toString().trim().isEmpty() ? "-1" : bi.cg24f.getText().toString());

        form.setCg25(bi.cg25y.isChecked() ? "1"
                : bi.cg25n.isChecked() ? "2"
                : "-1");

        form.setCg26f(bi.cg26f.getText().toString().trim().isEmpty() ? "-1" : bi.cg26f.getText().toString());

        form.setCg27(bi.cg27y.isChecked() ? "1"
                : bi.cg27n.isChecked() ? "2"
                : "-1");

        form.setCg28f(bi.cg28f.getText().toString().trim().isEmpty() ? "-1" : bi.cg28f.getText().toString());
        form.setCg29(bi.cg29y.isChecked() ? "1"
                : bi.cg29n.isChecked() ? "2"
                : "-1");

        form.setCg30f(bi.cg30f.getText().toString().trim().isEmpty() ? "-1" : bi.cg30f.getText().toString());

        form.setCg31(bi.cg31y.isChecked() ? "1"
                : bi.cg31n.isChecked() ? "2"
                : "-1");

        form.setCg32f(bi.cg32f.getText().toString().trim().isEmpty() ? "-1" : bi.cg32f.getText().toString());

        form.setCg33(bi.cg33y.isChecked() ? "1"
                : bi.cg33n.isChecked() ? "2"
                : "-1");

        form.setCg34f(bi.cg34f.getText().toString().trim().isEmpty() ? "-1" : bi.cg34f.getText().toString());

        form.setCg35(bi.cg35y.isChecked() ? "1"
                : bi.cg35n.isChecked() ? "2"
                : "-1");

        form.setCg36f(bi.cg36f.getText().toString().trim().isEmpty() ? "-1" : bi.cg36f.getText().toString());

        form.setCg37(bi.cg37y.isChecked() ? "1"
                : bi.cg37n.isChecked() ? "2"
                : "-1");

        form.setCg38f(bi.cg38f.getText().toString().trim().isEmpty() ? "-1" : bi.cg38f.getText().toString());

        form.setCg39(bi.cg39y.isChecked() ? "1"
                : bi.cg39n.isChecked() ? "2"
                : "-1");

        form.setCg40f(bi.cg40f.getText().toString().trim().isEmpty() ? "-1" : bi.cg40f.getText().toString());

        form.setCg41(bi.cg41y.isChecked() ? "1"
                : bi.cg41n.isChecked() ? "2"
                : "-1");

        form.setCg42f(bi.cg42f.getText().toString().trim().isEmpty() ? "-1" : bi.cg42f.getText().toString());

        form.setCg43(bi.cg43y.isChecked() ? "1"
                : bi.cg43n.isChecked() ? "2"
                : "-1");

        form.setCg44f(bi.cg44f.getText().toString().trim().isEmpty() ? "-1" : bi.cg44f.getText().toString());

        form.setCg45(bi.cg45y.isChecked() ? "1"
                : bi.cg45n.isChecked() ? "2"
                : "-1");

        form.setCg46f(bi.cg46f.getText().toString().trim().isEmpty() ? "-1" : bi.cg46f.getText().toString());


        /*try {
            JSONObject json_merge = JSONUtils.mergeJSONObjects(new JSONObject(fc.getsC()),json);

            fc.setsC(String.valueOf(json_merge));
        }
        catch (JSONException e){
            e.printStackTrace();
        }*/


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
        openSectionMainActivity(this, "C");
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }

}