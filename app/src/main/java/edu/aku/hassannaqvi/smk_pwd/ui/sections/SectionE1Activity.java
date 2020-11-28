package edu.aku.hassannaqvi.smk_pwd.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionE1Binding;

import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;

public class SectionE1Activity extends AppCompatActivity {

    ActivitySectionE1Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_e1);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {

       /* bi.e11.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.e11b.getId()) {
                Clear.clearAllFields(bi.fldGrpe11);
            }
        }));*/

    }


    private boolean UpdateDB() {
        /*DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SE, fc.getsE());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show();
            return false;
        }*/
        return true;
    }


    private void SaveDraft() throws JSONException {

        /*form.setEa01( bi.ea01a.isChecked() ? "1"
                : bi.ea01b.isChecked() ? "2"
                : bi.ea01c.isChecked() ? "3"
                : bi.ea01d.isChecked() ? "4"
                : bi.ea01e.isChecked() ? "5"
                : bi.ea01f.isChecked() ? "6"
                : bi.ea0196.isChecked() ? "96"
                :  "-1");

        form.setEa0196x(bi.ea0196x.getText().toString());
        form.setEa02( bi.ea02a.isChecked() ? "1"
                : bi.ea02b.isChecked() ? "2"
                :  "-1");

        form.setEa03( bi.ea03a.isChecked() ? "1"
                : bi.ea0398.isChecked() ? "98"
                : bi.ea0396.isChecked() ? "96"
                :  "-1");

        form.setEa0396x(bi.ea0396x.getText().toString());
        form.setEa04( bi.ea04a.isChecked() ? "1"
                : bi.ea04b.isChecked() ? "2"
                : bi.ea04c.isChecked() ? "3"
                : bi.ea04d.isChecked() ? "4"
                : bi.ea04e.isChecked() ? "5"
                : bi.ea04f.isChecked() ? "6"
                : bi.ea04g.isChecked() ? "7"
                :  "-1");

        form.setEa05d(bi.ea05d.getText().toString());
        form.setEa05m(bi.ea05m.getText().toString());
        form.setEa06( bi.ea06a.isChecked() ? "1"
                : bi.ea06b.isChecked() ? "2"
                : bi.ea06c.isChecked() ? "3"
                : bi.ea06d.isChecked() ? "4"
                : bi.ea0696.isChecked() ? "96"
                :  "-1");

        form.setEa0696x(bi.ea0696x.getText().toString());
        form.setEa07( bi.ea07a.isChecked() ? "1"
                : bi.ea07b.isChecked() ? "2"
                : bi.ea07c.isChecked() ? "3"
                : bi.ea0796.isChecked() ? "96"
                :  "-1");

        form.setEa0796x(bi.ea0796x.getText().toString());
        form.setEa08( bi.ea08a.isChecked() ? "1"
                : bi.ea08b.isChecked() ? "2"
                : bi.ea08c.isChecked() ? "3"
                : bi.ea08d.isChecked() ? "4"
                :  "-1");

        form.setEa09d(bi.ea09d.getText().toString());
        form.setEa09m(bi.ea09m.getText().toString());
        form.setEa10( bi.ea10a.isChecked() ? "1"
                : bi.ea10b.isChecked() ? "2"
                :  "-1");

        form.setEa11( bi.ea11a.isChecked() ? "1"
                : bi.ea11b.isChecked() ? "2"
                : bi.ea11c.isChecked() ? "3"
                :  "-1");

        form.setEa12( bi.ea12a.isChecked() ? "1"
                : bi.ea12b.isChecked() ? "2"
                : bi.ea12c.isChecked() ? "3"
                :  "-1");

        form.setEa13( bi.ea13a.isChecked() ? "1"
                : bi.ea13b.isChecked() ? "2"
                :  "-1");

        form.setEa14( bi.ea14a.isChecked() ? "1"
                : bi.ea14b.isChecked() ? "2"
                : bi.ea14c.isChecked() ? "3"
                : bi.ea14d.isChecked() ? "4"
                : bi.ea14e.isChecked() ? "5"
                :  "-1");*/

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
            startActivity(new Intent(this, SectionE2Activity.class));
        }
    }


    public void BtnEnd() {
        openSectionMainActivity(this, "E");
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    public void showTooltip(@NotNull View view) {
        if (view.getId() != View.NO_ID) {
            String package_name = getApplicationContext().getPackageName();
            String infoid = view.getResources().getResourceName(view.getId()).replace(package_name + ":id/q_", "");
            int stringRes = this.getResources().getIdentifier(infoid + "_info", "string", getApplicationContext().getPackageName());
            //String infoText = (String) getResources().getText(stringRes);
            if (stringRes != 0) {
                String infoText = (String) getResources().getText(stringRes);

                new AlertDialog.Builder(this)
                        .setTitle("Info: " + infoid.toUpperCase())
                        .setMessage(infoText)
                        .setIcon(android.R.drawable.ic_dialog_info)
                        .show();
            } else {
                Toast.makeText(this, "No information available on this question.", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "No ID Associated with this question.", Toast.LENGTH_SHORT).show();

        }
    }

}
