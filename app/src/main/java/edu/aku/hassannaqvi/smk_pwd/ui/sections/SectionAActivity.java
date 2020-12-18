package edu.aku.hassannaqvi.smk_pwd.ui.sections;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.contracts.FormsContract;
import edu.aku.hassannaqvi.smk_pwd.core.DatabaseHelper;
import edu.aku.hassannaqvi.smk_pwd.core.MainApp;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionABinding;
import edu.aku.hassannaqvi.smk_pwd.models.Forms;
import edu.aku.hassannaqvi.smk_pwd.ui.other.SectionMainActivity;
import edu.aku.hassannaqvi.smk_pwd.utils.DateUtils;

import static edu.aku.hassannaqvi.smk_pwd.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_pwd.core.MainApp.form;

public class SectionAActivity extends AppCompatActivity {

    ActivitySectionABinding bi;
    private List<String> districtNames, tehsilNames, ucNames;
    private List<String> districtCodes, tehsilCodes, ucCodes;
    private List<String> districtTypes;
    private DatabaseHelper db;

    private List<String> hfNamesPrv, hfNamesPub;
    private Map<String, String> hfMap;
    private boolean fcFlag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a);
        bi.setCallback(this);
        //bi.setFormsContract(MainApp.fc);
        initializingComponents();
        initializeHF();
    }


    private void initializingComponents() {

        bi.aa01.setMinDate(DateUtils.getMonthsBack("dd/MM/yyyy", -2));

        /*bi.aa01d.setMaxvalue(Float.parseFloat(new SimpleDateFormat("dd", Locale.getDefault()).format(new Date().getTime())));
        bi.aa01m.setMaxvalue(Float.parseFloat(new SimpleDateFormat("MM", Locale.getDefault()).format(new Date().getTime())));
        bi.aa01y.setMaxvalue(Float.parseFloat(new SimpleDateFormat("yyyy", Locale.getDefault()).format(new Date().getTime())));*/

        bi.aa02.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.fldGrpCVaa03, false);
            if (i == bi.aa02a.getId()) {
                bi.aa03a.setEnabled(true);
                bi.aa03b.setEnabled(true);
            } else if (i == bi.aa02b.getId()) {
                bi.aa03c.setEnabled(true);
                bi.aa03d.setEnabled(true);
                bi.aa03e.setEnabled(true);
                bi.aa03f.setEnabled(true);
                bi.aa03g.setEnabled(true);
                bi.aa03h.setEnabled(true);
            } else if (i == bi.aa02c.getId()) {
                bi.aa03i.setEnabled(true);
                bi.aa03j.setEnabled(true);
            }
        });

        // Databinding Edit Mode (only in first activity for every contract)
        fc = new FormsContract();
        db = MainApp.appInfo.getDbHelper();
        populateSpinner(this);
    }


    private void initializeHF() {
        //For HF
        hfNamesPrv = new ArrayList<String>() {
            {
                add("....");
            }
        };
        hfNamesPub = new ArrayList<String>() {
            {
                add("....");
            }
        };
        hfMap = new HashMap<>();
    }


    public void populateSpinner(final Context context) {
        // Spinner Drop down elements
        /*districtNames = new ArrayList<>();
        districtCodes = new ArrayList<>();
        districtTypes = new ArrayList<>();

        districtNames.add("....");
        districtCodes.add("....");
        districtTypes.add("....");

        Collection<DistrictContract> dc = db.getAllDistricts();

        for (DistrictContract d : dc) {
            districtNames.add(d.getDistrictName());
            districtCodes.add(d.getDistrictCode());
            districtTypes.add(d.getDistrictType());
        }

        bi.a07.setAdapter(new ArrayAdapter<>(context, android.R.layout.simple_spinner_dropdown_item, districtNames));

        bi.a07.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) return;

                tehsilNames = new ArrayList<>();
                tehsilCodes = new ArrayList<>();

                tehsilNames.add("....");
                tehsilCodes.add("....");

                Collection<TehsilsContract> pc = db.getAllTehsils(districtCodes.get(position));
                for (TehsilsContract p : pc) {
                    tehsilNames.add(p.getTehsilName());
                    tehsilCodes.add(p.getTehsilCode());
                }

                bi.a08.setAdapter(new ArrayAdapter<>(context, android.R.layout.simple_spinner_dropdown_item, tehsilNames));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


        bi.a08.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) return;

                ucNames = new ArrayList<>();
                ucCodes = new ArrayList<>();

                ucNames.add("....");
                ucCodes.add("....");
                Clear.clearAllFields(bi.fldGrpCVa10);

                //For HF
                initializeHF();

                Collection<UCsContract> pc = db.getAllUCs(tehsilCodes.get(bi.a08.getSelectedItemPosition()));
                for (UCsContract p : pc) {
                    ucCodes.add(p.getUc_code());
                    ucNames.add(p.getUc_name());
                }

                bi.a09.setAdapter(new ArrayAdapter<>(context, android.R.layout.simple_spinner_dropdown_item, ucNames));
                bi.a13.setAdapter(new ArrayAdapter<>(context, android.R.layout.simple_spinner_dropdown_item, Collections.emptyList()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        bi.a09.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Clear.clearAllFields(bi.fldGrpCVa10);

                if (position == 0) return;
                if (hfMap.size() > 0) return;
                Collection<HFContract> pc = db.getAllHFs(tehsilCodes.get(bi.a08.getSelectedItemPosition()));
                for (HFContract p : pc) {
                    if (p.getHf_type().equals("1")) hfNamesPub.add(p.getHf_name());
                    else hfNamesPrv.add(p.getHf_name());
                    hfMap.put(p.getHf_name(), p.getHf_code());
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        bi.a10.setOnCheckedChangeListener(((radioGroup, i) -> {
            Clear.clearAllFields(bi.fldGrpCVa11);
            if (i == bi.a10a.getId()) {
                bi.a13.setAdapter(new ArrayAdapter<>(context, android.R.layout.simple_spinner_dropdown_item, hfNamesPub));
            } else if (i == bi.a10b.getId()) {
                bi.a13.setAdapter(new ArrayAdapter<>(context, android.R.layout.simple_spinner_dropdown_item, hfNamesPrv));
            }
        }));

        bi.a13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //                Toast.makeText(SectionAActivity.this, String.valueOf(hfCodes.get(bi.a13.getSelectedItemPosition())), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

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
            startActivity(new Intent(this, SectionMainActivity.class));
        }
    }


    private boolean UpdateDB() {

        if (!form.get_ID().equals("")) return true;

        long updcount = db.addForm(form);
        form.set_ID(String.valueOf(updcount));
        if (updcount > 0) {
            form.set_UID(form.getDeviceID() + form.get_ID());
            db.updatesFormColumn(FormsContract.FormsTable.COLUMN_UID, form.get_UID());
            return true;
        } else {
            Toast.makeText(this, "Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }

    }


    private void SaveDraft() throws JSONException {

        if (!form.get_ID().equals("")) return;

        form = new Forms();
        form.setSysdate(new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.getDefault()).format(new Date().getTime()));
        form.setUsername(MainApp.userName);
        form.setDeviceID(MainApp.appInfo.getDeviceID());
        form.setDevicetagID(MainApp.appInfo.getTagName());
        form.setAppversion(MainApp.appInfo.getAppVersion());
        MainApp.setGPS(this);

        String[] dA = bi.aa01.getText().toString().split("-");
        form.setAa01d(dA[0]);
        form.setAa01m(dA[1]);
        form.setAa01y(dA[2]);

        form.setAa02(bi.aa02a.isChecked() ? "1"
                : bi.aa02b.isChecked() ? "2"
                : bi.aa02c.isChecked() ? "3"
                : "-1");

        form.setAa03(bi.aa03a.isChecked() ? "101"
                : bi.aa03b.isChecked() ? "102"
                : bi.aa03c.isChecked() ? "201"
                : bi.aa03d.isChecked() ? "202"
                : bi.aa03e.isChecked() ? "203"
                : bi.aa03f.isChecked() ? "204"
                : bi.aa03g.isChecked() ? "205"
                : bi.aa03h.isChecked() ? "206"
                : bi.aa03i.isChecked() ? "301"
                : bi.aa03j.isChecked() ? "302"
                : "-1");

        form.setAa04(bi.aa04.getText().toString());

        form.setAa05(bi.aa05.getText().toString());

        form.setAa06(bi.aa06a.isChecked() ? "1"
                : bi.aa06b.isChecked() ? "2"
                : bi.aa06c.isChecked() ? "3"
                : bi.aa06d.isChecked() ? "4"
                : "-1");

        form.setAa07(bi.aa07.getText().toString());

        form.setAa08(bi.aa08a.isChecked() ? "1"
                : bi.aa08b.isChecked() ? "2"
                : "-1");

        form.setAa09(bi.aa09a.isChecked() ? "1"
                : bi.aa09b.isChecked() ? "2"
                : "-1");

        form.setAa10(bi.aa10.getText().toString());

        form.setAa11(bi.aa11a.isChecked() ? "1"
                : bi.aa11b.isChecked() ? "2"
                : "-1");

        form.setAa12(bi.aa12a.isChecked() ? "1"
                : bi.aa12b.isChecked() ? "2"
                : bi.aa12c.isChecked() ? "3"
                : bi.aa12d.isChecked() ? "4"
                : "-1");

        form.setAa13(bi.aa13.getText().toString());

        form.setAa14(bi.aa14a.isChecked() ? "1"
                : bi.aa14b.isChecked() ? "2"
                : bi.aa14c.isChecked() ? "3"
                : bi.aa14d.isChecked() ? "4"
                : bi.aa14e.isChecked() ? "5"
                : "-1");

    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);

        /*if (db.CheckHF(String.valueOf(hfMap.get(bi.a13.getSelectedItem().toString())))) {
            Toast.makeText(this, "Facility Already filled ", Toast.LENGTH_LONG).show();
            return false;
        }

        fc = db.CheckHF(String.valueOf(hfMap.get(bi.a13.getSelectedItem().toString())), "1");
        if (fc == null) {
            Toast.makeText(this, "Partially filled Facility ", Toast.LENGTH_LONG).show();
            return true;
        }*/

    }

}
