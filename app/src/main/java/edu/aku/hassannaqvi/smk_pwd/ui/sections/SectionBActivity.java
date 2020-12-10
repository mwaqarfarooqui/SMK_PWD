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
import org.json.JSONObject;

import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.contracts.FormsContract;
import edu.aku.hassannaqvi.smk_pwd.core.DatabaseHelper;
import edu.aku.hassannaqvi.smk_pwd.core.MainApp;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionBBinding;
import edu.aku.hassannaqvi.smk_pwd.ui.other.SectionMainActivity;

import static edu.aku.hassannaqvi.smk_pwd.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;
import static java.lang.Float.parseFloat;

public class SectionBActivity extends AppCompatActivity {

    ActivitySectionBBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_b);
        bi.setCallback(this);
        setupSkips();
        setupTextWatchers();
    }


    private void setupSkips() {

        /*if (fc.getA10().equals("1")) {
            bi.a17h.setVisibility(View.GONE);
            bi.a17i.setVisibility(View.GONE);
            bi.a17j.setVisibility(View.GONE);
        }

        if (fc.getA10().equals("2")) {
            bi.a17a.setVisibility(View.GONE);
            bi.a17b.setVisibility(View.GONE);
            bi.a17c.setVisibility(View.GONE);
            bi.a17d.setVisibility(View.GONE);
            bi.a17e.setVisibility(View.GONE);
            bi.a17f.setVisibility(View.GONE);
            bi.a17g.setVisibility(View.GONE);
        }

        bi.a18.setOnCheckedChangeListener(((radioGroup, i) -> {
            Clear.clearAllFields(bi.fldGrpCVa19);
        }));*/

    }


    private void setupTextWatchers() {
        editTextImplementation(bi.ba01a1, new EditTextPicker[]{bi.ba01a2, bi.ba01a4, bi.ba01a5}, bi.ba01a3);
        editTextImplementation(bi.ba01b1, new EditTextPicker[]{bi.ba01b2, bi.ba01b4, bi.ba01b5}, bi.ba01b3);
        editTextImplementation(bi.ba01c1, new EditTextPicker[]{bi.ba01c2, bi.ba01c4, bi.ba01c5}, bi.ba01c3);
        editTextImplementation(bi.ba01d1, new EditTextPicker[]{bi.ba01d2, bi.ba01d4, bi.ba01d5}, bi.ba01d3);
        editTextImplementation(bi.ba01e1, new EditTextPicker[]{bi.ba01e2, bi.ba01e4, bi.ba01e5}, bi.ba01e3);
        editTextImplementation(bi.ba01f1, new EditTextPicker[]{bi.ba01f2, bi.ba01f4, bi.ba01f5}, bi.ba01f3);
        editTextImplementation(bi.ba01g1, new EditTextPicker[]{bi.ba01g2, bi.ba01g4, bi.ba01g5}, bi.ba01g3);
        editTextImplementation(bi.ba01h1, new EditTextPicker[]{bi.ba01h2, bi.ba01h4, bi.ba01h5}, bi.ba01h3);
    }


    public void editTextImplementation(EditTextPicker edit01, EditTextPicker[] editTextsArray, EditTextPicker edit02) {

        edit01.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (TextUtils.isEmpty(edit01.getText()))
                    return;
                for (EditTextPicker item : editTextsArray) {
                    item.setMaxvalue(Integer.parseInt(edit01.getText().toString().trim()));
                }
            }
        });


        editTextsArray[0].addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (TextUtils.isEmpty(edit01.getText()) || TextUtils.isEmpty(editTextsArray[0].getText()))
                    return;
                edit02.setText("");
                edit02.setEnabled(false);
                editTextsArray[1].setMaxvalue(Integer.parseInt(editTextsArray[0].getText().toString().trim()));
                editTextsArray[2].setMaxvalue(Integer.parseInt(editTextsArray[0].getText().toString().trim()));
                edit02.setText(String.valueOf(parseFloat(edit01.getText().toString().trim()) - parseFloat(editTextsArray[0].getText().toString().trim())));

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

    }


    public void BtnContinue() {
        if (!formValidation()) return;
        try {
            SaveDraft();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (UpdateDB()) {
            startActivity(new Intent(this, SectionMainActivity.class));
            finish();
        }
    }


    public void BtnEnd() {
        openSectionMainActivity(this, "B");
    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SB, fc.getsB());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    /*@Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }*/


    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("ba01a1", bi.ba01a1.getText().toString().trim().isEmpty() ? "-1" : bi.ba01a1.getText().toString());
        json.put("ba01a2", bi.ba01a2.getText().toString().trim().isEmpty() ? "-1" : bi.ba01a2.getText().toString());
        json.put("ba01a3", bi.ba01a3.getText().toString().trim().isEmpty() ? "-1" : bi.ba01a3.getText().toString());
        json.put("ba01a4", bi.ba01a4.getText().toString().trim().isEmpty() ? "-1" : bi.ba01a4.getText().toString());
        json.put("ba01a5", bi.ba01a5.getText().toString().trim().isEmpty() ? "-1" : bi.ba01a5.getText().toString());

        json.put("ba01b1", bi.ba01b1.getText().toString().trim().isEmpty() ? "-1" : bi.ba01b1.getText().toString());
        json.put("ba01b2", bi.ba01b2.getText().toString().trim().isEmpty() ? "-1" : bi.ba01b2.getText().toString());
        json.put("ba01b3", bi.ba01b3.getText().toString().trim().isEmpty() ? "-1" : bi.ba01b3.getText().toString());
        json.put("ba01b4", bi.ba01b4.getText().toString().trim().isEmpty() ? "-1" : bi.ba01b4.getText().toString());
        json.put("ba01b5", bi.ba01b5.getText().toString().trim().isEmpty() ? "-1" : bi.ba01b5.getText().toString());

        json.put("ba01c1", bi.ba01c1.getText().toString().trim().isEmpty() ? "-1" : bi.ba01c1.getText().toString());
        json.put("ba01c2", bi.ba01c2.getText().toString().trim().isEmpty() ? "-1" : bi.ba01c2.getText().toString());
        json.put("ba01c3", bi.ba01c3.getText().toString().trim().isEmpty() ? "-1" : bi.ba01c3.getText().toString());
        json.put("ba01c4", bi.ba01c4.getText().toString().trim().isEmpty() ? "-1" : bi.ba01c4.getText().toString());
        json.put("ba01c5", bi.ba01c5.getText().toString().trim().isEmpty() ? "-1" : bi.ba01c5.getText().toString());

        json.put("ba01d1", bi.ba01d1.getText().toString().trim().isEmpty() ? "-1" : bi.ba01d1.getText().toString());
        json.put("ba01d2", bi.ba01d2.getText().toString().trim().isEmpty() ? "-1" : bi.ba01d2.getText().toString());
        json.put("ba01d3", bi.ba01d3.getText().toString().trim().isEmpty() ? "-1" : bi.ba01d3.getText().toString());
        json.put("ba01d4", bi.ba01d4.getText().toString().trim().isEmpty() ? "-1" : bi.ba01d4.getText().toString());
        json.put("ba01d5", bi.ba01d5.getText().toString().trim().isEmpty() ? "-1" : bi.ba01d5.getText().toString());

        json.put("ba01e1", bi.ba01e1.getText().toString().trim().isEmpty() ? "-1" : bi.ba01e1.getText().toString());
        json.put("ba01e2", bi.ba01e2.getText().toString().trim().isEmpty() ? "-1" : bi.ba01e2.getText().toString());
        json.put("ba01e3", bi.ba01e3.getText().toString().trim().isEmpty() ? "-1" : bi.ba01e3.getText().toString());
        json.put("ba01e4", bi.ba01e4.getText().toString().trim().isEmpty() ? "-1" : bi.ba01e4.getText().toString());
        json.put("ba01e5", bi.ba01e5.getText().toString().trim().isEmpty() ? "-1" : bi.ba01e5.getText().toString());

        json.put("ba01f1", bi.ba01f1.getText().toString().trim().isEmpty() ? "-1" : bi.ba01f1.getText().toString());
        json.put("ba01f2", bi.ba01f2.getText().toString().trim().isEmpty() ? "-1" : bi.ba01f2.getText().toString());
        json.put("ba01f3", bi.ba01f3.getText().toString().trim().isEmpty() ? "-1" : bi.ba01f3.getText().toString());
        json.put("ba01f4", bi.ba01f4.getText().toString().trim().isEmpty() ? "-1" : bi.ba01f4.getText().toString());
        json.put("ba01f5", bi.ba01f5.getText().toString().trim().isEmpty() ? "-1" : bi.ba01f5.getText().toString());

        json.put("ba01g1", bi.ba01g1.getText().toString().trim().isEmpty() ? "-1" : bi.ba01g1.getText().toString());
        json.put("ba01g2", bi.ba01g2.getText().toString().trim().isEmpty() ? "-1" : bi.ba01g2.getText().toString());
        json.put("ba01g3", bi.ba01g3.getText().toString().trim().isEmpty() ? "-1" : bi.ba01g3.getText().toString());
        json.put("ba01g4", bi.ba01g4.getText().toString().trim().isEmpty() ? "-1" : bi.ba01g4.getText().toString());
        json.put("ba01g5", bi.ba01g5.getText().toString().trim().isEmpty() ? "-1" : bi.ba01g5.getText().toString());

        json.put("ba01h1", bi.ba01h1.getText().toString().trim().isEmpty() ? "-1" : bi.ba01h1.getText().toString());
        json.put("ba01h2", bi.ba01h2.getText().toString().trim().isEmpty() ? "-1" : bi.ba01h2.getText().toString());
        json.put("ba01h3", bi.ba01h3.getText().toString().trim().isEmpty() ? "-1" : bi.ba01h3.getText().toString());
        json.put("ba01h4", bi.ba01h4.getText().toString().trim().isEmpty() ? "-1" : bi.ba01h4.getText().toString());
        json.put("ba01h5", bi.ba01h5.getText().toString().trim().isEmpty() ? "-1" : bi.ba01h5.getText().toString());

        MainApp.fc.setsB(json.toString());

    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

}
