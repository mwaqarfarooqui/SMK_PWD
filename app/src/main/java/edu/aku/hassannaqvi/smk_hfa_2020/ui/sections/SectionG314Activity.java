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
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivitySectionG314Binding;
import edu.aku.hassannaqvi.smk_hfa_2020.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_hfa_2020.utils.UtilKt.openSectionMainActivity;


public class SectionG314Activity extends AppCompatActivity {

    ActivitySectionG314Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_g314);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {

        bi.g3130s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3130sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3130so);
            }
        }));

        bi.g3131s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3131sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3131so);
            }
        }));

        bi.g3132s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3132sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3132so);
            }
        }));

        bi.g3133s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3133sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3133so);
            }
        }));

        bi.g3134s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3134sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3134so);
            }
        }));

        bi.g3135s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3135sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3135so);
            }
        }));

        bi.g3136s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3136sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3136so);
            }
        }));

        bi.g3137s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3137sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3137so);
            }
        }));

        bi.g3138s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3138sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3138so);
            }
        }));

        bi.g3139s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g3139sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg3139so);
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

        json.put("g3130a", bi.g3130ay.isChecked() ? "1"
                : bi.g3130an.isChecked() ? "2"
                : "-1");

        json.put("g3130s", bi.g3130sy.isChecked() ? "1"
                : bi.g3130sn.isChecked() ? "2"
                : "-1");
        json.put("g3130sod", bi.g3130sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3130sod.getText().toString());
        json.put("g3130som", bi.g3130som.getText().toString().trim().isEmpty() ? "-1" : bi.g3130som.getText().toString());

        json.put("g3131a", bi.g3131ay.isChecked() ? "1"
                : bi.g3131an.isChecked() ? "2"
                : "-1");

        json.put("g3131s", bi.g3131sy.isChecked() ? "1"
                : bi.g3131sn.isChecked() ? "2"
                : "-1");
        json.put("g3131sod", bi.g3131sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3131sod.getText().toString());
        json.put("g3131som", bi.g3131som.getText().toString().trim().isEmpty() ? "-1" : bi.g3131som.getText().toString());

        json.put("g3132a", bi.g3132ay.isChecked() ? "1"
                : bi.g3132an.isChecked() ? "2"
                : "-1");

        json.put("g3132s", bi.g3132sy.isChecked() ? "1"
                : bi.g3132sn.isChecked() ? "2"
                : "-1");
        json.put("g3132sod", bi.g3132sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3132sod.getText().toString());
        json.put("g3132som", bi.g3132som.getText().toString().trim().isEmpty() ? "-1" : bi.g3132som.getText().toString());

        json.put("g3133a", bi.g3133ay.isChecked() ? "1"
                : bi.g3133an.isChecked() ? "2"
                : "-1");

        json.put("g3133s", bi.g3133sy.isChecked() ? "1"
                : bi.g3133sn.isChecked() ? "2"
                : "-1");
        json.put("g3133sod", bi.g3133sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3133sod.getText().toString());
        json.put("g3133som", bi.g3133som.getText().toString().trim().isEmpty() ? "-1" : bi.g3133som.getText().toString());

        json.put("g3134a", bi.g3134ay.isChecked() ? "1"
                : bi.g3134an.isChecked() ? "2"
                : "-1");

        json.put("g3134s", bi.g3134sy.isChecked() ? "1"
                : bi.g3134sn.isChecked() ? "2"
                : "-1");
        json.put("g3134sod", bi.g3134sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3134sod.getText().toString());
        json.put("g3134som", bi.g3134som.getText().toString().trim().isEmpty() ? "-1" : bi.g3134som.getText().toString());

        json.put("g3135a", bi.g3135ay.isChecked() ? "1"
                : bi.g3135an.isChecked() ? "2"
                : "-1");

        json.put("g3135s", bi.g3135sy.isChecked() ? "1"
                : bi.g3135sn.isChecked() ? "2"
                : "-1");
        json.put("g3135sod", bi.g3135sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3135sod.getText().toString());
        json.put("g3135som", bi.g3135som.getText().toString().trim().isEmpty() ? "-1" : bi.g3135som.getText().toString());

        json.put("g3136a", bi.g3136ay.isChecked() ? "1"
                : bi.g3136an.isChecked() ? "2"
                : "-1");

        json.put("g3136s", bi.g3136sy.isChecked() ? "1"
                : bi.g3136sn.isChecked() ? "2"
                : "-1");
        json.put("g3136sod", bi.g3136sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3136sod.getText().toString());
        json.put("g3136som", bi.g3136som.getText().toString().trim().isEmpty() ? "-1" : bi.g3136som.getText().toString());

        json.put("g3137a", bi.g3137ay.isChecked() ? "1"
                : bi.g3137an.isChecked() ? "2"
                : "-1");

        json.put("g3137s", bi.g3137sy.isChecked() ? "1"
                : bi.g3137sn.isChecked() ? "2"
                : "-1");
        json.put("g3137sod", bi.g3137sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3137sod.getText().toString());
        json.put("g3137som", bi.g3137som.getText().toString().trim().isEmpty() ? "-1" : bi.g3137som.getText().toString());

        json.put("g3138a", bi.g3138ay.isChecked() ? "1"
                : bi.g3138an.isChecked() ? "2"
                : "-1");

        json.put("g3138s", bi.g3138sy.isChecked() ? "1"
                : bi.g3138sn.isChecked() ? "2"
                : "-1");
        json.put("g3138sod", bi.g3138sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3138sod.getText().toString());
        json.put("g3138som", bi.g3138som.getText().toString().trim().isEmpty() ? "-1" : bi.g3138som.getText().toString());

        json.put("g3139a", bi.g3139ay.isChecked() ? "1"
                : bi.g3139an.isChecked() ? "2"
                : "-1");

        json.put("g3139s", bi.g3139sy.isChecked() ? "1"
                : bi.g3139sn.isChecked() ? "2"
                : "-1");
        json.put("g3139sod", bi.g3139sod.getText().toString().trim().isEmpty() ? "-1" : bi.g3139sod.getText().toString());
        json.put("g3139som", bi.g3139som.getText().toString().trim().isEmpty() ? "-1" : bi.g3139som.getText().toString());

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
            startActivity(new Intent(this, SectionG315Activity.class));
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
