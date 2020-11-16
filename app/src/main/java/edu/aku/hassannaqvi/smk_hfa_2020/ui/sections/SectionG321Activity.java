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
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivitySectionG321Binding;
import edu.aku.hassannaqvi.smk_hfa_2020.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_hfa_2020.utils.UtilKt.openSectionMainActivity;


public class SectionG321Activity extends AppCompatActivity {

    ActivitySectionG321Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_g321);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {

        bi.g3201s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3201sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3201so);
            }
        }));

        bi.g3202s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3202sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3202so);
            }
        }));

        bi.g3203s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3203sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3203so);
            }
        }));

        bi.g3204s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3204sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3204so);
            }
        }));

        bi.g3205s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3205sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3205so);
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

        json.put("g3201a", bi.g3201ay.isChecked() ? "1"
                : bi.g3201an.isChecked() ? "2"
                : "-1");

        json.put("g3201s", bi.g3201sy.isChecked() ? "1"
                : bi.g3201sn.isChecked() ? "2"
                : "-1");
        json.put("g3201sod", bi.g3201sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3201sod.getText().toString());
        json.put("g3201som", bi.g3201som.getText().toString().trim().isEmpty() ? "-1" : bi.g3201som.getText().toString());

        json.put("g3201p", bi.g3201py.isChecked() ? "1"
                : bi.g3201pn.isChecked() ? "2"
                : "-1");

        json.put("g3202a", bi.g3202ay.isChecked() ? "1"
                : bi.g3202an.isChecked() ? "2"
                : "-1");

        json.put("g3202s", bi.g3202sy.isChecked() ? "1"
                : bi.g3202sn.isChecked() ? "2"
                : "-1");
        json.put("g3202sod", bi.g3202sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3202sod.getText().toString());
        json.put("g3202som", bi.g3202som.getText().toString().trim().isEmpty() ? "-1" : bi.g3202som.getText().toString());

        json.put("g3202p", bi.g3202py.isChecked() ? "1"
                : bi.g3202pn.isChecked() ? "2"
                : "-1");

        json.put("g3203a", bi.g3203ay.isChecked() ? "1"
                : bi.g3203an.isChecked() ? "2"
                : "-1");

        json.put("g3203s", bi.g3203sy.isChecked() ? "1"
                : bi.g3203sn.isChecked() ? "2"
                : "-1");
        json.put("g3203sod", bi.g3203sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3203sod.getText().toString());
        json.put("g3203som", bi.g3203som.getText().toString().trim().isEmpty() ? "-1" : bi.g3203som.getText().toString());

        json.put("g3203p", bi.g3203py.isChecked() ? "1"
                : bi.g3203pn.isChecked() ? "2"
                : "-1");

        json.put("g3204a", bi.g3204ay.isChecked() ? "1"
                : bi.g3204an.isChecked() ? "2"
                : "-1");

        json.put("g3204s", bi.g3204sy.isChecked() ? "1"
                : bi.g3204sn.isChecked() ? "2"
                : "-1");
        json.put("g3204sod", bi.g3204sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3204sod.getText().toString());
        json.put("g3204som", bi.g3204som.getText().toString().trim().isEmpty() ? "-1" : bi.g3204som.getText().toString());

        json.put("g3204p", bi.g3204py.isChecked() ? "1"
                : bi.g3204pn.isChecked() ? "2"
                : "-1");

        json.put("g3205a", bi.g3205ay.isChecked() ? "1"
                : bi.g3205an.isChecked() ? "2"
                : "-1");

        json.put("g3205s", bi.g3205sy.isChecked() ? "1"
                : bi.g3205sn.isChecked() ? "2"
                : "-1");

        json.put("g3205sod", bi.g3205sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3205sod.getText().toString());
        json.put("g3205som", bi.g3205som.getText().toString().trim().isEmpty() ? "-1" : bi.g3205som.getText().toString());

        json.put("g3205p", bi.g3205py.isChecked() ? "1"
                : bi.g3205pn.isChecked() ? "2"
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
            startActivity(new Intent(this, SectionG322Activity.class));
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
