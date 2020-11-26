package edu.aku.hassannaqvi.smk_pwd.ui.sections;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.contracts.FormsContract;
import edu.aku.hassannaqvi.smk_pwd.core.DatabaseHelper;
import edu.aku.hassannaqvi.smk_pwd.core.MainApp;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionC5Binding;
import edu.aku.hassannaqvi.smk_pwd.ui.other.SectionMainActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;
import org.json.JSONObject;

import static edu.aku.hassannaqvi.smk_pwd.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;

public class SectionC5Activity extends AppCompatActivity {

    ActivitySectionC5Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_c5);
        bi.setCallback(this);
    }

    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SC, fc.getsC());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private void SaveDraft() throws JSONException {
        JSONObject json = new JSONObject();
        json.put("ce01", bi.ce01a.isChecked() ? "1"
                : bi.ce01b.isChecked() ? "2"
                :  "-1");

        json.put("ce02", bi.ce02a.isChecked() ? "1"
                : bi.ce02b.isChecked() ? "2"
                :  "-1");

        json.put("ce03", bi.ce03a.isChecked() ? "1"
                : bi.ce03b.isChecked() ? "2"
                :  "-1");

        json.put("ce04", bi.ce04a.isChecked() ? "1"
                : bi.ce04b.isChecked() ? "2"
                :  "-1");

        json.put("ce05", bi.ce05a.isChecked() ? "1"
                : bi.ce05b.isChecked() ? "2"
                :  "-1");

        json.put("ce06", bi.ce06a.isChecked() ? "1"
                : bi.ce06b.isChecked() ? "2"
                :  "-1");

        json.put("ce07", bi.ce07a.isChecked() ? "1"
                : bi.ce07b.isChecked() ? "2"
                :  "-1");

        json.put("ce08a",bi.ce08a.isChecked() ? "1" :"-1");

        json.put("ce08b",bi.ce08b.isChecked() ? "2" :"-1");

        json.put("ce08c",bi.ce08c.isChecked() ? "3" :"-1");

        json.put("ce08e",bi.ce08e.isChecked() ? "4" :"-1");

        json.put("ce08d",bi.ce08d.isChecked() ? "5" :"-1");

        json.put("ce08f",bi.ce08f.isChecked() ? "6" :"-1");

        json.put("ce08g",bi.ce08g.isChecked() ? "7" :"-1");

        json.put("ce08h",bi.ce08h.isChecked() ? "8" :"-1");

        json.put("ce08i",bi.ce08i.isChecked() ? "9" :"-1");


        fc.setsC(String.valueOf(json));
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
            startActivity(new Intent(this, SectionMainActivity.class));
        }
    }

    public void BtnEnd() {
        openSectionMainActivity(this, "D");
    }
}