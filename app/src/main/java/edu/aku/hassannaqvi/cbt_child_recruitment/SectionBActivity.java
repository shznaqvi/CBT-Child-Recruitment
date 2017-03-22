package edu.aku.hassannaqvi.cbt_child_recruitment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static android.content.ContentValues.TAG;

public class SectionBActivity extends Activity {

    @BindView(R.id.activity_section_b)
    ScrollView activitySectionB;
    @BindView(R.id.crb01)
    EditText crb01;
    @BindView(R.id.crb02)
    RadioGroup crb02;
    @BindView(R.id.crb0201)
    RadioButton crb0201;
    @BindView(R.id.crb0202)
    RadioButton crb0202;
    @BindView(R.id.crb03)
    DatePicker crb03;
    @BindView(R.id.crb0401)
    EditText crb0401;
    @BindView(R.id.crb0402)
    EditText crb0402;
    @BindView(R.id.crb05)
    RadioGroup crb05;
    @BindView(R.id.crb0501)
    RadioButton crb0501;
    @BindView(R.id.crb0502)
    RadioButton crb0502;
    @BindView(R.id.crb0601)
    EditText crb0601;
    @BindView(R.id.crb07)
    RadioGroup crb07;
    @BindView(R.id.crb0701)
    RadioButton crb0701;
    @BindView(R.id.crb0702)
    RadioButton crb0702;
    @BindView(R.id.crb0801)
    EditText crb0801;
    @BindView(R.id.crc01m1)
    EditText crc01m1;
    @BindView(R.id.crc01m2)
    EditText crc01m2;
    @BindView(R.id.crc01m3)
    EditText crc01m3;
    @BindView(R.id.crc02m1)
    EditText crc02m1;
    @BindView(R.id.crc02m2)
    EditText crc02m2;
    @BindView(R.id.crc02m3)
    EditText crc02m3;
    @BindView(R.id.crc03m1)
    EditText crc03m1;
    @BindView(R.id.crc03m2)
    EditText crc03m2;
    @BindView(R.id.crc03m3)
    EditText crc03m3;
    @BindView(R.id.crd0101)
    CheckBox crd0101;
    @BindView(R.id.crd0102)
    CheckBox crd0102;
    @BindView(R.id.crd0103)
    CheckBox crd0103;
    @BindView(R.id.crd0104)
    CheckBox crd0104;
    @BindView(R.id.crd0105)
    CheckBox crd0105;
    @BindView(R.id.crd0106)
    CheckBox crd0106;
    @BindView(R.id.crd0107)
    CheckBox crd0107;
    @BindView(R.id.crd0108)
    CheckBox crd0108;
    @BindView(R.id.crd0109)
    CheckBox crd0109;
    @BindView(R.id.crd0196)
    CheckBox crd0196;
    @BindView(R.id.crd0196x)
    EditText crd0196x;
    @BindView(R.id.crd02)
    RadioGroup crd02;
    @BindView(R.id.crd0201)
    RadioButton crd0201;
    @BindView(R.id.crd0202)
    RadioButton crd0202;
    @BindView(R.id.crd03)
    RadioGroup crd03;
    @BindView(R.id.crd0301)
    RadioButton crd0301;
    @BindView(R.id.crd0302)
    RadioButton crd0302;
    @BindView(R.id.crd0303)
    RadioButton crd0303;
    @BindView(R.id.crd0304)
    RadioButton crd0304;
    @BindView(R.id.crd0305)
    RadioButton crd0305;
    @BindView(R.id.crd0306)
    RadioButton crd0306;
    @BindView(R.id.crd0307)
    RadioButton crd0307;
    @BindView(R.id.crd0308)
    RadioButton crd0308;
    @BindView(R.id.crd0396)
    RadioButton crd0396;
    @BindView(R.id.crd0396x)
    EditText crd0396x;
    @BindView(R.id.cre01)
    RadioGroup cre01;
    @BindView(R.id.cre0101)
    RadioButton cre0101;
    @BindView(R.id.cre0102)
    RadioButton cre0102;
    @BindView(R.id.cre01a)
    RadioGroup cre01a;
    @BindView(R.id.cre01a01)
    RadioButton cre01a01;
    @BindView(R.id.cre01a02)
    RadioButton cre01a02;
    @BindView(R.id.cre0201b)
    RadioGroup cre0201b;
    @BindView(R.id.cre0201b01)
    RadioButton cre0201b01;
    @BindView(R.id.cre0201b02)
    RadioButton cre0201b02;
    @BindView(R.id.fldGrpBcg)
    LinearLayout fldGrpBcg;
    @BindView(R.id.cre0201a)
    RadioGroup cre0201a;
    @BindView(R.id.cre0201a01)
    RadioButton cre0201a01;
    @BindView(R.id.cre0201a02)
    RadioButton cre0201a02;
    @BindView(R.id.cre0202b)
    RadioGroup cre0202b;
    @BindView(R.id.cre0202b01)
    RadioButton cre0202b01;
    @BindView(R.id.cre0202b02)
    RadioButton cre0202b02;
    @BindView(R.id.fldGrpPolio)
    LinearLayout fldGrpPolio;
    @BindView(R.id.cre0202a)
    RadioGroup cre0202a;
    @BindView(R.id.cre0202a01)
    RadioButton cre0202a01;
    @BindView(R.id.cre0202a02)
    RadioButton cre0202a02;
    @BindView(R.id.cre0301b)
    RadioGroup cre0301b;
    @BindView(R.id.cre0301b01)
    RadioButton cre0301b01;
    @BindView(R.id.cre0301b02)
    RadioButton cre0301b02;
    @BindView(R.id.fldGrpPenta1)
    LinearLayout fldGrpPenta1;
    @BindView(R.id.cre0301a)
    RadioGroup cre0301a;
    @BindView(R.id.cre0301a01)
    RadioButton cre0301a01;
    @BindView(R.id.cre0301a02)
    RadioButton cre0301a02;
    @BindView(R.id.cre0302b)
    RadioGroup cre0302b;
    @BindView(R.id.cre0302b01)
    RadioButton cre0302b01;
    @BindView(R.id.cre0302b02)
    RadioButton cre0302b02;
    @BindView(R.id.fldGrppcv1)
    LinearLayout fldGrppcv1;
    @BindView(R.id.cre0302a)
    RadioGroup cre0302a;
    @BindView(R.id.cre0302a01)
    RadioButton cre0302a01;
    @BindView(R.id.cre0302a02)
    RadioButton cre0302a02;
    @BindView(R.id.cre0303b)
    RadioGroup cre0303b;
    @BindView(R.id.cre0303b01)
    RadioButton cre0303b01;
    @BindView(R.id.cre0303b02)
    RadioButton cre0303b02;
    @BindView(R.id.fldGrpopv1)
    LinearLayout fldGrpopv1;
    @BindView(R.id.cre0303a)
    RadioGroup cre0303a;
    @BindView(R.id.cre0303a01)
    RadioButton cre0303a01;
    @BindView(R.id.cre0303a02)
    RadioButton cre0303a02;
    @BindView(R.id.cre0401b)
    RadioGroup cre0401b;
    @BindView(R.id.cre0401b01)
    RadioButton cre0401b01;
    @BindView(R.id.cre0401b02)
    RadioButton cre0401b02;
    @BindView(R.id.fldGrppenta2)
    LinearLayout fldGrppenta2;
    @BindView(R.id.cre0401a)
    RadioGroup cre0401a;
    @BindView(R.id.cre0401a01)
    RadioButton cre0401a01;
    @BindView(R.id.cre0401a02)
    RadioButton cre0401a02;
    @BindView(R.id.cre0402b)
    RadioGroup cre0402b;
    @BindView(R.id.cre0402b01)
    RadioButton cre0402b01;
    @BindView(R.id.cre0402b02)
    RadioButton cre0402b02;
    @BindView(R.id.fldGrppcv2)
    LinearLayout fldGrppcv2;
    @BindView(R.id.cre0402a)
    RadioGroup cre0402a;
    @BindView(R.id.cre0402a01)
    RadioButton cre0402a01;
    @BindView(R.id.cre0402a02)
    RadioButton cre0402a02;
    @BindView(R.id.cre0403b)
    RadioGroup cre0403b;
    @BindView(R.id.cre0403b01)
    RadioButton cre0403b01;
    @BindView(R.id.cre0403b02)
    RadioButton cre0403b02;
    @BindView(R.id.fldGrpopv2)
    LinearLayout fldGrpopv2;
    @BindView(R.id.cre0403a)
    RadioGroup cre0403a;
    @BindView(R.id.cre0403a01)
    RadioButton cre0403a01;
    @BindView(R.id.cre0403a02)
    RadioButton cre0403a02;
    @BindView(R.id.cre0501b)
    RadioGroup cre0501b;
    @BindView(R.id.cre0501b01)
    RadioButton cre0501b01;
    @BindView(R.id.cre0501b02)
    RadioButton cre0501b02;
    @BindView(R.id.fldGrpenta3)
    LinearLayout fldGrpenta3;
    @BindView(R.id.cre0501a)
    RadioGroup cre0501a;
    @BindView(R.id.cre0501a01)
    RadioButton cre0501a01;
    @BindView(R.id.cre0501a02)
    RadioButton cre0501a02;
    @BindView(R.id.cre0502b)
    RadioGroup cre0502b;
    @BindView(R.id.cre0502b01)
    RadioButton cre0502b01;
    @BindView(R.id.cre0502b02)
    RadioButton cre0502b02;
    @BindView(R.id.fldGrppcv3)
    LinearLayout fldGrppcv3;
    @BindView(R.id.cre0502a)
    RadioGroup cre0502a;
    @BindView(R.id.cre0502a01)
    RadioButton cre0502a01;
    @BindView(R.id.cre0502a02)
    RadioButton cre0502a02;
    @BindView(R.id.cre0503b)
    RadioGroup cre0503b;
    @BindView(R.id.cre0503b01)
    RadioButton cre0503b01;
    @BindView(R.id.cre0503b02)
    RadioButton cre0503b02;
    @BindView(R.id.fldGrpopv3)
    LinearLayout fldGrpopv3;
    @BindView(R.id.cre0503a)
    RadioGroup cre0503a;
    @BindView(R.id.cre0503a01)
    RadioButton cre0503a01;
    @BindView(R.id.cre0503a02)
    RadioButton cre0503a02;
    @BindView(R.id.cre0504b)
    RadioGroup cre0504b;
    @BindView(R.id.cre0504b01)
    RadioButton cre0504b01;
    @BindView(R.id.cre0504b02)
    RadioButton cre0504b02;
    @BindView(R.id.fldGrpipv)
    LinearLayout fldGrpipv;
    @BindView(R.id.cre0504a)
    RadioGroup cre0504a;
    @BindView(R.id.cre0504a01)
    RadioButton cre0504a01;
    @BindView(R.id.cre0504a02)
    RadioButton cre0504a02;
    @BindView(R.id.fldGrpbtn)
    LinearLayout fldGrpbtn;
    @BindView(R.id.crbGrp01)
    LinearLayout crbGrp01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_b);
        ButterKnife.bind(this);

        // ====================== Q 7 Skip Pattern =========================

        crb07.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (crb0701.isChecked()) {
                    crbGrp01.setVisibility(View.VISIBLE);
                } else {
                    crbGrp01.setVisibility(View.GONE);
                    crb0801.setText(null);

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
            if (updateDb()) {
                Toast.makeText(this, "starting next section", Toast.LENGTH_SHORT).show();

                finish();
                Intent secF = new Intent(this, SectionFActivity.class);
                startActivity(secF);

            } else {
                Toast.makeText(this, "Failed to update Database", Toast.LENGTH_SHORT).show();
            }
        }

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

        JSONObject sb = new JSONObject();

        sb.put("crb01", crb01.getText().toString());
        sb.put("crb02", crb0201.isChecked() ? "1" : crb0202.isChecked() ? "2" : "0");
        sb.put("crb03", new SimpleDateFormat("dd-MM-yyyy").format(crb03.getCalendarView().getDate()));
        sb.put("crb0401", crb0401.getText().toString());
        sb.put("crb0402", crb0402.getText().toString());
        sb.put("crb05", crb0501.isChecked() ? "1" : crb0502.isChecked() ? "2" : "0");
        sb.put("crb0601", crb0601.getText().toString());
        sb.put("crb07", crb0701.isChecked() ? "1" : crb0702.isChecked() ? "2" : "0");
        sb.put("crb08", crb0801.getText().toString());
        sb.put("crc01m1", crc01m1.getText().toString());
        sb.put("crc01m2", crc01m2.getText().toString());
        sb.put("crc01m3", crc01m3.getText().toString());
        sb.put("crc02m1 ", crc02m1.getText().toString());
        sb.put("crc02m2 ", crc02m2.getText().toString());
        sb.put("crc02m3 ", crc02m3.getText().toString());
        sb.put("crc03m1 ", crc03m1.getText().toString());
        sb.put("crc03m2 ", crc03m2.getText().toString());
        sb.put("crc03m3 ", crc03m3.getText().toString());


        Toast.makeText(this, "Validation Succecful", Toast.LENGTH_SHORT).show();

    }

    public boolean validateForm() {

        // =================== Q1 ====================
        if (crb01.getText().toString().isEmpty()) {
            Toast.makeText(this, "" + getString(R.string.crb01), Toast.LENGTH_SHORT).show();
            crb01.setError("This data is required");
            Log.d(TAG, "empty: crb01  ");
            return false;
        } else {
            crb01.setError(null);
        }

        // =================== Q2 ====================
        if (crb02.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crb02), Toast.LENGTH_SHORT).show();
            crb0202.setError("This Data is required");
            Log.d(TAG, "not selected: crb02 ");
            return false;
        } else {
            crb0202.setError(null);
        }

        // =================== Q4 ====================
        if (crb0401.getText().toString().isEmpty()) {
            Toast.makeText(this, "" + getString(R.string.crb04), Toast.LENGTH_SHORT).show();
            crb0401.setError("This data is required");
            Log.d(TAG, "empty: crb0401  ");
            return false;
        } else {
            crb0401.setError(null);
        }

        if ((Integer.parseInt(crb0401.getText().toString()) < 1) || (Integer.parseInt(crb0401.getText().toString()) > 12)) {
            Toast.makeText(this, "ERROR: " + getString(crb04) + getString(R.string.months), Toast.LENGTH_LONG).show();
            crb0401.setError("Range is 1-12 days");
            Log.i(TAG, "crb0401: Range is 1-12 days");
            return false;
        } else {
            crb0401.setError(null);
        }

        if (crb0402.getText().toString().isEmpty()) {
            Toast.makeText(this, "" + getString(R.string.crb04), Toast.LENGTH_SHORT).show();
            crb0402.setError("This data is required");
            Log.d(TAG, "empty: crb0402  ");
            return false;
        } else {
            crb0402.setError(null);
        }

        if ((Integer.parseInt(crb0402.getText().toString()) < 1) || (Integer.parseInt(crb0402.getText().toString()) > 30)) {
            Toast.makeText(this, "ERROR: " + getString(crb04) + getString(R.string.days), Toast.LENGTH_LONG).show();
            crb0402.setError("Range is 1-30 days");
            Log.i(TAG, "crb0402: Range is 1-30 days");
            return false;
        } else {
            crb0402.setError(null);
        }

        // =================== Q5 ====================
        if (crb05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crb05), Toast.LENGTH_SHORT).show();
            crb0502.setError("This Data is required");
            Log.d(TAG, "not selected: crb05 ");
            return false;
        } else {
            crb0502.setError(null);
        }

        // =================== Q6 ====================
        if (crb0601.getText().toString().isEmpty()) {
            Toast.makeText(this, "" + getString(R.string.crb06), Toast.LENGTH_SHORT).show();
            crb0601.setError("This data is required");
            Log.d(TAG, "empty: crb0601  ");
            return false;
        } else {
            crb0601.setError(null);
        }

        // =================== Q7 ====================
        if (crb07.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crb07), Toast.LENGTH_SHORT).show();
            crb0702.setError("This Data is required");
            Log.d(TAG, "not selected: crb07 ");
            return false;
        } else {
            crb0702.setError(null);
        }

        if (crb0701.isChecked()) {

            // =================== Q8 ====================
            if (crb0801.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crb08), Toast.LENGTH_SHORT).show();
                crb0801.setError("This data is Required!");
                Log.i(TAG, "crb0801: This data is Required!");
                return false;
            } else {
                crb0801.setError(null);
                if (!crb0801.getText().toString().contains(".")) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.crb08), Toast.LENGTH_SHORT).show();
                    crb0801.setError("Invalid: Decimal value is Required!");
                    Log.i(TAG, "crb0801: Invalid Decimal value is Required!");
                    return false;
                } else {
                    crb0801.setError(null);
                    if (Double.parseDouble(crb0801.getText().toString()) < 1) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crb08), Toast.LENGTH_SHORT).show();
                        crb0801.setError("Invalid: Greater then 0");
                        Log.i(TAG, "crb0801: Invalid Greater then 0");
                        return false;
                    } else {
                        crb0801.setError(null);
                        if (Double.parseDouble(crb0801.getText().toString()) < 5 || Double.parseDouble(crb0801.getText().toString()) > 170) {
                            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crb08), Toast.LENGTH_SHORT).show();
                            crb0801.setError("Invalid: Range 5.0-170.0 kg");
                            Log.i(TAG, "crb0801: Invalid Range 5.0-170.0 kg");
                            return false;
                        } else {
                            crb0801.setError(null);
                        }
                    }
                }
            }
        }
        // =================== Section-c ====================

        // =================== Q1 m1 ====================
        if (crc01m1.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc01), Toast.LENGTH_SHORT).show();
            crc01m1.setError("This data is Required!");
            Log.i(TAG, "crc01m1: This data is Required!");
            return false;
        } else {
            crc01m1.setError(null);
            if (!crc01m1.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc01), Toast.LENGTH_SHORT).show();
                crc01m1.setError("Invalid: Decimal value is Required!");
                Log.i(TAG, "crc01m1: Invalid Decimal value is Required!");
                return false;
            } else {
                crc01m1.setError(null);
                if (Double.parseDouble(crc01m1.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc01), Toast.LENGTH_SHORT).show();
                    crc01m1.setError("Invalid: Greater then 0");
                    Log.i(TAG, "crc01m1: Invalid Greater then 0");
                    return false;
                } else {
                    crc01m1.setError(null);
                    if (Double.parseDouble(crc01m1.getText().toString()) < 50 || Double.parseDouble(crc01m1.getText().toString()) > 200) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc01), Toast.LENGTH_SHORT).show();
                        crc01m1.setError("Invalid: Range 50.0-200.0");
                        Log.i(TAG, "crc01m1: Invalid Range 50.0-200.0");
                        return false;
                    } else {
                        crc01m1.setError(null);
                    }
                }
            }
        }
        // =================== Q1 m2 ====================
        if (crc01m2.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc01), Toast.LENGTH_SHORT).show();
            crc01m2.setError("This data is Required!");
            Log.i(TAG, "crc01m2: This data is Required!");
            return false;
        } else {
            crc01m2.setError(null);
            if (!crc01m2.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc01), Toast.LENGTH_SHORT).show();
                crc01m2.setError("Invalid: Decimal value is Required!");
                Log.i(TAG, "crc01m2: Invalid Decimal value is Required!");
                return false;
            } else {
                crc01m2.setError(null);
                if (Double.parseDouble(crc01m2.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc01), Toast.LENGTH_SHORT).show();
                    crc01m2.setError("Invalid: Greater then 0");
                    Log.i(TAG, "crc01m2: Invalid Greater then 0");
                    return false;
                } else {
                    crc01m2.setError(null);
                    if (Double.parseDouble(crc01m2.getText().toString()) < 50 || Double.parseDouble(crc01m2.getText().toString()) > 200) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc01), Toast.LENGTH_SHORT).show();
                        crc01m2.setError("Invalid: Range 50.0-200.0");
                        Log.i(TAG, "crc01m2: Invalid Range 50.0-200.0");
                        return false;
                    } else {
                        crc01m2.setError(null);
                    }
                }
            }
        }

        // =================== Q1 m3 ====================
        if (crc01m3.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc01), Toast.LENGTH_SHORT).show();
            crc01m3.setError("This data is Required!");
            Log.i(TAG, "crc01m3: This data is Required!");
            return false;
        } else {
            crc01m3.setError(null);
            if (!crc01m3.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc01), Toast.LENGTH_SHORT).show();
                crc01m3.setError("Invalid: Decimal value is Required!");
                Log.i(TAG, "crc01m3: Invalid Decimal value is Required!");
                return false;
            } else {
                crc01m3.setError(null);
                if (Double.parseDouble(crc01m3.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc01), Toast.LENGTH_SHORT).show();
                    crc01m3.setError("Invalid: Greater then 0");
                    Log.i(TAG, "crc01m3: Invalid Greater then 0");
                    return false;
                } else {
                    crc01m3.setError(null);
                    if (Double.parseDouble(crc01m3.getText().toString()) < 50 || Double.parseDouble(crc01m3.getText().toString()) > 200) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc01), Toast.LENGTH_SHORT).show();
                        crc01m3.setError("Invalid: Range 50.0-200.0");
                        Log.i(TAG, "crc01m3: Invalid Range 50.0-200.0");
                        return false;
                    } else {
                        crc01m3.setError(null);
                    }
                }
            }
        }

        // =================== Q2 m1 ====================
        if (crc02m1.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc02), Toast.LENGTH_SHORT).show();
            crc02m1.setError("This data is Required!");
            Log.i(TAG, "crc02m1: This data is Required!");
            return false;
        } else {
            crc02m1.setError(null);
            if (!crc02m1.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc02), Toast.LENGTH_SHORT).show();
                crc02m1.setError("Invalid: Decimal value is Required!");
                Log.i(TAG, "crc02m1: Invalid Decimal value is Required!");
                return false;
            } else {
                crc02m1.setError(null);
                if (Double.parseDouble(crc02m1.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc02), Toast.LENGTH_SHORT).show();
                    crc02m1.setError("Invalid: Greater then 0");
                    Log.i(TAG, "crc02m1: Invalid Greater then 0");
                    return false;
                } else {
                    crc02m1.setError(null);
                    if (Double.parseDouble(crc02m1.getText().toString()) < 5 || Double.parseDouble(crc02m1.getText().toString()) > 170) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc02), Toast.LENGTH_SHORT).show();
                        crc02m1.setError("Invalid: Range 5.0-170.0 kg");
                        Log.i(TAG, "crc02m1: Invalid Range 5.0-170.0 kg");
                        return false;
                    } else {
                        crc02m1.setError(null);
                    }
                }
            }
        }

        // =================== Q2 m2 ====================
        if (crc02m2.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc02), Toast.LENGTH_SHORT).show();
            crc02m2.setError("This data is Required!");
            Log.i(TAG, "crc02m2: This data is Required!");
            return false;
        } else {
            crc02m2.setError(null);
            if (!crc02m2.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc02), Toast.LENGTH_SHORT).show();
                crc02m2.setError("Invalid: Decimal value is Required!");
                Log.i(TAG, "crc02m2: Invalid Decimal value is Required!");
                return false;
            } else {
                crc02m2.setError(null);
                if (Double.parseDouble(crc02m2.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc02), Toast.LENGTH_SHORT).show();
                    crc02m2.setError("Invalid: Greater then 0");
                    Log.i(TAG, "crc02m2: Invalid Greater then 0");
                    return false;
                } else {
                    crc02m2.setError(null);
                    if (Double.parseDouble(crc02m2.getText().toString()) < 5 || Double.parseDouble(crc02m2.getText().toString()) > 170) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc02), Toast.LENGTH_SHORT).show();
                        crc02m2.setError("Invalid: Range 5.0-170.0");
                        Log.i(TAG, "crc02m2: Invalid Range 5.0-170.0");
                        return false;
                    } else {
                        crc02m2.setError(null);
                    }
                }
            }
        }

        // =================== Q2 m3 ====================
        if (crc02m3.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc02), Toast.LENGTH_SHORT).show();
            crc02m3.setError("This data is Required!");
            Log.i(TAG, "crc02m3: This data is Required!");
            return false;
        } else {
            crc02m3.setError(null);
            if (!crc02m3.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc02), Toast.LENGTH_SHORT).show();
                crc02m3.setError("Invalid: Decimal value is Required!");
                Log.i(TAG, "crc02m3: Invalid Decimal value is Required!");
                return false;
            } else {
                crc02m3.setError(null);
                if (Double.parseDouble(crc02m3.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc02), Toast.LENGTH_SHORT).show();
                    crc02m3.setError("Invalid: Greater then 0");
                    Log.i(TAG, "crc02m3: Invalid Greater then 0");
                    return false;
                } else {
                    crc02m3.setError(null);
                    if (Double.parseDouble(crc02m3.getText().toString()) < 5 || Double.parseDouble(crc02m3.getText().toString()) > 170) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc02), Toast.LENGTH_SHORT).show();
                        crc02m3.setError("Invalid: Range 5.0-170.0");
                        Log.i(TAG, "crc02m3: Invalid Range 5.0-170.0");
                        return false;
                    } else {
                        crc02m3.setError(null);
                    }
                }
            }
        }
        // =================== Q3 m1 ====================
        if (crc03m1.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc03), Toast.LENGTH_SHORT).show();
            crc03m1.setError("This data is Required!");
            Log.i(TAG, "crc03m1: This data is Required!");
            return false;
        } else {
            crc03m1.setError(null);
            if (!crc03m1.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc03), Toast.LENGTH_SHORT).show();
                crc03m1.setError("Invalid: Decimal value is Required!");
                Log.i(TAG, "crc03m1: Invalid Decimal value is Required!");
                return false;
            } else {
                crc03m1.setError(null);
                if (Double.parseDouble(crc03m1.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc03), Toast.LENGTH_SHORT).show();
                    crc03m1.setError("Invalid: Greater then 0");
                    Log.i(TAG, "crc03m1: Invalid Greater then 0");
                    return false;
                } else {
                    crc03m1.setError(null);
                    if (Double.parseDouble(crc03m1.getText().toString()) < 8 || Double.parseDouble(crc03m1.getText().toString()) > 99.9) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc03), Toast.LENGTH_SHORT).show();
                        crc03m1.setError("Invalid: Range 8.0-99.9");
                        Log.i(TAG, "crc03m1: Invalid Range 8.0-99.9");
                        return false;
                    } else {
                        crc03m1.setError(null);
                    }
                }
            }
        }

        // =================== Q3 m2 ====================
        if (crc03m2.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc03), Toast.LENGTH_SHORT).show();
            crc03m2.setError("This data is Required!");
            Log.i(TAG, "crc03m2: This data is Required!");
            return false;
        } else {
            crc03m2.setError(null);
            if (!crc03m2.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc03), Toast.LENGTH_SHORT).show();
                crc03m2.setError("Invalid: Decimal value is Required!");
                Log.i(TAG, "crc03m2: Invalid Decimal value is Required!");
                return false;
            } else {
                crc03m2.setError(null);
                if (Double.parseDouble(crc03m2.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc03), Toast.LENGTH_SHORT).show();
                    crc03m2.setError("Invalid: Greater then 0");
                    Log.i(TAG, "crc03m2: Invalid Greater then 0");
                    return false;
                } else {
                    crc03m2.setError(null);
                    if (Double.parseDouble(crc03m2.getText().toString()) < 8 || Double.parseDouble(crc03m2.getText().toString()) > 99.9) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc03), Toast.LENGTH_SHORT).show();
                        crc03m2.setError("Invalid: Range 8.0-99.9");
                        Log.i(TAG, "crc03m2: Invalid Range 8.0-99.9");
                        return false;
                    } else {
                        crc03m2.setError(null);
                    }
                }
            }
        }

        // =================== Q3 m3 ====================
        if (crc03m3.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc03), Toast.LENGTH_SHORT).show();
            crc03m3.setError("This data is Required!");
            Log.i(TAG, "crc03m3: This data is Required!");
            return false;
        } else {
            crc03m3.setError(null);
            if (!crc03m3.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc03), Toast.LENGTH_SHORT).show();
                crc03m3.setError("Invalid: Decimal value is Required!");
                Log.i(TAG, "crc03m3: Invalid Decimal value is Required!");
                return false;
            } else {
                crc03m3.setError(null);
                if (Double.parseDouble(crc03m3.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc03), Toast.LENGTH_SHORT).show();
                    crc03m3.setError("Invalid: Greater then 0");
                    Log.i(TAG, "crc03m3: Invalid Greater then 0");
                    return false;
                } else {
                    crc03m3.setError(null);
                    if (Double.parseDouble(crc03m3.getText().toString()) < 8 || Double.parseDouble(crc03m3.getText().toString()) > 99.9) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc03), Toast.LENGTH_SHORT).show();
                        crc03m3.setError("Invalid: Range 8.0-99.9");
                        Log.i(TAG, "crc03m3: Invalid Range 8.0-99.9");
                        return false;
                    } else {
                        crc03m3.setError(null);
                    }
                }
            }
        }

        // =================== Section-D ====================


        return true;
    }


}
