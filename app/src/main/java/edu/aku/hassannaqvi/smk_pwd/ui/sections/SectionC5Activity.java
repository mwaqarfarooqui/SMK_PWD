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
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionC5Binding;

import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;

public class SectionC5Activity extends AppCompatActivity {

    ActivitySectionC5Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_c5);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {
        radioGroupListener(bi.ce05, bi.ce05b, bi.fldGrpc505);
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
        /*JSONObject json = new JSONObject();
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
            startActivity(new Intent(this, SectionC6Activity.class));
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