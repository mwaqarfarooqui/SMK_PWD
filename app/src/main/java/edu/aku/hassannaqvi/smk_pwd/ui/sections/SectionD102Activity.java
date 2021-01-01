package edu.aku.hassannaqvi.smk_pwd.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.jetbrains.annotations.NotNull;

import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.contracts.FormsContract;
import edu.aku.hassannaqvi.smk_pwd.core.DatabaseHelper;
import edu.aku.hassannaqvi.smk_pwd.core.MainApp;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionD102Binding;

import static edu.aku.hassannaqvi.smk_pwd.core.MainApp.form;
import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;

public class SectionD102Activity extends AppCompatActivity {

    ActivitySectionD102Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_d102);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {

        bi.da14.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.da14b.getId()) {
                Clear.clearAllFields(bi.llda14b);
            }
        }));

        rgListener(bi.da1911, bi.da1911a, bi.da1912);
        rgListener(bi.da1921, bi.da1921a, bi.da1922);
        rgListener(bi.da1931, bi.da1931a, bi.da1932);
        rgListener(bi.da1941, bi.da1941a, bi.da1942);
        rgListener(bi.da1951, bi.da1951a, bi.da1952);

        rgListener(bi.da2011, bi.da2011a, bi.da2012);
        rgListener(bi.da2021, bi.da2021a, bi.da2022);
        rgListener(bi.da2031, bi.da2031a, bi.da2032);
        rgListener(bi.da2041, bi.da2041a, bi.da2042);
        rgListener(bi.da2051, bi.da2051a, bi.da2052);
        rgListener(bi.da2061, bi.da2061a, bi.da2062);
        rgListener(bi.da2071, bi.da2071a, bi.da2072);

        rgListener(bi.da2111, bi.da2111a, bi.da2112);
        rgListener(bi.da2121, bi.da2121a, bi.da2122);
        rgListener(bi.da2131, bi.da2131a, bi.da2132);
        rgListener(bi.da2141, bi.da2141a, bi.da2142);
    }


    public void rgListener(@NotNull RadioGroup rg, RadioButton rb, ViewGroup vg) {

        rg.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(vg, false);
            if (i == rb.getId()) {
                Clear.clearAllFields(vg, true);
            }
        });
    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SD, form.sDtoString());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private void SaveDraft() {

        form.setDa14(bi.da14a.isChecked() ? "1"
                : bi.da14b.isChecked() ? "2"
                : "-1");

        form.setDa15(bi.da15a.isChecked() ? "1"
                : bi.da15b.isChecked() ? "2"
                : "-1");

        form.setDa16(bi.da16.getText().toString().trim().isEmpty() ? "-1" : bi.da16.getText().toString());

        form.setDa17(bi.da17.getText().toString().trim().isEmpty() ? "-1" : bi.da17.getText().toString());

        form.setDa18(bi.da18a.isChecked() ? "1"
                : bi.da1896.isChecked() ? "96"
                : "-1");

        form.setDa1896x(bi.da1896x.getText().toString().trim().isEmpty() ? "-1" : bi.da1896x.getText().toString());


        form.setDa1911(bi.da1911a.isChecked() ? "1"
                : bi.da1911b.isChecked() ? "2"
                : "-1");

        form.setDa1912(bi.da1912a.isChecked() ? "1"
                : bi.da1912b.isChecked() ? "2"
                : "-1");

        form.setDa1921(bi.da1921a.isChecked() ? "1"
                : bi.da1921b.isChecked() ? "2"
                : "-1");

        form.setDa1922(bi.da1922a.isChecked() ? "1"
                : bi.da1922b.isChecked() ? "2"
                : "-1");

        form.setDa1931(bi.da1931a.isChecked() ? "1"
                : bi.da1931b.isChecked() ? "2"
                : "-1");

        form.setDa1932(bi.da1932a.isChecked() ? "1"
                : bi.da1932b.isChecked() ? "2"
                : "-1");

        form.setDa1941(bi.da1941a.isChecked() ? "1"
                : bi.da1941b.isChecked() ? "2"
                : "-1");

        form.setDa1942(bi.da1942a.isChecked() ? "1"
                : bi.da1942b.isChecked() ? "2"
                : "-1");

        form.setDa1951(bi.da1951a.isChecked() ? "1"
                : bi.da1951b.isChecked() ? "2"
                : "-1");

        form.setDa1952(bi.da1952a.isChecked() ? "1"
                : bi.da1952b.isChecked() ? "2"
                : "-1");


        form.setDa2011(bi.da2011a.isChecked() ? "1"
                : bi.da2011b.isChecked() ? "2"
                : "-1");

        form.setDa2012(bi.da2012a.isChecked() ? "1"
                : bi.da2012b.isChecked() ? "2"
                : "-1");

        form.setDa2021(bi.da2021a.isChecked() ? "1"
                : bi.da2021b.isChecked() ? "2"
                : "-1");

        form.setDa2022(bi.da2022a.isChecked() ? "1"
                : bi.da2022b.isChecked() ? "2"
                : "-1");

        form.setDa2031(bi.da2031a.isChecked() ? "1"
                : bi.da2031b.isChecked() ? "2"
                : "-1");

        form.setDa2032(bi.da2032a.isChecked() ? "1"
                : bi.da2032b.isChecked() ? "2"
                : "-1");

        form.setDa2041(bi.da2041a.isChecked() ? "1"
                : bi.da2041b.isChecked() ? "2"
                : "-1");

        form.setDa2042(bi.da2042a.isChecked() ? "1"
                : bi.da2042b.isChecked() ? "2"
                : "-1");

        form.setDa2051(bi.da2051a.isChecked() ? "1"
                : bi.da2051b.isChecked() ? "2"
                : "-1");

        form.setDa2052(bi.da2052a.isChecked() ? "1"
                : bi.da2052b.isChecked() ? "2"
                : "-1");

        form.setDa2061(bi.da2061a.isChecked() ? "1"
                : bi.da2061b.isChecked() ? "2"
                : "-1");

        form.setDa2062(bi.da2062a.isChecked() ? "1"
                : bi.da2062b.isChecked() ? "2"
                : "-1");

        form.setDa2071(bi.da2071a.isChecked() ? "1"
                : bi.da2071b.isChecked() ? "2"
                : "-1");

        form.setDa2072(bi.da2072a.isChecked() ? "1"
                : bi.da2072b.isChecked() ? "2"
                : "-1");


        form.setDa2111(bi.da2111a.isChecked() ? "1"
                : bi.da2111b.isChecked() ? "2"
                : "-1");

        form.setDa2112(bi.da2112a.isChecked() ? "1"
                : bi.da2112b.isChecked() ? "2"
                : "-1");

        form.setDa2121(bi.da2121a.isChecked() ? "1"
                : bi.da2121b.isChecked() ? "2"
                : "-1");

        form.setDa2122(bi.da2122a.isChecked() ? "1"
                : bi.da2122b.isChecked() ? "2"
                : "-1");

        form.setDa2131(bi.da2131a.isChecked() ? "1"
                : bi.da2131b.isChecked() ? "2"
                : "-1");

        form.setDa2132(bi.da2132a.isChecked() ? "1"
                : bi.da2132b.isChecked() ? "2"
                : "-1");

        form.setDa2141(bi.da2141a.isChecked() ? "1"
                : bi.da2141b.isChecked() ? "2"
                : "-1");

        form.setDa2142(bi.da2142a.isChecked() ? "1"
                : bi.da2142b.isChecked() ? "2"
                : "-1");

    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    public void BtnContinue() {
        if (!formValidation()) return;
        SaveDraft();
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, SectionD103Activity.class));
        }
    }


    public void BtnEnd() {
        openSectionMainActivity(this, "D");
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }

}
