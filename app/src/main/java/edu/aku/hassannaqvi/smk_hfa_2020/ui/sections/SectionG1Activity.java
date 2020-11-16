package edu.aku.hassannaqvi.smk_hfa_2020.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.smk_hfa_2020.R;
import edu.aku.hassannaqvi.smk_hfa_2020.contracts.FormsContract;
import edu.aku.hassannaqvi.smk_hfa_2020.core.DatabaseHelper;
import edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp;
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivitySectionG1Binding;

import static edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp.fc;

public class SectionG1Activity extends AppCompatActivity {

    ActivitySectionG1Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_g1);
        bi.setCallback(this);
        setupSkips();

    }


    private void setupSkips() {

        bi.g01110b.setOnCheckedChangeListener(((radioGroup, i) -> {
            Clear.clearAllFields(bi.llGrpsecg01);
        }));

    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SG, fc.getsG());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("GDate", new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date().getTime()));
        json.put("GTime", new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date().getTime()));

        json.put("g0101", bi.g0101a.isChecked() ? "1"
                : bi.g0101b.isChecked() ? "2"
                : bi.g0101c.isChecked() ? "3"
                : bi.g0101d.isChecked() ? "4"
                : bi.g0101e.isChecked() ? "5"
                : bi.g0101f.isChecked() ? "6"
                : bi.g0101x.isChecked() ? "96"
                : "-1");
        json.put("g0101xx", bi.g0101xx.getText().toString().trim().isEmpty() ? "-1" : bi.g0101xx.getText().toString());


        json.put("g0102", bi.g0102a.isChecked() ? "1"
                : bi.g0102b.isChecked() ? "2"
                : "-1");

        json.put("g0103", bi.g0103a.isChecked() ? "1"
                : bi.g0103b.isChecked() ? "98"
                : bi.g0103x.isChecked() ? "96"
                : "-1");
        json.put("g0103xx", bi.g0103xx.getText().toString().trim().isEmpty() ? "-1" : bi.g0103xx.getText().toString());

        json.put("g0104", bi.g0104a.isChecked() ? "1"
                : bi.g0104b.isChecked() ? "2"
                : bi.g0104c.isChecked() ? "3"
                : bi.g0104d.isChecked() ? "4"
                : bi.g0104e.isChecked() ? "5"
                : bi.g0104f.isChecked() ? "6"
                : bi.g0104g.isChecked() ? "7"
                : "-1");

        json.put("g0105ax", bi.g0105ax.getText().toString().trim().isEmpty() ? "-1" : bi.g0105ax.getText().toString());
        json.put("g0105bx", bi.g0105bx.getText().toString().trim().isEmpty() ? "-1" : bi.g0105bx.getText().toString());

        json.put("g0106", bi.g0106a.isChecked() ? "1"
                : bi.g0106b.isChecked() ? "2"
                : bi.g0106c.isChecked() ? "3"
                : bi.g0106d.isChecked() ? "4"
                : bi.g0106x.isChecked() ? "96"
                : "-1");
        json.put("g0106xx", bi.g0106xx.getText().toString().trim().isEmpty() ? "-1" : bi.g0106xx.getText().toString());

        json.put("g0107", bi.g0107a.isChecked() ? "1"
                : bi.g0107b.isChecked() ? "2"
                : bi.g0107c.isChecked() ? "3"
                : bi.g0107x.isChecked() ? "96"
                : "-1");
        json.put("g0107xx", bi.g0107xx.getText().toString().trim().isEmpty() ? "-1" : bi.g0107xx.getText().toString());

        json.put("g0108", bi.g0108a.isChecked() ? "1"
                : bi.g0108b.isChecked() ? "2"
                : bi.g0108c.isChecked() ? "3"
                : bi.g0108d.isChecked() ? "4"
                : "-1");

        json.put("g0109ax", bi.g0109ax.getText().toString().trim().isEmpty() ? "-1" : bi.g0109ax.getText().toString());
        json.put("g0109bx", bi.g0109bx.getText().toString().trim().isEmpty() ? "-1" : bi.g0109bx.getText().toString());

        json.put("g01110", bi.g01110a.isChecked() ? "1"
                : bi.g01110b.isChecked() ? "2"
                : "-1");

        json.put("g01111", bi.g01111a.isChecked() ? "1"
                : bi.g01111b.isChecked() ? "2"
                : bi.g01111c.isChecked() ? "3"
                : "-1");

        json.put("g01112", bi.g01112a.isChecked() ? "1"
                : bi.g01112b.isChecked() ? "2"
                : bi.g01112c.isChecked() ? "3"
                : "-1");

        json.put("g01113", bi.g01113a.isChecked() ? "1"
                : bi.g01113b.isChecked() ? "2"
                : "-1");

        json.put("g01114", bi.g01114a.isChecked() ? "1"
                : bi.g01114b.isChecked() ? "2"
                : bi.g01114c.isChecked() ? "3"
                : bi.g01114d.isChecked() ? "4"
                : bi.g01114e.isChecked() ? "5"
                : "-1");

        MainApp.fc.setsG(String.valueOf(json));

    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
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
            startActivity(new Intent(this, SectionG2Activity.class));
        }
    }

}
