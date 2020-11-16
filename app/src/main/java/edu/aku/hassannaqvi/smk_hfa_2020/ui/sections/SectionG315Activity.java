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
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivitySectionG315Binding;
import edu.aku.hassannaqvi.smk_hfa_2020.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_hfa_2020.utils.UtilKt.openSectionMainActivity;


public class SectionG315Activity extends AppCompatActivity {

    ActivitySectionG315Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_g315);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {

        bi.g3140s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3140sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3140so);
            }
        }));

        bi.g3141s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3141sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3141so);
            }
        }));

        bi.g3142s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3142sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3142so);
            }
        }));

        bi.g3143s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3143sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3143so);
            }
        }));

        bi.g3144s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3144sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3144so);
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

        json.put("g3140a", bi.g3140ay.isChecked() ? "1"
                : bi.g3140an.isChecked() ? "2"
                : "-1");

        json.put("g3140s", bi.g3140sy.isChecked() ? "1"
                : bi.g3140sn.isChecked() ? "2"
                : "-1");
        json.put("g3140sod", bi.g3140sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3140sod.getText().toString());
        json.put("g3140som", bi.g3140som.getText().toString().trim().isEmpty() ? "-1" : bi.g3140som.getText().toString());

        json.put("g3141a", bi.g3141ay.isChecked() ? "1"
                : bi.g3141an.isChecked() ? "2"
                : "-1");

        json.put("g3141s", bi.g3141sy.isChecked() ? "1"
                : bi.g3141sn.isChecked() ? "2"
                : "-1");
        json.put("g3141sod", bi.g3141sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3141sod.getText().toString());
        json.put("g3141som", bi.g3141som.getText().toString().trim().isEmpty() ? "-1" : bi.g3141som.getText().toString());

        json.put("g3142a", bi.g3142ay.isChecked() ? "1"
                : bi.g3142an.isChecked() ? "2"
                : "-1");

        json.put("g3142s", bi.g3142sy.isChecked() ? "1"
                : bi.g3142sn.isChecked() ? "2"
                : "-1");
        json.put("g3142sod", bi.g3142sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3142sod.getText().toString());
        json.put("g3142som", bi.g3142som.getText().toString().trim().isEmpty() ? "-1" : bi.g3142som.getText().toString());

        json.put("g3143a", bi.g3143ay.isChecked() ? "1"
                : bi.g3143an.isChecked() ? "2"
                : "-1");

        json.put("g3143s", bi.g3143sy.isChecked() ? "1"
                : bi.g3143sn.isChecked() ? "2"
                : "-1");
        json.put("g3143sod", bi.g3143sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3143sod.getText().toString());
        json.put("g3143som", bi.g3143som.getText().toString().trim().isEmpty() ? "-1" : bi.g3143som.getText().toString());

        json.put("g3144a", bi.g3144ay.isChecked() ? "1"
                : bi.g3144an.isChecked() ? "2"
                : "-1");

        json.put("g3144s", bi.g3144sy.isChecked() ? "1"
                : bi.g3144sn.isChecked() ? "2"
                : "-1");

        json.put("g3144sod", bi.g3144sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3144sod.getText().toString());
        json.put("g3144som", bi.g3144som.getText().toString().trim().isEmpty() ? "-1" : bi.g3144som.getText().toString());

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
            startActivity(new Intent(this, SectionG321Activity.class));
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
