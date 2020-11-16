package edu.aku.hassannaqvi.smk_hfa_2020.ui.sections;

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

import edu.aku.hassannaqvi.smk_hfa_2020.R;
import edu.aku.hassannaqvi.smk_hfa_2020.contracts.FormsContract;
import edu.aku.hassannaqvi.smk_hfa_2020.core.DatabaseHelper;
import edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp;
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivitySectionH32Binding;
import edu.aku.hassannaqvi.smk_hfa_2020.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_hfa_2020.utils.UtilKt.openSectionMainActivity;


public class SectionH32Activity extends AppCompatActivity {

    ActivitySectionH32Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_h32);
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
            startActivity(new Intent(this, SectionH4Activity.class));
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

        JSONObject json = new JSONObject();

        json.put("h3114m1", bi.h3114m1.getText().toString().trim().isEmpty() ? "-1" : bi.h3114m1.getText().toString());
        json.put("h3114m2", bi.h3114m2.getText().toString().trim().isEmpty() ? "-1" : bi.h3114m2.getText().toString());
        json.put("h3114m3", bi.h3114m3.getText().toString().trim().isEmpty() ? "-1" : bi.h3114m3.getText().toString());


        json.put("h3114q1", bi.h3114q1y.isChecked() ? "1"
                : bi.h3114q1n.isChecked() ? "2"
                : "-1");

        json.put("h3115m1", bi.h3115m1.getText().toString().trim().isEmpty() ? "-1" : bi.h3115m1.getText().toString());
        json.put("h3115m2", bi.h3115m2.getText().toString().trim().isEmpty() ? "-1" : bi.h3115m2.getText().toString());
        json.put("h3115m3", bi.h3115m3.getText().toString().trim().isEmpty() ? "-1" : bi.h3115m3.getText().toString());

        json.put("h3115q1", bi.h3115q1y.isChecked() ? "1"
                : bi.h3115q1n.isChecked() ? "2"
                : "-1");

        json.put("h3116m1", bi.h3116m1.getText().toString().trim().isEmpty() ? "-1" : bi.h3116m1.getText().toString());
        json.put("h3116m2", bi.h3116m2.getText().toString().trim().isEmpty() ? "-1" : bi.h3116m2.getText().toString());
        json.put("h3116m3", bi.h3116m3.getText().toString().trim().isEmpty() ? "-1" : bi.h3116m3.getText().toString());

        json.put("h3116q1", bi.h3116q1y.isChecked() ? "1"
                : bi.h3116q1n.isChecked() ? "2"
                : "-1");

        json.put("h3117m1", bi.h3117m1.getText().toString().trim().isEmpty() ? "-1" : bi.h3117m1.getText().toString());
        json.put("h3117m2", bi.h3117m2.getText().toString().trim().isEmpty() ? "-1" : bi.h3117m2.getText().toString());
        json.put("h3117m3", bi.h3117m3.getText().toString().trim().isEmpty() ? "-1" : bi.h3117m3.getText().toString());

        json.put("h3117q1", bi.h3117q1y.isChecked() ? "1"
                : bi.h3117q1n.isChecked() ? "2"
                : "-1");

        json.put("h3118m1", bi.h3118m1.getText().toString().trim().isEmpty() ? "-1" : bi.h3118m1.getText().toString());
        json.put("h3118m2", bi.h3118m2.getText().toString().trim().isEmpty() ? "-1" : bi.h3118m2.getText().toString());
        json.put("h3118m3", bi.h3118m3.getText().toString().trim().isEmpty() ? "-1" : bi.h3118m3.getText().toString());

        json.put("h3118q1", bi.h3118q1y.isChecked() ? "1"
                : bi.h3118q1n.isChecked() ? "2"
                : "-1");

        json.put("h3119m1", bi.h3119m1.getText().toString().trim().isEmpty() ? "-1" : bi.h3119m1.getText().toString());
        json.put("h3119m2", bi.h3119m2.getText().toString().trim().isEmpty() ? "-1" : bi.h3119m2.getText().toString());
        json.put("h3119m3", bi.h3119m3.getText().toString().trim().isEmpty() ? "-1" : bi.h3119m3.getText().toString());

        json.put("h3119q1", bi.h3119q1y.isChecked() ? "1"
                : bi.h3119q1n.isChecked() ? "2"
                : "-1");

        json.put("h3120m1", bi.h3120m1.getText().toString().trim().isEmpty() ? "-1" : bi.h3120m1.getText().toString());
        json.put("h3120m2", bi.h3120m2.getText().toString().trim().isEmpty() ? "-1" : bi.h3120m2.getText().toString());
        json.put("h3120m3", bi.h3120m3.getText().toString().trim().isEmpty() ? "-1" : bi.h3120m3.getText().toString());

        json.put("h3120q1", bi.h3120q1y.isChecked() ? "1"
                : bi.h3120q1n.isChecked() ? "2"
                : "-1");

        json.put("h3121m1", bi.h3121m1.getText().toString().trim().isEmpty() ? "-1" : bi.h3121m1.getText().toString());
        json.put("h3121m2", bi.h3121m2.getText().toString().trim().isEmpty() ? "-1" : bi.h3121m2.getText().toString());
        json.put("h3121m3", bi.h3121m3.getText().toString().trim().isEmpty() ? "-1" : bi.h3121m3.getText().toString());

        json.put("h3121q1", bi.h3121q1y.isChecked() ? "1"
                : bi.h3121q1n.isChecked() ? "2"
                : "-1");

        json.put("h3122m1", bi.h3122m1.getText().toString().trim().isEmpty() ? "-1" : bi.h3122m1.getText().toString());
        json.put("h3122m2", bi.h3122m2.getText().toString().trim().isEmpty() ? "-1" : bi.h3122m2.getText().toString());
        json.put("h3122m3", bi.h3122m3.getText().toString().trim().isEmpty() ? "-1" : bi.h3122m3.getText().toString());

        json.put("h3122q1", bi.h3122q1y.isChecked() ? "1"
                : bi.h3122q1n.isChecked() ? "2"
                : "-1");

        json.put("h3123m1", bi.h3123m1.getText().toString().trim().isEmpty() ? "-1" : bi.h3123m1.getText().toString());
        json.put("h3123m2", bi.h3123m2.getText().toString().trim().isEmpty() ? "-1" : bi.h3123m2.getText().toString());
        json.put("h3123m3", bi.h3123m3.getText().toString().trim().isEmpty() ? "-1" : bi.h3123m3.getText().toString());

        json.put("h3123q1", bi.h3123q1y.isChecked() ? "1"
                : bi.h3123q1n.isChecked() ? "2"
                : "-1");

        json.put("h3124m1", bi.h3124m1.getText().toString().trim().isEmpty() ? "-1" : bi.h3124m1.getText().toString());
        json.put("h3124m2", bi.h3124m2.getText().toString().trim().isEmpty() ? "-1" : bi.h3124m2.getText().toString());
        json.put("h3124m3", bi.h3124m3.getText().toString().trim().isEmpty() ? "-1" : bi.h3124m3.getText().toString());

        json.put("h3124q1", bi.h3124q1y.isChecked() ? "1"
                : bi.h3124q1n.isChecked() ? "2"
                : "-1");

        json.put("h3125m1", bi.h3125m1.getText().toString().trim().isEmpty() ? "-1" : bi.h3125m1.getText().toString());
        json.put("h3125m2", bi.h3125m2.getText().toString().trim().isEmpty() ? "-1" : bi.h3125m2.getText().toString());
        json.put("h3125m3", bi.h3125m3.getText().toString().trim().isEmpty() ? "-1" : bi.h3125m3.getText().toString());

        json.put("h3125q1", bi.h3125q1y.isChecked() ? "1"
                : bi.h3125q1n.isChecked() ? "2"
                : "-1");

        json.put("h3126m1", bi.h3126m1.getText().toString().trim().isEmpty() ? "-1" : bi.h3126m1.getText().toString());
        json.put("h3126m2", bi.h3126m2.getText().toString().trim().isEmpty() ? "-1" : bi.h3126m2.getText().toString());
        json.put("h3126m3", bi.h3126m3.getText().toString().trim().isEmpty() ? "-1" : bi.h3126m3.getText().toString());

        json.put("h3126q1", bi.h3126q1y.isChecked() ? "1"
                : bi.h3126q1n.isChecked() ? "2"
                : "-1");

        json.put("h3127m1", bi.h3127m1.getText().toString().trim().isEmpty() ? "-1" : bi.h3127m1.getText().toString());
        json.put("h3127m2", bi.h3127m2.getText().toString().trim().isEmpty() ? "-1" : bi.h3127m2.getText().toString());
        json.put("h3127m3", bi.h3127m3.getText().toString().trim().isEmpty() ? "-1" : bi.h3127m3.getText().toString());

        json.put("h3127q1", bi.h3127q1y.isChecked() ? "1"
                : bi.h3127q1n.isChecked() ? "2"
                : "-1");

        try {
            JSONObject json_merge = JSONUtils.mergeJSONObjects(new JSONObject(fc.getsH()), json);

            fc.setsH(String.valueOf(json_merge));

        } catch (JSONException e) {
            e.printStackTrace();
        }

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
