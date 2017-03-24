package edu.aku.hassannaqvi.cbt_child_recruitment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionHActivity extends Activity {

    private static final String TAG = SectionHActivity.class.getSimpleName();

    @BindView(R.id.activity_section_h)
    ScrollView activitySectionH;
    @BindView(R.id.crh01)
    RadioGroup crh01;
    @BindView(R.id.crh0101)
    RadioButton crh0101;
    @BindView(R.id.crh0102)
    RadioButton crh0102;
    @BindView(R.id.crh0103)
    RadioButton crh0103;
    @BindView(R.id.crh0196)
    RadioButton crh0196;
    @BindView(R.id.crh0196x)
    EditText crh0196x;
    @BindView(R.id.fldGrpcrh02)
    LinearLayout fldGrpcrh02;
    @BindView(R.id.crh02)
    RadioGroup crh02;
    @BindView(R.id.crh0201)
    RadioButton crh0201;
    @BindView(R.id.crh0202)
    RadioButton crh0202;
    @BindView(R.id.crh03)
    RadioGroup crh03;
    @BindView(R.id.crh0301)
    RadioButton crh0301;
    @BindView(R.id.crh0302)
    RadioButton crh0302;
    @BindView(R.id.crh0303)
    RadioButton crh0303;
    @BindView(R.id.crh0304)
    RadioButton crh0304;
    @BindView(R.id.crh0305)
    RadioButton crh0305;
    @BindView(R.id.crh04)
    RadioGroup crh04;
    @BindView(R.id.crh0401)
    RadioButton crh0401;
    @BindView(R.id.crh0402)
    RadioButton crh0402;
    @BindView(R.id.fldGrpcrh05)
    LinearLayout fldGrpcrh05;
    @BindView(R.id.crh05)
    RadioGroup crh05;
    @BindView(R.id.crh0501)
    RadioButton crh0501;
    @BindView(R.id.crh0502)
    RadioButton crh0502;
    @BindView(R.id.crh0503)
    RadioButton crh0503;
    @BindView(R.id.crh0504)
    RadioButton crh0504;
    @BindView(R.id.crh0505)
    RadioButton crh0505;

    @BindView(R.id.crh0601)
    CheckBox crh0601;
    @BindView(R.id.crh0602)
    CheckBox crh0602;
    @BindView(R.id.crh0603)
    CheckBox crh0603;
    @BindView(R.id.crh0604)
    CheckBox crh0604;
    @BindView(R.id.crh0605)
    CheckBox crh0605;
    @BindView(R.id.crh0606)
    CheckBox crh0606;
    @BindView(R.id.crh0607)
    CheckBox crh0607;
    @BindView(R.id.crh0608)
    CheckBox crh0608;
    @BindView(R.id.crh0609)
    CheckBox crh0609;
    @BindView(R.id.crh0696)
    CheckBox crh0696;
    @BindView(R.id.crh0696x)
    EditText crh0696x;
    @BindView(R.id.cri01a)
    EditText cri01a;
    @BindView(R.id.cri01b)
    EditText cri01b;
    @BindView(R.id.cri01c)
    EditText cri01c;
    @BindView(R.id.cri01d)
    EditText cri01d;
    @BindView(R.id.cri01e)
    EditText cri01e;
    @BindView(R.id.cri01f)
    EditText cri01f;
    @BindView(R.id.cri01g)
    EditText cri01g;
    @BindView(R.id.cri01h)
    EditText cri01h;
    @BindView(R.id.cri01i)
    EditText cri01i;
    @BindView(R.id.cri01j)
    EditText cri01j;
    @BindView(R.id.cri01k)
    EditText cri01k;
    @BindView(R.id.cri01l)
    EditText cri01l;
    @BindView(R.id.cri01m)
    EditText cri01m;
    @BindView(R.id.cri02a)
    EditText cri02a;
    @BindView(R.id.cri02b)
    EditText cri02b;
    @BindView(R.id.cri02c)
    EditText cri02c;
    @BindView(R.id.cri02d)
    EditText cri02d;
    @BindView(R.id.cri02e)
    EditText cri02e;
    @BindView(R.id.cri02f)
    EditText cri02f;
    @BindView(R.id.cri02g)
    EditText cri02g;
    @BindView(R.id.cri02h)
    EditText cri02h;
    @BindView(R.id.cri02i)
    EditText cri02i;
    @BindView(R.id.cri02j)
    EditText cri02j;
    @BindView(R.id.cri02k)
    EditText cri02k;
    @BindView(R.id.cri02l)
    EditText cri02l;
    @BindView(R.id.cri03)
    EditText cri03;
    @BindView(R.id.cri04)
    RadioGroup cri04;
    @BindView(R.id.cri0401)
    RadioButton cri0401;
    @BindView(R.id.cri0402)
    RadioButton cri0402;
    @BindView(R.id.cri0499)
    RadioButton cri0499;
    @BindView(R.id.crj01a)
    RadioGroup crj01a;
    @BindView(R.id.crj01a01)
    RadioButton crj01a01;
    @BindView(R.id.crj01a02)
    RadioButton crj01a02;
    @BindView(R.id.fldGrpcrj01a)
    LinearLayout fldGrpcrj01a;
    @BindView(R.id.crj01anum)
    EditText crj01anum;
    @BindView(R.id.crj01asrc)
    Spinner crj01asrc;
    @BindView(R.id.crj01b)
    RadioGroup crj01b;
    @BindView(R.id.crj01b01)
    RadioButton crj01b01;
    @BindView(R.id.crj01b02)
    RadioButton crj01b02;
    @BindView(R.id.fldGrpcrj01b)
    LinearLayout fldGrpcrj01b;
    @BindView(R.id.crj01bnum)
    EditText crj01bnum;
    @BindView(R.id.crj01bsrc)
    Spinner crj01bsrc;
    @BindView(R.id.crj01c)
    RadioGroup crj01c;
    @BindView(R.id.crj01c01)
    RadioButton crj01c01;
    @BindView(R.id.crj01c02)
    RadioButton crj01c02;
    @BindView(R.id.fldGrpcrj01c)
    LinearLayout fldGrpcrj01c;
    @BindView(R.id.crj01cnum)
    EditText crj01cnum;
    @BindView(R.id.crj01csrc)
    Spinner crj01csrc;
    @BindView(R.id.crj01d)
    RadioGroup crj01d;
    @BindView(R.id.crj01d01)
    RadioButton crj01d01;
    @BindView(R.id.crj01d02)
    RadioButton crj01d02;
    @BindView(R.id.fldGrpcrj01d)
    LinearLayout fldGrpcrj01d;
    @BindView(R.id.crj01dnum)
    EditText crj01dnum;
    @BindView(R.id.crj01dsrc)
    Spinner crj01dsrc;
    @BindView(R.id.crj01e)
    RadioGroup crj01e;
    @BindView(R.id.crj01e01)
    RadioButton crj01e01;
    @BindView(R.id.crj01e02)
    RadioButton crj01e02;
    @BindView(R.id.fldGrpcrj01e)
    LinearLayout fldGrpcrj01e;
    @BindView(R.id.crj01enum)
    EditText crj01enum;
    @BindView(R.id.crj01esrc)
    Spinner crj01esrc;
    @BindView(R.id.crj01f)
    RadioGroup crj01f;
    @BindView(R.id.crj01f01)
    RadioButton crj01f01;
    @BindView(R.id.crj01f02)
    RadioButton crj01f02;
    @BindView(R.id.fldGrpcrj01f)
    LinearLayout fldGrpcrj01f;
    @BindView(R.id.crj01fnum)
    EditText crj01fnum;
    @BindView(R.id.crj01fsrc)
    Spinner crj01fsrc;
    @BindView(R.id.crj01g)
    RadioGroup crj01g;
    @BindView(R.id.crj01g01)
    RadioButton crj01g01;
    @BindView(R.id.crj01g02)
    RadioButton crj01g02;
    @BindView(R.id.fldGrpcrj01g)
    LinearLayout fldGrpcrj01g;
    @BindView(R.id.crj01gnum)
    EditText crj01gnum;
    @BindView(R.id.crj01gsrc)
    Spinner crj01gsrc;
    @BindView(R.id.crj01h)
    RadioGroup crj01h;
    @BindView(R.id.crj01h01)
    RadioButton crj01h01;
    @BindView(R.id.crj01h02)
    RadioButton crj01h02;
    @BindView(R.id.fldGrpcrj01h)
    LinearLayout fldGrpcrj01h;
    @BindView(R.id.crj01hnum)
    EditText crj01hnum;
    @BindView(R.id.crj01hsrc)
    Spinner crj01hsrc;
    @BindView(R.id.crj01i)
    RadioGroup crj01i;
    @BindView(R.id.crj01i01)
    RadioButton crj01i01;
    @BindView(R.id.crj01i02)
    RadioButton crj01i02;
    @BindView(R.id.fldGrpcrj01i)
    LinearLayout fldGrpcrj01i;
    @BindView(R.id.crj01inum)
    EditText crj01inum;
    @BindView(R.id.crj01isrc)
    Spinner crj01isrc;
    @BindView(R.id.crj01j)
    RadioGroup crj01j;
    @BindView(R.id.crj01j01)
    RadioButton crj01j01;
    @BindView(R.id.crj01j02)
    RadioButton crj01j02;
    @BindView(R.id.fldGrpcrj01j)
    LinearLayout fldGrpcrj01j;
    @BindView(R.id.crj01jnum)
    EditText crj01jnum;
    @BindView(R.id.crj01jsrc)
    Spinner crj01jsrc;
    @BindView(R.id.crj01k)
    RadioGroup crj01k;
    @BindView(R.id.crj01k01)
    RadioButton crj01k01;
    @BindView(R.id.crj01k02)
    RadioButton crj01k02;
    @BindView(R.id.fldGrpcrj01k)
    LinearLayout fldGrpcrj01k;
    @BindView(R.id.crj01knum)
    EditText crj01knum;
    @BindView(R.id.crj01ksrc)
    Spinner crj01ksrc;
    @BindView(R.id.crj01l)
    RadioGroup crj01l;
    @BindView(R.id.crj01l01)
    RadioButton crj01l01;
    @BindView(R.id.crj01l02)
    RadioButton crj01l02;
    @BindView(R.id.fldGrpcrj01l)
    LinearLayout fldGrpcrj01l;
    @BindView(R.id.crj01lnum)
    EditText crj01lnum;
    @BindView(R.id.crj01lsrc)
    Spinner crj01lsrc;
    @BindView(R.id.crj01mx)
    EditText crj01mx;
    @BindView(R.id.crj01m)
    RadioGroup crj01m;
    @BindView(R.id.crj01m01)
    RadioButton crj01m01;
    @BindView(R.id.crj01m02)
    RadioButton crj01m02;
    @BindView(R.id.fldGrpcrj01m)
    LinearLayout fldGrpcrj01m;
    @BindView(R.id.crj01mnum)
    EditText crj01mnum;
    @BindView(R.id.crj01msrc)
    Spinner crj01msrc;
    @BindView(R.id.crj01nx)
    EditText crj01nx;
    @BindView(R.id.crj01n)
    RadioGroup crj01n;
    @BindView(R.id.crj01n01)
    RadioButton crj01n01;
    @BindView(R.id.crj01n02)
    RadioButton crj01n02;
    @BindView(R.id.fldGrpcrj01n)
    LinearLayout fldGrpcrj01n;
    @BindView(R.id.crj01nnum)
    EditText crj01nnum;
    @BindView(R.id.crj01nsrc)
    Spinner crj01nsrc;
    @BindView(R.id.fldGrpbtn)
    LinearLayout fldGrpbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_h);
        ButterKnife.bind(this);


//*********************************Section H***********************
        crh0101.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrh02.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrh02.setVisibility(View.GONE);
                    crh02.clearCheck();
                    crh03.clearCheck();
                }
            }
        });

        crh0196.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crh0196x.setVisibility(View.VISIBLE);
                } else {
                    crh0196x.setVisibility(View.GONE);
                    crh0196x.setText(null);
                }
            }
        });

        crh04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (crh0401.isChecked()) {
                    fldGrpcrh05.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrh05.setVisibility(View.GONE);
                    crh05.clearCheck();
                }
            }
        });

        crh0696.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crh0696x.setVisibility(View.VISIBLE);
                } else {
                    crh0696x.setVisibility(View.GONE);
                    crh0696x.setText(null);
                }
            }
        });


//******************************************** Section J *******************************************
        crj01a01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrj01a.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrj01a.setVisibility(View.GONE);
                    crj01anum.setText(null);
                }
            }
        });

        crj01b01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrj01b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrj01b.setVisibility(View.GONE);
                    crj01bnum.setText(null);
                }
            }
        });

        crj01c01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrj01c.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrj01c.setVisibility(View.GONE);
                    crj01cnum.setText(null);
                }
            }
        });

        crj01d01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrj01d.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrj01d.setVisibility(View.GONE);
                    crj01dnum.setText(null);
                }
            }
        });

        crj01e01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrj01e.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrj01e.setVisibility(View.GONE);
                    crj01enum.setText(null);
                }
            }
        });

        crj01f01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrj01f.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrj01f.setVisibility(View.GONE);
                    crj01fnum.setText(null);
                }
            }
        });

        crj01g01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrj01g.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrj01g.setVisibility(View.GONE);
                    crj01gnum.setText(null);
                }
            }
        });

        crj01h01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrj01h.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrj01h.setVisibility(View.GONE);
                    crj01hnum.setText(null);
                }
            }
        });

        crj01i01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrj01i.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrj01i.setVisibility(View.GONE);
                    crj01inum.setText(null);
                }
            }
        });

        crj01j01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrj01j.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrj01j.setVisibility(View.GONE);
                    crj01jnum.setText(null);
                }
            }
        });

        crj01k01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrj01k.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrj01k.setVisibility(View.GONE);
                    crj01knum.setText(null);
                }
            }
        });

        crj01l01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrj01l.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrj01l.setVisibility(View.GONE);
                    crj01lnum.setText(null);
                }
            }
        });

        crj01m01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrj01m.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrj01m.setVisibility(View.GONE);
                    crj01mnum.setText(null);
                    crj01mx.setText(null);
                }
            }
        });

        crj01n01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrj01n.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrj01n.setVisibility(View.GONE);
                    crj01nnum.setText(null);
                    crj01nx.setText(null);
                }
            }
        });

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

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sh = new JSONObject();
        JSONObject si = new JSONObject();
        JSONObject sj = new JSONObject();

        sh.put("crh01", crh0101.isChecked() ? "1" : crh0102.isChecked() ? "2" : crh0103.isChecked() ? "3"
                : crh0196.isChecked() ? "96" : "0");
        sh.put("crh0196x", crh0196x.getText().toString());
        sh.put("crh02", crh0201.isChecked() ? "1" : crh0202.isChecked() ? "2" : "0");
        sh.put("crh03", crh0301.isChecked() ? "1" : crh0302.isChecked() ? "2" : crh0303.isChecked() ? "3"
                : crh0304.isChecked() ? "4" : crh0305.isChecked() ? "5" : "0");
        sh.put("crh04", crh0401.isChecked() ? "1" : crh0402.isChecked() ? "2" : "0");
        sh.put("crh05", crh0501.isChecked() ? "1" : crh0502.isChecked() ? "2" : crh0503.isChecked() ? "3"
                : crh0504.isChecked() ? "4" : crh0505.isChecked() ? "5" : "0");
        sh.put("crh0601", crh0601.isChecked() ? "1" : "0");
        sh.put("crh0602", crh0602.isChecked() ? "1" : "0");
        sh.put("crh0603", crh0603.isChecked() ? "1" : "0");
        sh.put("crh0604", crh0604.isChecked() ? "1" : "0");
        sh.put("crh0605", crh0605.isChecked() ? "1" : "0");
        sh.put("crh0606", crh0606.isChecked() ? "1" : "0");
        sh.put("crh0607", crh0607.isChecked() ? "1" : "0");
        sh.put("crh0607", crh0607.isChecked() ? "1" : "0");
        sh.put("crh0608", crh0608.isChecked() ? "1" : "0");
        sh.put("crh0609", crh0609.isChecked() ? "1" : "0");
        sh.put("crh0696", crh0696.isChecked() ? "1" : "0");
        sh.put("crh0696x", crh0696x.getText().toString());

        si.put("cri01a", cri01a.getText().toString());
        si.put("cri01b", cri01b.getText().toString());
        si.put("cri01c", cri01c.getText().toString());
        si.put("cri01d", cri01d.getText().toString());
        si.put("cri01e", cri01e.getText().toString());
        si.put("cri01f", cri01f.getText().toString());
        si.put("cri01g", cri01g.getText().toString());
        si.put("cri01h", cri01h.getText().toString());
        si.put("cri01i", cri01i.getText().toString());
        si.put("cri01j", cri01j.getText().toString());
        si.put("cri01k", cri01k.getText().toString());
        si.put("cri01l", cri01l.getText().toString());
        si.put("cri01m", cri01m.getText().toString());
        si.put("cri02a", cri02a.getText().toString());
        si.put("cri02b", cri02b.getText().toString());
        si.put("cri02c", cri02c.getText().toString());
        si.put("cri02d", cri02d.getText().toString());
        si.put("cri02e", cri02e.getText().toString());
        si.put("cri02f", cri02f.getText().toString());
        si.put("cri02g", cri02g.getText().toString());
        si.put("cri02g", cri02h.getText().toString());
        si.put("cri02i", cri02i.getText().toString());
        si.put("cri02j", cri02j.getText().toString());
        si.put("cri02k", cri02k.getText().toString());
        si.put("cri02l", cri02l.getText().toString());
        si.put("cri03", cri03.getText().toString());
        si.put("cri04", cri0401.isChecked() ? "1" : cri0402.isChecked() ? "2" : cri0499.isChecked() ? "99" : "0");

        sj.put("crj01a", crj01a01.isChecked() ? "1" : crj01a02.isChecked() ? "2" : "0");
        sj.put("crj01anum", crj01anum.getText().toString());
        sj.put("crj01asrc", crj01asrc.getSelectedItem().toString());
        sj.put("crj01b", crj01b01.isChecked() ? "1" : crj01b02.isChecked() ? "2" : "0");
        sj.put("crj01bnum", crj01bnum.getText().toString());
        sj.put("crj01bsrc", crj01bsrc.getSelectedItem().toString());
        sj.put("crj01c", crj01c01.isChecked() ? "1" : crj01c02.isChecked() ? "2" : "0");
        sj.put("crj01cnum", crj01cnum.getText().toString());
        sj.put("crj01csrc", crj01csrc.getSelectedItem().toString());
        sj.put("crj01d", crj01d01.isChecked() ? "1" : crj01d02.isChecked() ? "2" : "0");
        sj.put("crj01dnum", crj01dnum.getText().toString());
        sj.put("crj01dsrc", crj01dsrc.getSelectedItem().toString());
        sj.put("crj01e", crj01e01.isChecked() ? "1" : crj01e02.isChecked() ? "2" : "0");
        sj.put("crj01enum", crj01enum.getText().toString());
        sj.put("crj01esrc", crj01esrc.getSelectedItem().toString());
        sj.put("crj01f", crj01f01.isChecked() ? "1" : crj01f02.isChecked() ? "2" : "0");
        sj.put("crj01fnum", crj01fnum.getText().toString());
        sj.put("crj01fsrc", crj01fsrc.getSelectedItem().toString());
        sj.put("crj01g", crj01g01.isChecked() ? "1" : crj01g02.isChecked() ? "2" : "0");
        sj.put("crj01gnum", crj01gnum.getText().toString());
        sj.put("crj01gsrc", crj01gsrc.getSelectedItem().toString());
        sj.put("crj01h", crj01h01.isChecked() ? "1" : crj01h02.isChecked() ? "2" : "0");
        sj.put("crj01hnum", crj01hnum.getText().toString());
        sj.put("crj01hsrc", crj01hsrc.getSelectedItem().toString());
        sj.put("crj01i", crj01i01.isChecked() ? "1" : crj01i02.isChecked() ? "2" : "0");
        sj.put("crj01inum", crj01inum.getText().toString());
        sj.put("crj01isrc", crj01isrc.getSelectedItem().toString());
        sj.put("crj01j", crj01j01.isChecked() ? "1" : crj01j02.isChecked() ? "2" : "0");
        sj.put("crj01jnum", crj01jnum.getText().toString());
        sj.put("crj01jsrc", crj01jsrc.getSelectedItem().toString());
        sj.put("crj01k", crj01k01.isChecked() ? "1" : crj01k02.isChecked() ? "2" : "0");
        sj.put("crj01knum", crj01knum.getText().toString());
        sj.put("crj01ksrc", crj01ksrc.getSelectedItem().toString());
        sj.put("crj01l", crj01l01.isChecked() ? "1" : crj01l02.isChecked() ? "2" : "0");
        sj.put("crj01lnum", crj01lnum.getText().toString());
        sj.put("crj01lsrc", crj01lsrc.getSelectedItem().toString());
        sj.put("crj01m", crj01m01.isChecked() ? "1" : crj01m02.isChecked() ? "2" : "0");
        sj.put("crj01mx", crj01mx.getText().toString());
        sj.put("crj01mnum", crj01mnum.getText().toString());
        sj.put("crj01msrc", crj01msrc.getSelectedItem().toString());
        sj.put("crj01n", crj01n01.isChecked() ? "1" : crj01n02.isChecked() ? "2" : "0");
        sj.put("crj01nx", crj01nx.getText().toString());
        sj.put("crj01nnum", crj01nnum.getText().toString());
        sj.put("crj01nsrc", crj01nsrc.getSelectedItem().toString());


        //DCEApp.fc.setROW_Sa(String.valueOf(sa));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean ValidateForm() {

        Toast.makeText(this, "Validating Section H", Toast.LENGTH_SHORT).show();

//*************************************Section H******************
        //======================= Q 1 ===============
        if (crh01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crh01), Toast.LENGTH_SHORT).show();
            crh0196.setError("This data is Required!");
            Log.i(TAG, "crh01: This data is Required!");
            return false;
        } else {
            crh0196.setError(null);
        }

        //====================== Q1 Others ================
        if (crh0196.isChecked() && crh0196x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crh01) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            crh0196x.setError("This data is Required!");
            Log.i(TAG, "crh0196x: This data is Required!");
            return false;
        } else {
            crh0196x.setError(null);
        }

        if (crh0101.isChecked()) {
            //====================== Q2 ================
            if (crh02.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crh02), Toast.LENGTH_SHORT).show();
                crh0202.setError("This data is Required!");
                Log.i(TAG, "crh02: This data is Required!");
                return false;
            } else {
                crh0202.setError(null);
            }

            //====================== Q3 ================
            if (crh03.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crh03), Toast.LENGTH_SHORT).show();
                crh0305.setError("This data is Required!");
                Log.i(TAG, "crh03: This data is Required!");
                return false;
            } else {
                crh0305.setError(null);
            }

        }

        //====================== Q4 ================
        if (crh04.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crh04), Toast.LENGTH_SHORT).show();
            crh0402.setError("This data is Required!");
            Log.i(TAG, "crh04: This data is Required!");
            return false;
        } else {
            crh0402.setError(null);
        }

        if (crh0401.isChecked()) {
            //====================== Q5 ================
            if (crh05.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crh05), Toast.LENGTH_SHORT).show();
                crh0505.setError("This data is Required!");
                Log.i(TAG, "crh05: This data is Required!");
                return false;
            } else {
                crh0505.setError(null);
            }
        }

        //====================== Q6 ================
        if (!(crh0601.isChecked() && crh0602.isChecked() && crh0603.isChecked() && crh0604.isChecked()
                && crh0605.isChecked() && crh0606.isChecked() && crh0607.isChecked() && crh0607.isChecked()
                && crh0608.isChecked() && crh0609.isChecked() && crh0696.isChecked())) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crh06), Toast.LENGTH_SHORT).show();
            crh0696.setError("This data is Required!");
            Log.i(TAG, "crh06: This data is Required!");
            return false;
        } else {
            crh0696.setError(null);
        }

        //====================== Q6 Others ================
        if (crh0696.isChecked() && crh0696x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crh06) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            crh0696x.setError("This data is Required!");
            Log.i(TAG, "crh0696x: This data is Required!");
            return false;
        } else {
            crh0696x.setError(null);
        }


        return true;

    }


}
