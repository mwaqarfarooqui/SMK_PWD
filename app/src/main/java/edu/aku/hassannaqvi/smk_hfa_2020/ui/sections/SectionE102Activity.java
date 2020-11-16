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

import edu.aku.hassannaqvi.smk_hfa_2020.R;
import edu.aku.hassannaqvi.smk_hfa_2020.contracts.FormsContract;
import edu.aku.hassannaqvi.smk_hfa_2020.core.DatabaseHelper;
import edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp;
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivitySectionE102Binding;
import edu.aku.hassannaqvi.smk_hfa_2020.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_hfa_2020.utils.UtilKt.openSectionMainActivity;

public class SectionE102Activity extends AppCompatActivity {

    ActivitySectionE102Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_e102);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {

        bi.e151aav.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.e151aavn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVe151af);
            }
        }));

        bi.e151bav.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.e151bavn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVe151bf);
            }
        }));

        bi.e151cav.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.e151cavn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVe151cf);
            }
        }));

        bi.e151dav.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.e151davn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVe151df);
            }
        }));

        bi.e151eav.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.e151eavn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVe151ef);
            }
        }));

        bi.e152aav.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.e152aavn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVe152af);
            }
        }));

        bi.e152bav.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.e152bavn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVe152bf);
            }
        }));

        bi.e152cav.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.e152cavn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVe152cf);
            }
        }));

        bi.e152dav.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.e152davn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVe152df);
            }
        }));

        bi.e152eav.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.e152eavn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVe152ef);
            }
        }));

        bi.e152fav.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.e152favn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVe152ff);
            }
        }));

        bi.e152gav.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.e152gavn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVe152gf);
            }
        }));

        bi.e153av.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.e153aavn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVe153af);
            }
        }));

        bi.e153bav.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.e153bavn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVe153bf);
            }
        }));

        bi.e153cav.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.e153cavn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVe153cf);
            }
        }));

        bi.e153dav.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.e153davn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVe153df);
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

        json.put("e151aav", bi.e151aavy.isChecked() ? "1"
                : bi.e151aavn.isChecked() ? "2"
                :  "-1");

        json.put("e151af", bi.e151afy.isChecked() ? "1"
                : bi.e151afn.isChecked() ? "2"
                :  "-1");

        json.put("e151bav", bi.e151bavy.isChecked() ? "1"
                : bi.e151bavn.isChecked() ? "2"
                :  "-1");

        json.put("e151bf", bi.e151bfy.isChecked() ? "1"
                : bi.e151bfn.isChecked() ? "2"
                :  "-1");

        json.put("e151cav", bi.e151cavy.isChecked() ? "1"
                : bi.e151cavn.isChecked() ? "2"
                :  "-1");

        json.put("e151cf", bi.e151cfy.isChecked() ? "1"
                : bi.e151cfn.isChecked() ? "2"
                :  "-1");

        json.put("e151dav", bi.e151davy.isChecked() ? "1"
                : bi.e151davn.isChecked() ? "2"
                :  "-1");

        json.put("e151df", bi.e151dfy.isChecked() ? "1"
                : bi.e151dfn.isChecked() ? "2"
                :  "-1");

        json.put("e151eav", bi.e151eavy.isChecked() ? "1"
                : bi.e151eavn.isChecked() ? "2"
                :  "-1");

        json.put("e151ef", bi.e151efy.isChecked() ? "1"
                : bi.e151efn.isChecked() ? "2"
                :  "-1");

        json.put("e152aav", bi.e152aavy.isChecked() ? "1"
                : bi.e152aavn.isChecked() ? "2"
                :  "-1");

        json.put("e152af", bi.e152afy.isChecked() ? "1"
                : bi.e152afn.isChecked() ? "2"
                :  "-1");

        json.put("e152bav", bi.e152bavy.isChecked() ? "1"
                : bi.e152bavn.isChecked() ? "2"
                :  "-1");

        json.put("e152bf", bi.e152bfy.isChecked() ? "1"
                : bi.e152bfn.isChecked() ? "2"
                :  "-1");

        json.put("e152cav", bi.e152cavy.isChecked() ? "1"
                : bi.e152cavn.isChecked() ? "2"
                :  "-1");

        json.put("e152cf", bi.e152cfy.isChecked() ? "1"
                : bi.e152cfn.isChecked() ? "2"
                :  "-1");

        json.put("e152dav", bi.e152davy.isChecked() ? "1"
                : bi.e152davn.isChecked() ? "2"
                :  "-1");

        json.put("e152df", bi.e152dfy.isChecked() ? "1"
                : bi.e152dfn.isChecked() ? "2"
                :  "-1");

        json.put("e152eav", bi.e152eavy.isChecked() ? "1"
                : bi.e152eavn.isChecked() ? "2"
                :  "-1");

        json.put("e152ef", bi.e152efy.isChecked() ? "1"
                : bi.e152efn.isChecked() ? "2"
                :  "-1");

        json.put("e152fav", bi.e152favy.isChecked() ? "1"
                : bi.e152favn.isChecked() ? "2"
                :  "-1");

        json.put("e152ff", bi.e152ffy.isChecked() ? "1"
                : bi.e152ffn.isChecked() ? "2"
                :  "-1");

        json.put("e152gav", bi.e152gavy.isChecked() ? "1"
                : bi.e152gavn.isChecked() ? "2"
                :  "-1");

        json.put("e152gf", bi.e152gfy.isChecked() ? "1"
                : bi.e152gfn.isChecked() ? "2"
                :  "-1");

        json.put("e153av", bi.e153aavy.isChecked() ? "1"
                : bi.e153aavn.isChecked() ? "2"
                :  "-1");

        json.put("e153af", bi.e153afy.isChecked() ? "1"
                : bi.e153afn.isChecked() ? "2"
                :  "-1");

        json.put("e153bav", bi.e153bavy.isChecked() ? "1"
                : bi.e153bavn.isChecked() ? "2"
                :  "-1");

        json.put("e153bf", bi.e153bfy.isChecked() ? "1"
                : bi.e153bfn.isChecked() ? "2"
                :  "-1");

        json.put("e153cav", bi.e153cavy.isChecked() ? "1"
                : bi.e153cavn.isChecked() ? "2"
                :  "-1");

        json.put("e153cf", bi.e153cfy.isChecked() ? "1"
                : bi.e153cfn.isChecked() ? "2"
                : "-1");

        json.put("e153dav", bi.e153davy.isChecked() ? "1"
                : bi.e153davn.isChecked() ? "2"
                : "-1");

        json.put("e153df", bi.e153dfy.isChecked() ? "1"
                : bi.e153dfn.isChecked() ? "2"
                : "-1");

        try {
            JSONObject json_merge = JSONUtils.mergeJSONObjects(new JSONObject(fc.getsE()), json);

            fc.setsE(String.valueOf(json_merge));

        } catch (JSONException e) {
            e.printStackTrace();
        }

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
            startActivity(new Intent(this, SectionE103Activity.class));
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
