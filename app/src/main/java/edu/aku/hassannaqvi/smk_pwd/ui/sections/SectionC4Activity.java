package edu.aku.hassannaqvi.smk_pwd.ui.sections;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionC4Binding;

import static edu.aku.hassannaqvi.smk_pwd.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;

public class SectionC4Activity extends AppCompatActivity {

    ActivitySectionC4Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_c4);
        bi.setCallback(this);
        setupSkips();
    }

    private void setupSkips() {

        bi.cd02.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.fldGrpc202));

        bi.cd04.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.fldGrpc402));

        bi.cd06.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.fldGrpc602));

        bi.cd08.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.fldGrpc802));

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
        json.put("cd01", bi.cd01a.isChecked() ? "1"
                : bi.cd01b.isChecked() ? "2"
                : bi.cd01c.isChecked() ? "3"
                :  "-1");

        json.put("cd02", bi.cd02y.isChecked() ? "1"
                : bi.cd02n.isChecked() ? "2"
                :  "-1");

        json.put("cd02yx", bi.cd02yx.getText().toString());
        json.put("cd03", bi.cd03y.isChecked() ? "1"
                : bi.cd03n.isChecked() ? "2"
                :  "-1");

        json.put("cd03yx", bi.cd03yx.getText().toString());
        json.put("cd04", bi.cd04y.isChecked() ? "1"
                : bi.cd04n.isChecked() ? "2"
                :  "-1");

        json.put("cd04yx", bi.cd04yx.getText().toString());
        json.put("cd05", bi.cd05y.isChecked() ? "1"
                : bi.cd05n.isChecked() ? "2"
                :  "-1");

        json.put("cd05yx", bi.cd05yx.getText().toString());
        json.put("cd06", bi.cd06y.isChecked() ? "1"
                : bi.cd06n.isChecked() ? "2"
                :  "-1");

        json.put("cd06yx", bi.cd06yx.getText().toString());
        json.put("cd07", bi.cd07y.isChecked() ? "1"
                : bi.cd07n.isChecked() ? "2"
                :  "-1");

        json.put("cd07yx", bi.cd07yx.getText().toString());
        json.put("cd08", bi.cd08y.isChecked() ? "1"
                : bi.cd08n.isChecked() ? "2"
                :  "-1");

        json.put("cd08yx", bi.cd08yx.getText().toString());
        json.put("cd09", bi.cd09y.isChecked() ? "1"
                : bi.cd09n.isChecked() ? "2"
                :  "-1");

        json.put("cd09yx", bi.cd09yx.getText().toString());
        json.put("cd10", bi.cd10a.isChecked() ? "1"
                : bi.cd10b.isChecked() ? "2"
                :  "-1");

        json.put("cd11", bi.cd11a.isChecked() ? "1"
                : bi.cd11b.isChecked() ? "2"
                :  "-1");

        json.put("cd12", bi.cd12a.isChecked() ? "1"
                : bi.cd12b.isChecked() ? "2"
                :  "-1");

        json.put("cd13", bi.cd13a.isChecked() ? "1"
                : bi.cd13b.isChecked() ? "2"
                :  "-1");

        json.put("cd14", bi.cd14a.isChecked() ? "1"
                : bi.cd14b.isChecked() ? "2"
                :  "-1");

        json.put("cd15", bi.cd15a.isChecked() ? "1"
                : bi.cd15b.isChecked() ? "2"
                :  "-1");

        json.put("cd16", bi.cd16a.isChecked() ? "1"
                : bi.cd16b.isChecked() ? "2"
                :  "-1");

        json.put("cd17", bi.cd17a.isChecked() ? "1"
                : bi.cd17b.isChecked() ? "2"
                :  "-1");

        json.put("cd18", bi.cd18a.isChecked() ? "1"
                : bi.cd18b.isChecked() ? "2"
                :  "-1");

        json.put("cd19", bi.cd19a.isChecked() ? "1"
                : bi.cd19b.isChecked() ? "2"
                :  "-1");

        json.put("cd20", bi.cd20a.isChecked() ? "1"
                : bi.cd20b.isChecked() ? "2"
                :  "-1");

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
            startActivity(new Intent(this, SectionC5Activity.class));
        }
    }

    public void BtnEnd() {
        openSectionMainActivity(this, "C");
    }

}