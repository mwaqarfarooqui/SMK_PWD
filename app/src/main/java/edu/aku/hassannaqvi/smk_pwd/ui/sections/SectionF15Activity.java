package edu.aku.hassannaqvi.smk_pwd.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.edittextpicker.aliazaz.EditTextPicker;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionF15Binding;

import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;

public class SectionF15Activity extends AppCompatActivity {

    ActivitySectionF15Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_f15);
        bi.setCallback(this);
        setupSkips();
    }

    private void setupSkips() {
        watcherSetMax(bi.fo01a, bi.fo01b);
        watcherSetMax(bi.fo02a, bi.fo02b);
        watcherSetMax(bi.fo03a, bi.fo03b);
        watcherSetMax(bi.fo04a, bi.fo04b);
        watcherSetMax(bi.fo05a, bi.fo05b);
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
       /* DatabaseHelper db = MainApp.appInfo.getDbHelper();
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
        json.put("fo01a", bi.fo01a.getText().toString());

        json.put("fo01b", bi.fo01b.getText().toString());

        json.put("fo02a", bi.fo02a.getText().toString());

        json.put("fo02b", bi.fo02b.getText().toString());

        json.put("fo03a", bi.fo03a.getText().toString());

        json.put("fo03b", bi.fo03b.getText().toString());

        json.put("fo04a", bi.fo04a.getText().toString());

        json.put("fo04b", bi.fo04b.getText().toString());

        json.put("fo05a", bi.fo05a.getText().toString());

        json.put("fo05b", bi.fo05b.getText().toString());

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
            startActivity(new Intent(this, SectionF16Activity.class));
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