package edu.aku.hassannaqvi.cbt_child_recruitment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionAActivity extends Activity {

    private static final String TAG = SectionAActivity.class.getSimpleName();

    @BindView(R.id.activity_section_a)
    ScrollView activitySectionA;
    @BindView(R.id.cra01)
    RadioGroup cra01;
    @BindView(R.id.cra0101)
    RadioButton cra0101;
    @BindView(R.id.cra0102)
    RadioButton cra0102;
    @BindView(R.id.fldGrpcra02)
    LinearLayout fldGrpcra02;
    @BindView(R.id.cra02)
    RadioGroup cra02;
    @BindView(R.id.cra0201)
    RadioButton cra0201;
    @BindView(R.id.cra0202)
    RadioButton cra0202;
    @BindView(R.id.fldGrpcra03)
    LinearLayout fldGrpcra03;
    @BindView(R.id.cra04)
    RadioGroup cra04;
    @BindView(R.id.cra0401)
    RadioButton cra0401;
    @BindView(R.id.cra0402)
    RadioButton cra0402;
    @BindView(R.id.cra0403)
    RadioButton cra0403;
    @BindView(R.id.cra0404)
    RadioButton cra0404;
    @BindView(R.id.cra0405)
    RadioButton cra0405;
    @BindView(R.id.cra05)
    EditText cra05;
    @BindView(R.id.cra06)
    EditText cra06;
    @BindView(R.id.cra07)
    EditText cra07;
    @BindView(R.id.cra08)
    EditText cra08;
    @BindView(R.id.cra09)
    EditText cra09;
    @BindView(R.id.cra10)
    EditText cra10;
    @BindView(R.id.cra11)
    EditText cra11;
    @BindView(R.id.cra12)
    EditText cra12;
    @BindView(R.id.cra13)
    RadioGroup cra13;
    @BindView(R.id.cra1301)
    RadioButton cra1301;
    @BindView(R.id.cra1302)
    RadioButton cra1302;
    @BindView(R.id.cra14)
    EditText cra14;
    @BindView(R.id.cra15)
    EditText cra15;
    @BindView(R.id.cra16)
    RadioGroup cra16;
    @BindView(R.id.cra1601)
    RadioButton cra1601;
    @BindView(R.id.cra1602)
    RadioButton cra1602;
    @BindView(R.id.cra1603)
    RadioButton cra1603;
    @BindView(R.id.cra17)
    EditText cra17;
    @BindView(R.id.cra18)
    EditText cra18;
    @BindView(R.id.cra19)
    EditText cra19;
    @BindView(R.id.cra20)
    EditText cra20;
    @BindView(R.id.cra21)
    EditText cra21;
    @BindView(R.id.cra22)
    EditText cra22;
    @BindView(R.id.cra23)
    EditText cra23;
    @BindView(R.id.cra24)
    EditText cra24;
    @BindView(R.id.fldGrpbtn)
    LinearLayout fldGrpbtn;
    @BindView(R.id.cra03)
    EditText cra03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_a);
        ButterKnife.bind(this);

        //================= Q1  Skip Pattern // HH Recieving Cash from BISP =============
        cra01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (cra0101.isChecked()) {
                    fldGrpcra02.setVisibility(View.VISIBLE);
                    fldGrpcra03.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcra02.setVisibility(View.GONE);
                    fldGrpcra03.setVisibility(View.GONE);
                    cra02.clearCheck();
                    cra03.setText(null);
                    cra04.clearCheck();
                    cra05.setText(null);
                    cra06.setText(null);
                    cra07.setText(null);
                    cra08.setText(null);
                    cra09.setText(null);
                    cra10.setText(null);
                    cra11.setText(null);
                    cra12.setText(null);
                    cra13.clearCheck();
                    cra14.setText(null);
                    cra15.setText(null);
                    cra16.clearCheck();
                    cra17.setText(null);
                    cra18.setText(null);
                    cra19.setText(null);
                    cra20.setText(null);
                    cra21.setText(null);
                    cra22.setText(null);
                    cra23.setText(null);
                    cra24.setText(null);

                }
            }
        });

        //============== Q2 Skip Pattern // Verbal Consent====

        cra02.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (cra0201.isChecked()) {
                    fldGrpcra03.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcra03.setVisibility(View.GONE);
                    cra03.setText(null);
                    cra04.clearCheck();
                    cra05.setText(null);
                    cra06.setText(null);
                    cra07.setText(null);
                    cra08.setText(null);
                    cra09.setText(null);
                    cra10.setText(null);
                    cra11.setText(null);
                    cra12.setText(null);
                    cra13.clearCheck();
                    cra14.setText(null);
                    cra15.setText(null);
                    cra16.clearCheck();
                    cra17.setText(null);
                    cra18.setText(null);
                    cra19.setText(null);
                    cra20.setText(null);
                    cra21.setText(null);
                    cra22.setText(null);
                    cra23.setText(null);
                    cra24.setText(null);

                }
            }
        });


    }

    @OnClick(R.id.btnNext)
    void onBtnNextClick() {
        //TODO implement
    }


    @OnClick(R.id.btnEnd)
    void onBtnEndClick() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();

        /*if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
*/
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);
            /*} else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }*/
    }


    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateA();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }


    }

    public boolean ValidateForm() {

        Toast.makeText(this, "Validating Section A", Toast.LENGTH_SHORT).show();

        //======================= Q 1 ===============


        return true;

    }


}
