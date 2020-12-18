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
import org.json.JSONException;

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
        radioGroupListener(bi.cg01, bi.cg01y, bi.cvcg02);
        radioGroupListener(bi.cg03, bi.cg03y, bi.cvcg04);
        radioGroupListener(bi.cg05, bi.cg05y, bi.cvcg06);
        radioGroupListener(bi.cg07, bi.cg07y, bi.cvcg08);
        radioGroupListener(bi.cg09, bi.cg09y, bi.cvcg10);
        radioGroupListener(bi.cg11, bi.cg11y, bi.cvcg12);
        radioGroupListener(bi.cg13, bi.cg13y, bi.cvcg14);
        radioGroupListener(bi.cg15, bi.cg15y, bi.cvcg16);
        radioGroupListener(bi.cg17, bi.cg17y, bi.cvcg18);
        radioGroupListener(bi.cg19, bi.cg19y, bi.cvcg20);
        radioGroupListener(bi.cg21, bi.cg21y, bi.cvcg22);
        radioGroupListener(bi.cg23, bi.cg23y, bi.cvcg24);
        radioGroupListener(bi.cg25, bi.cg25y, bi.cvcg26);
        radioGroupListener(bi.cg27, bi.cg27y, bi.cvcg28);
        radioGroupListener(bi.cg29, bi.cg29y, bi.cvcg30);
        radioGroupListener(bi.cg31, bi.cg31y, bi.cvcg32);
        radioGroupListener(bi.cg33, bi.cg33y, bi.cvcg34);
        radioGroupListener(bi.cg35, bi.cg35y, bi.cvcg36);
        radioGroupListener(bi.cg37, bi.cg37y, bi.cvcg38);
        radioGroupListener(bi.cg39, bi.cg39y, bi.cvcg40);
        radioGroupListener(bi.cg41, bi.cg41y, bi.cvcg42);
        radioGroupListener(bi.cg43, bi.cg43y, bi.cvcg44);
        radioGroupListener(bi.cg45, bi.cg45y, bi.cvcg46);
    }


    public void radioGroupListener(@NotNull RadioGroup rg, RadioButton rb, ViewGroup vg) {
        rg.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(vg);
            vg.setVisibility(View.GONE);
            if (i == rb.getId()) vg.setVisibility(View.VISIBLE);
        });
    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SC, form.getsC());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private void SaveDraft() throws JSONException {
       /* JSONObject json = new JSONObject();
        json.put("cg01", bi.cg01y.isChecked() ? "1"
                : bi.cg01n.isChecked() ? "2"
                : bi.cg01f.isChecked() ? "3"
                : "-1");

        json.put("cg01fx", bi.cg01fx.getText().toString());
        json.put("cg02", bi.cg02y.isChecked() ? "1"
                : bi.cg02n.isChecked() ? "2"
                : bi.cg02f.isChecked() ? "3"
                : "-1");

        json.put("cg02fx", bi.cg02fx.getText().toString());
        json.put("cg03", bi.cg03y.isChecked() ? "1"
                : bi.cg03n.isChecked() ? "2"
                : bi.cg03f.isChecked() ? "3"
                : "-1");

        json.put("cg03fx", bi.cg03fx.getText().toString());
        json.put("cg04", bi.cg04y.isChecked() ? "1"
                : bi.cg04n.isChecked() ? "2"
                : bi.cg04f.isChecked() ? "3"
                : "-1");

        json.put("cg04fx", bi.cg04fx.getText().toString());
        json.put("cg05", bi.cg05y.isChecked() ? "1"
                : bi.cg05n.isChecked() ? "2"
                : bi.cg05f.isChecked() ? "3"
                : "-1");

        json.put("cg05fx", bi.cg05fx.getText().toString());
        json.put("cg06", bi.cg06y.isChecked() ? "1"
                : bi.cg06n.isChecked() ? "2"
                : bi.cg06f.isChecked() ? "3"
                : "-1");

        json.put("cg06fx", bi.cg06fx.getText().toString());
        json.put("cg07", bi.cg07y.isChecked() ? "1"
                : bi.cg07n.isChecked() ? "2"
                : bi.cg07f.isChecked() ? "3"
                : "-1");

        json.put("cg07fx", bi.cg07fx.getText().toString());
        json.put("cg08", bi.cg08y.isChecked() ? "1"
                : bi.cg08n.isChecked() ? "2"
                : bi.cg08f.isChecked() ? "3"
                : "-1");

        json.put("cg08fx", bi.cg08fx.getText().toString());
        json.put("cg09", bi.cg09y.isChecked() ? "1"
                : bi.cg09n.isChecked() ? "2"
                : bi.cg09f.isChecked() ? "3"
                : "-1");

        json.put("cg09fx", bi.cg09fx.getText().toString());
        json.put("cg10", bi.cg10y.isChecked() ? "1"
                : bi.cg10n.isChecked() ? "2"
                : bi.cg10f.isChecked() ? "3"
                : "-1");

        json.put("cg10fx", bi.cg10fx.getText().toString());
        json.put("cg11", bi.cg11y.isChecked() ? "1"
                : bi.cg11n.isChecked() ? "2"
                : bi.cg11f.isChecked() ? "3"
                : "-1");

        json.put("cg11fx", bi.cg11fx.getText().toString());
        json.put("cg12", bi.cg12y.isChecked() ? "1"
                : bi.cg12n.isChecked() ? "2"
                : bi.cg12f.isChecked() ? "3"
                : "-1");

        json.put("cg12fx", bi.cg12fx.getText().toString());
        json.put("cg13", bi.cg13y.isChecked() ? "1"
                : bi.cg13n.isChecked() ? "2"
                : bi.cg13f.isChecked() ? "3"
                : "-1");

        json.put("cg13fx", bi.cg13fx.getText().toString());
        json.put("cg14", bi.cg14y.isChecked() ? "1"
                : bi.cg14n.isChecked() ? "2"
                : bi.cg14f.isChecked() ? "3"
                : "-1");

        json.put("cg14fx", bi.cg14fx.getText().toString());
        json.put("cg15", bi.cg15y.isChecked() ? "1"
                : bi.cg15n.isChecked() ? "2"
                : bi.cg15f.isChecked() ? "3"
                : "-1");

        json.put("cg15fx", bi.cg15fx.getText().toString());
        json.put("cg16", bi.cg16y.isChecked() ? "1"
                : bi.cg16n.isChecked() ? "2"
                : bi.cg16f.isChecked() ? "3"
                : "-1");

        json.put("cg16fx", bi.cg16fx.getText().toString());
        json.put("cg17", bi.cg17y.isChecked() ? "1"
                : bi.cg17n.isChecked() ? "2"
                : bi.cg17f.isChecked() ? "3"
                : "-1");

        json.put("cg17fx", bi.cg17fx.getText().toString());
        json.put("cg18", bi.cg18y.isChecked() ? "1"
                : bi.cg18n.isChecked() ? "2"
                : bi.cg18f.isChecked() ? "3"
                : "-1");

        json.put("cg18fx", bi.cg18fx.getText().toString());
        json.put("cg19", bi.cg19y.isChecked() ? "1"
                : bi.cg19n.isChecked() ? "2"
                : bi.cg19f.isChecked() ? "3"
                : "-1");

        json.put("cg19fx", bi.cg19fx.getText().toString());
        json.put("cg20", bi.cg20y.isChecked() ? "1"
                : bi.cg20n.isChecked() ? "2"
                : bi.cg20f.isChecked() ? "3"
                : "-1");

        json.put("cg20fx", bi.cg20fx.getText().toString());
        json.put("cg21", bi.cg21y.isChecked() ? "1"
                : bi.cg21n.isChecked() ? "2"
                : bi.cg21f.isChecked() ? "3"
                : "-1");

        json.put("cg21fx", bi.cg21fx.getText().toString());
        json.put("cg22", bi.cg22y.isChecked() ? "1"
                : bi.cg22n.isChecked() ? "2"
                : bi.cg22f.isChecked() ? "3"
                : "-1");

        json.put("cg22fx", bi.cg22fx.getText().toString());
        json.put("cg23", bi.cg23y.isChecked() ? "1"
                : bi.cg23n.isChecked() ? "2"
                : bi.cg23f.isChecked() ? "3"
                : "-1");

        json.put("cg23fx", bi.cg23fx.getText().toString());

        try {
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
        try {
            SaveDraft();
        } catch (JSONException e) {
            e.printStackTrace();
        }
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