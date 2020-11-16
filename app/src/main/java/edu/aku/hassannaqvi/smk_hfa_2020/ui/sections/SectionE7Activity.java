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
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivitySectionE7Binding;
import edu.aku.hassannaqvi.smk_hfa_2020.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_hfa_2020.utils.UtilKt.openSectionMainActivity;

public class SectionE7Activity extends AppCompatActivity {

    ActivitySectionE7Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_e7);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {

        bi.e0701.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.e0701b.getId()) {
                Clear.clearAllFields(bi.fldGrpSece701);
            }
        }));

    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SE, fc.getsE());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("e0701", bi.e0701a.isChecked() ? "1"
                : bi.e0701b.isChecked() ? "2"
                : "-1");

        json.put("e070201", bi.e070201a.isChecked() ? "1"
                : bi.e070201b.isChecked() ? "2"
                : "-1");

        json.put("e070202", bi.e070202a.isChecked() ? "1"
                : bi.e070202b.isChecked() ? "2"
                : "-1");

        json.put("e070203", bi.e070203a.isChecked() ? "1"
                : bi.e070203b.isChecked() ? "2"
                : "-1");

        json.put("e070204", bi.e070204a.isChecked() ? "1"
                : bi.e070204b.isChecked() ? "2"
                : "-1");

        json.put("e070205", bi.e070205a.isChecked() ? "1"
                : bi.e070205b.isChecked() ? "2"
                : "-1");

        json.put("e070301", bi.e070301a.isChecked() ? "1"
                : bi.e070301b.isChecked() ? "2"
                : bi.e070301c.isChecked() ? "3"
                : "-1");

        json.put("e070401", bi.e070401a.isChecked() ? "1"
                : bi.e070401b.isChecked() ? "2"
                : "-1");

        json.put("e070402", bi.e070402.getText().toString().trim().isEmpty() ? "-1" : bi.e070402.getText().toString());
        json.put("e070403", bi.e070403.getText().toString().trim().isEmpty() ? "-1" : bi.e070403.getText().toString());

        json.put("e070404", bi.e070404a.isChecked() ? "1"
                : bi.e070404x.isChecked() ? "96"
                : "-1");
        json.put("e070404xx", bi.e070404xx.getText().toString().trim().isEmpty() ? "-1" : bi.e070403.getText().toString());


        try {
            JSONObject json_merge = JSONUtils.mergeJSONObjects(new JSONObject(fc.getsE()), json);

            fc.setsE(String.valueOf(json_merge));

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
            startActivity(new Intent(this, SectionE8Activity.class));
        }
    }


    public void BtnEnd() {
        openSectionMainActivity(this, "E");
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }

}