package edu.aku.hassannaqvi.smk_pwd.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.edittextpicker.aliazaz.EditTextPicker;
import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.contracts.FormsContract;
import edu.aku.hassannaqvi.smk_pwd.core.DatabaseHelper;
import edu.aku.hassannaqvi.smk_pwd.core.MainApp;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionC4Binding;
import edu.aku.hassannaqvi.smk_pwd.utils.JSONUtils;

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
        radioGroupListener(bi.cd0211, bi.cd0211a, bi.cd0212, bi.cd0212c);
        radioGroupListener(bi.cd0221, bi.cd0221a, bi.cd0222, bi.cd0222c);
        radioGroupListener(bi.cd0231, bi.cd0231a, bi.cd0232, bi.cd0232c);
        radioGroupListener(bi.cd0241, bi.cd0241a, bi.cd0242, bi.cd0242c);
        watcherSetMax(bi.cd0211c, bi.cd0212c);
        watcherSetMax(bi.cd0221c, bi.cd0222c);
        watcherSetMax(bi.cd0231c, bi.cd0232c);
        watcherSetMax(bi.cd0241c, bi.cd0242c);
    }


    public void radioGroupListener(@NotNull RadioGroup rg, RadioButton rb, RadioGroup rG, EditTextPicker etp) {
        rg.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(rG, false);
            if (i == rb.getId()) {
                Clear.clearAllFields(rG, true);
                etp.setEnabled(false);
            }
        });
    }


    public void watcherSetMax(EditTextPicker edit01, EditTextPicker edit02) {
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

        json.put("cd01", bi.cd01a.isChecked() ? "1"
                : bi.cd01b.isChecked() ? "2"
                : bi.cd01c.isChecked() ? "3"
                : "-1");


        json.put("cd0211", bi.cd0211a.isChecked() ? "1"
                : bi.cd0211b.isChecked() ? "2"
                : "-1");
        json.put("cd0211c", bi.cd0211c.getText().toString().trim().isEmpty() ? "-1" : bi.cd0211c.getText().toString());

        json.put("cd0212", bi.cd0212a.isChecked() ? "1"
                : bi.cd0212b.isChecked() ? "2"
                : "-1");
        json.put("cd0212c", bi.cd0212c.getText().toString().trim().isEmpty() ? "-1" : bi.cd0212c.getText().toString());


        json.put("cd0221", bi.cd0221a.isChecked() ? "1"
                : bi.cd0221b.isChecked() ? "2"
                : "-1");
        json.put("cd0221c", bi.cd0221c.getText().toString().trim().isEmpty() ? "-1" : bi.cd0221c.getText().toString());

        json.put("cd0222", bi.cd0222a.isChecked() ? "1"
                : bi.cd0222b.isChecked() ? "2"
                : "-1");
        json.put("cd0222c", bi.cd0222c.getText().toString().trim().isEmpty() ? "-1" : bi.cd0222c.getText().toString());


        json.put("cd0231", bi.cd0231a.isChecked() ? "1"
                : bi.cd0231b.isChecked() ? "2"
                : "-1");
        json.put("cd0231c", bi.cd0231c.getText().toString().trim().isEmpty() ? "-1" : bi.cd0231c.getText().toString());

        json.put("cd0232", bi.cd0232a.isChecked() ? "1"
                : bi.cd0232b.isChecked() ? "2"
                : "-1");
        json.put("cd0232c", bi.cd0232c.getText().toString().trim().isEmpty() ? "-1" : bi.cd0232c.getText().toString());


        json.put("cd0241", bi.cd0241a.isChecked() ? "1"
                : bi.cd0241b.isChecked() ? "2"
                : "-1");
        json.put("cd0241c", bi.cd0241c.getText().toString().trim().isEmpty() ? "-1" : bi.cd0241c.getText().toString());

        json.put("cd0242", bi.cd0242a.isChecked() ? "1"
                : bi.cd0242b.isChecked() ? "2"
                : "-1");
        json.put("cd0242c", bi.cd0242c.getText().toString().trim().isEmpty() ? "-1" : bi.cd0242c.getText().toString());


        json.put("cd10", bi.cd10a.isChecked() ? "1"
                : bi.cd10b.isChecked() ? "2"
                : "-1");

        json.put("cd11", bi.cd11a.isChecked() ? "1"
                : bi.cd11b.isChecked() ? "2"
                : "-1");

        json.put("cd12", bi.cd12a.isChecked() ? "1"
                : bi.cd12b.isChecked() ? "2"
                : "-1");

        json.put("cd13", bi.cd13a.isChecked() ? "1"
                : bi.cd13b.isChecked() ? "2"
                : "-1");

        json.put("cd14", bi.cd14a.isChecked() ? "1"
                : bi.cd14b.isChecked() ? "2"
                : "-1");

        json.put("cd15", bi.cd15a.isChecked() ? "1"
                : bi.cd15b.isChecked() ? "2"
                : "-1");

        json.put("cd16", bi.cd16a.isChecked() ? "1"
                : bi.cd16b.isChecked() ? "2"
                : "-1");

        json.put("cd17", bi.cd17a.isChecked() ? "1"
                : bi.cd17b.isChecked() ? "2"
                : "-1");

        json.put("cd18", bi.cd18a.isChecked() ? "1"
                : bi.cd18b.isChecked() ? "2"
                : "-1");

        json.put("cd19", bi.cd19a.isChecked() ? "1"
                : bi.cd19b.isChecked() ? "2"
                : "-1");

        json.put("cd20", bi.cd20a.isChecked() ? "1"
                : bi.cd20b.isChecked() ? "2"
                : "-1");

        try {
            JSONObject json_merge = JSONUtils.mergeJSONObjects(new JSONObject(fc.getsC()), json);

            fc.setsC(String.valueOf(json_merge));
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
            startActivity(new Intent(this, SectionC5Activity.class));
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