package edu.aku.hassannaqvi.smk_pwd.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
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

import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionI2Binding;

import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;

public class SectionI2Activity extends AppCompatActivity {

    ActivitySectionI2Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_i2);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {
        radioGroupListener(bi.ib01, bi.ib01a, bi.llib01);
        radioGroupListener(bi.ib02, bi.ib02a, bi.llib02);
        radioGroupListener(bi.ib03, bi.ib03a, bi.llib03);
        radioGroupListener(bi.ib04, bi.ib04a, bi.llib04);
        radioGroupListener(bi.ib05, bi.ib05a, bi.llib05);
        radioGroupListener(bi.ib06, bi.ib06a, bi.llib06);
        radioGroupListener(bi.ib07, bi.ib07a, bi.llib07);
        radioGroupListener(bi.ib08, bi.ib08a, bi.llib08);
        watcherSetMax(bi.ib01dx, bi.ib01ex);
        watcherSetMax(bi.ib02dx, bi.ib02ex);
        watcherSetMax(bi.ib03dx, bi.ib03ex);
        watcherSetMax(bi.ib04dx, bi.ib04ex);
        watcherSetMax(bi.ib05dx, bi.ib05ex);
        watcherSetMax(bi.ib06dx, bi.ib06ex);
        watcherSetMax(bi.ib07dx, bi.ib07ex);
        watcherSetMax(bi.ib08dx, bi.ib08ex);
    }


    public void radioGroupListener(@NotNull RadioGroup rg, RadioButton rb, ViewGroup vg) {
        rg.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(vg);
            vg.setVisibility(View.GONE);
            if (i != rb.getId()) vg.setVisibility(View.VISIBLE);
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


    public void BtnContinue() {
        if (!formValidation()) return;
        try {
            SaveDraft();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (UpdateDB()) {
            startActivity(new Intent(this, SectionI3Activity.class));
            finish();
        }
    }


    private boolean UpdateDB() {
        /*DatabaseHelper db = MainApp.appInfo.getDbHelper();
        long updcount = db.addPSC(psc);
        psc.set_ID(String.valueOf(updcount));
        if (updcount > 0) {
            psc.set_UID(psc.getDeviceID() + psc.get_ID());
            db.updatesPSCColumn(PatientsContract.PatientsTable.COLUMN_UID, psc.get_UID());
            return true;
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show();
            return false;
        }*/
        return true;
    }


    private void SaveDraft() throws JSONException {


        /*form.setIb01(bi.ib01a.isChecked() ? "1"
                : bi.ib01b.isChecked() ? "2"
                : bi.ib01c.isChecked() ? "3"
                : bi.ib01d.isChecked() ? "4"
                : bi.ib01e.isChecked() ? "5"
                : "-1");

        form.setIb01dx(bi.ib01dx.getText().toString());
        form.setIb01ex(bi.ib01ex.getText().toString());
        form.setIb02(bi.ib02a.isChecked() ? "1"
                : bi.ib02b.isChecked() ? "2"
                : bi.ib02c.isChecked() ? "3"
                : bi.ib02d.isChecked() ? "4"
                : bi.ib02e.isChecked() ? "5"
                : "-1");

        form.setIb02dx(bi.ib02dx.getText().toString());
        form.setIb02ex(bi.ib02ex.getText().toString());
        form.setIb03(bi.ib03a.isChecked() ? "1"
                : bi.ib03b.isChecked() ? "2"
                : bi.ib03c.isChecked() ? "3"
                : bi.ib03d.isChecked() ? "4"
                : bi.ib03e.isChecked() ? "5"
                : "-1");

        form.setIb03dx(bi.ib03dx.getText().toString());
        form.setIb03ex(bi.ib03ex.getText().toString());
        form.setIb04(bi.ib04a.isChecked() ? "1"
                : bi.ib04b.isChecked() ? "2"
                : bi.ib04c.isChecked() ? "3"
                : bi.ib04d.isChecked() ? "4"
                : bi.ib04e.isChecked() ? "5"
                : "-1");

        form.setIb04dx(bi.ib04dx.getText().toString());
        form.setIb04ex(bi.ib04ex.getText().toString());
        form.setIb05(bi.ib05a.isChecked() ? "1"
                : bi.ib05b.isChecked() ? "2"
                : bi.ib05c.isChecked() ? "3"
                : bi.ib05d.isChecked() ? "4"
                : bi.ib05e.isChecked() ? "5"
                : "-1");

        form.setIb05dx(bi.ib05dx.getText().toString());
        form.setIb05ex(bi.ib05ex.getText().toString());
        form.setIb06(bi.ib06a.isChecked() ? "1"
                : bi.ib06b.isChecked() ? "2"
                : bi.ib06c.isChecked() ? "3"
                : bi.ib06d.isChecked() ? "4"
                : bi.ib06e.isChecked() ? "5"
                : "-1");

        form.setIb06dx(bi.ib06dx.getText().toString());
        form.setIb06ex(bi.ib06ex.getText().toString());
        form.setIb07(bi.ib07a.isChecked() ? "1"
                : bi.ib07b.isChecked() ? "2"
                : bi.ib07c.isChecked() ? "3"
                : bi.ib07d.isChecked() ? "4"
                : bi.ib07e.isChecked() ? "5"
                : "-1");

        form.setIb07dx(bi.ib07dx.getText().toString());
        form.setIb07ex(bi.ib07ex.getText().toString());
        form.setIb08(bi.ib08a.isChecked() ? "1"
                : bi.ib08b.isChecked() ? "2"
                : bi.ib08c.isChecked() ? "3"
                : bi.ib08d.isChecked() ? "4"
                : bi.ib08e.isChecked() ? "5"
                : "-1");

        form.setIb08dx(bi.ib08dx.getText().toString());
        form.setIb08ex(bi.ib08ex.getText().toString());*/

    }


    public void BtnEnd() {
        openSectionMainActivity(this, "I");
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
       /* if (!Validator.emptyCheckingContainer(this, bi.GrpName))
            return false;

        if (bi.i0106a.getText().toString().trim().length() > 0 && bi.i0106b.getText().toString().trim().length() > 0) {
            if (Integer.parseInt(bi.i0106a.getText().toString().trim()) + Integer.parseInt(bi.i0106a.getText().toString().trim()) == 0) {
                return ValidatorClass.EmptyCustomeTextBox(this, bi.i0106a, "Both!! Month & Year Can't be Zero!");
                //return Validator.emptyCheckingContainer(this, bi.i0106a);
            }
        }
        return true;*/
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }

}
