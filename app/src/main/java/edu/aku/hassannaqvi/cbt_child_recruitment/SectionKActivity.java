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
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static android.content.ContentValues.TAG;

public class SectionKActivity extends Activity {

    @BindView(R.id.activity_section_b)
    ScrollView activitySectionB;
    @BindView(R.id.crka)
    EditText crka;
    @BindView(R.id.crk01)
    RadioGroup crk01;
    @BindView(R.id.crk0101)
    RadioButton crk0101;
    @BindView(R.id.crk0102)
    RadioButton crk0102;
    @BindView(R.id.crk0199)
    RadioButton crk0199;
    @BindView(R.id.crk02a)
    RadioGroup crk02a;
    @BindView(R.id.crk02a01)
    RadioButton crk02a01;
    @BindView(R.id.crk02a02)
    RadioButton crk02a02;
    @BindView(R.id.crk02b)
    RadioGroup crk02b;
    @BindView(R.id.crk02b01)
    RadioButton crk02b01;
    @BindView(R.id.crk02b02)
    RadioButton crk02b02;
    @BindView(R.id.crk02c)
    RadioGroup crk02c;
    @BindView(R.id.crk02c01)
    RadioButton crk02c01;
    @BindView(R.id.crk02c02)
    RadioButton crk02c02;
    @BindView(R.id.crk02d)
    RadioGroup crk02d;
    @BindView(R.id.crk02d01)
    RadioButton crk02d01;
    @BindView(R.id.crk02d02)
    RadioButton crk02d02;
    @BindView(R.id.crk02e)
    RadioGroup crk02e;
    @BindView(R.id.crk02e01)
    RadioButton crk02e01;
    @BindView(R.id.crk02e02)
    RadioButton crk02e02;
    @BindView(R.id.crk03)
    RadioGroup crk03;
    @BindView(R.id.crk0301)
    RadioButton crk0301;
    @BindView(R.id.crk0302)
    RadioButton crk0302;
    @BindView(R.id.crk0399)
    RadioButton crk0399;
    @BindView(R.id.crkGrp03)
    LinearLayout crkGrp03;
    @BindView(R.id.crk04a)
    RadioGroup crk04a;
    @BindView(R.id.crk04a01)
    RadioButton crk04a01;
    @BindView(R.id.crk04a02)
    RadioButton crk04a02;
    @BindView(R.id.crk04b)
    RadioGroup crk04b;
    @BindView(R.id.crk04b01)
    RadioButton crk04b01;
    @BindView(R.id.crk04b02)
    RadioButton crk04b02;
    @BindView(R.id.crk0496)
    RadioGroup crk0496;
    @BindView(R.id.crk049601)
    RadioButton crk049601;
    @BindView(R.id.crk049602)
    RadioButton crk049602;
    @BindView(R.id.crk0496x)
    EditText crk0496x;
    @BindView(R.id.crk05)
    RadioGroup crk05;
    @BindView(R.id.crk0501)
    RadioButton crk0501;
    @BindView(R.id.crk0502)
    RadioButton crk0502;
    @BindView(R.id.crk0599)
    RadioButton crk0599;
    @BindView(R.id.crk06a)
    RadioGroup crk06a;
    @BindView(R.id.crk06a01)
    RadioButton crk06a01;
    @BindView(R.id.crk06a02)
    RadioButton crk06a02;
    @BindView(R.id.crk06b)
    RadioGroup crk06b;
    @BindView(R.id.crk06b01)
    RadioButton crk06b01;
    @BindView(R.id.crk06b02)
    RadioButton crk06b02;
    @BindView(R.id.crk06c)
    RadioGroup crk06c;
    @BindView(R.id.crk06c01)
    RadioButton crk06c01;
    @BindView(R.id.crk06c02)
    RadioButton crk06c02;
    @BindView(R.id.crk06d)
    RadioGroup crk06d;
    @BindView(R.id.crk06d01)
    RadioButton crk06d01;
    @BindView(R.id.crk06d02)
    RadioButton crk06d02;
    @BindView(R.id.crk07a)
    RadioGroup crk07a;
    @BindView(R.id.crk07a01)
    RadioButton crk07a01;
    @BindView(R.id.crk07a02)
    RadioButton crk07a02;
    @BindView(R.id.crk07b)
    RadioGroup crk07b;
    @BindView(R.id.crk07b01)
    RadioButton crk07b01;
    @BindView(R.id.crk07b02)
    RadioButton crk07b02;
    @BindView(R.id.crk07c)
    RadioGroup crk07c;
    @BindView(R.id.crk07c01)
    RadioButton crk07c01;
    @BindView(R.id.crk07c02)
    RadioButton crk07c02;
    @BindView(R.id.crk07d)
    RadioGroup crk07d;
    @BindView(R.id.crk07d01)
    RadioButton crk07d01;
    @BindView(R.id.crk07d02)
    RadioButton crk07d02;
    @BindView(R.id.crk07e)
    RadioGroup crk07e;
    @BindView(R.id.crk07e01)
    RadioButton crk07e01;
    @BindView(R.id.crk07e02)
    RadioButton crk07e02;
    @BindView(R.id.crk0796)
    RadioGroup crk0796;
    @BindView(R.id.crk079601)
    RadioButton crk079601;
    @BindView(R.id.crk079602)
    RadioButton crk079602;
    @BindView(R.id.crk0796x)
    EditText crk0796x;
    @BindView(R.id.crk08)
    RadioGroup crk08;
    @BindView(R.id.crk0801)
    RadioButton crk0801;
    @BindView(R.id.crk0802)
    RadioButton crk0802;
    @BindView(R.id.crk0899)
    RadioButton crk0899;
    @BindView(R.id.crk09a)
    RadioGroup crk09a;
    @BindView(R.id.crk09a01)
    RadioButton crk09a01;
    @BindView(R.id.crk09a02)
    RadioButton crk09a02;
    @BindView(R.id.crk09b)
    RadioGroup crk09b;
    @BindView(R.id.crk09b01)
    RadioButton crk09b01;
    @BindView(R.id.crk09b02)
    RadioButton crk09b02;
    @BindView(R.id.crk09c)
    RadioGroup crk09c;
    @BindView(R.id.crk09c01)
    RadioButton crk09c01;
    @BindView(R.id.crk09c02)
    RadioButton crk09c02;
    @BindView(R.id.crk09d)
    RadioGroup crk09d;
    @BindView(R.id.crk09d01)
    RadioButton crk09d01;
    @BindView(R.id.crk09d02)
    RadioButton crk09d02;
    @BindView(R.id.crk09e)
    RadioGroup crk09e;
    @BindView(R.id.crk09e01)
    RadioButton crk09e01;
    @BindView(R.id.crk09e02)
    RadioButton crk09e02;
    @BindView(R.id.crk09f)
    RadioGroup crk09f;
    @BindView(R.id.crk09f01)
    RadioButton crk09f01;
    @BindView(R.id.crk09f02)
    RadioButton crk09f02;
    @BindView(R.id.crk0996)
    RadioGroup crk0996;
    @BindView(R.id.crk099601)
    RadioButton crk099601;
    @BindView(R.id.crk099602)
    RadioButton crk099602;
    @BindView(R.id.crk0996x)
    EditText crk0996x;
    @BindView(R.id.crk10)
    RadioGroup crk10;
    @BindView(R.id.crk1001)
    RadioButton crk1001;
    @BindView(R.id.crk1002)
    RadioButton crk1002;
    @BindView(R.id.crk1099)
    RadioButton crk1099;
    @BindView(R.id.crk1101)
    CheckBox crk1101;
    @BindView(R.id.crk1102)
    CheckBox crk1102;
    @BindView(R.id.crk1103)
    CheckBox crk1103;
    @BindView(R.id.crk1104)
    CheckBox crk1104;
    @BindView(R.id.crk1105)
    CheckBox crk1105;
    @BindView(R.id.crk1106)
    CheckBox crk1106;
    @BindView(R.id.crk1196)
    CheckBox crk1196;
    @BindView(R.id.crk1196x)
    EditText crk1196x;
    @BindView(R.id.fldGrpbtn)
    LinearLayout fldGrpbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_k);
        ButterKnife.bind(this);

        // ====================== Q3 Skip Pattern ========================
        crk03.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (crk0301.isChecked()) {
                    crkGrp03.setVisibility(View.VISIBLE);
                } else {
                    crkGrp03.setVisibility(View.GONE);
                    crk04a.clearCheck();
                    crk04b.clearCheck();
                    crk0496.clearCheck();
                    crk0496x.setText(null);
                }
            }
        });

        // =================== Q11 Others ====================

        crk1196.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crk1196x.setVisibility(View.VISIBLE);
                } else {
                    crk1196x.setVisibility(View.GONE);
                    crk1196x.setText(null);
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
            Intent secL = new Intent(this, SectionLActivity.class);
            startActivity(secL);

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

        DatabaseHelper db = new DatabaseHelper(this);

        /*int updcount = db.updateA();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();*/
        return false;
    }


    private void saveDrafts() throws JSONException {
        Toast.makeText(this, "saving Drafts", Toast.LENGTH_SHORT).show();

        JSONObject sk = new JSONObject();

        sk.put("crka", crka.getText().toString());
        sk.put("crk01", crk0101.isChecked() ? "1" : crk0102.isChecked() ? "2" : crk0199.isChecked() ? "99" : "0");
        sk.put("crk02a", crk02a01.isChecked() ? "1" : crk02a02.isChecked() ? "2" : "0");
        sk.put("crk02b", crk02b01.isChecked() ? "1" : crk02b02.isChecked() ? "2" : "0");
        sk.put("crk02c", crk02c01.isChecked() ? "1" : crk02c02.isChecked() ? "2" : "0");
        sk.put("crk02d", crk02d01.isChecked() ? "1" : crk02d02.isChecked() ? "2" : "0");
        sk.put("crk02e", crk02e01.isChecked() ? "1" : crk02e02.isChecked() ? "2" : "0");
        sk.put("crk03", crk0301.isChecked() ? "1" : crk0302.isChecked() ? "2" : crk0399.isChecked() ? "99" : "0");
        sk.put("crk04a", crk04a01.isChecked() ? "1" : crk04a02.isChecked() ? "2" : "0");
        sk.put("crk04b", crk04b01.isChecked() ? "1" : crk04b02.isChecked() ? "2" : "0");
        sk.put("crk0496", crk049601.isChecked() ? "1" : crk049602.isChecked() ? "2" : "0");
        sk.put("crk0496x", crk0496x.getText().toString());
        sk.put("crk05", crk0501.isChecked() ? "1" : crk0502.isChecked() ? "2" : crk0599.isChecked() ? "99" : "0");
        sk.put("crk06a", crk06a01.isChecked() ? "1" : crk06a02.isChecked() ? "2" : "0");
        sk.put("crk06b", crk06b01.isChecked() ? "1" : crk06b02.isChecked() ? "2" : "0");
        sk.put("crk06c", crk06c01.isChecked() ? "1" : crk06c02.isChecked() ? "2" : "0");
        sk.put("crk06d", crk06d01.isChecked() ? "1" : crk06d02.isChecked() ? "2" : "0");
        sk.put("crk07a", crk07a01.isChecked() ? "1" : crk07a02.isChecked() ? "2" : "0");
        sk.put("crk07b", crk07b01.isChecked() ? "1" : crk07b02.isChecked() ? "2" : "0");
        sk.put("crk07c", crk07c01.isChecked() ? "1" : crk07c02.isChecked() ? "2" : "0");
        sk.put("crk07d", crk07d01.isChecked() ? "1" : crk07d02.isChecked() ? "2" : "0");
        sk.put("crk07e", crk07e01.isChecked() ? "1" : crk07e02.isChecked() ? "2" : "0");
        sk.put("crk0796", crk079601.isChecked() ? "1" : crk079602.isChecked() ? "2" : "0");
        sk.put("crk0796x", crk0796x.getText().toString());
        sk.put("crk08", crk0801.isChecked() ? "1" : crk0802.isChecked() ? "2" : crk0899.isChecked() ? "99" : "0");
        sk.put("crk09a", crk09a01.isChecked() ? "1" : crk09a02.isChecked() ? "2" : "0");
        sk.put("crk09b", crk09b01.isChecked() ? "1" : crk09b02.isChecked() ? "2" : "0");
        sk.put("crk09c", crk09c01.isChecked() ? "1" : crk09c02.isChecked() ? "2" : "0");
        sk.put("crk09d", crk09d01.isChecked() ? "1" : crk09d02.isChecked() ? "2" : "0");
        sk.put("crk09e", crk09e01.isChecked() ? "1" : crk09e02.isChecked() ? "2" : "0");
        sk.put("crk09f", crk09f01.isChecked() ? "1" : crk09f02.isChecked() ? "2" : "0");
        sk.put("crk0996", crk099601.isChecked() ? "1" : crk079602.isChecked() ? "2" : "0");
        sk.put("crk10", crk1001.isChecked() ? "1" : crk1002.isChecked() ? "2" : crk1099.isChecked() ? "99" : "0");
        sk.put("crk1101", crk1101.isChecked() ? "1" : "0");
        sk.put("crk1102", crk1102.isChecked() ? "1" : "0");
        sk.put("crk1103", crk1103.isChecked() ? "1" : "0");
        sk.put("crk1104", crk1104.isChecked() ? "1" : "0");
        sk.put("crk1105", crk1105.isChecked() ? "1" : "0");
        sk.put("crk1106", crk1106.isChecked() ? "1" : "0");
        sk.put("crk1196", crk1196.isChecked() ? "1" : "0");
        sk.put("crk1196x", crk1196x.getText().toString());


        Toast.makeText(this, "Validation Succecful", Toast.LENGTH_SHORT).show();
    }

    public boolean validateForm() {

        // =================== Qa ====================
        if (crka.getText().toString().isEmpty()) {
            Toast.makeText(this, "" + getString(R.string.crka), Toast.LENGTH_SHORT).show();
            crka.setError("This Data is Required");
            Log.d(TAG, "This Data is Required: crka ");
            return false;
        } else {
            crka.setError(null);
        }

        // =================== Q1 ====================
        if (crk01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crk01), Toast.LENGTH_SHORT).show();
            crk0199.setError("This Data is Required");
            Log.d(TAG, "not selected: crk01 ");
            return false;
        } else {
            crk0199.setError(null);
        }

        // =================== Q2a ====================
        if (crk02a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crk02a), Toast.LENGTH_SHORT).show();
            crk02a02.setError("This Data is Required");
            Log.d(TAG, "not selected: crk02a ");
            return false;
        } else {
            crk02a02.setError(null);
        }

        // =================== Q2b ====================
        if (crk02b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crk02b), Toast.LENGTH_SHORT).show();
            crk02b02.setError("This Data is Required");
            Log.d(TAG, "not selected: crk02b ");
            return false;
        } else {
            crk02b02.setError(null);
        }

        // =================== Q2c ====================
        if (crk02c.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crk02c), Toast.LENGTH_SHORT).show();
            crk02c02.setError("This Data is Required");
            Log.d(TAG, "not selected: crk02c ");
            return false;
        } else {
            crk02c02.setError(null);
        }

        // =================== Q2d ====================
        if (crk02d.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crk02d), Toast.LENGTH_SHORT).show();
            crk02d02.setError("This Data is Required");
            Log.d(TAG, "not selected: crk02d ");
            return false;
        } else {
            crk02d02.setError(null);
        }

        // =================== Q2e ====================
        if (crk02e.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crk02e), Toast.LENGTH_SHORT).show();
            crk02e02.setError("This Data is Required");
            Log.d(TAG, "not selected: crk02e ");
            return false;
        } else {
            crk02e02.setError(null);
        }

        // =================== Q3 ====================
        if (crk03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crk03), Toast.LENGTH_SHORT).show();
            crk0399.setError("This Data is Required");
            Log.d(TAG, "not selected: crk03 ");
            return false;
        } else {
            crk0399.setError(null);
        }

        if (crk0301.isChecked()) {
            // =================== Q4a ====================
            if (crk04a.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.crk04a), Toast.LENGTH_SHORT).show();
                crk04a02.setError("This Data is Required");
                Log.d(TAG, "not selected: crk04a ");
                return false;
            } else {
                crk04a02.setError(null);
            }

            // =================== Q4b ====================
            if (crk04b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.crk04b), Toast.LENGTH_SHORT).show();
                crk04b02.setError("This Data is Required");
                Log.d(TAG, "not selected: crk04b ");
                return false;
            } else {
                crk04b02.setError(null);
            }


            // =================== Q4others ====================
            if (crk0496.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.other), Toast.LENGTH_SHORT).show();
                crk049602.setError("This Data is Required");
                Log.d(TAG, "not selected: crk0496 ");
                return false;
            } else {
                crk049602.setError(null);
            }

            if (crk0496x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crk04) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                crk0496x.setError("This data is Required!");    // Set Error on last radio button
                Log.d(TAG, "crk0496x: This data is Required!");
                return false;
            } else {
                crk0496x.setError(null);
            }
        }

        // =================== Q5 ====================
        if (crk05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crk05), Toast.LENGTH_SHORT).show();
            crk0599.setError("This Data is Required");
            Log.d(TAG, "not selected: crk05 ");
            return false;
        } else {
            crk0599.setError(null);
        }

        // =================== Q6a ====================
        if (crk06a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crk06a), Toast.LENGTH_SHORT).show();
            crk06a02.setError("This Data is Required");
            Log.d(TAG, "not selected: crk06a ");
            return false;
        } else {
            crk06a02.setError(null);
        }

        // =================== Q6b ====================
        if (crk06b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crk06b), Toast.LENGTH_SHORT).show();
            crk06b02.setError("This Data is Required");
            Log.d(TAG, "not selected: crk06b ");
            return false;
        } else {
            crk06b02.setError(null);
        }

        // =================== Q6c ====================
        if (crk06c.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crk06c), Toast.LENGTH_SHORT).show();
            crk06c02.setError("This Data is Required");
            Log.d(TAG, "not selected: crk06c ");
            return false;
        } else {
            crk06c02.setError(null);
        }

        // =================== Q6d ====================
        if (crk06d.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crk06d), Toast.LENGTH_SHORT).show();
            crk06d02.setError("This Data is Required");
            Log.d(TAG, "not selected: crk06d ");
            return false;
        } else {
            crk06d02.setError(null);
        }


        // =================== Q7a ====================
        if (crk07a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crk07a), Toast.LENGTH_SHORT).show();
            crk07a02.setError("This Data is Required");
            Log.d(TAG, "not selected: crk07a ");
            return false;
        } else {
            crk07a02.setError(null);
        }

        // =================== Q7b ====================
        if (crk07b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crk07b), Toast.LENGTH_SHORT).show();
            crk07b02.setError("This Data is Required");
            Log.d(TAG, "not selected: crk07b ");
            return false;
        } else {
            crk07b02.setError(null);
        }

        // =================== Q7c ====================
        if (crk07c.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crk07c), Toast.LENGTH_SHORT).show();
            crk07c02.setError("This Data is Required");
            Log.d(TAG, "not selected: crk07c ");
            return false;
        } else {
            crk07c02.setError(null);
        }

        // =================== Q7d ====================
        if (crk07d.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crk07d), Toast.LENGTH_SHORT).show();
            crk07d02.setError("This Data is Required");
            Log.d(TAG, "not selected: crk07d ");
            return false;
        } else {
            crk07d02.setError(null);
        }

        // =================== Q7e ====================
        if (crk07d.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crk07d), Toast.LENGTH_SHORT).show();
            crk07d02.setError("This Data is Required");
            Log.d(TAG, "not selected: crk07d ");
            return false;
        } else {
            crk07d02.setError(null);
        }

        // =================== Q7others ====================
        if (crk0796.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.other), Toast.LENGTH_SHORT).show();
            crk079602.setError("This Data is Required");
            Log.d(TAG, "not selected: crk0796 ");
            return false;
        } else {
            crk079602.setError(null);
        }

        if (crk0796x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crk07) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            crk0796x.setError("This data is Required!");    // Set Error on last radio button
            Log.d(TAG, "crk0796x: This data is Required!");
            return false;
        } else {
            crk0796x.setError(null);
        }

        // =================== Q8 ====================
        if (crk08.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crk08), Toast.LENGTH_SHORT).show();
            crk0899.setError("This Data is Required");
            Log.d(TAG, "not selected: crk08 ");
            return false;
        } else {
            crk0899.setError(null);
        }

        // =================== Q9a ====================
        if (crk09a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crk09a), Toast.LENGTH_SHORT).show();
            crk09a02.setError("This Data is Required");
            Log.d(TAG, "not selected: crk09a ");
            return false;
        } else {
            crk09a02.setError(null);
        }

        // =================== Q9b ====================
        if (crk09b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crk09b), Toast.LENGTH_SHORT).show();
            crk09b02.setError("This Data is Required");
            Log.d(TAG, "not selected: crk09b ");
            return false;
        } else {
            crk09b02.setError(null);
        }

        // =================== Q9c ====================
        if (crk09c.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crk09c), Toast.LENGTH_SHORT).show();
            crk09c02.setError("This Data is Required");
            Log.d(TAG, "not selected: crk09c ");
            return false;
        } else {
            crk09c02.setError(null);
        }

        // =================== Q9d ====================
        if (crk09d.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crk09d), Toast.LENGTH_SHORT).show();
            crk09d02.setError("This Data is Required");
            Log.d(TAG, "not selected: crk09d ");
            return false;
        } else {
            crk09d02.setError(null);
        }

        // =================== Q9e ====================
        if (crk09e.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crk09e), Toast.LENGTH_SHORT).show();
            crk09e02.setError("This Data is Required");
            Log.d(TAG, "not selected: crk09e ");
            return false;
        } else {
            crk09e02.setError(null);
        }

        // =================== Q9f ====================
        if (crk09f.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crk09f), Toast.LENGTH_SHORT).show();
            crk09f02.setError("This Data is Required");
            Log.d(TAG, "not selected: crk09f ");
            return false;
        } else {
            crk09f02.setError(null);
        }

        // =================== Q9others ====================
        if (crk0996.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.other), Toast.LENGTH_SHORT).show();
            crk099602.setError("This Data is Required");
            Log.d(TAG, "not selected: crk0996 ");
            return false;
        } else {
            crk099602.setError(null);
        }

        if (crk0996x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crk09) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            crk0996x.setError("This data is Required!");    // Set Error on last radio button
            Log.d(TAG, "crk0996x: This data is Required!");
            return false;
        } else {
            crk0996x.setError(null);
        }

        // =================== Q10 ====================
        if (crk10.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crk10), Toast.LENGTH_SHORT).show();
            crk1099.setError("This Data is Required");
            Log.d(TAG, "not selected: crk10 ");
            return false;
        } else {
            crk1099.setError(null);
        }

        // =================== Q11 ====================
        if (!(crk1101.isChecked() || crk1102.isChecked() || crk1103.isChecked() || crk1104.isChecked()
                || crk1105.isChecked() || crk1106.isChecked() || crk1196.isChecked())) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crk11), Toast.LENGTH_LONG).show();
            crk1196.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "crk11: This data is Required!");
            return false;
        } else {
            crk1196.setError(null);
        }

        if (crk1196.isChecked() && crk1196x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crk11) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            crk1196x.setError("This data is Required!");    // Set Error on last radio button
            Log.d(TAG, "crk1196: This data is Required!");
            return false;
        } else {
            crk1196x.setError(null);
        }


        return true;
    }
}

