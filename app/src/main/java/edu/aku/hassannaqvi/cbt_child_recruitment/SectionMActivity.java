package edu.aku.hassannaqvi.cbt_child_recruitment;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionMActivity extends Activity {

    @BindView(R.id.activity_section_h)
    ScrollView activitySectionH;
    @BindView(R.id.crm01a)
    EditText crm01a;
    @BindView(R.id.fldGrpcrm01b)
    LinearLayout fldGrpcrm01b;
    @BindView(R.id.crm01b)
    RadioGroup crm01b;
    @BindView(R.id.crm01b01)
    RadioButton crm01b01;
    @BindView(R.id.crm01b02)
    RadioButton crm01b02;
    @BindView(R.id.crm01b03)
    RadioButton crm01b03;
    @BindView(R.id.crm01b04)
    RadioButton crm01b04;
    @BindView(R.id.crm01b05)
    RadioButton crm01b05;
    @BindView(R.id.crm01b06)
    RadioButton crm01b06;
    @BindView(R.id.crm01b07)
    RadioButton crm01b07;
    @BindView(R.id.crm01b08)
    RadioButton crm01b08;
    @BindView(R.id.crm01b09)
    RadioButton crm01b09;
    @BindView(R.id.crm01b10)
    RadioButton crm01b10;
    @BindView(R.id.crm02a)
    EditText crm02a;
    @BindView(R.id.fldGrpcrm02b)
    LinearLayout fldGrpcrm02b;
    @BindView(R.id.crm02b)
    RadioGroup crm02b;
    @BindView(R.id.crm02b01)
    RadioButton crm02b01;
    @BindView(R.id.crm02b02)
    RadioButton crm02b02;
    @BindView(R.id.crm02b03)
    RadioButton crm02b03;
    @BindView(R.id.crm02b04)
    RadioButton crm02b04;
    @BindView(R.id.crm02b05)
    RadioButton crm02b05;
    @BindView(R.id.crm02b06)
    RadioButton crm02b06;
    @BindView(R.id.crm02b07)
    RadioButton crm02b07;
    @BindView(R.id.crm02b08)
    RadioButton crm02b08;
    @BindView(R.id.crm02b09)
    RadioButton crm02b09;
    @BindView(R.id.crm02b10)
    RadioButton crm02b10;
    @BindView(R.id.crm03a)
    EditText crm03a;
    @BindView(R.id.fldGrpcrm03b)
    LinearLayout fldGrpcrm03b;
    @BindView(R.id.crm03b)
    RadioGroup crm03b;
    @BindView(R.id.crm03b01)
    RadioButton crm03b01;
    @BindView(R.id.crm03b02)
    RadioButton crm03b02;
    @BindView(R.id.crm03b03)
    RadioButton crm03b03;
    @BindView(R.id.crm03b04)
    RadioButton crm03b04;
    @BindView(R.id.crm03b05)
    RadioButton crm03b05;
    @BindView(R.id.crm03b06)
    RadioButton crm03b06;
    @BindView(R.id.crm03b07)
    RadioButton crm03b07;
    @BindView(R.id.crm03b08)
    RadioButton crm03b08;
    @BindView(R.id.crm03b09)
    RadioButton crm03b09;
    @BindView(R.id.crm03b10)
    RadioButton crm03b10;
    @BindView(R.id.crm04a)
    EditText crm04a;
    @BindView(R.id.fldGrpcrm04b)
    LinearLayout fldGrpcrm04b;
    @BindView(R.id.crm04b)
    RadioGroup crm04b;
    @BindView(R.id.crm04b01)
    RadioButton crm04b01;
    @BindView(R.id.crm04b02)
    RadioButton crm04b02;
    @BindView(R.id.crm04b03)
    RadioButton crm04b03;
    @BindView(R.id.crm04b04)
    RadioButton crm04b04;
    @BindView(R.id.crm04b05)
    RadioButton crm04b05;
    @BindView(R.id.crm04b06)
    RadioButton crm04b06;
    @BindView(R.id.crm04b07)
    RadioButton crm04b07;
    @BindView(R.id.crm04b08)
    RadioButton crm04b08;
    @BindView(R.id.crm04b09)
    RadioButton crm04b09;
    @BindView(R.id.crm04b10)
    RadioButton crm04b10;
    @BindView(R.id.crm041a)
    EditText crm041a;
    @BindView(R.id.fldGrpcrm041b)
    LinearLayout fldGrpcrm041b;
    @BindView(R.id.crm041b)
    RadioGroup crm041b;
    @BindView(R.id.crm041b01)
    RadioButton crm041b01;
    @BindView(R.id.crm041b02)
    RadioButton crm041b02;
    @BindView(R.id.crm041b03)
    RadioButton crm041b03;
    @BindView(R.id.crm041b04)
    RadioButton crm041b04;
    @BindView(R.id.crm041b05)
    RadioButton crm041b05;
    @BindView(R.id.crm041b06)
    RadioButton crm041b06;
    @BindView(R.id.crm041b07)
    RadioButton crm041b07;
    @BindView(R.id.crm041b08)
    RadioButton crm041b08;
    @BindView(R.id.crm041b09)
    RadioButton crm041b09;
    @BindView(R.id.crm041b10)
    RadioButton crm041b10;
    @BindView(R.id.crm042a)
    EditText crm042a;
    @BindView(R.id.fldGrpcrm042b)
    LinearLayout fldGrpcrm042b;
    @BindView(R.id.crm042b)
    RadioGroup crm042b;
    @BindView(R.id.crm042b01)
    RadioButton crm042b01;
    @BindView(R.id.crm042b02)
    RadioButton crm042b02;
    @BindView(R.id.crm042b03)
    RadioButton crm042b03;
    @BindView(R.id.crm042b04)
    RadioButton crm042b04;
    @BindView(R.id.crm042b05)
    RadioButton crm042b05;
    @BindView(R.id.crm042b06)
    RadioButton crm042b06;
    @BindView(R.id.crm042b07)
    RadioButton crm042b07;
    @BindView(R.id.crm042b08)
    RadioButton crm042b08;
    @BindView(R.id.crm042b09)
    RadioButton crm042b09;
    @BindView(R.id.crm042b10)
    RadioButton crm042b10;
    @BindView(R.id.crm043a)
    EditText crm043a;
    @BindView(R.id.fldGrpcrm043b)
    LinearLayout fldGrpcrm043b;
    @BindView(R.id.crm043b)
    RadioGroup crm043b;
    @BindView(R.id.crm043b01)
    RadioButton crm043b01;
    @BindView(R.id.crm043b02)
    RadioButton crm043b02;
    @BindView(R.id.crm043b03)
    RadioButton crm043b03;
    @BindView(R.id.crm043b04)
    RadioButton crm043b04;
    @BindView(R.id.crm043b05)
    RadioButton crm043b05;
    @BindView(R.id.crm043b06)
    RadioButton crm043b06;
    @BindView(R.id.crm043b07)
    RadioButton crm043b07;
    @BindView(R.id.crm043b08)
    RadioButton crm043b08;
    @BindView(R.id.crm044a)
    EditText crm044a;
    @BindView(R.id.fldGrpcrm044b)
    LinearLayout fldGrpcrm044b;
    @BindView(R.id.crm044b)
    RadioGroup crm044b;
    @BindView(R.id.crm044b01)
    RadioButton crm044b01;
    @BindView(R.id.crm044b02)
    RadioButton crm044b02;
    @BindView(R.id.crm044b03)
    RadioButton crm044b03;
    @BindView(R.id.crm044b04)
    RadioButton crm044b04;
    @BindView(R.id.crm044b05)
    RadioButton crm044b05;
    @BindView(R.id.crm044b06)
    RadioButton crm044b06;
    @BindView(R.id.crm044b07)
    RadioButton crm044b07;
    @BindView(R.id.crm044b08)
    RadioButton crm044b08;
    @BindView(R.id.crm044b09)
    RadioButton crm044b09;
    @BindView(R.id.crm044b10)
    RadioButton crm044b10;
    @BindView(R.id.crm05a)
    EditText crm05a;
    @BindView(R.id.fldGrpcrm05b)
    LinearLayout fldGrpcrm05b;
    @BindView(R.id.crm05b)
    RadioGroup crm05b;
    @BindView(R.id.crm05b01)
    RadioButton crm05b01;
    @BindView(R.id.crm05b02)
    RadioButton crm05b02;
    @BindView(R.id.crm05b03)
    RadioButton crm05b03;
    @BindView(R.id.crm05b04)
    RadioButton crm05b04;
    @BindView(R.id.crm05b05)
    RadioButton crm05b05;
    @BindView(R.id.crm05b06)
    RadioButton crm05b06;
    @BindView(R.id.crm05b07)
    RadioButton crm05b07;
    @BindView(R.id.crm05b08)
    RadioButton crm05b08;
    @BindView(R.id.crm05b09)
    RadioButton crm05b09;
    @BindView(R.id.crm05b10)
    RadioButton crm05b10;
    @BindView(R.id.crm051a)
    EditText crm051a;
    @BindView(R.id.fldGrpcrm051b)
    LinearLayout fldGrpcrm051b;
    @BindView(R.id.crm051b)
    RadioGroup crm051b;
    @BindView(R.id.crm051b01)
    RadioButton crm051b01;
    @BindView(R.id.crm051b02)
    RadioButton crm051b02;
    @BindView(R.id.crm051b03)
    RadioButton crm051b03;
    @BindView(R.id.crm051b04)
    RadioButton crm051b04;
    @BindView(R.id.crm051b05)
    RadioButton crm051b05;
    @BindView(R.id.crm051b06)
    RadioButton crm051b06;
    @BindView(R.id.crm051b07)
    RadioButton crm051b07;
    @BindView(R.id.crm051b08)
    RadioButton crm051b08;
    @BindView(R.id.crm051b09)
    RadioButton crm051b09;
    @BindView(R.id.crm051b10)
    RadioButton crm051b10;
    @BindView(R.id.crm052a)
    EditText crm052a;
    @BindView(R.id.fldGrpcrm052b)
    LinearLayout fldGrpcrm052b;
    @BindView(R.id.crm052b)
    RadioGroup crm052b;
    @BindView(R.id.crm052b01)
    RadioButton crm052b01;
    @BindView(R.id.crm052b02)
    RadioButton crm052b02;
    @BindView(R.id.crm052b03)
    RadioButton crm052b03;
    @BindView(R.id.crm052b04)
    RadioButton crm052b04;
    @BindView(R.id.crm052b05)
    RadioButton crm052b05;
    @BindView(R.id.crm052b06)
    RadioButton crm052b06;
    @BindView(R.id.crm052b07)
    RadioButton crm052b07;
    @BindView(R.id.crm052b08)
    RadioButton crm052b08;
    @BindView(R.id.crm052b09)
    RadioButton crm052b09;
    @BindView(R.id.crm052b10)
    RadioButton crm052b10;
    @BindView(R.id.crm06a)
    EditText crm06a;
    @BindView(R.id.fldGrpcrm06b)
    LinearLayout fldGrpcrm06b;
    @BindView(R.id.crm06b)
    RadioGroup crm06b;
    @BindView(R.id.crm06b01)
    RadioButton crm06b01;
    @BindView(R.id.crm06b02)
    RadioButton crm06b02;
    @BindView(R.id.crm06b03)
    RadioButton crm06b03;
    @BindView(R.id.crm06b04)
    RadioButton crm06b04;
    @BindView(R.id.crm06b05)
    RadioButton crm06b05;
    @BindView(R.id.crm06b06)
    RadioButton crm06b06;
    @BindView(R.id.crm06b07)
    RadioButton crm06b07;
    @BindView(R.id.crm06b08)
    RadioButton crm06b08;
    @BindView(R.id.crm06b09)
    RadioButton crm06b09;
    @BindView(R.id.crm06b10)
    RadioButton crm06b10;
    @BindView(R.id.crm061a)
    EditText crm061a;
    @BindView(R.id.fldGrpcrm061b)
    LinearLayout fldGrpcrm061b;
    @BindView(R.id.crm061b)
    RadioGroup crm061b;
    @BindView(R.id.crm061b01)
    RadioButton crm061b01;
    @BindView(R.id.crm061b02)
    RadioButton crm061b02;
    @BindView(R.id.crm061b03)
    RadioButton crm061b03;
    @BindView(R.id.crm061b04)
    RadioButton crm061b04;
    @BindView(R.id.crm061b05)
    RadioButton crm061b05;
    @BindView(R.id.crm061b06)
    RadioButton crm061b06;
    @BindView(R.id.crm061b07)
    RadioButton crm061b07;
    @BindView(R.id.crm061b08)
    RadioButton crm061b08;
    @BindView(R.id.crm061b09)
    RadioButton crm061b09;
    @BindView(R.id.crm061b10)
    RadioButton crm061b10;
    @BindView(R.id.crm07a)
    EditText crm07a;
    @BindView(R.id.fldGrpcrm07b)
    LinearLayout fldGrpcrm07b;
    @BindView(R.id.crm07b)
    RadioGroup crm07b;
    @BindView(R.id.crm07b01)
    RadioButton crm07b01;
    @BindView(R.id.crm07b02)
    RadioButton crm07b02;
    @BindView(R.id.crm07b03)
    RadioButton crm07b03;
    @BindView(R.id.crm07b04)
    RadioButton crm07b04;
    @BindView(R.id.crm07b05)
    RadioButton crm07b05;
    @BindView(R.id.crm07b06)
    RadioButton crm07b06;
    @BindView(R.id.crm07b07)
    RadioButton crm07b07;
    @BindView(R.id.crm07b08)
    RadioButton crm07b08;
    @BindView(R.id.crm07b09)
    RadioButton crm07b09;
    @BindView(R.id.crm07b10)
    RadioButton crm07b10;
    @BindView(R.id.crm08a)
    EditText crm08a;
    @BindView(R.id.fldGrpcrm08b)
    LinearLayout fldGrpcrm08b;
    @BindView(R.id.crm08b)
    RadioGroup crm08b;
    @BindView(R.id.crm08b01)
    RadioButton crm08b01;
    @BindView(R.id.crm08b02)
    RadioButton crm08b02;
    @BindView(R.id.crm08b03)
    RadioButton crm08b03;
    @BindView(R.id.crm08b04)
    RadioButton crm08b04;
    @BindView(R.id.crm08b05)
    RadioButton crm08b05;
    @BindView(R.id.crm08b06)
    RadioButton crm08b06;
    @BindView(R.id.crm08b07)
    RadioButton crm08b07;
    @BindView(R.id.crm08b08)
    RadioButton crm08b08;
    @BindView(R.id.crm08b09)
    RadioButton crm08b09;
    @BindView(R.id.crm08b10)
    RadioButton crm08b10;
    @BindView(R.id.crm09a)
    EditText crm09a;
    @BindView(R.id.fldGrpcrm09b)
    LinearLayout fldGrpcrm09b;
    @BindView(R.id.crm09b)
    RadioGroup crm09b;
    @BindView(R.id.crm09b01)
    RadioButton crm09b01;
    @BindView(R.id.crm09b02)
    RadioButton crm09b02;
    @BindView(R.id.crm09b03)
    RadioButton crm09b03;
    @BindView(R.id.crm09b04)
    RadioButton crm09b04;
    @BindView(R.id.crm09b05)
    RadioButton crm09b05;
    @BindView(R.id.crm09b06)
    RadioButton crm09b06;
    @BindView(R.id.crm09b07)
    RadioButton crm09b07;
    @BindView(R.id.crm09b08)
    RadioButton crm09b08;
    @BindView(R.id.crm09b09)
    RadioButton crm09b09;
    @BindView(R.id.crm09b10)
    RadioButton crm09b10;
    @BindView(R.id.crn01s)
    EditText crn01s;
    @BindView(R.id.crn01dob)
    DatePicker crn01dob;
    @BindView(R.id.crn01dod)
    DatePicker crn01dod;
    @BindView(R.id.crn02s)
    EditText crn02s;
    @BindView(R.id.crn02dob)
    DatePicker crn02dob;
    @BindView(R.id.crn02dod)
    DatePicker crn02dod;
    @BindView(R.id.crn03s)
    EditText crn03s;
    @BindView(R.id.crn03dob1)
    DatePicker crn03dob1;
    @BindView(R.id.crn03dob2)
    DatePicker crn03dob2;
    @BindView(R.id.crn03dob3)
    DatePicker crn03dob3;
    @BindView(R.id.crn04s)
    EditText crn04s;
    @BindView(R.id.crn04dob1)
    DatePicker crn04dob1;
    @BindView(R.id.crn04dob2)
    DatePicker crn04dob2;
    @BindView(R.id.crn04dod1)
    DatePicker crn04dod1;
    @BindView(R.id.crn04dod2)
    DatePicker crn04dod2;
    @BindView(R.id.crn05s)
    EditText crn05s;
    @BindView(R.id.crn05dob1)
    DatePicker crn05dob1;
    @BindView(R.id.crn05dob2)
    DatePicker crn05dob2;
    @BindView(R.id.crn05dod1)
    DatePicker crn05dod1;
    @BindView(R.id.crn05dod2)
    DatePicker crn05dod2;
    @BindView(R.id.crn06s)
    EditText crn06s;
    @BindView(R.id.crn06dob1)
    DatePicker crn06dob1;
    @BindView(R.id.crn06dob2)
    DatePicker crn06dob2;
    @BindView(R.id.crn06dod1)
    DatePicker crn06dod1;
    @BindView(R.id.crn06dod2)
    DatePicker crn06dod2;
    @BindView(R.id.crn07s)
    EditText crn07s;
    @BindView(R.id.crn07dob1)
    DatePicker crn07dob1;
    @BindView(R.id.crn07dob2)
    DatePicker crn07dob2;
    @BindView(R.id.crn07dod1)
    DatePicker crn07dod1;
    @BindView(R.id.crn07dod2)
    DatePicker crn07dod2;
    @BindView(R.id.crn08s)
    EditText crn08s;
    @BindView(R.id.crn08dob1)
    DatePicker crn08dob1;
    @BindView(R.id.crn08dob2)
    DatePicker crn08dob2;
    @BindView(R.id.crn08dod1)
    DatePicker crn08dod1;
    @BindView(R.id.crn08dod2)
    DatePicker crn08dod2;
    @BindView(R.id.fldGrpbtn)
    LinearLayout fldGrpbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_m);
        ButterKnife.bind(this);

//******************************** Section M *******************
        //=============== Q 1B Skip Pattern==============
        crm01a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm01a.getText().toString().isEmpty() ? "0" : crm01a.getText().toString()) > 0) {
                    fldGrpcrm01b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm01b.setVisibility(View.GONE);
                    crm01b.clearCheck();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 2B Skip Pattern==============
        crm02a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm02a.getText().toString().isEmpty() ? "0" : crm02a.getText().toString()) > 0) {
                    fldGrpcrm02b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm02b.setVisibility(View.GONE);
                    crm02b.clearCheck();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 3B Skip Pattern==============
        crm03a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm03a.getText().toString().isEmpty() ? "0" : crm03a.getText().toString()) > 0) {
                    fldGrpcrm03b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm03b.setVisibility(View.GONE);
                    crm03b.clearCheck();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 4B Skip Pattern==============
        crm04a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm04a.getText().toString().isEmpty() ? "0" : crm04a.getText().toString()) > 0) {
                    fldGrpcrm04b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm04b.setVisibility(View.GONE);
                    crm04b.clearCheck();
                    crm041a.setText(null);
                    crm041b.clearCheck();
                    crm042a.setText(null);
                    crm042b.clearCheck();
                    crm043a.setText(null);
                    crm043b.clearCheck();
                    crm044a.setText(null);
                    crm044b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 4.1 B Skip Pattern==============
        crm041a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm041a.getText().toString().isEmpty() ? "0" : crm041a.getText().toString()) > 0) {
                    fldGrpcrm041b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm041b.setVisibility(View.GONE);
                    crm041b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 4.2 B Skip Pattern==============
        crm042a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm042a.getText().toString().isEmpty() ? "0" : crm042a.getText().toString()) > 0) {
                    fldGrpcrm042b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm042b.setVisibility(View.GONE);
                    crm042b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 4.3 B Skip Pattern==============
        crm043a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm043a.getText().toString().isEmpty() ? "0" : crm043a.getText().toString()) > 0) {
                    fldGrpcrm043b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm043b.setVisibility(View.GONE);
                    crm043b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 4.4 B Skip Pattern==============
        crm044a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm044a.getText().toString().isEmpty() ? "0" : crm044a.getText().toString()) > 0) {
                    fldGrpcrm044b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm044b.setVisibility(View.GONE);
                    crm044b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        //=============== Q 5B Skip Pattern==============
        crm05a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm05a.getText().toString().isEmpty() ? "0" : crm05a.getText().toString()) > 0) {
                    fldGrpcrm05b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm05b.setVisibility(View.GONE);
                    crm05b.clearCheck();
                    crm051a.setText(null);
                    crm051b.clearCheck();
                    crm052a.setText(null);
                    crm052b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 5.1 B Skip Pattern==============
        crm051a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm051a.getText().toString().isEmpty() ? "0" : crm051a.getText().toString()) > 0) {
                    fldGrpcrm051b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm051b.setVisibility(View.GONE);
                    crm051b.clearCheck();


                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 5.2 B Skip Pattern==============
        crm052a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm052a.getText().toString().isEmpty() ? "0" : crm052a.getText().toString()) > 0) {
                    fldGrpcrm052b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm052b.setVisibility(View.GONE);
                    crm052b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        //=============== Q 6B Skip Pattern==============
        crm06a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm06a.getText().toString().isEmpty() ? "0" : crm06a.getText().toString()) > 0) {
                    fldGrpcrm06b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm06b.setVisibility(View.GONE);
                    crm06b.clearCheck();
                    crm061a.setText(null);
                    crm061b.clearCheck();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 6.1 B Skip Pattern==============
        crm061a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm061a.getText().toString().isEmpty() ? "0" : crm061a.getText().toString()) > 0) {
                    fldGrpcrm061b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm061b.setVisibility(View.GONE);
                    crm061b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 7B Skip Pattern==============
        crm07a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm07a.getText().toString().isEmpty() ? "0" : crm07a.getText().toString()) > 0) {
                    fldGrpcrm07b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm07b.setVisibility(View.GONE);
                    crm07b.clearCheck();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 8B Skip Pattern==============
        crm08a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm08a.getText().toString().isEmpty() ? "0" : crm08a.getText().toString()) > 0) {
                    fldGrpcrm08b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm08b.setVisibility(View.GONE);
                    crm08b.clearCheck();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 9B Skip Pattern==============
        crm09a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm09a.getText().toString().isEmpty() ? "0" : crm09a.getText().toString()) > 0) {
                    fldGrpcrm09b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm09b.setVisibility(View.GONE);
                    crm09b.clearCheck();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

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
