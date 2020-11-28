package edu.aku.hassannaqvi.smk_pwd.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;
import org.json.JSONObject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.contracts.FormsContract;
import edu.aku.hassannaqvi.smk_pwd.core.DatabaseHelper;
import edu.aku.hassannaqvi.smk_pwd.core.MainApp;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionF3Binding;
import edu.aku.hassannaqvi.smk_pwd.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_pwd.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;

public class SectionF3Activity extends AppCompatActivity {

    ActivitySectionF3Binding bi;
    boolean imFlag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_f3);
        bi.setCallback(this);
    }

    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SF, fc.getsF());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();
        json.put("fc01m1", bi.fc01m1.getText().toString());

        json.put("fc01m2", bi.fc01m2.getText().toString());

        json.put("fc01m3", bi.fc01m3.getText().toString());

        json.put("fc01a", bi.fc01aa.isChecked() ? "1"
                : bi.fc01ab.isChecked() ? "2"
                : "-1");

        json.put("fc02m1", bi.fc02m1.getText().toString());

        json.put("fc02m2", bi.fc02m2.getText().toString());

        json.put("fc02m3", bi.fc02m3.getText().toString());

        json.put("fc02a", bi.fc02aa.isChecked() ? "1"
                : bi.fc02ab.isChecked() ? "2"
                : "-1");

        json.put("fc03m1", bi.fc03m1.getText().toString());

        json.put("fc03m2", bi.fc03m2.getText().toString());

        json.put("fc03m3", bi.fc03m3.getText().toString());

        json.put("fc03a", bi.fc03aa.isChecked() ? "1"
                : bi.fc03ab.isChecked() ? "2"
                : "-1");

        json.put("fc04m1", bi.fc04m1.getText().toString());

        json.put("fc04m2", bi.fc04m2.getText().toString());

        json.put("fc04m3", bi.fc04m3.getText().toString());

        json.put("fc04a", bi.fc04aa.isChecked() ? "1"
                : bi.fc04ab.isChecked() ? "2"
                : "-1");

        json.put("fc05m1", bi.fc05m1.getText().toString());

        json.put("fc05m2", bi.fc05m2.getText().toString());

        json.put("fc05m3", bi.fc05m3.getText().toString());

        json.put("fc05a", bi.fc05aa.isChecked() ? "1"
                : bi.fc05ab.isChecked() ? "2"
                : "-1");

        json.put("fc06m1", bi.fc06m1.getText().toString());

        json.put("fc06m2", bi.fc06m2.getText().toString());

        json.put("fc06m3", bi.fc06m3.getText().toString());

        json.put("fc06a", bi.fc06aa.isChecked() ? "1"
                : bi.fc06ab.isChecked() ? "2"
                : "-1");

        json.put("fc07m1", bi.fc07m1.getText().toString());

        json.put("fc07m2", bi.fc07m2.getText().toString());

        json.put("fc07m3", bi.fc07m3.getText().toString());

        json.put("fc07a", bi.fc07aa.isChecked() ? "1"
                : bi.fc07ab.isChecked() ? "2"
                : "-1");

        json.put("fc08m1", bi.fc08m1.getText().toString());

        json.put("fc08m2", bi.fc08m2.getText().toString());

        json.put("fc08m3", bi.fc08m3.getText().toString());

        json.put("fc08a", bi.fc08aa.isChecked() ? "1"
                : bi.fc08ab.isChecked() ? "2"
                : "-1");

        json.put("fc09m1", bi.fc09m1.getText().toString());

        json.put("fc09m2", bi.fc09m2.getText().toString());

        json.put("fc09m3", bi.fc09m3.getText().toString());

        json.put("fc09a", bi.fc09aa.isChecked() ? "1"
                : bi.fc09ab.isChecked() ? "2"
                : "-1");

        json.put("fc10m1", bi.fc10m1.getText().toString());

        json.put("fc10m2", bi.fc10m2.getText().toString());

        json.put("fc10m3", bi.fc10m3.getText().toString());

        json.put("fc10a", bi.fc10aa.isChecked() ? "1"
                : bi.fc10ab.isChecked() ? "2"
                : "-1");

        json.put("fc11m1", bi.fc11m1.getText().toString());

        json.put("fc11m2", bi.fc11m2.getText().toString());

        json.put("fc11m3", bi.fc11m3.getText().toString());

        json.put("fc11a", bi.fc11aa.isChecked() ? "1"
                : bi.fc11ab.isChecked() ? "2"
                : "-1");

        json.put("fc12m1", bi.fc12m1.getText().toString());

        json.put("fc12m2", bi.fc12m2.getText().toString());

        json.put("fc12m3", bi.fc12m3.getText().toString());

        json.put("fc12a", bi.fc12aa.isChecked() ? "1"
                : bi.fc12ab.isChecked() ? "2"
                : "-1");

        json.put("fc13m1", bi.fc13m1.getText().toString());

        json.put("fc13m2", bi.fc13m2.getText().toString());

        json.put("fc13m3", bi.fc13m3.getText().toString());

        json.put("fc13a", bi.fc13aa.isChecked() ? "1"
                : bi.fc13ab.isChecked() ? "2"
                : "-1");

        json.put("fc14m1", bi.fc14m1.getText().toString());

        json.put("fc14m2", bi.fc14m2.getText().toString());

        json.put("fc14m3", bi.fc14m3.getText().toString());

        json.put("fc14a", bi.fc14aa.isChecked() ? "1"
                : bi.fc14ab.isChecked() ? "2"
                : "-1");

        try {
            JSONObject json_merge = JSONUtils.mergeJSONObjects(new JSONObject(MainApp.fc.getsF()), json);

            MainApp.fc.setsF(String.valueOf(json_merge));

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
            startActivity(new Intent(this, SectionF4Activity.class));
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
