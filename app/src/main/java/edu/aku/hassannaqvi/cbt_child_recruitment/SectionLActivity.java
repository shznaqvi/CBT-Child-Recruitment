package edu.aku.hassannaqvi.cbt_child_recruitment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionLActivity extends Activity {

    @BindView(R.id.activity_section_l)
    ScrollView activitySectionL;
    @BindView(R.id.crl01)
    RadioGroup crl01;
    @BindView(R.id.crl0101)
    RadioButton crl0101;
    @BindView(R.id.crl0102)
    RadioButton crl0102;
    @BindView(R.id.crl0103)
    RadioButton crl0103;
    @BindView(R.id.crlGrp01)
    LinearLayout crlGrp01;
    @BindView(R.id.crl02)
    EditText crl02;
    @BindView(R.id.crl03)
    RadioGroup crl03;
    @BindView(R.id.crl0301)
    RadioButton crl0301;
    @BindView(R.id.crl0302)
    RadioButton crl0302;
    @BindView(R.id.crl0399)
    RadioButton crl0399;
    @BindView(R.id.crlGrp03)
    LinearLayout crlGrp03;
    @BindView(R.id.crl04)
    RadioGroup crl04;
    @BindView(R.id.crl0401)
    RadioButton crl0401;
    @BindView(R.id.crl0402)
    RadioButton crl0402;
    @BindView(R.id.crl0403)
    RadioButton crl0403;
    @BindView(R.id.crl0404)
    RadioButton crl0404;
    @BindView(R.id.crl0405)
    RadioButton crl0405;
    @BindView(R.id.crl0406)
    RadioButton crl0406;
    @BindView(R.id.crl0407)
    RadioButton crl0407;
    @BindView(R.id.crl0408)
    RadioButton crl0408;
    @BindView(R.id.crl0496)
    RadioButton crl0496;
    @BindView(R.id.crl0496x)
    EditText crl0496x;
    @BindView(R.id.crl05)
    RadioGroup crl05;
    @BindView(R.id.crl0501)
    RadioButton crl0501;
    @BindView(R.id.crl0599)
    RadioButton crl0599;
    @BindView(R.id.crl0501x)
    EditText crl0501x;
    @BindView(R.id.crl06)
    RadioGroup crl06;
    @BindView(R.id.crl0601)
    RadioButton crl0601;
    @BindView(R.id.crl0602)
    RadioButton crl0602;
    @BindView(R.id.crl0603)
    RadioButton crl0603;
    @BindView(R.id.crl0604)
    RadioButton crl0604;
    @BindView(R.id.crl0605)
    RadioButton crl0605;
    @BindView(R.id.crl0606)
    RadioButton crl0606;
    @BindView(R.id.crl0696)
    RadioButton crl0696;
    @BindView(R.id.crl0696x)
    EditText crl0696x;
    @BindView(R.id.crl07)
    RadioGroup crl07;
    @BindView(R.id.crl0701)
    RadioButton crl0701;
    @BindView(R.id.crl0799)
    RadioButton crl0799;
    @BindView(R.id.crl0701x)
    EditText crl0701x;
    @BindView(R.id.crl08)
    RadioGroup crl08;
    @BindView(R.id.crl0801)
    RadioButton crl0801;
    @BindView(R.id.crl0802)
    RadioButton crl0802;
    @BindView(R.id.crl0899)
    RadioButton crl0899;
    @BindView(R.id.crlGrp08)
    LinearLayout crlGrp08;
    @BindView(R.id.crl09)
    RadioGroup crl09;
    @BindView(R.id.crl0901)
    RadioButton crl0901;
    @BindView(R.id.crl0902)
    RadioButton crl0902;
    @BindView(R.id.crl0903)
    RadioButton crl0903;
    @BindView(R.id.crl0904)
    RadioButton crl0904;
    @BindView(R.id.crl0997)
    RadioButton crl0997;
    @BindView(R.id.crl0999)
    RadioButton crl0999;
    @BindView(R.id.crl10)
    RadioGroup crl10;
    @BindView(R.id.crl1001)
    RadioButton crl1001;
    @BindView(R.id.crl1002)
    RadioButton crl1002;
    @BindView(R.id.crl1003)
    RadioButton crl1003;
    @BindView(R.id.crl1004)
    RadioButton crl1004;
    @BindView(R.id.crl1005)
    RadioButton crl1005;
    @BindView(R.id.crl1006)
    RadioButton crl1006;
    @BindView(R.id.crl1096)
    RadioButton crl1096;
    @BindView(R.id.crl1096x)
    EditText crl1096x;
    @BindView(R.id.crl11)
    RadioGroup crl11;
    @BindView(R.id.crl1101)
    RadioButton crl1101;
    @BindView(R.id.crl1102)
    RadioButton crl1102;
    @BindView(R.id.crl1103)
    RadioButton crl1103;
    @BindView(R.id.crl1196)
    RadioButton crl1196;
    @BindView(R.id.crl1196x)
    EditText crl1196x;
    @BindView(R.id.crl1201)
    EditText crl1201;
    @BindView(R.id.crl1202)
    EditText crl1202;
    @BindView(R.id.crl1203)
    EditText crl1203;
    @BindView(R.id.crl1204)
    CheckBox crl1204;
    @BindView(R.id.crlGrp12)
    LinearLayout crlGrp12;
    @BindView(R.id.crl13)
    RadioGroup crl13;
    @BindView(R.id.crl1301)
    RadioButton crl1301;
    @BindView(R.id.crl1302)
    RadioButton crl1302;
    @BindView(R.id.crl1303)
    RadioButton crl1303;
    @BindView(R.id.crl1304)
    RadioButton crl1304;
    @BindView(R.id.crl1305)
    RadioButton crl1305;
    @BindView(R.id.crl1306)
    RadioButton crl1306;
    @BindView(R.id.crl1307)
    RadioButton crl1307;
    @BindView(R.id.crl1308)
    RadioButton crl1308;
    @BindView(R.id.crl1396)
    RadioButton crl1396;
    @BindView(R.id.crl1396x)
    EditText crl1396x;
    @BindView(R.id.fldGrpbtn)
    LinearLayout fldGrpbtn;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_l);
        ButterKnife.bind(this);

        // ====================== Q1 Skip Pattern =========================
        crl01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (crl0101.isChecked()) {
                    crlGrp01.setVisibility(View.VISIBLE);
                } else {
                    crlGrp01.setVisibility(View.GONE);
                    crl02.setText(null);
                }
            }
        });


        // ====================== Q3 Skip Pattern =========================
        crl03.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (crl0301.isChecked()) {
                    crlGrp03.setVisibility(View.VISIBLE);
                } else {
                    crlGrp03.setVisibility(View.GONE);
                    crl04.clearCheck();
                    crl0496x.setText(null);
                    crl05.clearCheck();
                    crl0501x.setText(null);
                    crl06.clearCheck();
                    crl0696x.setText(null);
                    crl07.clearCheck();
                    crl0701x.setText(null);
                    crl08.clearCheck();

                }
            }
        });

        // ====================== Q8 Skip Pattern =========================
        crl08.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (crl0801.isChecked()) {
                    crlGrp08.setVisibility(View.VISIBLE);
                } else {
                    crlGrp08.setVisibility(View.GONE);
                    crl09.clearCheck();
                }
            }
        });

        // ====================== Q12 Skip Pattern =========================
        crl1204.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crl1201.setText(null);
                    crl1202.setText(null);
                    crl1203.setText(null);
                    crlGrp12.setVisibility(View.GONE);
                } else {
                    crlGrp12.setVisibility(View.VISIBLE);
                }

            }
        });
        
    }

    @OnClick(R.id.btnNext)
    void onBtnNextClick() {
        Toast.makeText(this, "Processing this section", Toast.LENGTH_SHORT).show();
        if (validateForm()) {
            try {
                saveDrafts();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            //if (updateDb()) {
                Toast.makeText(this, "starting next section", Toast.LENGTH_SHORT).show();

                finish();
                Intent secM = new Intent(this, SectionMActivity.class);
                startActivity(secM);

            } else {
                Toast.makeText(this, "Failed to update Database", Toast.LENGTH_SHORT).show();
            }
        //}
    }


    @OnClick(R.id.btnEnd)
    void onBtnEndClick() {
        Toast.makeText(this, "complete Section", Toast.LENGTH_SHORT).show();
        Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);
    }

    private boolean updateDb() {


        return true;
    }

    private void saveDrafts() throws JSONException {
        Toast.makeText(this, "saving Drafts", Toast.LENGTH_SHORT).show();

        JSONObject sg = new JSONObject();

        Toast.makeText(this, "Validation Succecful", Toast.LENGTH_SHORT).show();
    }

    public boolean validateForm() {


        return true;
    }

}
    

   

