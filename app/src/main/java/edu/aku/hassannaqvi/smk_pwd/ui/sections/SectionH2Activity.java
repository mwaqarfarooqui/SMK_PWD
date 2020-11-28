package edu.aku.hassannaqvi.smk_pwd.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionH2Binding;

import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;


public class SectionH2Activity extends AppCompatActivity {

    ActivitySectionH2Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_h2);
        bi.setCallback(this);
    }


    public void BtnContinue() {
        if (!formValidation()) return;
        try {
            SaveDraft();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, SectionH3Activity.class));
        }
    }


    private boolean UpdateDB() {
        /*DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SH, MainApp.fc.getsH());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show();
            return false;
        }*/
        return true;
    }


    private void SaveDraft() throws JSONException {


       /* form.setHb01( bi.hb01a.isChecked() ? "1"
                : bi.hb01b.isChecked() ? "2"
                :  "-1");

        form.setHb02( bi.hb02a.isChecked() ? "1"
                : bi.hb02b.isChecked() ? "2"
                :  "-1");

        form.setHb03( bi.hb03a.isChecked() ? "1"
                : bi.hb03b.isChecked() ? "2"
                :  "-1");

        form.setHb04( bi.hb04a.isChecked() ? "1"
                : bi.hb04b.isChecked() ? "2"
                :  "-1");

        form.setHb05( bi.hb05a.isChecked() ? "1"
                : bi.hb05b.isChecked() ? "2"
                :  "-1");

        form.setHb06( bi.hb06a.isChecked() ? "1"
                : bi.hb06b.isChecked() ? "2"
                :  "-1");

        form.setHb07a(bi.hb07a.isChecked() ? "1" : "-1");

        form.setHb07b(bi.hb07b.isChecked() ? "2" : "-1");

        form.setHb07c(bi.hb07c.isChecked() ? "3" : "-1");

        form.setHb07d(bi.hb07d.isChecked() ? "4" : "-1");

        form.setHb0796(bi.hb0796.isChecked() ? "96" : "-1");

        form.setHb0796x(bi.hb0796x.getText().toString());*/


    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    public void BtnEnd() {
        openSectionMainActivity(this, "H");
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }

}
