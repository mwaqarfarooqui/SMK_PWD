package edu.aku.hassannaqvi.smk_pwd.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionC6Binding;

import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;

public class SectionC6Activity extends AppCompatActivity {

    ActivitySectionC6Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_c6);
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
       /* JSONObject json = new JSONObject();
        json.put("cf01", bi.cf01a.isChecked() ? "1"
                : bi.cf01b.isChecked() ? "2"
                : bi.cf01c.isChecked() ? "3"
                : bi.cf0196.isChecked() ? "96"
                :  "-1");

        json.put("cf0196x", bi.cf0196x.getText().toString());
        json.put("cf02", bi.cf02a.isChecked() ? "1"
                : bi.cf02b.isChecked() ? "2"
                : bi.cf02c.isChecked() ? "3"
                : bi.cf02d.isChecked() ? "4"
                : bi.cf02e.isChecked() ? "5"
                : bi.cf0296.isChecked() ? "96"
                :  "-1");

        json.put("cf0296x", bi.cf0296x.getText().toString());
        json.put("cf03", bi.cf03a.isChecked() ? "1"
                : bi.cf03b.isChecked() ? "2"
                : bi.cf03c.isChecked() ? "3"
                : bi.cf03d.isChecked() ? "98"
                :  "-1");

        json.put("cf04", bi.cf04a.isChecked() ? "1"
                : bi.cf04b.isChecked() ? "2"
                :  "-1");

        json.put("cf05", bi.cf05a.isChecked() ? "1"
                : bi.cf05b.isChecked() ? "2"
                :  "-1");

        json.put("cf06", bi.cf06a.isChecked() ? "1"
                : bi.cf06b.isChecked() ? "2"
                :  "-1");

        try {
            JSONObject json_merge = JSONUtils.mergeJSONObjects(new JSONObject(fc.getsC()),json);

            fc.setsC(String.valueOf(json_merge));
        }
        catch (JSONException e){
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
            startActivity(new Intent(this, SectionC7Activity.class));
        }
    }


    public void BtnEnd() {
        openSectionMainActivity(this, "C");
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }

}