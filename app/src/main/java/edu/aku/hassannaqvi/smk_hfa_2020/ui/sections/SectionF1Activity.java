package edu.aku.hassannaqvi.smk_hfa_2020.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.edittextpicker.aliazaz.EditTextPicker;
import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.smk_hfa_2020.R;
import edu.aku.hassannaqvi.smk_hfa_2020.contracts.FormsContract;
import edu.aku.hassannaqvi.smk_hfa_2020.core.DatabaseHelper;
import edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp;
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivitySectionF1Binding;

import static edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp.fc;

public class SectionF1Activity extends AppCompatActivity {

    ActivitySectionF1Binding bi;
    boolean imFlag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_f1);
        bi.setCallback(this);
        setupSkips();
        setupTextWatchers();
    }


    private void setupTextWatchers() {
        editTextImplementation(bi.f0101aa0ayx, bi.f0101aa0fyx);
        editTextImplementation(bi.f0101ab0ayx, bi.f0101ab0fyx);
    }


    public void editTextImplementation(EditTextPicker edit01, EditTextPicker edit02) {

        edit01.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (TextUtils.isEmpty(edit01.getText()))
                    return;
                edit02.setMaxvalue(Integer.parseInt(edit01.getText().toString()));
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
    }


    private void setupSkips() {

        bi.f0100.setOnCheckedChangeListener((radioGroup, i) -> {
            if (i == bi.f0100b.getId()) {
                Clear.clearAllFields(bi.fldGrpCVf01001);
                Clear.clearAllFields(bi.fldGrpSecf101);
            }
        });

        bi.f0101aa0a.setOnCheckedChangeListener((radioGroup, i) -> {
            if (i == bi.f0101aa0an.getId()) {
                Clear.clearAllFields(bi.fldGrpCVf0101aa0f);
            }
        });

        bi.f0101ab0a.setOnCheckedChangeListener((radioGroup, i) -> {
            if (i == bi.f0101ab0an.getId()) {
                Clear.clearAllFields(bi.fldGrpCVf0101ab0f);
            }
        });
    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SF, fc.getsF());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("FDate", new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date().getTime()));
        json.put("FTime", new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date().getTime()));

        json.put("f0100", bi.f0100a.isChecked() ? "1"
                : bi.f0100b.isChecked() ? "2"
                : "-1");

        json.put("f01001", bi.f01001a.isChecked() ? "1"
                : bi.f01001b.isChecked() ? "2"
                : "-1");

        json.put("f0101aa0a", bi.f0101aa0ay.isChecked() ? "1"
                : bi.f0101aa0an.isChecked() ? "2"
                : "-1");
        json.put("f0101aa0ayx", bi.f0101aa0ayx.getText().toString().trim().isEmpty() ? "-1" : bi.f0101aa0ayx.getText().toString());

        json.put("f0101aa0f", bi.f0101aa0fy.isChecked() ? "1"
                : bi.f0101aa0fn.isChecked() ? "2"
                : "-1");
        json.put("f0101aa0fyx", bi.f0101aa0fyx.getText().toString().trim().isEmpty() ? "-1" : bi.f0101aa0fyx.getText().toString());


        json.put("f0101ab0a", bi.f0101ab0ay.isChecked() ? "1"
                : bi.f0101ab0an.isChecked() ? "2"
                : "-1");
        json.put("f0101ab0ayx", bi.f0101ab0ayx.getText().toString().trim().isEmpty() ? "-1" : bi.f0101ab0ayx.getText().toString());

        json.put("f0101ab0f", bi.f0101ab0fy.isChecked() ? "1"
                : bi.f0101ab0fn.isChecked() ? "2"
                : "-1");
        json.put("f0101ab0fyx", bi.f0101ab0fyx.getText().toString().trim().isEmpty() ? "-1" : bi.f0101ab0fyx.getText().toString());


        json.put("f0102", bi.f0102a.isChecked() ? "1"
                : bi.f0102b.isChecked() ? "2"
                : "-1");

        json.put("f0103", bi.f0103a.isChecked() ? "1"
                : bi.f0103b.isChecked() ? "2"
                : "-1");

        json.put("f0104", bi.f0104a.isChecked() ? "1"
                : bi.f0104b.isChecked() ? "2"
                : "-1");

        json.put("f0105", bi.f0105a.isChecked() ? "1"
                : bi.f0105b.isChecked() ? "2"
                : "-1");

        json.put("f0106", bi.f0106a.isChecked() ? "1"
                : bi.f0106b.isChecked() ? "2"
                : "-1");

        json.put("f0107", bi.f0107a.isChecked() ? "1"
                : bi.f0107b.isChecked() ? "2"
                : "-1");

        json.put("f0108", bi.f0108a.isChecked() ? "1"
                : bi.f0108b.isChecked() ? "2"
                : "-1");

        json.put("f0109", bi.f0109a.isChecked() ? "1"
                : bi.f0109b.isChecked() ? "2"
                : "-1");

        json.put("f0110", bi.f0110a.isChecked() ? "1"
                : bi.f0110b.isChecked() ? "2"
                : "-1");

        MainApp.fc.setsF(String.valueOf(json));

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
            startActivity(new Intent(this, SectionF2Activity.class));
        }
    }

}