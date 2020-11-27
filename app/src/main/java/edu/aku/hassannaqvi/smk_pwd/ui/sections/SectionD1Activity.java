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
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionD1Binding;


public class SectionD1Activity extends AppCompatActivity {

    ActivitySectionD1Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_d1);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {

        bi.da01.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.da01b.getId()) {
                Clear.clearAllFields(bi.fldGrpskipda01b);
            }
        }));
    }


    private boolean UpdateDB() {
        /*DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SD, MainApp.fc.getsD());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show();
            return false;
        }*/
        return true;
    }


    private void SaveDraft() throws JSONException {
/*
        form.setDa01( bi.da01a.isChecked() ? "1"
                : bi.da01b.isChecked() ? "2"
                :  "-1");

        form.setDa02( bi.da02a.isChecked() ? "1"
                : bi.da02b.isChecked() ? "2"
                :  "-1");

        form.setDa03( bi.da03a.isChecked() ? "1"
                : bi.da03b.isChecked() ? "2"
                :  "-1");

        form.setDa04( bi.da04a.isChecked() ? "1"
                : bi.da04b.isChecked() ? "2"
                :  "-1");

        form.setDa05( bi.da05a.isChecked() ? "1"
                : bi.da05b.isChecked() ? "2"
                :  "-1");

        form.setDa06( bi.da06a.isChecked() ? "1"
                : bi.da06b.isChecked() ? "2"
                :  "-1");

        form.setDa07( bi.da07a.isChecked() ? "1"
                : bi.da07b.isChecked() ? "2"
                :  "-1");

        form.setDa08( bi.da08a.isChecked() ? "1"
                : bi.da08b.isChecked() ? "2"
                :  "-1");

        form.setDa09( bi.da09a.isChecked() ? "1"
                : bi.da09b.isChecked() ? "2"
                :  "-1");

        form.setDa10( bi.da10a.isChecked() ? "1"
                : bi.da10b.isChecked() ? "2"
                :  "-1");

        form.setDa11( bi.da11a.isChecked() ? "1"
                : bi.da11b.isChecked() ? "2"
                :  "-1");

        form.setDa12( bi.da12a.isChecked() ? "1"
                : bi.da12b.isChecked() ? "2"
                : bi.da12c.isChecked() ? "3"
                :  "-1");

        form.setDa13( bi.da13a.isChecked() ? "1"
                : bi.da13b.isChecked() ? "2"
                : bi.da13c.isChecked() ? "3"
                :  "-1");

        form.setDa14( bi.da14a.isChecked() ? "1"
                : bi.da14b.isChecked() ? "2"
                :  "-1");

        form.setDa15( bi.da15a.isChecked() ? "1"
                : bi.da15b.isChecked() ? "2"
                :  "-1");

        form.setDa16(bi.da16.getText().toString());

        form.setDa17(bi.da17.getText().toString());

        form.setDa18( bi.da18a.isChecked() ? "1"
                : bi.da1896.isChecked() ? "96"
                :  "-1");

        form.setDa1896x(bi.da1896x.getText().toString());
        form.setDa19aa( bi.da19aaa.isChecked() ? "1"
                : bi.da19aab.isChecked() ? "2"
                :  "-1");

        form.setDa19af( bi.da19afa.isChecked() ? "1"
                : bi.da19afb.isChecked() ? "2"
                :  "-1");

        form.setDa19ba( bi.da19baa.isChecked() ? "1"
                : bi.da19bab.isChecked() ? "2"
                :  "-1");

        form.setDa19bf( bi.da19bfa.isChecked() ? "1"
                : bi.da19bfb.isChecked() ? "2"
                :  "-1");

        form.setDa19ca( bi.da19caa.isChecked() ? "1"
                : bi.da19cab.isChecked() ? "2"
                :  "-1");

        form.setDa19cf( bi.da19cfa.isChecked() ? "1"
                : bi.da19cfb.isChecked() ? "2"
                :  "-1");

        form.setDa19da( bi.da19daa.isChecked() ? "1"
                : bi.da19dab.isChecked() ? "2"
                :  "-1");

        form.setDa19df( bi.da19dfa.isChecked() ? "1"
                : bi.da19dfb.isChecked() ? "2"
                :  "-1");

        form.setDa19ea( bi.da19eaa.isChecked() ? "1"
                : bi.da19eab.isChecked() ? "2"
                :  "-1");

        form.setDa19ef( bi.da19efa.isChecked() ? "1"
                : bi.da19efb.isChecked() ? "2"
                :  "-1");

        form.setDa20aa( bi.da20aaa.isChecked() ? "1"
                : bi.da20aab.isChecked() ? "2"
                :  "-1");

        form.setDa20af( bi.da20afa.isChecked() ? "1"
                : bi.da20afb.isChecked() ? "2"
                :  "-1");

        form.setDa20ba( bi.da20baa.isChecked() ? "1"
                : bi.da20bab.isChecked() ? "2"
                :  "-1");

        form.setDa20bf( bi.da20bfa.isChecked() ? "1"
                : bi.da20bfb.isChecked() ? "2"
                :  "-1");

        form.setDa20ca( bi.da20caa.isChecked() ? "1"
                : bi.da20cab.isChecked() ? "2"
                :  "-1");

        form.setDa20cf( bi.da20cfa.isChecked() ? "1"
                : bi.da20cfb.isChecked() ? "2"
                :  "-1");

        form.setDa20da( bi.da20daa.isChecked() ? "1"
                : bi.da20dab.isChecked() ? "2"
                :  "-1");

        form.setDa20df( bi.da20dfa.isChecked() ? "1"
                : bi.da20dfb.isChecked() ? "2"
                :  "-1");

        form.setDa20ea( bi.da20eaa.isChecked() ? "1"
                : bi.da20eab.isChecked() ? "2"
                :  "-1");

        form.setDa20ef( bi.da20efa.isChecked() ? "1"
                : bi.da20efb.isChecked() ? "2"
                :  "-1");

        form.setDa20fa( bi.da20faa.isChecked() ? "1"
                : bi.da20fab.isChecked() ? "2"
                :  "-1");

        form.setDa20ff( bi.da20ffa.isChecked() ? "1"
                : bi.da20ffb.isChecked() ? "2"
                :  "-1");

        form.setDa20ga( bi.da20gaa.isChecked() ? "1"
                : bi.da20gab.isChecked() ? "2"
                :  "-1");

        form.setDa20gf( bi.da20gfa.isChecked() ? "1"
                : bi.da20gfb.isChecked() ? "2"
                :  "-1");

        form.setDa21aa( bi.da21aaa.isChecked() ? "1"
                : bi.da21aab.isChecked() ? "2"
                :  "-1");

        form.setDa21af( bi.da21afa.isChecked() ? "1"
                : bi.da21afb.isChecked() ? "2"
                :  "-1");

        form.setDa21ba( bi.da21baa.isChecked() ? "1"
                : bi.da21bab.isChecked() ? "2"
                :  "-1");

        form.setDa21bf( bi.da21bfa.isChecked() ? "1"
                : bi.da21bfb.isChecked() ? "2"
                :  "-1");

        form.setDa21ca( bi.da21caa.isChecked() ? "1"
                : bi.da21cab.isChecked() ? "2"
                :  "-1");

        form.setDa21cf( bi.da21cfa.isChecked() ? "1"
                : bi.da21cfb.isChecked() ? "2"
                :  "-1");

        form.setDa21da( bi.da21daa.isChecked() ? "1"
                : bi.da21dab.isChecked() ? "2"
                :  "-1");

        form.setDa21df( bi.da21dfa.isChecked() ? "1"
                : bi.da21dfb.isChecked() ? "2"
                :  "-1");

        form.setDa22aa( bi.da22aaa.isChecked() ? "1"
                : bi.da22aab.isChecked() ? "2"
                :  "-1");

        form.setDa22af( bi.da22afa.isChecked() ? "1"
                : bi.da22afb.isChecked() ? "2"
                :  "-1");

        form.setDa22ba( bi.da22baa.isChecked() ? "1"
                : bi.da22bab.isChecked() ? "2"
                :  "-1");

        form.setDa22bf( bi.da22bfa.isChecked() ? "1"
                : bi.da22bfb.isChecked() ? "2"
                :  "-1");

        form.setDa22ca( bi.da22caa.isChecked() ? "1"
                : bi.da22cab.isChecked() ? "2"
                :  "-1");

        form.setDa22cf( bi.da22cfa.isChecked() ? "1"
                : bi.da22cfb.isChecked() ? "2"
                :  "-1");

        form.setDa22da( bi.da22daa.isChecked() ? "1"
                : bi.da22dab.isChecked() ? "2"
                :  "-1");

        form.setDa22df( bi.da22dfa.isChecked() ? "1"
                : bi.da22dfb.isChecked() ? "2"
                :  "-1");

        form.setDa22ea( bi.da22eaa.isChecked() ? "1"
                : bi.da22eab.isChecked() ? "2"
                :  "-1");

        form.setDa22ef( bi.da22efa.isChecked() ? "1"
                : bi.da22efb.isChecked() ? "2"
                :  "-1");

        form.setDa22fa( bi.da22faa.isChecked() ? "1"
                : bi.da22fab.isChecked() ? "2"
                :  "-1");

        form.setDa22ff( bi.da22ffa.isChecked() ? "1"
                : bi.da22ffb.isChecked() ? "2"
                :  "-1");

        form.setDa22ga( bi.da22gaa.isChecked() ? "1"
                : bi.da22gab.isChecked() ? "2"
                :  "-1");

        form.setDa22gf( bi.da22gfa.isChecked() ? "1"
                : bi.da22gfb.isChecked() ? "2"
                :  "-1");

        form.setDa22ha( bi.da22haa.isChecked() ? "1"
                : bi.da22hab.isChecked() ? "2"
                :  "-1");

        form.setDa22hf( bi.da22hfa.isChecked() ? "1"
                : bi.da22hfb.isChecked() ? "2"
                :  "-1");

        form.setDa23aa( bi.da23aaa.isChecked() ? "1"
                : bi.da23aab.isChecked() ? "2"
                :  "-1");

        form.setDa23af( bi.da23afa.isChecked() ? "1"
                : bi.da23afb.isChecked() ? "2"
                :  "-1");

        form.setDa23ba( bi.da23baa.isChecked() ? "1"
                : bi.da23bab.isChecked() ? "2"
                :  "-1");

        form.setDa23bf( bi.da23bfa.isChecked() ? "1"
                : bi.da23bfb.isChecked() ? "2"
                :  "-1");

        form.setDa23ca( bi.da23caa.isChecked() ? "1"
                : bi.da23cab.isChecked() ? "2"
                :  "-1");

        form.setDa23cf( bi.da23cfa.isChecked() ? "1"
                : bi.da23cfb.isChecked() ? "2"
                :  "-1");

        form.setDa23da( bi.da23daa.isChecked() ? "1"
                : bi.da23dab.isChecked() ? "2"
                :  "-1");

        form.setDa23df( bi.da23dfa.isChecked() ? "1"
                : bi.da23dfb.isChecked() ? "2"
                :  "-1");

        form.setDa24aa( bi.da24aaa.isChecked() ? "1"
                : bi.da24aab.isChecked() ? "2"
                :  "-1");

        form.setDa24af( bi.da24afa.isChecked() ? "1"
                : bi.da24afb.isChecked() ? "2"
                :  "-1");

        form.setDa24ba( bi.da24baa.isChecked() ? "1"
                : bi.da24bab.isChecked() ? "2"
                :  "-1");

        form.setDa24bf( bi.da24bfa.isChecked() ? "1"
                : bi.da24bfb.isChecked() ? "2"
                :  "-1");

        form.setDa24ca( bi.da24caa.isChecked() ? "1"
                : bi.da24cab.isChecked() ? "2"
                :  "-1");

        form.setDa24cf( bi.da24cfa.isChecked() ? "1"
                : bi.da24cfb.isChecked() ? "2"
                :  "-1");

        form.setDa24da( bi.da24daa.isChecked() ? "1"
                : bi.da24dab.isChecked() ? "2"
                :  "-1");

        form.setDa24df( bi.da24dfa.isChecked() ? "1"
                : bi.da24dfb.isChecked() ? "2"
                :  "-1");

        form.setDa24ea( bi.da24eaa.isChecked() ? "1"
                : bi.da24eab.isChecked() ? "2"
                :  "-1");

        form.setDa24ef( bi.da24efa.isChecked() ? "1"
                : bi.da24efb.isChecked() ? "2"
                :  "-1");

        form.setDa24fa( bi.da24faa.isChecked() ? "1"
                : bi.da24fab.isChecked() ? "2"
                :  "-1");

        form.setDa24ff( bi.da24ffa.isChecked() ? "1"
                : bi.da24ffb.isChecked() ? "2"
                :  "-1");

        form.setDa24ga( bi.da24gaa.isChecked() ? "1"
                : bi.da24gab.isChecked() ? "2"
                :  "-1");

        form.setDa24gf( bi.da24gfa.isChecked() ? "1"
                : bi.da24gfb.isChecked() ? "2"
                :  "-1");

        form.setDa24ha( bi.da24haa.isChecked() ? "1"
                : bi.da24hab.isChecked() ? "2"
                :  "-1");

        form.setDa24hf( bi.da24hfa.isChecked() ? "1"
                : bi.da24hfb.isChecked() ? "2"
                :  "-1");*/



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
            startActivity(new Intent(this, bi.da01b.isChecked() ? SectionD2Activity.class : SectionE101Activity.class));
          /*  startActivity(new Intent(this, SectionD2Activity.class));*/


        }
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    public void showTooltip(@NotNull View view) {
        if (view.getId() != View.NO_ID) {
            String package_name = getApplicationContext().getPackageName();
            String infoid = view.getResources().getResourceName(view.getId()).replace(package_name + ":id/q_", "");
            int stringRes = this.getResources().getIdentifier(infoid + "_info", "string", getApplicationContext().getPackageName());
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
