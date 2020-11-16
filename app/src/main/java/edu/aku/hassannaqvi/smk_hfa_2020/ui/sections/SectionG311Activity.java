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
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivitySectionG311Binding;
import edu.aku.hassannaqvi.smk_hfa_2020.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_hfa_2020.utils.UtilKt.openSectionMainActivity;


public class SectionG311Activity extends AppCompatActivity {

    ActivitySectionG311Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_g311);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {

        bi.g3101s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3101sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3101so);
            }
        }));


        bi.g3102s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3102sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3102so);
            }
        }));

        bi.g3104s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3104sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3104so);
            }
        }));

        bi.g3105s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3105sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3105so);
            }
        }));

        bi.g3106s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3106sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3106so);
            }
        }));

        bi.g3107s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3107sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3107so);
            }
        }));

        bi.g3108s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3108sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3108so);
            }
        }));

        bi.g3109s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3109sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3109so);
            }
        }));

        bi.g3110s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3110sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3110so);
            }
        }));

        bi.g3111s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3111sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3111so);
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

        json.put("g3101a", bi.g3101ay.isChecked() ? "1"
                : bi.g3101an.isChecked() ? "2"
                : "-1");

        json.put("g3101s", bi.g3101sy.isChecked() ? "1"
                : bi.g3101sn.isChecked() ? "2"
                : "-1");
        json.put("g3101sd", bi.g3101sd.getText().toString().trim().isEmpty() ? "-1" : bi.g3101sd.getText().toString());
        json.put("g3101sm", bi.g3101sm.getText().toString().trim().isEmpty() ? "-1" : bi.g3101sm.getText().toString());

        json.put("g3102a", bi.g3102ay.isChecked() ? "1"
                : bi.g3102an.isChecked() ? "2"
                : "-1");

        json.put("g3102s", bi.g3102sy.isChecked() ? "1"
                : bi.g3102sn.isChecked() ? "2"
                : "-1");
        json.put("g3102sod", bi.g3102sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3102sod.getText().toString());
        json.put("g3102som", bi.g3102som.getText().toString().trim().isEmpty() ? "-1" : bi.g3102som.getText().toString());

        json.put("g3103", bi.g3103a.isChecked() ? "1"
                : bi.g3103b.isChecked() ? "2"
                : "-1");

        json.put("g3104a", bi.g3104ay.isChecked() ? "1"
                : bi.g3104an.isChecked() ? "2"
                : "-1");

        json.put("g3104s", bi.g3104sy.isChecked() ? "1"
                : bi.g3104sn.isChecked() ? "2"
                : "-1");
        json.put("g3104sod", bi.g3104sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3104sod.getText().toString());
        json.put("g3104som", bi.g3104som.getText().toString().trim().isEmpty() ? "-1" : bi.g3104som.getText().toString());

        json.put("g3105a", bi.g3105ay.isChecked() ? "1"
                : bi.g3105an.isChecked() ? "2"
                : "-1");

        json.put("g3105s", bi.g3105sy.isChecked() ? "1"
                : bi.g3105sn.isChecked() ? "2"
                : "-1");
        json.put("g3105sod", bi.g3105sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3105sod.getText().toString());
        json.put("g3105som", bi.g3105som.getText().toString().trim().isEmpty() ? "-1" : bi.g3105som.getText().toString());

        json.put("g3106a", bi.g3106ay.isChecked() ? "1"
                : bi.g3106an.isChecked() ? "2"
                : "-1");

        json.put("g3106s", bi.g3106sy.isChecked() ? "1"
                : bi.g3106sn.isChecked() ? "2"
                : "-1");
        json.put("g3106sod", bi.g3106sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3106sod.getText().toString());
        json.put("g3106som", bi.g3106som.getText().toString().trim().isEmpty() ? "-1" : bi.g3106som.getText().toString());

        json.put("g3107a", bi.g3107ay.isChecked() ? "1"
                : bi.g3107an.isChecked() ? "2"
                : "-1");

        json.put("g3107s", bi.g3107sy.isChecked() ? "1"
                : bi.g3107sn.isChecked() ? "2"
                : "-1");
        json.put("g3107sod", bi.g3107sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3107sod.getText().toString());
        json.put("g3107som", bi.g3107som.getText().toString().trim().isEmpty() ? "-1" : bi.g3107som.getText().toString());

        json.put("g3108a", bi.g3108ay.isChecked() ? "1"
                : bi.g3108an.isChecked() ? "2"
                : "-1");

        json.put("g3108s", bi.g3108sy.isChecked() ? "1"
                : bi.g3108sn.isChecked() ? "2"
                : "-1");
        json.put("g3108sod", bi.g3108sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3108sod.getText().toString());
        json.put("g3108som", bi.g3108som.getText().toString().trim().isEmpty() ? "-1" : bi.g3108som.getText().toString());

        json.put("g3109a", bi.g3109ay.isChecked() ? "1"
                : bi.g3109an.isChecked() ? "2"
                : "-1");

        json.put("g3109s", bi.g3109sy.isChecked() ? "1"
                : bi.g3109sn.isChecked() ? "2"
                : "-1");
        json.put("g3109sod", bi.g3109sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3109sod.getText().toString());
        json.put("g3109som", bi.g3109som.getText().toString().trim().isEmpty() ? "-1" : bi.g3109som.getText().toString());

        json.put("g3110a", bi.g3110ay.isChecked() ? "1"
                : bi.g3110an.isChecked() ? "2"
                : "-1");

        json.put("g3110s", bi.g3110sy.isChecked() ? "1"
                : bi.g3110sn.isChecked() ? "2"
                : "-1");
        json.put("g3110sod", bi.g3110sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3110sod.getText().toString());
        json.put("g3110som", bi.g3110som.getText().toString().trim().isEmpty() ? "-1" : bi.g3110som.getText().toString());

        json.put("g3111a", bi.g3111ay.isChecked() ? "1"
                : bi.g3111an.isChecked() ? "2"
                : "-1");

        json.put("g3111s", bi.g3111sy.isChecked() ? "1"
                : bi.g3111sn.isChecked() ? "2"
                : "-1");
        json.put("g3111sod", bi.g3111sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3111sod.getText().toString());
        json.put("g3111som", bi.g3111som.getText().toString().trim().isEmpty() ? "-1" : bi.g3111som.getText().toString());

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
            startActivity(new Intent(this, SectionG312Activity.class));
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
