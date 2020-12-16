package edu.aku.hassannaqvi.smk_pwd.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionF6Binding;

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

    public void setupSkips() {
        radioGroupListener(bi.ff01, bi.ff01b, bi.fldGrpCVff02);
        radioGroupListener(bi.ff03, bi.ff03b, bi.fldGrpF604);
    }


    public void radioGroupListener(@NotNull RadioGroup rg, RadioButton rb, ViewGroup vg) {
        rg.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(vg);
            vg.setVisibility(View.VISIBLE);
            if (i == rb.getId()) {
                vg.setVisibility(View.GONE);
            }
        });
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

        /*JSONObject json = new JSONObject();
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
