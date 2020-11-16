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
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivitySectionG322Binding;
import edu.aku.hassannaqvi.smk_hfa_2020.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_hfa_2020.utils.UtilKt.openSectionMainActivity;

public class SectionG322Activity extends AppCompatActivity {

    ActivitySectionG322Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_g322);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {

        bi.g3206s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3206sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3206so);
            }
        }));

        bi.g3207s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3207sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3207so);
            }
        }));

        bi.g3208s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3208sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3208so);
            }
        }));

        bi.g3209s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3209sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3209so);
            }
        }));

        bi.g3210s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3210sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3210so);
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

        json.put("g3206a", bi.g3206ay.isChecked() ? "1"
                : bi.g3206an.isChecked() ? "2"
                : "-1");

        json.put("g3206s", bi.g3206sy.isChecked() ? "1"
                : bi.g3206sn.isChecked() ? "2"
                : "-1");
        json.put("g3206sod", bi.g3206sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3206sod.getText().toString());
        json.put("g3206som", bi.g3206som.getText().toString().trim().isEmpty() ? "-1" : bi.g3206som.getText().toString());

        json.put("g3206p", bi.g3206py.isChecked() ? "1"
                : bi.g3206pn.isChecked() ? "2"
                : "-1");

        json.put("g3207a", bi.g3207ay.isChecked() ? "1"
                : bi.g3207an.isChecked() ? "2"
                : "-1");

        json.put("g3207s", bi.g3207sy.isChecked() ? "1"
                : bi.g3207sn.isChecked() ? "2"
                : "-1");
        json.put("g3207sod", bi.g3207sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3207sod.getText().toString());
        json.put("g3207som", bi.g3207som.getText().toString().trim().isEmpty() ? "-1" : bi.g3207som.getText().toString());

        json.put("g3207p", bi.g3207py.isChecked() ? "1"
                : bi.g3207pn.isChecked() ? "2"
                : "-1");

        json.put("g3208a", bi.g3208ay.isChecked() ? "1"
                : bi.g3208an.isChecked() ? "2"
                : "-1");

        json.put("g3208s", bi.g3208sy.isChecked() ? "1"
                : bi.g3208sn.isChecked() ? "2"
                : "-1");
        json.put("g3208sod", bi.g3208sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3208sod.getText().toString());
        json.put("g3208som", bi.g3208som.getText().toString().trim().isEmpty() ? "-1" : bi.g3208som.getText().toString());

        json.put("g3208p", bi.g3208py.isChecked() ? "1"
                : bi.g3208pn.isChecked() ? "2"
                : "-1");

        json.put("g3209a", bi.g3209ay.isChecked() ? "1"
                : bi.g3209an.isChecked() ? "2"
                : "-1");

        json.put("g3209s", bi.g3209sy.isChecked() ? "1"
                : bi.g3209sn.isChecked() ? "2"
                : "-1");
        json.put("g3209sod", bi.g3209sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3209sod.getText().toString());
        json.put("g3209som", bi.g3209som.getText().toString().trim().isEmpty() ? "-1" : bi.g3209som.getText().toString());

        json.put("g3209p", bi.g3209py.isChecked() ? "1"
                : bi.g3209pn.isChecked() ? "2"
                : "-1");

        json.put("g3210a", bi.g3210ay.isChecked() ? "1"
                : bi.g3210an.isChecked() ? "2"
                : "-1");

        json.put("g3210s", bi.g3210sy.isChecked() ? "1"
                : bi.g3210sn.isChecked() ? "2"
                : "-1");

        json.put("g3210sod", bi.g3210sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3210sod.getText().toString());
        json.put("g3210som", bi.g3210som.getText().toString().trim().isEmpty() ? "-1" : bi.g3210som.getText().toString());

        json.put("g3210p", bi.g3210py.isChecked() ? "1"
                : bi.g3210pn.isChecked() ? "2"
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
            startActivity(new Intent(this, SectionG323Activity.class));
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