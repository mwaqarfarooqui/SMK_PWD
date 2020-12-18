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
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionD103Binding;

import static edu.aku.hassannaqvi.smk_pwd.core.MainApp.form;
import static edu.aku.hassannaqvi.smk_pwd.utils.UtilKt.openSectionMainActivity;

public class SectionD103Activity extends AppCompatActivity {

    ActivitySectionD103Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_d103);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {
        radioGroupListener(bi.da2211, bi.da2211a, bi.da2212);
        radioGroupListener(bi.da2221, bi.da2221a, bi.da2222);
        radioGroupListener(bi.da2231, bi.da2231a, bi.da2232);
        radioGroupListener(bi.da2241, bi.da2241a, bi.da2242);
        radioGroupListener(bi.da2251, bi.da2251a, bi.da2252);
        radioGroupListener(bi.da2261, bi.da2261a, bi.da2262);
        radioGroupListener(bi.da2271, bi.da2271a, bi.da2272);
        radioGroupListener(bi.da2281, bi.da2281a, bi.da2282);

        radioGroupListener(bi.da2311, bi.da2311a, bi.da2312);
        radioGroupListener(bi.da2321, bi.da2321a, bi.da2322);
        radioGroupListener(bi.da2331, bi.da2331a, bi.da2332);
        radioGroupListener(bi.da2341, bi.da2341a, bi.da2342);

        radioGroupListener(bi.da2411, bi.da2411a, bi.da2412);
        radioGroupListener(bi.da2421, bi.da2421a, bi.da2422);
        radioGroupListener(bi.da2431, bi.da2431a, bi.da2432);
        radioGroupListener(bi.da2441, bi.da2441a, bi.da2442);
        radioGroupListener(bi.da2451, bi.da2451a, bi.da2452);
        radioGroupListener(bi.da2461, bi.da2461a, bi.da2462);
        radioGroupListener(bi.da2471, bi.da2471a, bi.da2472);
        radioGroupListener(bi.da2481, bi.da2481a, bi.da2482);
    }


    public void radioGroupListener(@NotNull RadioGroup rg, RadioButton rb, ViewGroup vg) {

        rg.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(vg, false);
            if (i == rb.getId()) {
                Clear.clearAllFields(vg, true);
            }
        });
    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SD, form.getsD());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private void SaveDraft() {

        form.setDa2211(bi.da2211a.isChecked() ? "1"
                : bi.da2211b.isChecked() ? "2"
                : "-1");

        form.setDa2212(bi.da2212a.isChecked() ? "1"
                : bi.da2212b.isChecked() ? "2"
                : "-1");

        form.setDa2221(bi.da2221a.isChecked() ? "1"
                : bi.da2221b.isChecked() ? "2"
                : "-1");

        form.setDa2222(bi.da2222a.isChecked() ? "1"
                : bi.da2222b.isChecked() ? "2"
                : "-1");

        form.setDa2231(bi.da2231a.isChecked() ? "1"
                : bi.da2231b.isChecked() ? "2"
                : "-1");

        form.setDa2232(bi.da2232a.isChecked() ? "1"
                : bi.da2232b.isChecked() ? "2"
                : "-1");

        form.setDa2241(bi.da2241a.isChecked() ? "1"
                : bi.da2241b.isChecked() ? "2"
                : "-1");

        form.setDa2242(bi.da2242a.isChecked() ? "1"
                : bi.da2242b.isChecked() ? "2"
                : "-1");

        form.setDa2251(bi.da2251a.isChecked() ? "1"
                : bi.da2251b.isChecked() ? "2"
                : "-1");

        form.setDa2252(bi.da2252a.isChecked() ? "1"
                : bi.da2252b.isChecked() ? "2"
                : "-1");

        form.setDa2261(bi.da2261a.isChecked() ? "1"
                : bi.da2261b.isChecked() ? "2"
                : "-1");

        form.setDa2262(bi.da2262a.isChecked() ? "1"
                : bi.da2262b.isChecked() ? "2"
                : "-1");

        form.setDa2271(bi.da2271a.isChecked() ? "1"
                : bi.da2271b.isChecked() ? "2"
                : "-1");

        form.setDa2272(bi.da2272a.isChecked() ? "1"
                : bi.da2272b.isChecked() ? "2"
                : "-1");

        form.setDa2281(bi.da2281a.isChecked() ? "1"
                : bi.da2281b.isChecked() ? "2"
                : "-1");

        form.setDa2282(bi.da2282a.isChecked() ? "1"
                : bi.da2282b.isChecked() ? "2"
                : "-1");


        form.setDa2311(bi.da2311a.isChecked() ? "1"
                : bi.da2311b.isChecked() ? "2"
                : "-1");

        form.setDa2312(bi.da2312a.isChecked() ? "1"
                : bi.da2312b.isChecked() ? "2"
                : "-1");

        form.setDa2321(bi.da2321a.isChecked() ? "1"
                : bi.da2321b.isChecked() ? "2"
                : "-1");

        form.setDa2322(bi.da2322a.isChecked() ? "1"
                : bi.da2322b.isChecked() ? "2"
                : "-1");

        form.setDa2331(bi.da2331a.isChecked() ? "1"
                : bi.da2331b.isChecked() ? "2"
                : "-1");

        form.setDa2332(bi.da2332a.isChecked() ? "1"
                : bi.da2332b.isChecked() ? "2"
                : "-1");

        form.setDa2341(bi.da2341a.isChecked() ? "1"
                : bi.da2341b.isChecked() ? "2"
                : "-1");

        form.setDa2342(bi.da2342a.isChecked() ? "1"
                : bi.da2342b.isChecked() ? "2"
                : "-1");


        form.setDa2411(bi.da2411a.isChecked() ? "1"
                : bi.da2411b.isChecked() ? "2"
                : "-1");

        form.setDa2412(bi.da2412a.isChecked() ? "1"
                : bi.da2412b.isChecked() ? "2"
                : "-1");

        form.setDa2421(bi.da2421a.isChecked() ? "1"
                : bi.da2421b.isChecked() ? "2"
                : "-1");

        form.setDa2422(bi.da2422a.isChecked() ? "1"
                : bi.da2422b.isChecked() ? "2"
                : "-1");

        form.setDa2431(bi.da2431a.isChecked() ? "1"
                : bi.da2431b.isChecked() ? "2"
                : "-1");

        form.setDa2432(bi.da2432a.isChecked() ? "1"
                : bi.da2432b.isChecked() ? "2"
                : "-1");

        form.setDa2441(bi.da2441a.isChecked() ? "1"
                : bi.da2441b.isChecked() ? "2"
                : "-1");

        form.setDa2442(bi.da2442a.isChecked() ? "1"
                : bi.da2442b.isChecked() ? "2"
                : "-1");

        form.setDa2451(bi.da2451a.isChecked() ? "1"
                : bi.da2451b.isChecked() ? "2"
                : "-1");

        form.setDa2452(bi.da2452a.isChecked() ? "1"
                : bi.da2452b.isChecked() ? "2"
                : "-1");

        form.setDa2461(bi.da2461a.isChecked() ? "1"
                : bi.da2461b.isChecked() ? "2"
                : "-1");

        form.setDa2462(bi.da2462a.isChecked() ? "1"
                : bi.da2462b.isChecked() ? "2"
                : "-1");

        form.setDa2471(bi.da2471a.isChecked() ? "1"
                : bi.da2471b.isChecked() ? "2"
                : "-1");

        form.setDa2472(bi.da2472a.isChecked() ? "1"
                : bi.da2472b.isChecked() ? "2"
                : "-1");

        form.setDa2481(bi.da2481a.isChecked() ? "1"
                : bi.da2481b.isChecked() ? "2"
                : "-1");

        form.setDa2482(bi.da2482a.isChecked() ? "1"
                : bi.da2482b.isChecked() ? "2"
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
            startActivity(new Intent(this, SectionD2Activity.class));
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
