package edu.aku.hassannaqvi.smk_hfa_2020.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.smk_hfa_2020.R;
import edu.aku.hassannaqvi.smk_hfa_2020.contracts.FormsContract;
import edu.aku.hassannaqvi.smk_hfa_2020.core.DatabaseHelper;
import edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp;
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivitySectionG313Binding;
import edu.aku.hassannaqvi.smk_hfa_2020.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_hfa_2020.utils.UtilKt.openSectionMainActivity;


public class SectionG313Activity extends AppCompatActivity {

    ActivitySectionG313Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_g313);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {

        bi.g3120s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3120sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3120so);
            }
        }));

        bi.g3121s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3121sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3121so);
            }
        }));


        bi.g3122s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3122sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3122so);
            }
        }));


        bi.g3123s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3123sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3123so);
            }
        }));


        bi.g3124s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3124sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3124so);
            }
        }));


        bi.g3125s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3125sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3125so);
            }
        }));


        bi.g3126s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3126sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3126so);
            }
        }));


        bi.g3127s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3127sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3127so);
            }
        }));

        bi.g3128s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3128sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3128so);
            }
        }));

        bi.g3129s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3129sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3129so);
            }
        }));

    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SG, fc.getsG());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("g3120a", bi.g3120ay.isChecked() ? "1"
                : bi.g3120an.isChecked() ? "2"
                : "-1");

        json.put("g3120s", bi.g3120sy.isChecked() ? "1"
                : bi.g3120sn.isChecked() ? "2"
                : "-1");
        json.put("g3120sod", bi.g3120sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3120sod.getText().toString());
        json.put("g3120som", bi.g3120som.getText().toString().trim().isEmpty() ? "-1" : bi.g3120som.getText().toString());

        json.put("g3121a", bi.g3121ay.isChecked() ? "1"
                : bi.g3121an.isChecked() ? "2"
                : "-1");

        json.put("g3121s", bi.g3121sy.isChecked() ? "1"
                : bi.g3121sn.isChecked() ? "2"
                : "-1");
        json.put("g3121sod", bi.g3121sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3121sod.getText().toString());
        json.put("g3121som", bi.g3121som.getText().toString().trim().isEmpty() ? "-1" : bi.g3121som.getText().toString());

        json.put("g3122a", bi.g3122ay.isChecked() ? "1"
                : bi.g3122an.isChecked() ? "2"
                : "-1");

        json.put("g3122s", bi.g3122sy.isChecked() ? "1"
                : bi.g3122sn.isChecked() ? "2"
                : "-1");
        json.put("g3122sod", bi.g3122sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3122sod.getText().toString());
        json.put("g3122som", bi.g3122som.getText().toString().trim().isEmpty() ? "-1" : bi.g3122som.getText().toString());

        json.put("g3123a", bi.g3123ay.isChecked() ? "1"
                : bi.g3123an.isChecked() ? "2"
                : "-1");

        json.put("g3123s", bi.g3123sy.isChecked() ? "1"
                : bi.g3123sn.isChecked() ? "2"
                : "-1");
        json.put("g3123sod", bi.g3123sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3123sod.getText().toString());
        json.put("g3123som", bi.g3123som.getText().toString().trim().isEmpty() ? "-1" : bi.g3123som.getText().toString());

        json.put("g3124a", bi.g3124ay.isChecked() ? "1"
                : bi.g3124an.isChecked() ? "2"
                : "-1");

        json.put("g3124s", bi.g3124sy.isChecked() ? "1"
                : bi.g3124sn.isChecked() ? "2"
                : "-1");
        json.put("g3124sod", bi.g3124sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3124sod.getText().toString());
        json.put("g3124som", bi.g3124som.getText().toString().trim().isEmpty() ? "-1" : bi.g3124som.getText().toString());

        json.put("g3125a", bi.g3125ay.isChecked() ? "1"
                : bi.g3125an.isChecked() ? "2"
                : "-1");

        json.put("g3125s", bi.g3125sy.isChecked() ? "1"
                : bi.g3125sn.isChecked() ? "2"
                : "-1");
        json.put("g3125sod", bi.g3125sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3125sod.getText().toString());
        json.put("g3125som", bi.g3125som.getText().toString().trim().isEmpty() ? "-1" : bi.g3125som.getText().toString());

        json.put("g3126a", bi.g3126ay.isChecked() ? "1"
                : bi.g3126an.isChecked() ? "2"
                : "-1");

        json.put("g3126s", bi.g3126sy.isChecked() ? "1"
                : bi.g3126sn.isChecked() ? "2"
                : "-1");
        json.put("g3126sod", bi.g3126sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3126sod.getText().toString());
        json.put("g3126som", bi.g3126som.getText().toString().trim().isEmpty() ? "-1" : bi.g3126som.getText().toString());

        json.put("g3127a", bi.g3127ay.isChecked() ? "1"
                : bi.g3127an.isChecked() ? "2"
                : "-1");

        json.put("g3127s", bi.g3127sy.isChecked() ? "1"
                : bi.g3127sn.isChecked() ? "2"
                : "-1");
        json.put("g3127sod", bi.g3127sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3127sod.getText().toString());
        json.put("g3127som", bi.g3127som.getText().toString().trim().isEmpty() ? "-1" : bi.g3127som.getText().toString());

        json.put("g3128a", bi.g3128ay.isChecked() ? "1"
                : bi.g3128an.isChecked() ? "2"
                : "-1");

        json.put("g3128s", bi.g3128sy.isChecked() ? "1"
                : bi.g3128sn.isChecked() ? "2"
                : "-1");
        json.put("g3128sod", bi.g3128sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3128sod.getText().toString());
        json.put("g3128som", bi.g3128som.getText().toString().trim().isEmpty() ? "-1" : bi.g3128som.getText().toString());

        json.put("g3129a", bi.g3129ay.isChecked() ? "1"
                : bi.g3129an.isChecked() ? "2"
                : "-1");

        json.put("g3129s", bi.g3129sy.isChecked() ? "1"
                : bi.g3129sn.isChecked() ? "2"
                : "-1");
        json.put("g3129sod", bi.g3129sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3129sod.getText().toString());
        json.put("g3129som", bi.g3129som.getText().toString().trim().isEmpty() ? "-1" : bi.g3129som.getText().toString());

        try {
            JSONObject json_merge = JSONUtils.mergeJSONObjects(new JSONObject(MainApp.fc.getsG()), json);

            MainApp.fc.setsG(String.valueOf(json_merge));

        } catch (JSONException e) {
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
            startActivity(new Intent(this, SectionG314Activity.class));
        }
    }


    public void BtnEnd() {
        openSectionMainActivity(this, "G");
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }

}
