package edu.aku.hassannaqvi.smk_hfa_2020.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.smk_hfa_2020.R;
import edu.aku.hassannaqvi.smk_hfa_2020.contracts.FormsContract;
import edu.aku.hassannaqvi.smk_hfa_2020.core.DatabaseHelper;
import edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp;
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivitySectionG323Binding;
import edu.aku.hassannaqvi.smk_hfa_2020.ui.other.SectionMainActivity;
import edu.aku.hassannaqvi.smk_hfa_2020.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_hfa_2020.utils.UtilKt.openSectionMainActivity;


public class SectionG323Activity extends AppCompatActivity {

    ActivitySectionG323Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_g323);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {

        bi.g3301s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3301sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3301so);
            }
        }));

        bi.g3302s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3302sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3302so);
            }
        }));

        bi.g3303s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3303sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3303so);
            }
        }));

        bi.g3304s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3304sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3304so);
            }
        }));

        bi.g3305s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3305sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3305so);
            }
        }));

        bi.g3306s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3306sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3306so);
            }
        }));

    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SG, fc.getsG());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("g3301a", bi.g3301ay.isChecked() ? "1"
                : bi.g3301an.isChecked() ? "2"
                : "-1");

        json.put("g3301s", bi.g3301sy.isChecked() ? "1"
                : bi.g3301sn.isChecked() ? "2"
                : "-1");
        json.put("g3301sod", bi.g3301sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3301sod.getText().toString());
        json.put("g3301som", bi.g3301som.getText().toString().trim().isEmpty() ? "-1" : bi.g3301som.getText().toString());

        json.put("g3301p", bi.g3301py.isChecked() ? "1"
                : bi.g3301pn.isChecked() ? "2"
                : "-1");

        json.put("g3302a", bi.g3302ay.isChecked() ? "1"
                : bi.g3302an.isChecked() ? "2"
                : "-1");

        json.put("g3302s", bi.g3302sy.isChecked() ? "1"
                : bi.g3302sn.isChecked() ? "2"
                : "-1");
        json.put("g3302sod", bi.g3302sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3302sod.getText().toString());
        json.put("g3302som", bi.g3302som.getText().toString().trim().isEmpty() ? "-1" : bi.g3302som.getText().toString());

        json.put("g3302p", bi.g3302py.isChecked() ? "1"
                : bi.g3302pn.isChecked() ? "2"
                : "-1");

        json.put("g3303a", bi.g3303ay.isChecked() ? "1"
                : bi.g3303an.isChecked() ? "2"
                : "-1");

        json.put("g3303s", bi.g3303sy.isChecked() ? "1"
                : bi.g3303sn.isChecked() ? "2"
                : "-1");
        json.put("g3303sod", bi.g3303sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3303sod.getText().toString());
        json.put("g3303som", bi.g3303som.getText().toString().trim().isEmpty() ? "-1" : bi.g3303som.getText().toString());

        json.put("g3303p", bi.g3303py.isChecked() ? "1"
                : bi.g3303pn.isChecked() ? "2"
                : "-1");

        json.put("g3304a", bi.g3304ay.isChecked() ? "1"
                : bi.g3304an.isChecked() ? "2"
                : "-1");

        json.put("g3304s", bi.g3304sy.isChecked() ? "1"
                : bi.g3304sn.isChecked() ? "2"
                : "-1");
        json.put("g3304sod", bi.g3304sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3304sod.getText().toString());
        json.put("g3304som", bi.g3304som.getText().toString().trim().isEmpty() ? "-1" : bi.g3304som.getText().toString());

        json.put("g3304p", bi.g3304py.isChecked() ? "1"
                : bi.g3304pn.isChecked() ? "2"
                : "-1");

        json.put("g3305a", bi.g3305ay.isChecked() ? "1"
                : bi.g3305an.isChecked() ? "2"
                : "-1");

        json.put("g3305s", bi.g3305sy.isChecked() ? "1"
                : bi.g3305sn.isChecked() ? "2"
                : "-1");
        json.put("g3305sod", bi.g3305sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3305sod.getText().toString());
        json.put("g3305som", bi.g3305som.getText().toString().trim().isEmpty() ? "-1" : bi.g3305som.getText().toString());

        json.put("g3305p", bi.g3305py.isChecked() ? "1"
                : bi.g3305pn.isChecked() ? "2"
                : "-1");

        json.put("g3306a", bi.g3306ay.isChecked() ? "1"
                : bi.g3306an.isChecked() ? "2"
                : "-1");

        json.put("g3306s", bi.g3306sy.isChecked() ? "1"
                : bi.g3306sn.isChecked() ? "2"
                : "-1");
        json.put("g3306sod", bi.g3306sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3306sod.getText().toString());
        json.put("g3306som", bi.g3306som.getText().toString().trim().isEmpty() ? "-1" : bi.g3306som.getText().toString());

        json.put("g3306p", bi.g3306py.isChecked() ? "1"
                : bi.g3306pn.isChecked() ? "2"
                : "-1");

        try {
            JSONObject json_merge = JSONUtils.mergeJSONObjects(new JSONObject(MainApp.fc.getsG()), json);

            MainApp.fc.setsG(String.valueOf(json_merge));

        } catch (JSONException e) {
            e.printStackTrace();
        }

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
        openSectionMainActivity(this, "G");
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }

}
