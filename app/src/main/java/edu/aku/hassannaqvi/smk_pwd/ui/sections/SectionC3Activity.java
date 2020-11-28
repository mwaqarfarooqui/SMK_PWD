package edu.aku.hassannaqvi.smk_pwd.ui.sections;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionC3Binding;
import edu.aku.hassannaqvi.smk_pwd.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_pwd.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;

public class SectionC3Activity extends AppCompatActivity {

    ActivitySectionC3Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_c3);
        bi.setCallback(this);
    }

    private boolean UpdateDB() {
        /*DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SC, fc.getsC());
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
        json.put("cc01", bi.cc01a.isChecked() ? "1"
                : bi.cc01b.isChecked() ? "2"
                : bi.cc01c.isChecked() ? "3"
                : bi.cc01d.isChecked() ? "4"
                : bi.cc01e.isChecked() ? "5"
                : bi.cc01f.isChecked() ? "6"
                :  "-1");

        json.put("cc02", bi.cc02a.isChecked() ? "1"
                : bi.cc02b.isChecked() ? "2"
                : bi.cc02c.isChecked() ? "3"
                : bi.cc02d.isChecked() ? "4"
                : bi.cc02e.isChecked() ? "5"
                : bi.cc02f.isChecked() ? "6"
                :  "-1");

        json.put("cc03", bi.cc03a.isChecked() ? "1"
                : bi.cc03b.isChecked() ? "2"
                : bi.cc03c.isChecked() ? "3"
                :  "-1");

        json.put("cc04", bi.cc04a.isChecked() ? "1"
                : bi.cc04b.isChecked() ? "2"
                : bi.cc04c.isChecked() ? "3"
                : bi.cc04d.isChecked() ? "4"
                :  "-1");

        json.put("cc05", bi.cc05a.isChecked() ? "1"
                : bi.cc05b.isChecked() ? "2"
                :  "-1");

        json.put("cc06", bi.cc06a.isChecked() ? "1"
                : bi.cc06b.isChecked() ? "2"
                :  "-1");

        json.put("cc07", bi.cc07a.isChecked() ? "1"
                : bi.cc07b.isChecked() ? "2"
                :  "-1");

        json.put("cc08", bi.cc08a.isChecked() ? "1"
                : bi.cc08b.isChecked() ? "2"
                :  "-1");

        try {
            JSONObject json_merge = JSONUtils.mergeJSONObjects(new JSONObject(fc.getsC()),json);

            fc.setsC(String.valueOf(json_merge));
        }
        catch (JSONException e){
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
            startActivity(new Intent(this, SectionC4Activity.class));
        }
    }

    public void BtnEnd() {
        openSectionMainActivity(this, "C");
    }

}