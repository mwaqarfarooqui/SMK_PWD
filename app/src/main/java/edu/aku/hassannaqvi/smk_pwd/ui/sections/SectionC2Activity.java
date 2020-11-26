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
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionC2Binding;
import edu.aku.hassannaqvi.smk_pwd.ui.other.SectionMainActivity;

import static edu.aku.hassannaqvi.smk_pwd.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;

public class SectionC2Activity extends AppCompatActivity {

    ActivitySectionC2Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_c1);
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
        json.put("cb01", bi.cb01a.isChecked() ? "1"
                : bi.cb01b.isChecked() ? "2"
                : bi.cb01c.isChecked() ? "3"
                : bi.cb01d.isChecked() ? "4"
                : "-1");

        json.put("cb02", bi.cb02a.isChecked() ? "1"
                : bi.cb02b.isChecked() ? "2"
                : bi.cb02c.isChecked() ? "3"
                : bi.cb02d.isChecked() ? "4"
                : bi.cb02e.isChecked() ? "5"
                : "-1");

        json.put("cb03", bi.cb03a.isChecked() ? "1"
                : bi.cb03b.isChecked() ? "2"
                : "-1");

        json.put("cb04", bi.cb04a.isChecked() ? "1"
                : bi.cb04b.isChecked() ? "2"
                : "-1");

        json.put("cb05", bi.cb05a.isChecked() ? "1"
                : bi.cb05b.isChecked() ? "2"
                : bi.cb05c.isChecked() ? "3"
                : "-1");
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