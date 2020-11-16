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
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivitySectionG312Binding;
import edu.aku.hassannaqvi.smk_hfa_2020.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_hfa_2020.utils.UtilKt.openSectionMainActivity;


public class SectionG312Activity extends AppCompatActivity {

    ActivitySectionG312Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_g312);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {

        bi.g3112s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3112sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3112so);
            }
        }));

        bi.g3113s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3113sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3113so);
            }
        }));

        bi.g3114s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3114sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3114so);
            }
        }));

        bi.g3115s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3115sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3115so);
            }
        }));

        bi.g3116s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3116sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3116so);
            }
        }));

        bi.g3117s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3117sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3117so);
            }
        }));

        bi.g3118s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3118sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3118so);
            }
        }));

        bi.g3119s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3119sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3119so);
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

        json.put("g3112a", bi.g3112ay.isChecked() ? "1"
                : bi.g3112an.isChecked() ? "2"
                : "-1");

        json.put("g3112s", bi.g3112sy.isChecked() ? "1"
                : bi.g3112sn.isChecked() ? "2"
                : "-1");
        json.put("g3112sod", bi.g3112sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3112sod.getText().toString());
        json.put("g3112som", bi.g3112som.getText().toString().trim().isEmpty() ? "-1" : bi.g3112som.getText().toString());

        json.put("g3113a", bi.g3113ay.isChecked() ? "1"
                : bi.g3113an.isChecked() ? "2"
                : "-1");

        json.put("g3113s", bi.g3113sy.isChecked() ? "1"
                : bi.g3113sn.isChecked() ? "2"
                : "-1");
        json.put("g3113sod", bi.g3113sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3113sod.getText().toString());
        json.put("g3113som", bi.g3113som.getText().toString().trim().isEmpty() ? "-1" : bi.g3113som.getText().toString());

        json.put("g3114a", bi.g3114ay.isChecked() ? "1"
                : bi.g3114an.isChecked() ? "2"
                : "-1");

        json.put("g3114s", bi.g3114sy.isChecked() ? "1"
                : bi.g3114sn.isChecked() ? "2"
                : "-1");
        json.put("g3114sod", bi.g3114sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3114sod.getText().toString());
        json.put("g3114som", bi.g3114som.getText().toString().trim().isEmpty() ? "-1" : bi.g3114som.getText().toString());

        json.put("g3115a", bi.g3115ay.isChecked() ? "1"
                : bi.g3115an.isChecked() ? "2"
                : "-1");

        json.put("g3115s", bi.g3115sy.isChecked() ? "1"
                : bi.g3115sn.isChecked() ? "2"
                : "-1");
        json.put("g3115sod", bi.g3115sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3115sod.getText().toString());
        json.put("g3115som", bi.g3115som.getText().toString().trim().isEmpty() ? "-1" : bi.g3115som.getText().toString());

        json.put("g3116a", bi.g3116ay.isChecked() ? "1"
                : bi.g3116an.isChecked() ? "2"
                : "-1");

        json.put("g3116s", bi.g3116sy.isChecked() ? "1"
                : bi.g3116sn.isChecked() ? "2"
                : "-1");
        json.put("g3116sod", bi.g3116sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3116sod.getText().toString());
        json.put("g3116som", bi.g3116som.getText().toString().trim().isEmpty() ? "-1" : bi.g3116som.getText().toString());

        json.put("g3117a", bi.g3117ay.isChecked() ? "1"
                : bi.g3117an.isChecked() ? "2"
                : "-1");

        json.put("g3117s", bi.g3117sy.isChecked() ? "1"
                : bi.g3117sn.isChecked() ? "2"
                : "-1");
        json.put("g3117sod", bi.g3117sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3117sod.getText().toString());
        json.put("g3117som", bi.g3117som.getText().toString().trim().isEmpty() ? "-1" : bi.g3117som.getText().toString());

        json.put("g3118a", bi.g3118ay.isChecked() ? "1"
                : bi.g3118an.isChecked() ? "2"
                : "-1");

        json.put("g3118s", bi.g3118sy.isChecked() ? "1"
                : bi.g3118sn.isChecked() ? "2"
                : "-1");
        json.put("g3118sod", bi.g3118sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3118sod.getText().toString());
        json.put("g3118som", bi.g3118som.getText().toString().trim().isEmpty() ? "-1" : bi.g3118som.getText().toString());

        json.put("g3119a", bi.g3119ay.isChecked() ? "1"
                : bi.g3119an.isChecked() ? "2"
                : "-1");

        json.put("g3119s", bi.g3119sy.isChecked() ? "1"
                : bi.g3119sn.isChecked() ? "2"
                : "-1");
        json.put("g3119sod", bi.g3119sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3119sod.getText().toString());
        json.put("g3119som", bi.g3119som.getText().toString().trim().isEmpty() ? "-1" : bi.g3119som.getText().toString());

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
            startActivity(new Intent(this, SectionG313Activity.class));
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
