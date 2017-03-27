package edu.aku.hassannaqvi.cbt_child_recruitment.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.util.Log;
import android.view.View;
import android.widget.Button;
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
import edu.aku.hassannaqvi.cbt_child_recruitment.DatabaseHelper;
import edu.aku.hassannaqvi.cbt_child_recruitment.R;

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
    @BindView(R.id.btnNext)
    Button btnNext;

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
                    btnNext.setVisibility(View.GONE);
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
                    btnNext.setVisibility(View.GONE);
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

        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            //if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();

                startActivity(new Intent(this, SectionBActivity.class));
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        //}

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

        /*int updcount = db.updateA();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();*/
            return false;
        }


    public boolean ValidateForm() {

        Toast.makeText(this, "Validating Section A", Toast.LENGTH_SHORT).show();

        //======================= Q 1 ===============
        if (cra01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra01), Toast.LENGTH_SHORT).show();
            cra0102.setError("This data is Required!");

            Log.i(TAG, "cra01: This Data is Required!");
            return false;
        } else {
            cra0102.setError(null);
        }

        if (cra0101.isChecked()) {
            //========== Q2==============
            if (cra02.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra02), Toast.LENGTH_SHORT).show();
                cra0202.setError("This data is Required!");

                Log.i(TAG, "cra02: This Data is Required!");
                return false;
            } else {
                cra0202.setError(null);
            }

            if (cra0201.isChecked()) {
                //================ Q 3==================
                if (cra03.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra03), Toast.LENGTH_SHORT).show();
                    cra03.setError("This data is Required!");

                    Log.i(TAG, "cra03: This Data is Required!");
                    return false;
                } else {
                    cra03.setError(null);
                }

                //================= Q4================
                if (cra04.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra04), Toast.LENGTH_SHORT).show();
                    cra0405.setError("This data is Required!");

                    Log.i(TAG, "cra04: This Data is Required!");
                    return false;
                } else {
                    cra0405.setError(null);
                }
                //======================= Q6==================
                if (cra06.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra06), Toast.LENGTH_SHORT).show();
                    cra06.setError("This data is Required!");

                    Log.i(TAG, "cra06: This Data is Required!");
                    return false;
                } else {
                    cra06.setError(null);
                }

                //==================== Q7====================
                if (cra07.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra07), Toast.LENGTH_SHORT).show();
                    cra07.setError("This data is Required!");

                    Log.i(TAG, "cra07: This Data is Required!");
                    return false;
                } else {
                    cra07.setError(null);
                }

                //============== Check on Education=============
                if ((Integer.parseInt(cra07.getText().toString().isEmpty() ? "0" : cra07.getText().toString()) < 1)
                        || (Integer.parseInt(cra07.getText().toString().isEmpty() ? "0" : cra07.getText().toString()) > 16)) {
                    Toast.makeText(this, "ERROR(Invalid) " + getString(R.string.cra07), Toast.LENGTH_LONG).show();
                    cra07.setError("Range is 1-16");
                    Log.i(TAG, "cra07: Range is 1-16");
                    return false;
                } else {
                    cra07.setError(null);
                }

                //=================== Q8==============
                if (cra08.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra08), Toast.LENGTH_SHORT).show();
                    cra08.setError("This data is Required!");

                    Log.i(TAG, "cra08: This Data is Required!");
                    return false;
                } else {
                    cra08.setError(null);
                }
                //================== Q9=====================
                if (cra09.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra09), Toast.LENGTH_SHORT).show();
                    cra09.setError("This data is Required!");

                    Log.i(TAG, "cra09: This Data is Required!");
                    return false;
                } else {
                    cra09.setError(null);
                }


                //======================= Q10===============
                if (cra10.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra10), Toast.LENGTH_SHORT).show();
                    cra10.setError("This data is Required!");

                    Log.i(TAG, "cra10: This Data is Required!");
                    return false;
                } else {
                    cra10.setError(null);
                }
                //================== Check on age of mother===============
                if ((Integer.parseInt(cra07.getText().toString().isEmpty() ? "0" : cra07.getText().toString()) < 15)
                        || (Integer.parseInt(cra07.getText().toString().isEmpty() ? "0" : cra07.getText().toString()) > 49)) {
                    Toast.makeText(this, "ERROR(Invalid) " + getString(R.string.cra10), Toast.LENGTH_LONG).show();
                    cra10.setError("Range is 15-49 years");
                    Log.i(TAG, "cra10: Range is 15-49");
                    return false;
                } else {
                    cra10.setError(null);
                }
                //==================== Q11=================
                if (cra11.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra11), Toast.LENGTH_SHORT).show();
                    cra11.setError("This data is Required!");

                    Log.i(TAG, "cra11: This Data is Required!");
                    return false;
                } else {
                    cra11.setError(null);
                }

                //=============== Check on Education of Mother================
                if ((Integer.parseInt(cra11.getText().toString().isEmpty() ? "0" : cra11.getText().toString()) < 1)
                        || (Integer.parseInt(cra11.getText().toString().isEmpty() ? "0" : cra11.getText().toString()) > 16)) {
                    Toast.makeText(this, "ERROR(Invalid) " + getString(R.string.cra11), Toast.LENGTH_LONG).show();
                    cra11.setError("Range is 1-16");
                    Log.i(TAG, "cra11: Range is 1-16");
                    return false;
                } else {
                    cra11.setError(null);
                }
                //================= Q12===================
                if (cra12.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra12), Toast.LENGTH_SHORT).show();
                    cra12.setError("This data is Required!");

                    Log.i(TAG, "cra12: This Data is Required!");
                    return false;
                } else {
                    cra12.setError(null);
                }
                //===================== Check on age of mother at time of marriage===================
                if ((Integer.parseInt(cra12.getText().toString().isEmpty() ? "0" : cra12.getText().toString()) < 15)
                        || (Integer.parseInt(cra12.getText().toString().isEmpty() ? "0" : cra12.getText().toString()) > 49)) {
                    Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.cra12), Toast.LENGTH_LONG).show();
                    cra12.setError("Range is 15-49 years");
                    Log.i(TAG, "cra12: Range is 15-49");
                    return false;
                } else {
                    cra12.setError(null);
                }
                //======================= Q13================
                if (cra13.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra13), Toast.LENGTH_SHORT).show();
                    cra1302.setError("This data is Required!");

                    Log.i(TAG, "cra13: This Data is Required!");
                    return false;
                } else {
                    cra1302.setError(null);
                }

                //================ Q14===============
                if (cra14.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra14), Toast.LENGTH_SHORT).show();
                    cra14.setError("This data is Required!");

                    Log.i(TAG, "cra14: This Data is Required!");
                    return false;
                } else {
                    cra14.setError(null);
                }

                //================ Q15===============
                if (cra15.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra15), Toast.LENGTH_SHORT).show();
                    cra15.setError("This data is Required!");

                    Log.i(TAG, "cra15: This Data is Required!");
                    return false;
                } else {
                    cra15.setError(null);
                }

                //================ Q16===============
                if (cra16.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra16), Toast.LENGTH_SHORT).show();
                    cra1603.setError("This data is Required!");

                    Log.i(TAG, "cra16: This Data is Required!");
                    return false;
                } else {
                    cra1603.setError(null);
                }

                //================ Q17===============
                if (cra17.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra17), Toast.LENGTH_SHORT).show();
                    cra17.setError("This data is Required!");

                    Log.i(TAG, "cra17: This Data is Required!");
                    return false;
                } else {
                    cra17.setError(null);
                }

                //================ Q18===============
                if (cra18.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra18), Toast.LENGTH_SHORT).show();
                    cra18.setError("This data is Required!");

                    Log.i(TAG, "cra18: This Data is Required!");
                    return false;
                } else {
                    cra18.setError(null);
                }

                //================ Q19===============
                if (cra19.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra19), Toast.LENGTH_SHORT).show();
                    cra19.setError("This data is Required!");

                    Log.i(TAG, "cra19: This Data is Required!");
                    return false;
                } else {
                    cra19.setError(null);
                }

                //================ Q20===============
                if (cra20.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra20), Toast.LENGTH_SHORT).show();
                    cra20.setError("This data is Required!");

                    Log.i(TAG, "cra20: This Data is Required!");
                    return false;
                } else {
                    cra20.setError(null);
                }

                //================ Q21===============
                if (cra21.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra21), Toast.LENGTH_SHORT).show();
                    cra21.setError("This data is Required!");

                    Log.i(TAG, "cra21: This Data is Required!");
                    return false;
                } else {
                    cra21.setError(null);
                }

                //================ Q22===============
                if (cra22.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra22), Toast.LENGTH_SHORT).show();
                    cra22.setError("This data is Required!");

                    Log.i(TAG, "cra22: This Data is Required!");
                    return false;
                } else {
                    cra22.setError(null);
                }

                //================ Q15===============
                if (cra23.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra23), Toast.LENGTH_SHORT).show();
                    cra23.setError("This data is Required!");

                    Log.i(TAG, "cra23: This Data is Required!");
                    return false;
                } else {
                    cra23.setError(null);
                }

                //================ Q15===============
                if (cra24.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra24), Toast.LENGTH_SHORT).show();
                    cra24.setError("This data is Required!");

                    Log.i(TAG, "cra24: This Data is Required!");
                    return false;
                } else {
                    cra24.setError(null);
                }

                //================== Check on Total members in HH=============

                if (Integer.parseInt(cra24.getText().toString().isEmpty() ? "0" : cra24.getText().toString())
                        != ((Integer.parseInt(cra17.getText().toString().isEmpty() ? "0" : cra17.getText().toString()))
                        + (Integer.parseInt(cra18.getText().toString().isEmpty() ? "0" : cra18.getText().toString()))
                        + (Integer.parseInt(cra19.getText().toString().isEmpty() ? "0" : cra19.getText().toString()))
                        + (Integer.parseInt(cra20.getText().toString().isEmpty() ? "0" : cra20.getText().toString()))
                        + (Integer.parseInt(cra21.getText().toString().isEmpty() ? "0" : cra21.getText().toString()))
                        + (Integer.parseInt(cra22.getText().toString().isEmpty() ? "0" : cra22.getText().toString()))
                        + (Integer.parseInt(cra23.getText().toString().isEmpty() ? "0" : cra23.getText().toString())))) {
                    Toast.makeText(this, "ERROR(Invalid)" + getString(R.string.cra17), Toast.LENGTH_SHORT).show();
                    cra17.setError("Invalid: Check all memebers again");

                    Log.i(TAG, "cra17: Check All members again!");
                    return false;
                } else {
                    cra17.setError(null);
                }
            }
        }

        return true;

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sa = new JSONObject();

        sa.put("cra01", cra0101.isChecked() ? "1" : cra0102.isChecked() ? "2" : "0");
        sa.put("cra02", cra0201.isChecked() ? "1" : cra0202.isChecked() ? "2" : "0");
        sa.put("cra03", cra03.getText().toString());
        sa.put("cra04", cra0401.isChecked() ? "1" : cra0402.isChecked() ? "2" : cra0403.isChecked() ? "3"
                : cra0404.isChecked() ? "4" : cra0405.isChecked() ? "5" : "0");
        sa.put("cra05", cra05.getText().toString());
        sa.put("cra06", cra06.getText().toString());
        sa.put("cra07", cra07.getText().toString());
        sa.put("cra08", cra08.getText().toString());
        sa.put("cra09", cra09.getText().toString());
        sa.put("cra10", cra10.getText().toString());
        sa.put("cra11", cra11.getText().toString());
        sa.put("cra12", cra12.getText().toString());
        sa.put("cra13", cra1301.isChecked() ? "1" : cra1302.isChecked() ? "2" : "0");
        sa.put("cra14", cra14.getText().toString());
        sa.put("cra15", cra15.getText().toString());
        sa.put("cra16", cra1601.isChecked() ? "1" : cra1602.isChecked() ? "2" : cra1603.isChecked() ? "3" : "0");
        sa.put("cra17", cra17.getText().toString());
        sa.put("cra18", cra18.getText().toString());
        sa.put("cra19", cra19.getText().toString());
        sa.put("cra20", cra20.getText().toString());
        sa.put("cra21", cra21.getText().toString());
        sa.put("cra22", cra22.getText().toString());
        sa.put("cra23", cra23.getText().toString());
        sa.put("cra24", cra15.getText().toString());

        //DCEApp.fc.setROW_Sa(String.valueOf(sa));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }


}
