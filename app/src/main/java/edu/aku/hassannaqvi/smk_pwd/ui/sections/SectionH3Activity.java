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
import org.json.JSONObject;

import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.contracts.FormsContract;
import edu.aku.hassannaqvi.smk_pwd.core.DatabaseHelper;
import edu.aku.hassannaqvi.smk_pwd.core.MainApp;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionH3Binding;
import edu.aku.hassannaqvi.smk_pwd.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_pwd.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;


public class SectionH3Activity extends AppCompatActivity {

    ActivitySectionH3Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_h3);
        bi.setCallback(this);

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
            startActivity(new Intent(this, SectionH32Activity.class));
        }
    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SH, MainApp.fc.getsH());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private void SaveDraft() throws JSONException {

       /* form.setHc01( bi.hc01a.isChecked() ? "1"
                : bi.hc01b.isChecked() ? "2"
                :  "-1");

        form.setHc02( bi.hc02a.isChecked() ? "1"
                : bi.hc02b.isChecked() ? "2"
                :  "-1");

        form.setHc03( bi.hc03a.isChecked() ? "1"
                : bi.hc03b.isChecked() ? "2"
                :  "-1");

        form.setHc04( bi.hc04a.isChecked() ? "1"
                : bi.hc04b.isChecked() ? "2"
                :  "-1");

        form.setHc05( bi.hc05a.isChecked() ? "1"
                : bi.hc05b.isChecked() ? "2"
                :  "-1");

        form.setHc06a(bi.hc06a.isChecked() ? "1" : "-1");

        form.setHc06b(bi.hc06b.isChecked() ? "2" : "-1");

        form.setHc06c(bi.hc06c.isChecked() ? "3" : "-1");

        form.setHc06d(bi.hc06d.isChecked() ? "4" : "-1");

        form.setHc06e(bi.hc06e.isChecked() ? "5" : "-1");

        form.setHc0696(bi.hc0696.isChecked() ? "96" : "-1");

        form.setHc0696x(bi.hc0696x.getText().toString());*/

    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    public void BtnEnd() {
        openSectionMainActivity(this, "H");
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
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
