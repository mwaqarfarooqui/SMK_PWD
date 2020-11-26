package edu.aku.hassannaqvi.smk_pwd.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.contracts.FormsContract;
import edu.aku.hassannaqvi.smk_pwd.core.DatabaseHelper;
import edu.aku.hassannaqvi.smk_pwd.core.MainApp;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionH1Binding;


public class SectionH1Activity extends AppCompatActivity {

    ActivitySectionH1Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_h1);
        bi.setCallback(this);
        //setupSpinner(this);
        setupSkips();


        /*if (!MainApp.fc.getsG().isEmpty()) {
            bi.h0101a.setText(getMon1());
            bi.h0101b.setText(getMon2());
            bi.h0101c.setText(getMon3());

            String[] one = getMon1().split("-");
            bi.h0101aa.setText(one[0]);
            bi.h0101ab.setText(one[1]);

            String[] two = getMon2().split("-");
            bi.h0101ba.setText(two[0]);
            bi.h0101bb.setText(two[1]);

            String[] three = getMon3().split("-");
            bi.h0101ca.setText(three[0]);
            bi.h0101cb.setText(three[1]);
        }*/

    }


    /*private void setupSpinner(final Context context) {

        bi.h0101b.setEnabled(false);
        bi.h0101c.setEnabled(false);

        bi.h0101a.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(getResources().getStringArray(R.array.months_array))));
        bi.h0101a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) return;
                List<String> items = new LinkedList<>(Arrays.asList(getResources().getStringArray(R.array.months_array)));
                items.remove(bi.h0101a.getSelectedItemPosition());
                bi.h0101b.setAdapter(new ArrayAdapter<>(SectionH1Activity.this, android.R.layout.simple_spinner_dropdown_item, items));
                bi.h0101b.setEnabled(true);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        bi.h0101b.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) return;
                List<String> items = new LinkedList<>(Arrays.asList(getResources().getStringArray(R.array.months_array)));
                items.remove(bi.h0101a.getSelectedItemPosition());
                items.remove(bi.h0101b.getSelectedItemPosition());
                bi.h0101c.setAdapter(new ArrayAdapter<>(SectionH1Activity.this, android.R.layout.simple_spinner_dropdown_item, items));
                bi.h0101c.setEnabled(true);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }*/


    private void setupSkips() {

        /*bi.ss04.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.ss04b.getId()) {
                Clear.clearAllFields(bi.ss05cv, false);
            } else {
                Clear.clearAllFields(bi.ss05cv, true);
            }
        }));*/

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
            startActivity(new Intent(this, SectionH2Activity.class));
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


        /*form.setHa01( bi.ha01a.isChecked() ? "1"
                : bi.ha01b.isChecked() ? "2"
                :  "-1");

        form.setHa02( bi.ha02a.isChecked() ? "1"
                : bi.ha02b.isChecked() ? "2"
                :  "-1");

        form.setHa03( bi.ha03a.isChecked() ? "1"
                : bi.ha03b.isChecked() ? "2"
                :  "-1");

        form.setHa04( bi.ha04a.isChecked() ? "1"
                : bi.ha04b.isChecked() ? "2"
                :  "-1");

        form.setHa05( bi.ha05a.isChecked() ? "1"
                : bi.ha05b.isChecked() ? "2"
                :  "-1");

        form.setHa06( bi.ha06a.isChecked() ? "1"
                : bi.ha06b.isChecked() ? "2"
                :  "-1");

        form.setHa07( bi.ha07a.isChecked() ? "1"
                : bi.ha07b.isChecked() ? "2"
                :  "-1");

        form.setHa08( bi.ha08a.isChecked() ? "1"
                : bi.ha08b.isChecked() ? "2"
                :  "-1");

        form.setHa09( bi.ha09a.isChecked() ? "1"
                : bi.ha09b.isChecked() ? "2"
                :  "-1");

        form.setHa10( bi.ha10a.isChecked() ? "1"
                : bi.ha10b.isChecked() ? "2"
                :  "-1");

        form.setHa11( bi.ha11a.isChecked() ? "1"
                : bi.ha11b.isChecked() ? "2"
                :  "-1");

        form.setHa12( bi.ha12a.isChecked() ? "1"
                : bi.ha12b.isChecked() ? "2"
                :  "-1");

        form.setHa13( bi.ha13a.isChecked() ? "1"
                : bi.ha13b.isChecked() ? "2"
                :  "-1");

        form.setHa14a(bi.ha14a.isChecked() ? "1" : "-1");

        form.setHa14b(bi.ha14b.isChecked() ? "2" : "-1");

        form.setHa14c(bi.ha14c.isChecked() ? "3" : "-1");

        form.setHa14d(bi.ha14d.isChecked() ? "4" : "-1");

        form.setHa14e(bi.ha14e.isChecked() ? "5" : "-1");

        form.setHa14f(bi.ha14f.isChecked() ? "6" : "-1");

        form.setHa1496(bi.ha1496.isChecked() ? "96" : "-1");

        form.setHa1496x(bi.ha1496x.getText().toString());*/

    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

}
