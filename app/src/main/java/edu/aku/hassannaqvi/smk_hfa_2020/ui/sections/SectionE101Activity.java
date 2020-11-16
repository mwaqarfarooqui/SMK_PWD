package edu.aku.hassannaqvi.smk_hfa_2020.ui.sections;

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
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.smk_hfa_2020.R;
import edu.aku.hassannaqvi.smk_hfa_2020.contracts.FormsContract;
import edu.aku.hassannaqvi.smk_hfa_2020.core.DatabaseHelper;
import edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp;
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivitySectionE101Binding;

import static edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_hfa_2020.utils.UtilKt.openSectionMainActivity;

public class SectionE101Activity extends AppCompatActivity {

    ActivitySectionE101Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_e101);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {

        bi.e11.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.e11b.getId()) {
                Clear.clearAllFields(bi.fldGrpe11);
            }
        }));

        bi.e14a.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.e14ab.getId()) {
                Clear.clearAllFields(bi.fldGrpe14a);
            }
        }));
    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SE, fc.getsE());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("FDate", new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date().getTime()));
        json.put("FTime", new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date().getTime()));

        json.put("e11", bi.e11a.isChecked() ? "1"
                : bi.e11b.isChecked() ? "2"
                : "-1");

        json.put("e12a", bi.e12aa.isChecked() ? "1"
                : bi.e12ab.isChecked() ? "2"
                : "-1");

        json.put("e12b", bi.e12ba.isChecked() ? "1"
                : bi.e12bb.isChecked() ? "2"
                : "-1");

        json.put("e12c", bi.e12ca.isChecked() ? "1"
                : bi.e12cb.isChecked() ? "2"
                : "-1");

        json.put("e12d", bi.e12da.isChecked() ? "1"
                : bi.e12db.isChecked() ? "2"
                : "-1");

        json.put("e12e", bi.e12ea.isChecked() ? "1"
                : bi.e12eb.isChecked() ? "2"
                : "-1");

        json.put("e12f", bi.e12fa.isChecked() ? "1"
                : bi.e12fb.isChecked() ? "2"
                : "-1");

        json.put("e12g", bi.e12ga.isChecked() ? "1"
                : bi.e12gb.isChecked() ? "2"
                : "-1");

        json.put("e12h", bi.e12ha.isChecked() ? "1"
                : bi.e12hb.isChecked() ? "2"
                : "-1");

        json.put("e12i", bi.e12ia.isChecked() ? "1"
                : bi.e12ib.isChecked() ? "2"
                : "-1");

        json.put("e12j", bi.e12ja.isChecked() ? "1"
                : bi.e12jb.isChecked() ? "2"
                : "-1");

        json.put("e13a", bi.e13aa.isChecked() ? "1"
                : bi.e13ab.isChecked() ? "2"
                : bi.e13ac.isChecked() ? "3"
                :  "-1");

        json.put("e13b", bi.e13ba.isChecked() ? "1"
                : bi.e13bb.isChecked() ? "2"
                : bi.e13bc.isChecked() ? "3"
                : "-1");

        json.put("e14a", bi.e14aa.isChecked() ? "1"
                : bi.e14ab.isChecked() ? "2"
                : "-1");

        json.put("e14b", bi.e14ba.isChecked() ? "1"
                : bi.e14bb.isChecked() ? "2"
                : "-1");

        json.put("e14c", bi.e14c.getText().toString().trim().isEmpty() ? "-1" : bi.e14c.getText().toString());
        json.put("e14d", bi.e14d.getText().toString().trim().isEmpty() ? "-1" : bi.e14d.getText().toString());

        json.put("e14e", bi.e14ea.isChecked() ? "1"
                : bi.e14ex.isChecked() ? "96"
                : "-1");
        json.put("e14exx", bi.e14exx.getText().toString().trim().isEmpty() ? "-1" : bi.e14exx.getText().toString());

        MainApp.fc.setsE(String.valueOf(json));

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
            startActivity(new Intent(this, bi.e11b.isChecked() ? SectionE2Activity.class : SectionE102Activity.class));
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
