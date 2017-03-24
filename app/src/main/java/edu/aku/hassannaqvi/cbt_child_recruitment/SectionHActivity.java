package edu.aku.hassannaqvi.cbt_child_recruitment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Spinner;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivitySectionHActivity extends Activity {

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
    @BindView(R.id.crh0104)
    RadioButton crh0104;
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
    @BindView(R.id.crh06)
    RadioGroup crh06;
    @BindView(R.id.crh0601)
    RadioButton crh0601;
    @BindView(R.id.crh0602)
    RadioButton crh0602;
    @BindView(R.id.crh0603)
    RadioButton crh0603;
    @BindView(R.id.crh0604)
    RadioButton crh0604;
    @BindView(R.id.crh0605)
    RadioButton crh0605;
    @BindView(R.id.crh0606)
    RadioButton crh0606;
    @BindView(R.id.crh0607)
    RadioButton crh0607;
    @BindView(R.id.crh0608)
    RadioButton crh0608;
    @BindView(R.id.crh0609)
    RadioButton crh0609;
    @BindView(R.id.crh0696)
    RadioButton crh0696;
    @BindView(R.id.crh0610x)
    EditText crh0610x;
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
        crh01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (crh0101.isChecked()) {
                    fldGrpcrh02.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrh02.setVisibility(View.GONE);
                    crh02.clearCheck();
                    crh03.clearCheck();
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
        //TODO implement
    }


}
