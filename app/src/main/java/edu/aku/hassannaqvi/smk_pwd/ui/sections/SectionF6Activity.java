package edu.aku.hassannaqvi.smk_pwd.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.core.MainApp;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionF6Binding;
import edu.aku.hassannaqvi.smk_pwd.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;


public class SectionF6Activity extends AppCompatActivity {

    ActivitySectionF6Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_f6);
        bi.setCallback(this);
        setupSkips();
    }

    public void setupSkips(){

        bi.ff01.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.fldGrpF602));

        bi.ff03.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.fldGrpF604));

    }


    private boolean UpdateDB() {
        /*DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SF, fc.getsF());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show();
            return false;
        }*/
        return true;
    }


    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();
        json.put("ff01", bi.ff01a.isChecked() ? "1"
                : bi.ff01b.isChecked() ? "2"
                : "-1");

        json.put("ff02d", bi.ff02d.getText().toString());

        json.put("ff03", bi.ff03a.isChecked() ? "1"
                : bi.ff03b.isChecked() ? "2"
                : "-1");

        json.put("ff04", bi.ff04a.isChecked() ? "1"
                : bi.ff04b.isChecked() ? "2"
                : "-1");

        json.put("ff05", bi.ff05a.isChecked() ? "1"
                : bi.ff05b.isChecked() ? "2"
                : "-1");

        json.put("ff06", bi.ff06a.isChecked() ? "1"
                : bi.ff06b.isChecked() ? "2"
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
            startActivity(new Intent(this, SectionF7Activity.class));
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
