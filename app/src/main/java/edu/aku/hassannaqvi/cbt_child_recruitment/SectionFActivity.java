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

import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionFActivity extends Activity implements RadioGroup.OnCheckedChangeListener {

    private static final String TAG = SectionFActivity.class.getSimpleName();

    @BindView(R.id.activity_section_f)
    ScrollView activitySectionF;
    @BindView(R.id.crf01)
    RadioGroup crf01;
    @BindView(R.id.crf0101)
    RadioButton crf0101;
    @BindView(R.id.crf0102)
    RadioButton crf0102;
    @BindView(R.id.crf0199)
    RadioButton crf0199;
    @BindView(R.id.crf01a)
    RadioGroup crf01a;
    @BindView(R.id.crf01a01)
    RadioButton crf01a01;
    @BindView(R.id.crf01a02)
    RadioButton crf01a02;
    @BindView(R.id.crf01a99)
    RadioButton crf01a99;
    @BindView(R.id.crf02i)
    CheckBox crf02i;
    @BindView(R.id.crf02h)
    EditText crf02h;
    @BindView(R.id.crf02d)
    EditText crf02d;
    @BindView(R.id.crf03)
    RadioGroup crf03;
    @BindView(R.id.crf0301)
    RadioButton crf0301;
    @BindView(R.id.crf0302)
    RadioButton crf0302;
    @BindView(R.id.crf0399)
    RadioButton crf0399;
    @BindView(R.id.crf04)
    RadioGroup crf04;
    @BindView(R.id.crf0401)
    RadioButton crf0401;
    @BindView(R.id.crf0402)
    RadioButton crf0402;
    @BindView(R.id.crf0499)
    RadioButton crf0499;
    @BindView(R.id.crf05)
    RadioGroup crf05;
    @BindView(R.id.crf0501)
    RadioButton crf0501;
    @BindView(R.id.crf0502)
    RadioButton crf0502;
    @BindView(R.id.crf0599)
    RadioButton crf0599;
    @BindView(R.id.crf06a)
    RadioGroup crf06a;
    @BindView(R.id.crf06a01)
    RadioButton crf06a01;
    @BindView(R.id.crf06a02)
    RadioButton crf06a02;
    @BindView(R.id.crf06a99)
    RadioButton crf06a99;
    @BindView(R.id.crf06b)
    RadioGroup crf06b;
    @BindView(R.id.crf06b01)
    RadioButton crf06b01;
    @BindView(R.id.crf06b02)
    RadioButton crf06b02;
    @BindView(R.id.crf06b99)
    RadioButton crf06b99;
    @BindView(R.id.crf06btime)
    EditText crf06btime;
    @BindView(R.id.crf06c)
    RadioGroup crf06c;
    @BindView(R.id.crf06c01)
    RadioButton crf06c01;
    @BindView(R.id.crf06c02)
    RadioButton crf06c02;
    @BindView(R.id.crf06c99)
    RadioButton crf06c99;
    @BindView(R.id.crf06ctime)
    EditText crf06ctime;
    @BindView(R.id.crf06d)
    RadioGroup crf06d;
    @BindView(R.id.crf06d01)
    RadioButton crf06d01;
    @BindView(R.id.crf06d02)
    RadioButton crf06d02;
    @BindView(R.id.crf06d99)
    RadioButton crf06d99;
    @BindView(R.id.crf06e)
    RadioGroup crf06e;
    @BindView(R.id.crf06e01)
    RadioButton crf06e01;
    @BindView(R.id.crf06e02)
    RadioButton crf06e02;
    @BindView(R.id.crf06e99)
    RadioButton crf06e99;
    @BindView(R.id.crf06f)
    RadioGroup crf06f;
    @BindView(R.id.crf06f01)
    RadioButton crf06f01;
    @BindView(R.id.crf06f02)
    RadioButton crf06f02;
    @BindView(R.id.crf06f99)
    RadioButton crf06f99;
    @BindView(R.id.crf06ftime)
    EditText crf06ftime;
    @BindView(R.id.crf06g)
    RadioGroup crf06g;
    @BindView(R.id.crf06g01)
    RadioButton crf06g01;
    @BindView(R.id.crf06g02)
    RadioButton crf06g02;
    @BindView(R.id.crf06g99)
    RadioButton crf06g99;
    @BindView(R.id.crf06h)
    RadioGroup crf06h;
    @BindView(R.id.crf06h01)
    RadioButton crf06h01;
    @BindView(R.id.crf06h02)
    RadioButton crf06h02;
    @BindView(R.id.crf06h99)
    RadioButton crf06h99;
    @BindView(R.id.crf06i)
    RadioGroup crf06i;
    @BindView(R.id.crf06i01)
    RadioButton crf06i01;
    @BindView(R.id.crf06i02)
    RadioButton crf06i02;
    @BindView(R.id.crf06i99)
    RadioButton crf06i99;
    @BindView(R.id.crf07a)
    RadioGroup crf07a;
    @BindView(R.id.crf07a01)
    RadioButton crf07a01;
    @BindView(R.id.crf07a02)
    RadioButton crf07a02;
    @BindView(R.id.crf07a99)
    RadioButton crf07a99;
    @BindView(R.id.crf07b)
    RadioGroup crf07b;
    @BindView(R.id.crf07b01)
    RadioButton crf07b01;
    @BindView(R.id.crf07b02)
    RadioButton crf07b02;
    @BindView(R.id.crf07b99)
    RadioButton crf07b99;
    @BindView(R.id.crf07c)
    RadioGroup crf07c;
    @BindView(R.id.crf07c01)
    RadioButton crf07c01;
    @BindView(R.id.crf07c02)
    RadioButton crf07c02;
    @BindView(R.id.crf07c99)
    RadioButton crf07c99;
    @BindView(R.id.crf07d)
    RadioGroup crf07d;
    @BindView(R.id.crf07d01)
    RadioButton crf07d01;
    @BindView(R.id.crf07d02)
    RadioButton crf07d02;
    @BindView(R.id.crf07d99)
    RadioButton crf07d99;
    @BindView(R.id.crf07e)
    RadioGroup crf07e;
    @BindView(R.id.crf07e01)
    RadioButton crf07e01;
    @BindView(R.id.crf07e02)
    RadioButton crf07e02;
    @BindView(R.id.crf07e99)
    RadioButton crf07e99;
    @BindView(R.id.crf07f)
    RadioGroup crf07f;
    @BindView(R.id.crf07f01)
    RadioButton crf07f01;
    @BindView(R.id.crf07f02)
    RadioButton crf07f02;
    @BindView(R.id.crf07f99)
    RadioButton crf07f99;
    @BindView(R.id.crf07g)
    RadioGroup crf07g;
    @BindView(R.id.crf07g01)
    RadioButton crf07g01;
    @BindView(R.id.crf07g02)
    RadioButton crf07g02;
    @BindView(R.id.crf07g99)
    RadioButton crf07g99;
    @BindView(R.id.crf07h)
    RadioGroup crf07h;
    @BindView(R.id.crf07h01)
    RadioButton crf07h01;
    @BindView(R.id.crf07h02)
    RadioButton crf07h02;
    @BindView(R.id.crf07h99)
    RadioButton crf07h99;
    @BindView(R.id.crf07i)
    RadioGroup crf07i;
    @BindView(R.id.crf07i01)
    RadioButton crf07i01;
    @BindView(R.id.crf07i02)
    RadioButton crf07i02;
    @BindView(R.id.crf07i99)
    RadioButton crf07i99;
    @BindView(R.id.crf07j)
    RadioGroup crf07j;
    @BindView(R.id.crf07j01)
    RadioButton crf07j01;
    @BindView(R.id.crf07j02)
    RadioButton crf07j02;
    @BindView(R.id.crf07j99)
    RadioButton crf07j99;
    @BindView(R.id.crf07k)
    RadioGroup crf07k;
    @BindView(R.id.crf07k01)
    RadioButton crf07k01;
    @BindView(R.id.crf07k02)
    RadioButton crf07k02;
    @BindView(R.id.crf07k99)
    RadioButton crf07k99;
    @BindView(R.id.crf07l)
    RadioGroup crf07l;
    @BindView(R.id.crf07l01)
    RadioButton crf07l01;
    @BindView(R.id.crf07l02)
    RadioButton crf07l02;
    @BindView(R.id.crf07l99)
    RadioButton crf07l99;
    @BindView(R.id.crf07m)
    RadioGroup crf07m;
    @BindView(R.id.crf07m01)
    RadioButton crf07m01;
    @BindView(R.id.crf07m02)
    RadioButton crf07m02;
    @BindView(R.id.crf07m99)
    RadioButton crf07m99;
    @BindView(R.id.crf07n)
    RadioGroup crf07n;
    @BindView(R.id.crf07n01)
    RadioButton crf07n01;
    @BindView(R.id.crf07n02)
    RadioButton crf07n02;
    @BindView(R.id.crf07n99)
    RadioButton crf07n99;
    @BindView(R.id.crf07o)
    RadioGroup crf07o;
    @BindView(R.id.crf07o01)
    RadioButton crf07o01;
    @BindView(R.id.crf07o02)
    RadioButton crf07o02;
    @BindView(R.id.crf07o99)
    RadioButton crf07o99;
    @BindView(R.id.crf07p)
    RadioGroup crf07p;
    @BindView(R.id.crf07p01)
    RadioButton crf07p01;
    @BindView(R.id.crf07p02)
    RadioButton crf07p02;
    @BindView(R.id.crf07p99)
    RadioButton crf07p99;
    @BindView(R.id.crf07q)
    RadioGroup crf07q;
    @BindView(R.id.crf07q01)
    RadioButton crf07q01;
    @BindView(R.id.crf07q02)
    RadioButton crf07q02;
    @BindView(R.id.crf07q99)
    RadioButton crf07q99;
    @BindView(R.id.crf08)
    RadioGroup crf08;
    @BindView(R.id.crf0801)
    RadioButton crf0801;
    @BindView(R.id.crf0802)
    RadioButton crf0802;
    @BindView(R.id.crf0899)
    RadioButton crf0899;
    @BindView(R.id.crf0999)
    CheckBox crf0999;
    @BindView(R.id.crf09num)
    EditText crf09num;
    @BindView(R.id.crf10)
    RadioGroup crf10;
    @BindView(R.id.crf1001)
    RadioButton crf1001;
    @BindView(R.id.crf1002)
    RadioButton crf1002;
    @BindView(R.id.crf1099)
    RadioButton crf1099;
    @BindView(R.id.crf11)
    RadioGroup crf11;
    @BindView(R.id.crf1101)
    RadioButton crf1101;
    @BindView(R.id.crf1102)
    RadioButton crf1102;
    @BindView(R.id.crf1199)
    RadioButton crf1199;
    @BindView(R.id.crf12)
    RadioGroup crf12;
    @BindView(R.id.crf1201)
    RadioButton crf1201;
    @BindView(R.id.crf1202)
    RadioButton crf1202;
    @BindView(R.id.crf1299)
    RadioButton crf1299;
    @BindView(R.id.crf13)
    RadioGroup crf13;
    @BindView(R.id.crf1301)
    RadioButton crf1301;
    @BindView(R.id.crf1302)
    RadioButton crf1302;
    @BindView(R.id.crf1399)
    RadioButton crf1399;
    @BindView(R.id.crf14)
    RadioGroup crf14;
    @BindView(R.id.crf1401)
    RadioButton crf1401;
    @BindView(R.id.crf1402)
    RadioButton crf1402;
    @BindView(R.id.crf1499)
    RadioButton crf1499;
    @BindView(R.id.crf15)
    EditText crf15;
    @BindView(R.id.fldGrpbtn)
    LinearLayout fldGrpbtn;
    @BindView(R.id.fldGrpcrf01a)
    LinearLayout fldGrpcrf01a;
    @BindView(R.id.fldGrpcrf06b)
    LinearLayout fldGrpcrf06b;
    @BindView(R.id.fldGrpcrf06c)
    LinearLayout fldGrpcrf06c;
    @BindView(R.id.fldGrpcrf06f)
    LinearLayout fldGrpcrf06f;
    @BindView(R.id.fldGrpcrf09)
    LinearLayout fldGrpcrf09;

    @BindViews({R.id.crf07a, R.id.crf07b, R.id.crf07c, R.id.crf07d, R.id.crf07e, R.id.crf07f, R.id.crf07g,
            R.id.crf07h, R.id.crf07i, R.id.crf07j, R.id.crf07k, R.id.crf07l, R.id.crf07m, R.id.crf07n, R.id.crf07o,
            R.id.crf07p, R.id.crf07q})
    List<RadioGroup> crf07;

    @BindViews({R.id.crf07a02, R.id.crf07b02, R.id.crf07c02, R.id.crf07d02, R.id.crf07e02, R.id.crf07f02, R.id.crf07g02,
            R.id.crf07h02, R.id.crf07i02, R.id.crf07j02, R.id.crf07k02, R.id.crf07l02, R.id.crf07m02, R.id.crf07n02, R.id.crf07o02,
            R.id.crf07p02, R.id.crf07q02})
    List<RadioButton> crf0702;

    @BindViews({R.id.crf07a99, R.id.crf07b99, R.id.crf07c99, R.id.crf07d99, R.id.crf07e99, R.id.crf07f99, R.id.crf07g99,
            R.id.crf07h99, R.id.crf07i99, R.id.crf07j99, R.id.crf07k99, R.id.crf07l99, R.id.crf07m99, R.id.crf07n99, R.id.crf07o99,
            R.id.crf07p99, R.id.crf07q99})
    List<RadioButton> crf0799;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_f);
        ButterKnife.bind(this);

        //================ Q1 Skip pattern ==============
        crf01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (crf0101.isChecked()) {
                    fldGrpcrf01a.setVisibility(View.GONE);
                    crf01a.clearCheck();
                } else {
                    fldGrpcrf01a.setVisibility(View.VISIBLE);
                }
            }
        });

        //============= Q6 B Times=========
        crf06b01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrf06b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrf06b.setVisibility(View.GONE);
                    crf06btime.setText(null);
                }
            }
        });

        //============= Q6 C Times=========
        crf06c01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrf06c.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrf06c.setVisibility(View.GONE);
                    crf06ctime.setText(null);
                }
            }
        });

        //============= Q6 f Times=========
        crf06f01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrf06f.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrf06f.setVisibility(View.GONE);
                    crf06ftime.setText(null);
                }
            }
        });

        //=============== Q8 Skip Pattern===============

        crf08.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (crf0801.isChecked()) {
                    fldGrpcrf09.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrf09.setVisibility(View.GONE);
                    crf09num.setText(null);
                    crf0999.setChecked(false);
                }
            }
        });

        //================== Q7 Skip Pattern ===========
        for (RadioGroup rg : crf07) {
            rg.setOnCheckedChangeListener(this);
        }








    }

    @OnClick(R.id.btnNext)
    void onBtnNextClick() {
        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();

                startActivity(new Intent(this, SectionGActivity.class));
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

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

        int updcount = db.updateF();

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

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sa = new JSONObject();


        //DCEApp.fc.setROW_Sa(String.valueOf(sa));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

        if (is07AllNo() || is07Alldontknow()) {
            // Show answer here
            fldGrpcrf09.setVisibility(View.VISIBLE);

        }

    }


    public boolean is07AllNo() {


        int i = 0;
        for (RadioButton rg : crf0702) {
            if (rg.isChecked())
                i++;
        }

        // Show answer here
        return i == crf0702.size();

    }

    public boolean is07Alldontknow() {


        int i = 0;
        for (RadioButton rg : crf0799) {
            if (rg.isChecked())
                i++;
        }

        // Show answer here
        return i == crf0799.size();

    }


}


