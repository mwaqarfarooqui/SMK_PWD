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
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionE2Binding;

import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;

public class SectionE2Activity extends AppCompatActivity {

    ActivitySectionE2Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_e2);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {

        bi.eb03.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.eb03b.getId()) {
                Clear.clearAllFields(bi.fldGrpCVeb03y);
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

        /*form.setEb01( bi.eb01a.isChecked() ? "1"
                : bi.eb01b.isChecked() ? "2"
                : bi.eb01c.isChecked() ? "3"
                :  "-1");

        form.setEb02( bi.eb02a.isChecked() ? "1"
                : bi.eb02b.isChecked() ? "2"
                : bi.eb02c.isChecked() ? "3"
                :  "-1");

        form.setEb03( bi.eb03a.isChecked() ? "1"
                : bi.eb03b.isChecked() ? "2"
                :  "-1");

        form.setEb03t(bi.eb03t.getText().toString());
        form.setEb04( bi.eb04a.isChecked() ? "1"
                : bi.eb04b.isChecked() ? "2"
                : bi.eb04c.isChecked() ? "3"
                :  "-1");

        form.setEb05( bi.eb05a.isChecked() ? "1"
                : bi.eb05b.isChecked() ? "2"
                :  "-1");

        form.setEb06( bi.eb06a.isChecked() ? "1"
                : bi.eb06b.isChecked() ? "2"
                :  "-1");

        form.setEb07( bi.eb07a.isChecked() ? "1"
                : bi.eb07b.isChecked() ? "2"
                : bi.eb07c.isChecked() ? "3"
                :  "-1");

        form.setEb08a(bi.eb08a.isChecked() ? "1" : "-1");

        form.setEb08b(bi.eb08b.isChecked() ? "2" : "-1");

        form.setEb08c(bi.eb08c.isChecked() ? "3" : "-1");

        form.setEb08d(bi.eb08d.isChecked() ? "4" : "-1");

        form.setEb0896(bi.eb0896.isChecked() ? "96" : "-1");

        form.setEb0896x(bi.eb0896x.getText().toString());*/

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
            startActivity(new Intent(this, SectionE3Activity.class));
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
