package edu.aku.hassannaqvi.smk_pwd.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionE3Binding;
import edu.aku.hassannaqvi.smk_pwd.ui.other.SectionMainActivity;

import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;

public class SectionE3Activity extends AppCompatActivity {

    ActivitySectionE3Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_e3);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {

        bi.ec01a.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.ec01y.getId()) {
                Clear.clearAllFields(bi.fldGrpCVec02s);
            }
        }));

        bi.ec03a.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.ec03y.getId()) {
                Clear.clearAllFields(bi.fldGrpCVec04s);
            }
        }));

        bi.ec05a.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.ec05y.getId()) {
                Clear.clearAllFields(bi.fldGrpCVec06s);
            }
        }));

        bi.ec07a.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.ec07y.getId()) {
                Clear.clearAllFields(bi.fldGrpCVec08s);
            }
        }));

        bi.ec09a.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.ec09y.getId()) {
                Clear.clearAllFields(bi.fldGrpCVec10s);
            }
        }));

        bi.ec11a.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.ec11y.getId()) {
                Clear.clearAllFields(bi.fldGrpCVec12s);
            }
        }));

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

       /* form.setEc01a( bi.ec01y.isChecked() ? "1"
                : bi.ec01n.isChecked() ? "2"
                :  "-1");

        form.setEc02d(bi.ec02d.getText().toString());
        form.setEc02m(bi.ec02m.getText().toString());
        form.setEc03a( bi.ec03y.isChecked() ? "1"
                : bi.ec03n.isChecked() ? "2"
                :  "-1");

        form.setEc04d(bi.ec04d.getText().toString());
        form.setEc04m(bi.ec04m.getText().toString());
        form.setEc05a( bi.ec05y.isChecked() ? "1"
                : bi.ec05n.isChecked() ? "2"
                :  "-1");

        form.setEc06d(bi.ec06d.getText().toString());
        form.setEc06m(bi.ec06m.getText().toString());
        form.setEc07a( bi.ec07y.isChecked() ? "1"
                : bi.ec07n.isChecked() ? "2"
                :  "-1");

        form.setEc08d(bi.ec08d.getText().toString());
        form.setEc08m(bi.ec08m.getText().toString());
        form.setEc09a( bi.ec09y.isChecked() ? "1"
                : bi.ec09n.isChecked() ? "2"
                :  "-1");

        form.setEc10d(bi.ec10d.getText().toString());
        form.setEc10m(bi.ec10m.getText().toString());
        form.setEc11a( bi.ec11y.isChecked() ? "1"
                : bi.ec11n.isChecked() ? "2"
                :  "-1");

        form.setEc12d(bi.ec12d.getText().toString());
        form.setEc12m(bi.ec12m.getText().toString());*/

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
            startActivity(new Intent(this, SectionMainActivity.class));
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
