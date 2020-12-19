package edu.aku.hassannaqvi.smk_pwd.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.contracts.FormsContract;
import edu.aku.hassannaqvi.smk_pwd.core.DatabaseHelper;
import edu.aku.hassannaqvi.smk_pwd.core.MainApp;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionF8Binding;

import static edu.aku.hassannaqvi.smk_pwd.core.MainApp.form;
import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;

public class SectionF8Activity extends AppCompatActivity {

    ActivitySectionF8Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_f8);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {
    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SF, form.sFtoString());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private void SaveDraft() {

        form.setFh01(bi.fh01a.isChecked() ? "1"
                : bi.fh01b.isChecked() ? "2"
                : "-1");

        form.setFh02(bi.fh02a.isChecked() ? "1"
                : bi.fh02b.isChecked() ? "2"
                : "-1");

        form.setFh03(bi.fh03a.isChecked() ? "1"
                : bi.fh03b.isChecked() ? "2"
                : "-1");

        form.setFh04(bi.fh04a.isChecked() ? "1"
                : bi.fh04b.isChecked() ? "2"
                : "-1");

        form.setFh05(bi.fh05a.isChecked() ? "1"
                : bi.fh05b.isChecked() ? "2"
                : "-1");

        form.setFh06(bi.fh06a.isChecked() ? "1"
                : bi.fh06b.isChecked() ? "2"
                : "-1");

        form.setFh07(bi.fh07a.isChecked() ? "1"
                : bi.fh07b.isChecked() ? "2"
                : "-1");

        /*try {
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
        SaveDraft();
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, SectionF9Activity.class));
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