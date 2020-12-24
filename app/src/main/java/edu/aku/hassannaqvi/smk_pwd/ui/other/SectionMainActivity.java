package edu.aku.hassannaqvi.smk_pwd.ui.other;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import edu.aku.hassannaqvi.smk_pwd.R;
import edu.aku.hassannaqvi.smk_pwd.core.MainApp;
import edu.aku.hassannaqvi.smk_pwd.databinding.ActivitySectionMainBinding;
import edu.aku.hassannaqvi.smk_pwd.ui.sections.SectionBActivity;
import edu.aku.hassannaqvi.smk_pwd.ui.sections.SectionC1Activity;
import edu.aku.hassannaqvi.smk_pwd.ui.sections.SectionD101Activity;
import edu.aku.hassannaqvi.smk_pwd.ui.sections.SectionE1Activity;
import edu.aku.hassannaqvi.smk_pwd.ui.sections.SectionF1Activity;
import edu.aku.hassannaqvi.smk_pwd.ui.sections.SectionGActivity;
import edu.aku.hassannaqvi.smk_pwd.ui.sections.SectionH1Activity;
import edu.aku.hassannaqvi.smk_pwd.ui.sections.SectionI1Activity;

import static edu.aku.hassannaqvi.smk_pwd.core.MainApp.form;
import static edu.aku.hassannaqvi.smk_pwd.core.MainApp.psc;

public class SectionMainActivity extends AppCompatActivity {
    public static int countI = 0;
    ActivitySectionMainBinding bi;
    boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_main);
        bi.setCallback(this);


        if (!form.sAtoString().isEmpty() && !form.sBtoString().isEmpty()) {
            bi.form01.setEnabled(false);
            bi.form01.setBackgroundResource(R.color.dullWhite);
        }

        if (!form.sCtoString().isEmpty()) {
            bi.form02.setEnabled(false);
            bi.form02.setBackgroundResource(R.color.dullWhite);
            flag = true;
        }

        if (!form.sDtoString().isEmpty()) {
            bi.form03.setEnabled(false);
            bi.form03.setBackgroundResource(R.color.dullWhite);
        }

        if (!form.sEtoString().isEmpty()) {
            bi.form04.setEnabled(false);
            bi.form04.setBackgroundResource(R.color.dullWhite);
        }

        if (!form.sFtoString().isEmpty()) {
            bi.form05.setEnabled(false);
            bi.form05.setBackgroundResource(R.color.dullWhite);
        }

        if (!form.sGtoString().isEmpty()) {
            bi.form06.setEnabled(false);
            bi.form06.setBackgroundResource(R.color.dullWhite);
        }

        if (!form.sHtoString().isEmpty()) {
            bi.form07.setEnabled(false);
            bi.form07.setBackgroundResource(R.color.dullWhite);
        }

        if (!psc.sItoString().isEmpty()) {
            bi.form08.setEnabled(false);
            bi.form08.setBackgroundResource(R.color.dullWhite);
        }


    }


    public void openForm(View v) {
        OpenFormFunc(v.getId());
    }


    public void BtnContinue() {
        if (!bi.form01.isEnabled()
                && !bi.form02.isEnabled()
                && !bi.form03.isEnabled()
                && !bi.form04.isEnabled()
                && !bi.form05.isEnabled()
                && !bi.form06.isEnabled()
                && !bi.form07.isEnabled()
                && !bi.form08.isEnabled()) {
            finish();
            startActivity(new Intent(this, EndingActivity.class).putExtra("complete", true));
        } else {
            Toast.makeText(this, "Sections still in Pending!", Toast.LENGTH_SHORT).show();
        }
    }


    public void BtnEnd() {
        if (bi.form01.isEnabled()
                || bi.form02.isEnabled()
                || bi.form03.isEnabled()
                || bi.form04.isEnabled()
                || bi.form05.isEnabled()
                || bi.form06.isEnabled()
                || bi.form07.isEnabled()
                || bi.form08.isEnabled()) {
            finish();
            startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
            //MainApp.endActivity(this, EndingActivity.class).putExtra("complete", false);
        } else {
            Toast.makeText(this, "ALL SECTIONS FILLED \n Good to GO GREEN!", Toast.LENGTH_SHORT).show();
        }

    }


    private void OpenFormFunc(int id) {
        Intent oF = new Intent();
        if (!MainApp.userName.equals("0000")) {
            switch (id) {
                case R.id.form01:
                    oF = new Intent(this, SectionBActivity.class);
                    break;
                case R.id.form02:
                    oF = new Intent(this, SectionC1Activity.class);
                    break;
                case R.id.form03:
                    oF = new Intent(this, SectionD101Activity.class);
                    break;
                case R.id.form04:
                    oF = new Intent(this, SectionE1Activity.class);
                    break;
                case R.id.form05:
                    oF = new Intent(this, SectionF1Activity.class);
                    break;
                case R.id.form06:
                    oF = new Intent(this, SectionGActivity.class);
                    break;
                case R.id.form07:
                    oF = new Intent(this, SectionH1Activity.class);
                    break;
                case R.id.form08:
                    countI = 1;
                    oF = new Intent(this, SectionI1Activity.class);
                    break;
            }
            startActivity(oF);
        } else {
            Toast.makeText(this, "Please login Again!", Toast.LENGTH_LONG).show();
        }
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }

}
