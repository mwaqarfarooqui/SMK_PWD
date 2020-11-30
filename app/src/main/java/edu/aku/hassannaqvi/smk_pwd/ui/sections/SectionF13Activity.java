package edu.aku.hassannaqvi.smk_pwd.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionF13Binding;

import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;

public class SectionF13Activity extends AppCompatActivity {

    ActivitySectionF13Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_f13);
        bi.setCallback(this);
        setupSkips();
    }

    private void setupSkips() {

        bi.fm01.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.fldGrpF1302));

        bi.fm02.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.fldGrpF1303));

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

       /* JSONObject json = new JSONObject();
        json.put("fm01", bi.fm01a.isChecked() ? "1"
                : bi.fm01b.isChecked() ? "2"
                : "-1");

        json.put("fm02", bi.fm02a.isChecked() ? "1"
                : bi.fm02b.isChecked() ? "2"
                : "-1");

        json.put("fm03", bi.fm03a.isChecked() ? "1"
                : bi.fm03b.isChecked() ? "2"
                : "-1");

        json.put("fm04", bi.fm04a.isChecked() ? "1"
                : bi.fm04b.isChecked() ? "2"
                : "-1");

        json.put("fm05", bi.fm05a.isChecked() ? "1"
                : bi.fm05b.isChecked() ? "2"
                : "-1");

        json.put("fm06", bi.fm06a.isChecked() ? "1"
                : bi.fm06b.isChecked() ? "2"
                : "-1");

        json.put("fm07", bi.fm07a.isChecked() ? "1"
                : bi.fm07b.isChecked() ? "2"
                : "-1");

        json.put("fm08", bi.fm08a.isChecked() ? "1"
                : bi.fm08b.isChecked() ? "2"
                : "-1");


        try {
            JSONObject json_merge = JSONUtils.mergeJSONObjects(new JSONObject(MainApp.fc.getsF()), json);

            MainApp.fc.setsF(String.valueOf(json_merge));

        } catch (JSONException e) {
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
            startActivity(new Intent(this, SectionF14Activity.class));
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