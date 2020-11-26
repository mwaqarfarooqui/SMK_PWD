package edu.aku.hassannaqvi.smk_pwd.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.smk_pwd.CONSTANTS;
import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionI2Binding;
import edu.aku.hassannaqvi.smk_pwd.ui.other.EndingActivity;
import edu.aku.hassannaqvi.smk_pwd.ui.other.SectionMainActivity;

import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivityI;

public class SectionI2Activity extends AppCompatActivity {

    ActivitySectionI2Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_i2);
        bi.setCallback(this);
        setupSkips();
        setupContent();
    }


    private void setupContent() {

        /*psc = new PatientsContract();

        bi.hfType.setText(MainApp.fc.getA10().equals("1") ? getString(R.string.hfpublic) : getString(R.string.hfprivate));
        bi.countI.setText(new StringBuilder("Entries: 0").append(SectionMainActivity.countI));*/

        /*if (MainApp.fc.getA10().equals("1")) {
            if (SectionMainActivity.paedsCount == 3) bi.i0108a.setEnabled(false);
            else if (SectionMainActivity.maternalCount == 3) bi.i0108b.setEnabled(false);
        }*/
    }


    private void setupSkips() {

        /*bi.i0103.setOnCheckedChangeListener(((radioGroup, i) -> Clear.clearAllFields(bi.fldGrpCVi0104)));

        bi.i0110a.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                bi.i0110b.setChecked(false);
                bi.i0110b.setEnabled(false);
                bi.i0110c.setChecked(false);
                bi.i0110c.setEnabled(false);
            } else {
                bi.i0110b.setEnabled(true);
                bi.i0110c.setEnabled(true);
            }
        });

        bi.i0111a.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                bi.i0111b.setChecked(false);
                bi.i0111b.setEnabled(false);
                bi.i0111c.setChecked(false);
                bi.i0111c.setEnabled(false);
            } else {
                bi.i0111b.setEnabled(true);
                bi.i0111c.setEnabled(true);
            }
        });*/

        /*bi.i0108.setOnCheckedChangeListener(((radioGroup, i) -> {

            if (i == bi.i0108a.getId()) {
                Clear.clearAllFields(bi.fldGrpCVi0105);
                bi.i0105a.setEnabled(true);
                Clear.clearAllFields(bi.fldGrpCVi0106);
                bi.i0106a.setMaxvalue(5);
                bi.i0106a.setMinvalue(0);
            } else if (i == bi.i0108b.getId()) {
                Clear.clearAllFields(bi.fldGrpCVi0105);
                bi.i0105a.setEnabled(false);
                bi.i0105b.setChecked(true);
                Clear.clearAllFields(bi.fldGrpCVi0106);
                bi.i0106a.setMaxvalue(49);
                bi.i0106a.setMinvalue(15);
            }

        }));*/


        /*bi.i0106a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }


            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (TextUtils.isEmpty(bi.i0106a.getText()))
                    return;
                if (bi.i0108a.isChecked() && Integer.parseInt(bi.i0106a.getText().toString()) == 5) {
                    bi.i0106b.setMaxvalue(0);
                } else if (bi.i0108b.isChecked() && Integer.parseInt(bi.i0106a.getText().toString()) == 49) {
                    bi.i0106b.setMaxvalue(0);
                } else {
                    bi.i0106b.setMaxvalue(11);
                }

            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });*/


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
            SectionMainActivity.countI++;
            startActivity(new Intent(this, EndingActivity.class).putExtra("complete", true).putExtra(CONSTANTS.SECTION_MAIN_CHECK_FOR_END, true)
                    .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
        } else {
            Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
        }
    }


    public void BtnEnd() {
        /*if (!Validator.emptyCheckingContainer(this, bi.fldGrpEndForm)) return;
        contextEndActivity(this);*/
        openSectionMainActivityI(this);
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


    /*@Override
    public void endSecActivity(boolean flag) {
        try {
            SaveDraft();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (UpdateDB()) {
            finish();
            SectionMainActivity.countI++;
            startActivity(new Intent(this, EndingActivity.class).putExtra(SECTION_MAIN_CHECK_FOR_END, true)
                    .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
        } else {
            Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
        }
    }*/


    @Override
    public void onBackPressed() {
        if (SectionMainActivity.countI > 0) {
            Toast.makeText(getApplicationContext(), "Back Press Not Allowed", Toast.LENGTH_LONG).show();
        } else super.onBackPressed();
    }

}
