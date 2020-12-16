package edu.aku.hassannaqvi.smk_pwd.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionI1Binding;

import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;


public class SectionI1Activity extends AppCompatActivity {

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
        radioGroupListener(bi.ia01, bi.ia01c, bi.llia01c);
    }


    public void radioGroupListener(@NotNull RadioGroup rg, RadioButton rb, ViewGroup vg) {
        rg.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(vg);
            vg.setVisibility(View.VISIBLE);
            if (i == rb.getId()) {
                vg.setVisibility(View.GONE);
            }
        });
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


    public void BtnContinue() {
        if (!formValidation()) return;
        try {
            SaveDraft();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (UpdateDB()) {
            startActivity(new Intent(this, SectionI2Activity.class));
            finish();
        }
    }


    public void BtnEnd() {
        openSectionMainActivity(this, "I");
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

}
