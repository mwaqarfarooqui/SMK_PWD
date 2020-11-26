package edu.aku.hassannaqvi.smk_pwd.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.smk_pwd.CONSTANTS;
import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionI1Binding;
import edu.aku.hassannaqvi.smk_pwd.ui.other.EndingActivity;
import edu.aku.hassannaqvi.smk_pwd.ui.other.SectionMainActivity;
import edu.aku.hassannaqvi.smk_pwd.utils.EndSectionActivity;

import static edu.aku.hassannaqvi.smk_pwd.CONSTANTS.SECTION_MAIN_CHECK_FOR_END;
import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivityI;


public class SectionI1Activity extends AppCompatActivity implements EndSectionActivity {

    ActivitySectionI1Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_i1);
        bi.setCallback(this);
        setupSkips();
        setupContent();
    }


    private void setupContent() {

       /* psc = new PatientsContract();

        bi.hfType.setText(MainApp.fc.getA10().equals("1") ? getString(R.string.hfpublic) : getString(R.string.hfprivate));
        bi.countI.setText(new StringBuilder("Entries: 0").append(SectionMainActivity.countI));*/

        /*if (MainApp.fc.getA10().equals("1")) {
            if (SectionMainActivity.paedsCount == 3) bi.i0108a.setEnabled(false);
            else if (SectionMainActivity.maternalCount == 3) bi.i0108b.setEnabled(false);
        }*/
    }


    private void setupSkips() {

        bi.ia01.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.ia01b.getId()) {
                Clear.clearAllFields(bi.llgrpsecsAq1);
            }
        }));
       /* bi.i0103.setOnCheckedChangeListener(((radioGroup, i) -> Clear.clearAllFields(bi.fldGrpCVi0104)));

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

       /* form.setIa01( bi.ia01a.isChecked() ? "1"
                : bi.ia01b.isChecked() ? "2"
                : bi.ia01c.isChecked() ? "3"
                :  "-1");

        form.setIa02( bi.ia02a.isChecked() ? "1"
                : bi.ia02b.isChecked() ? "2"
                : bi.ia02c.isChecked() ? "3"
                :  "-1");

        form.setIa03( bi.ia03a.isChecked() ? "1"
                : bi.ia03b.isChecked() ? "2"
                :  "-1");

        form.setIa04( bi.ia04a.isChecked() ? "1"
                : bi.ia04b.isChecked() ? "2"
                :  "-1");

        form.setIa05( bi.ia05a.isChecked() ? "1"
                : bi.ia05b.isChecked() ? "2"
                : bi.ia05c.isChecked() ? "3"
                : bi.ia05d.isChecked() ? "4"
                :  "-1");

        form.setIa06( bi.ia06a.isChecked() ? "1"
                : bi.ia06b.isChecked() ? "2"
                :  "-1");

        form.setIa07( bi.ia07a.isChecked() ? "1"
                : bi.ia07b.isChecked() ? "2"
                :  "-1");
*/


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
    }


    @Override
    public void onBackPressed() {
        if (SectionMainActivity.countI > 0) {
            Toast.makeText(getApplicationContext(), "Back Press Not Allowed", Toast.LENGTH_LONG).show();
        } else super.onBackPressed();
    }

}
