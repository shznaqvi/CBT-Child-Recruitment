package edu.aku.hassannaqvi.cbt_child_recruitment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionGActivity extends Activity {

    @BindView(R.id.activity_section_g)
    ScrollView activitySectionG;
    @BindView(R.id.crg01)
    RadioGroup crg01;
    @BindView(R.id.crg0101)
    RadioButton crg0101;
    @BindView(R.id.crg0102)
    RadioButton crg0102;
    @BindView(R.id.crg0103)
    RadioButton crg0103;
    @BindView(R.id.crg0104)
    RadioButton crg0104;
    @BindView(R.id.crg0105)
    RadioButton crg0105;
    @BindView(R.id.crg0106)
    RadioButton crg0106;
    @BindView(R.id.crg0196)
    RadioButton crg0196;
    @BindView(R.id.crg0196x)
    EditText crg0196x;
    @BindView(R.id.crg02)
    RadioGroup crg02;
    @BindView(R.id.crg0201)
    RadioButton crg0201;
    @BindView(R.id.crg0202)
    RadioButton crg0202;
    @BindView(R.id.crg0203)
    RadioButton crg0203;
    @BindView(R.id.crg0204)
    RadioButton crg0204;
    @BindView(R.id.crg0205)
    RadioButton crg0205;
    @BindView(R.id.crg0206)
    RadioButton crg0206;
    @BindView(R.id.crg0207)
    RadioButton crg0207;
    @BindView(R.id.crg0208)
    RadioButton crg0208;
    @BindView(R.id.crg0209)
    RadioButton crg0209;
    @BindView(R.id.crg0210)
    RadioButton crg0210;
    @BindView(R.id.crg0211)
    RadioButton crg0211;
    @BindView(R.id.crg0212)
    RadioButton crg0212;
    @BindView(R.id.crg0213)
    RadioButton crg0213;
    @BindView(R.id.crg0214)
    RadioButton crg0214;
    @BindView(R.id.crg0215)
    RadioButton crg0215;
    @BindView(R.id.crg0296)
    RadioButton crg0296;
    @BindView(R.id.crg0296x)
    EditText crg0296x;
    @BindView(R.id.crg03)
    RadioGroup crg03;
    @BindView(R.id.crg0301)
    RadioButton crg0301;
    @BindView(R.id.crg0302)
    RadioButton crg0302;
    @BindView(R.id.crg04)
    RadioGroup crg04;
    @BindView(R.id.crg0401)
    RadioButton crg0401;
    @BindView(R.id.crg0402)
    RadioButton crg0402;
    @BindView(R.id.crg0403)
    RadioButton crg0403;
    @BindView(R.id.crg0404)
    RadioButton crg0404;
    @BindView(R.id.crg0405)
    RadioButton crg0405;
    @BindView(R.id.crg0406)
    RadioButton crg0406;
    @BindView(R.id.crg0496)
    RadioButton crg0496;
    @BindView(R.id.crg0496x)
    EditText crg0496x;
    @BindView(R.id.crg05)
    RadioGroup crg05;
    @BindView(R.id.crg0501)
    RadioButton crg0501;
    @BindView(R.id.crg0502)
    RadioButton crg0502;
    @BindView(R.id.crg0503)
    RadioButton crg0503;
    @BindView(R.id.crg0504)
    RadioButton crg0504;
    @BindView(R.id.crg0505)
    RadioButton crg0505;
    @BindView(R.id.crg0506)
    RadioButton crg0506;
    @BindView(R.id.crg0507)
    RadioButton crg0507;
    @BindView(R.id.crg0508)
    RadioButton crg0508;
    @BindView(R.id.crg0509)
    RadioButton crg0509;
    @BindView(R.id.crg0596)
    RadioButton crg0596;
    @BindView(R.id.crg0596x)
    EditText crg0596x;
    @BindView(R.id.crg06)
    RadioGroup crg06;
    @BindView(R.id.crg0601)
    RadioButton crg0601;
    @BindView(R.id.crg0602)
    RadioButton crg0602;
    @BindView(R.id.textView2)
    TextView textView2;
    @BindView(R.id.crg07)
    EditText crg07;
    @BindView(R.id.crg0801)
    RadioGroup crg0801;
    @BindView(R.id.crg080101)
    RadioButton crg080101;
    @BindView(R.id.crg080102)
    RadioButton crg080102;
    @BindView(R.id.crg0802)
    RadioGroup crg0802;
    @BindView(R.id.crg080201)
    RadioButton crg080201;
    @BindView(R.id.crg080202)
    RadioButton crg080202;
    @BindView(R.id.crg0803)
    RadioGroup crg0803;
    @BindView(R.id.crg080301)
    RadioButton crg080301;
    @BindView(R.id.crg080302)
    RadioButton crg080302;
    @BindView(R.id.crg0804)
    RadioGroup crg0804;
    @BindView(R.id.crg080401)
    RadioButton crg080401;
    @BindView(R.id.crg080402)
    RadioButton crg080402;
    @BindView(R.id.crg0805)
    RadioGroup crg0805;
    @BindView(R.id.crg080501)
    RadioButton crg080501;
    @BindView(R.id.crg080502)
    RadioButton crg080502;
    @BindView(R.id.crg0806)
    RadioGroup crg0806;
    @BindView(R.id.crg080601)
    RadioButton crg080601;
    @BindView(R.id.crg080602)
    RadioButton crg080602;
    @BindView(R.id.crg0807)
    RadioGroup crg0807;
    @BindView(R.id.crg080701)
    RadioButton crg080701;
    @BindView(R.id.crg080702)
    RadioButton crg080702;
    @BindView(R.id.crg0808)
    RadioGroup crg0808;
    @BindView(R.id.crg080801)
    RadioButton crg080801;
    @BindView(R.id.crg080802)
    RadioButton crg080802;
    @BindView(R.id.crg0809)
    RadioGroup crg0809;
    @BindView(R.id.crg080901)
    RadioButton crg080901;
    @BindView(R.id.crg080902)
    RadioButton crg080902;
    @BindView(R.id.crg0810)
    RadioGroup crg0810;
    @BindView(R.id.crg081001)
    RadioButton crg081001;
    @BindView(R.id.crg081002)
    RadioButton crg081002;
    @BindView(R.id.crg0811)
    RadioGroup crg0811;
    @BindView(R.id.crg081101)
    RadioButton crg081101;
    @BindView(R.id.crg081102)
    RadioButton crg081102;
    @BindView(R.id.crg0812)
    RadioGroup crg0812;
    @BindView(R.id.crg081201)
    RadioButton crg081201;
    @BindView(R.id.crg081202)
    RadioButton crg081202;
    @BindView(R.id.crg0813)
    RadioGroup crg0813;
    @BindView(R.id.crg081301)
    RadioButton crg081301;
    @BindView(R.id.crg081302)
    RadioButton crg081302;
    @BindView(R.id.crg0814)
    RadioGroup crg0814;
    @BindView(R.id.crg081401)
    RadioButton crg081401;
    @BindView(R.id.crg081402)
    RadioButton crg081402;
    @BindView(R.id.crg0815)
    RadioGroup crg0815;
    @BindView(R.id.crg081501)
    RadioButton crg081501;
    @BindView(R.id.crg081502)
    RadioButton crg081502;
    @BindView(R.id.crg0816)
    RadioGroup crg0816;
    @BindView(R.id.crg081601)
    RadioButton crg081601;
    @BindView(R.id.crg081602)
    RadioButton crg081602;
    @BindView(R.id.crg0817)
    RadioGroup crg0817;
    @BindView(R.id.crg081701)
    RadioButton crg081701;
    @BindView(R.id.crg081702)
    RadioButton crg081702;
    @BindView(R.id.crg0818)
    RadioGroup crg0818;
    @BindView(R.id.crg081801)
    RadioButton crg081801;
    @BindView(R.id.crg081802)
    RadioButton crg081802;
    @BindView(R.id.crg0819)
    RadioGroup crg0819;
    @BindView(R.id.crg081901)
    RadioButton crg081901;
    @BindView(R.id.crg081902)
    RadioButton crg081902;
    @BindView(R.id.crg09)
    RadioGroup crg09;
    @BindView(R.id.crg0901)
    RadioButton crg0901;
    @BindView(R.id.crg0902)
    RadioButton crg0902;
    @BindView(R.id.crg0903)
    RadioButton crg0903;
    @BindView(R.id.crg0904)
    RadioButton crg0904;
    @BindView(R.id.crg0905)
    RadioButton crg0905;
    @BindView(R.id.crg0906)
    RadioButton crg0906;
    @BindView(R.id.crg0907)
    RadioButton crg0907;
    @BindView(R.id.crg0908)
    RadioButton crg0908;
    @BindView(R.id.crg0909)
    RadioButton crg0909;
    @BindView(R.id.crg0910)
    RadioButton crg0910;
    @BindView(R.id.crg0996)
    RadioButton crg0996;
    @BindView(R.id.crg0996x)
    EditText crg0996x;
    @BindView(R.id.crg10)
    RadioGroup crg10;
    @BindView(R.id.crg1001)
    RadioButton crg1001;
    @BindView(R.id.crg1002)
    RadioButton crg1002;
    @BindView(R.id.crg1003)
    RadioButton crg1003;
    @BindView(R.id.crg1096)
    RadioButton crg1096;
    @BindView(R.id.crg1096x)
    EditText crg1096x;
    @BindView(R.id.crgGrp09)
    LinearLayout crgGrp09;
    @BindView(R.id.crg11)
    RadioGroup crg11;
    @BindView(R.id.crg1101)
    RadioButton crg1101;
    @BindView(R.id.crg1102)
    RadioButton crg1102;
    @BindView(R.id.crg12)
    RadioGroup crg12;
    @BindView(R.id.crg1201)
    RadioButton crg1201;
    @BindView(R.id.crg1202)
    RadioButton crg1202;
    @BindView(R.id.crg1203)
    RadioButton crg1203;
    @BindView(R.id.crg1204)
    RadioButton crg1204;
    @BindView(R.id.crg1205)
    RadioButton crg1205;
    @BindView(R.id.crg1206)
    RadioButton crg1206;
    @BindView(R.id.crg1207)
    RadioButton crg1207;
    @BindView(R.id.crg1208)
    RadioButton crg1208;
    @BindView(R.id.crg1209)
    RadioButton crg1209;
    @BindView(R.id.crg1210)
    RadioButton crg1210;
    @BindView(R.id.crg1211)
    RadioButton crg1211;
    @BindView(R.id.crg1296)
    RadioButton crg1296;
    @BindView(R.id.crg1296x)
    EditText crg1296x;
    @BindView(R.id.crg13)
    RadioGroup crg13;
    @BindView(R.id.crg1301)
    RadioButton crg1301;
    @BindView(R.id.crg1302)
    RadioButton crg1302;
    @BindView(R.id.crg1303)
    RadioButton crg1303;
    @BindView(R.id.crg1304)
    RadioButton crg1304;
    @BindView(R.id.crg1305)
    RadioButton crg1305;
    @BindView(R.id.crg1306)
    RadioButton crg1306;
    @BindView(R.id.crg1307)
    RadioButton crg1307;
    @BindView(R.id.crg1308)
    RadioButton crg1308;
    @BindView(R.id.crg1309)
    RadioButton crg1309;
    @BindView(R.id.crg1310)
    RadioButton crg1310;
    @BindView(R.id.crg1311)
    RadioButton crg1311;
    @BindView(R.id.crg1396)
    RadioButton crg1396;
    @BindView(R.id.crg1396x)
    EditText crg1396x;
    @BindView(R.id.crg14)
    RadioGroup crg14;
    @BindView(R.id.crg1401)
    RadioButton crg1401;
    @BindView(R.id.crg1402)
    RadioButton crg1402;
    @BindView(R.id.crg1403)
    RadioButton crg1403;
    @BindView(R.id.crg1404)
    RadioButton crg1404;
    @BindView(R.id.crg1405)
    RadioButton crg1405;
    @BindView(R.id.crg1406)
    RadioButton crg1406;
    @BindView(R.id.crg1407)
    RadioButton crg1407;
    @BindView(R.id.crg1408)
    RadioButton crg1408;
    @BindView(R.id.crg1409)
    RadioButton crg1409;
    @BindView(R.id.crg1410)
    RadioButton crg1410;
    @BindView(R.id.crg1411)
    RadioButton crg1411;
    @BindView(R.id.crg1496)
    RadioButton crg1496;
    @BindView(R.id.crg1496x)
    EditText crg1496x;
    @BindView(R.id.crg15)
    EditText crg15;
    @BindView(R.id.crg16a)
    RadioGroup crg16a;
    @BindView(R.id.crg16a01)
    RadioButton crg16a01;
    @BindView(R.id.crg16a02)
    RadioButton crg16a02;
    @BindView(R.id.crg16b)
    RadioGroup crg16b;
    @BindView(R.id.crg16b01)
    RadioButton crg16b01;
    @BindView(R.id.crg16b02)
    RadioButton crg16b02;
    @BindView(R.id.crg16c)
    RadioGroup crg16c;
    @BindView(R.id.crg16c01)
    RadioButton crg16c01;
    @BindView(R.id.crg16c02)
    RadioButton crg16c02;
    @BindView(R.id.crg16d)
    RadioGroup crg16d;
    @BindView(R.id.crg16d01)
    RadioButton crg16d01;
    @BindView(R.id.crg16d02)
    RadioButton crg16d02;
    @BindView(R.id.crg16e)
    RadioGroup crg16e;
    @BindView(R.id.crg16e01)
    RadioButton crg16e01;
    @BindView(R.id.crg16e02)
    RadioButton crg16e02;
    @BindView(R.id.crg16f)
    RadioGroup crg16f;
    @BindView(R.id.crg16f01)
    RadioButton crg16f01;
    @BindView(R.id.crg16f02)
    RadioButton crg16f02;
    @BindView(R.id.crg16g)
    RadioGroup crg16g;
    @BindView(R.id.crg16g01)
    RadioButton crg16g01;
    @BindView(R.id.crg16g02)
    RadioButton crg16g02;
    @BindView(R.id.crg16h)
    RadioGroup crg16h;
    @BindView(R.id.crg16h01)
    RadioButton crg16h01;
    @BindView(R.id.crg16h02)
    RadioButton crg16h02;
    @BindView(R.id.crg16i)
    RadioGroup crg16i;
    @BindView(R.id.crg16i01)
    RadioButton crg16i01;
    @BindView(R.id.crg16i02)
    RadioButton crg16i02;
    @BindView(R.id.crg17)
    RadioGroup crg17;
    @BindView(R.id.crg1701)
    RadioButton crg1701;
    @BindView(R.id.crg1702)
    RadioButton crg1702;
    @BindView(R.id.crgGrp17)
    LinearLayout crgGrp17;
    @BindView(R.id.crg1801)
    EditText crg1801;
    @BindView(R.id.crg1802)
    EditText crg1802;
    @BindView(R.id.crg18)
    RadioGroup crg18;
    @BindView(R.id.crg1899)
    RadioButton crg1899;
    @BindView(R.id.crg19)
    RadioGroup crg19;
    @BindView(R.id.crg1901)
    RadioButton crg1901;
    @BindView(R.id.crg1902)
    RadioButton crg1902;
    @BindView(R.id.crgGrp19)
    LinearLayout crgGrp19;
    @BindView(R.id.crg2001)
    EditText crg2001;
    @BindView(R.id.crg2002)
    EditText crg2002;
    @BindView(R.id.crg2003)
    EditText crg2003;
    @BindView(R.id.crg2004)
    EditText crg2004;
    @BindView(R.id.crg2005)
    EditText crg2005;
    @BindView(R.id.crg2006)
    EditText crg2006;
    @BindView(R.id.crg2007)
    EditText crg2007;
    @BindView(R.id.crg21a)
    RadioGroup crg21a;
    @BindView(R.id.crg21a01)
    RadioButton crg21a01;
    @BindView(R.id.crg21a02)
    RadioButton crg21a02;
    @BindView(R.id.crg21a03)
    RadioButton crg21a03;
    @BindView(R.id.crg21a04)
    RadioButton crg21a04;
    @BindView(R.id.crg21a05)
    RadioButton crg21a05;
    @BindView(R.id.crg21a06)
    RadioButton crg21a06;
    @BindView(R.id.crg21a07)
    RadioButton crg21a07;
    @BindView(R.id.crg21a08)
    RadioButton crg21a08;
    @BindView(R.id.crg21a09)
    RadioButton crg21a09;
    @BindView(R.id.crg21a10)
    RadioButton crg21a10;
    @BindView(R.id.crg21a11)
    RadioButton crg21a11;
    @BindView(R.id.crg21a12)
    RadioButton crg21a12;
    @BindView(R.id.crg21a13)
    RadioButton crg21a13;
    @BindView(R.id.crg21a96)
    RadioButton crg21a96;
    @BindView(R.id.crg21a96x)
    EditText crg21a96x;
    @BindView(R.id.crg21b)
    RadioGroup crg21b;
    @BindView(R.id.crg21b01)
    RadioButton crg21b01;
    @BindView(R.id.crg21b02)
    RadioButton crg21b02;
    @BindView(R.id.crg21b03)
    RadioButton crg21b03;
    @BindView(R.id.crg21b04)
    RadioButton crg21b04;
    @BindView(R.id.crg21b05)
    RadioButton crg21b05;
    @BindView(R.id.crg21b06)
    RadioButton crg21b06;
    @BindView(R.id.crg21b07)
    RadioButton crg21b07;
    @BindView(R.id.crg21b08)
    RadioButton crg21b08;
    @BindView(R.id.crg21b09)
    RadioButton crg21b09;
    @BindView(R.id.crg21b10)
    RadioButton crg21b10;
    @BindView(R.id.crg21b11)
    RadioButton crg21b11;
    @BindView(R.id.crg21b12)
    RadioButton crg21b12;
    @BindView(R.id.crg21b13)
    RadioButton crg21b13;
    @BindView(R.id.crg21b96)
    RadioButton crg21b96;
    @BindView(R.id.crg21b96x)
    EditText crg21b96x;
    @BindView(R.id.crg21c)
    RadioGroup crg21c;
    @BindView(R.id.crg21c01)
    RadioButton crg21c01;
    @BindView(R.id.crg21c02)
    RadioButton crg21c02;
    @BindView(R.id.crg21c03)
    RadioButton crg21c03;
    @BindView(R.id.crg21c04)
    RadioButton crg21c04;
    @BindView(R.id.crg21c05)
    RadioButton crg21c05;
    @BindView(R.id.crg21c06)
    RadioButton crg21c06;
    @BindView(R.id.crg21c07)
    RadioButton crg21c07;
    @BindView(R.id.crg21c08)
    RadioButton crg21c08;
    @BindView(R.id.crg21c09)
    RadioButton crg21c09;
    @BindView(R.id.crg21c10)
    RadioButton crg21c10;
    @BindView(R.id.crg21c11)
    RadioButton crg21c11;
    @BindView(R.id.crg21c12)
    RadioButton crg21c12;
    @BindView(R.id.crg21c13)
    RadioButton crg21c13;
    @BindView(R.id.crg21c96)
    RadioButton crg21c96;
    @BindView(R.id.crg21c96x)
    EditText crg21c96x;
    @BindView(R.id.crg22)
    RadioGroup crg22;
    @BindView(R.id.crg2201)
    RadioButton crg2201;
    @BindView(R.id.crg2202)
    RadioButton crg2202;
    @BindView(R.id.crgGrp22)
    LinearLayout crgGrp22;
    @BindView(R.id.crg22a)
    RadioGroup crg22a;
    @BindView(R.id.crg22a01)
    RadioButton crg22a01;
    @BindView(R.id.crg22a02)
    RadioButton crg22a02;
    @BindView(R.id.crg22a03)
    RadioButton crg22a03;
    @BindView(R.id.fldGrpbtn)
    LinearLayout fldGrpbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_g);
        ButterKnife.bind(this);


        // ====================== Q9 Skip Pattern =========================

        crg0910.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crgGrp09.setVisibility(View.GONE);
                    crg11.clearCheck();
                } else {
                    crgGrp09.setVisibility(View.VISIBLE);
                }
            }
        });

        // ====================== Q17 Skip Pattern =========================
        crg1702.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crgGrp17.setVisibility(View.GONE);
                    crg18.clearCheck();
                    crg1801.setText(null);
                    crg1802.setText(null);
                } else {
                    crgGrp17.setVisibility(View.VISIBLE);
                }
            }
        });

        // ====================== Q19 Skip Pattern =========================

        crg1902.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crgGrp19.setVisibility(View.GONE);
                    crg2001.setText(null);
                    crg2002.setText(null);
                    crg2003.setText(null);
                    crg2004.setText(null);
                    crg2005.setText(null);
                    crg2006.setText(null);
                    crg2006.setText(null);
                    crg2007.setText(null);
                    crg21a.clearCheck();
                    crg21a96x.setText(null);
                    crg21b.clearCheck();
                    crg21b96x.setText(null);
                    crg21c.clearCheck();
                    crg21c96x.setText(null);
                    crgGrp22.setVisibility(View.GONE);
                    crg22.clearCheck();
                    crg22a.clearCheck();
                } else {
                    crgGrp19.setVisibility(View.VISIBLE);
                    crgGrp22.setVisibility(View.VISIBLE);
                }
            }
        });

        // ====================== Q22 Skip Pattern =========================
        crg2202.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crgGrp22.setVisibility(View.GONE);
                    crg22a.clearCheck();
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
                Intent secH = new Intent(this, SectionHActivity.class);
                startActivity(secH);

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

        JSONObject sg = new JSONObject();


        Toast.makeText(this, "Validation Succecful", Toast.LENGTH_SHORT).show();
    }

    public boolean validateForm() {

        return true;
    }
}


}
