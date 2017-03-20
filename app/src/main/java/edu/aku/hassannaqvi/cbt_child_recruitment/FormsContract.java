package edu.aku.hassannaqvi.cbt_child_recruitment;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;

/**
 * Created by hassan.naqvi on 10/25/2016.
 */

public class FormsContract {

    private final String projectName = "Sero 2016-17";
    private final String surveyType = "SN";
    private String _ID = "";
    private String UID = "";
    private String mna1 = ""; // Date
    private String mna2 = "0000"; // DC name
    private String hFacility = ""; // District
    private String lhwCode = ""; // PSU
    private String houseHold = ""; // HH no.
    private String childId = ""; // Index Child Name
    private String mna6a = ""; // Name Confirmation
    private String iStatus = ""; // Form Status
    private String sA = "";
    private String sB = "";
    private String sC = "";
    private String sD = "";
    private String sE = "";
    private String sF = "";
    private String sG = "";

    private String gpsLat = "";
    private String gpsLng = "";
    private String gpsTime = "";
    private String gpsAcc = "";
    private String deviceID = "";
    private String synced = "";
    private String synced_date = "";

    public FormsContract() {
    }

    public FormsContract sync(JSONObject jsonObject) throws JSONException {
        this._ID = jsonObject.getString(singleForm._ID);
        this.UID = jsonObject.getString(singleForm.COLUMN_UID);
        this.mna1 = jsonObject.getString(singleForm.COLUMN_MNA1);
        this.mna2 = jsonObject.getString(singleForm.COLUMN_MNA2);
        this.hFacility = jsonObject.getString(singleForm.COLUMN_MNA3);
        this.lhwCode = jsonObject.getString(singleForm.COLUMN_MNA4);
        this.houseHold = jsonObject.getString(singleForm.COLUMN_MNA5);
        this.childId = jsonObject.getString(singleForm.COLUMN_MNA6);
        this.iStatus = jsonObject.getString(singleForm.COLUMN_MNA7);
        this.sA = jsonObject.getString(singleForm.COLUMN_SA);
        this.sB = jsonObject.getString(singleForm.COLUMN_SB);
        this.sC = jsonObject.getString(singleForm.COLUMN_SC);
        this.sD = jsonObject.getString(singleForm.COLUMN_SD);
        this.sE = jsonObject.getString(singleForm.COLUMN_SE);
        this.sF = jsonObject.getString(singleForm.COLUMN_SF);
        this.sG = jsonObject.getString(singleForm.COLUMN_SG);
        this.gpsLat = jsonObject.getString(singleForm.COLUMN_GPS_LAT);
        this.gpsLng = jsonObject.getString(singleForm.COLUMN_GPS_LNG);
        this.gpsTime = jsonObject.getString(singleForm.COLUMN_GPS_TIME);
        this.gpsAcc = jsonObject.getString(singleForm.COLUMN_GPS_ACC);
        this.deviceID = jsonObject.getString(singleForm.COLUMN_DEVICE_ID);
        this.synced = jsonObject.getString(singleForm.COLUMN_SYNCED);
        this.synced_date = jsonObject.getString(singleForm.COLUMN_SYNCED_DATE);

        return this;
    }

    public FormsContract hydrate(Cursor cursor) {
        this._ID = cursor.getString(cursor.getColumnIndex(singleForm._ID));
        this.UID = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_UID));
        this.mna1 = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_MNA1));
        this.mna2 = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_MNA2));
        this.hFacility = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_MNA3));
        this.lhwCode = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_MNA4));
        this.houseHold = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_MNA5));
        this.childId = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_MNA6));
        this.iStatus = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_MNA7));
        this.sA = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SA));
        this.sB = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SB));
        this.sC = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SC));
        this.sD = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SD));
        this.sE = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SE));
        this.sF = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SF));
        this.sG = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SG));
        this.gpsLat = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_GPS_LAT));
        this.gpsLng = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_GPS_LNG));
        this.gpsTime = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_GPS_TIME));
        this.gpsAcc = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_GPS_ACC));
        this.deviceID = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_DEVICE_ID));
        this.synced = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SYNCED));
        this.synced_date = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SYNCED_DATE));

        return this;
    }

    public String getID() {
        return _ID;
    }

    public void setID(String _ID) {
        this._ID = _ID;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getSurveyType() {
        return surveyType;
    }

    public String getMna1() {
        return mna1;
    }

    public void setMna1(String mna1) {
        this.mna1 = mna1;
    }

    public String getMna2() {
        return mna2;
    }

    public void setMna2(String mna2) {
        this.mna2 = mna2;
    }

    public String gethFacility() {
        return hFacility;
    }

    public void sethFacility(String hFacility) {
        this.hFacility = hFacility;
    }

    public String getLhwCode() {
        return lhwCode;
    }

    public void setLhwCode(String lhwCode) {
        this.lhwCode = lhwCode;
    }

    public String getHouseHold() {
        return houseHold;
    }

    public void setHouseHold(String houseHold) {
        this.houseHold = houseHold;
    }

    public String getChildId() {
        return childId;
    }

    public void setChildId(String childId) {
        this.childId = childId;
    }

    public String getMna6a() {
        return mna6a;
    }

    public void setMna6a(String mna6a) {
        this.mna6a = mna6a;
    }

    public String getiStatus() {
        return iStatus;
    }

    public void setiStatus(String iStatus) {
        this.iStatus = iStatus;
    }

    public String getsA() {
        return this.sA;
    }

    public void setsA(String sA) {
        this.sA = sA;
    }

    public String getsB() {

        return sB;
    }

    public void setsB(String sB) {
        this.sB = sB;
    }

    public String getsC() {
        return sC;
    }

    public void setsC(String sC) {
        this.sC = sC;
    }

    public String getsD() {
        return sD;
    }

    public void setsD(String sD) {
        this.sD = sD;
    }

    public String getsE() {
        return sE;
    }

    public void setsE(String sE) {
        this.sE = sE;
    }

    public String getsF() {
        return sF;
    }

    public void setsF(String sF) {
        this.sF = sF;
    }

    public String getsG() {
        return sG;
    }

    public void setsG(String sG) {
        this.sG = sG;
    }

    public String getGpsLat() {
        return gpsLat;
    }

    public void setGpsLat(String gpsLat) {
        this.gpsLat = gpsLat;
    }

    public String getGpsLng() {
        return gpsLng;
    }

    public void setGpsLng(String gpsLng) {
        this.gpsLng = gpsLng;
    }

    public String getGpsTime() {
        return gpsTime;
    }

    public void setGpsTime(String gpsTime) {
        this.gpsTime = gpsTime;
    }

    public String getGpsAcc() {
        return gpsAcc;
    }

    public void setGpsAcc(String gpsAcc) {
        this.gpsAcc = gpsAcc;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSyncedDate() {
        return synced_date;
    }

    public void setSyncedDate(String synced_date) {
        this.synced_date = synced_date;
    }

    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();

        json.put(singleForm._ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(singleForm.COLUMN_UID, this.UID == null ? JSONObject.NULL : this.UID);
        json.put(singleForm.COLUMN_PROJECT_NAME, this.projectName == null ? JSONObject.NULL : this.projectName);
        json.put(singleForm.COLUMN_SURVEY_TYPE, this.surveyType == null ? JSONObject.NULL : this.surveyType);
        json.put(singleForm.COLUMN_DEVICE_ID, this.deviceID == null ? JSONObject.NULL : this.deviceID);
        json.put(singleForm.COLUMN_GPS_LAT, this.gpsLat == null ? JSONObject.NULL : this.gpsLat);
        json.put(singleForm.COLUMN_GPS_LNG, this.gpsLng == null ? JSONObject.NULL : this.gpsLng);
        json.put(singleForm.COLUMN_GPS_TIME, this.gpsTime == null ? JSONObject.NULL : this.gpsTime);
        json.put(singleForm.COLUMN_GPS_ACC, this.gpsAcc == null ? JSONObject.NULL : this.gpsAcc);
        json.put(singleForm.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
        json.put(singleForm.COLUMN_SYNCED_DATE, this.synced_date == null ? JSONObject.NULL : this.synced_date);
        json.put(singleForm.COLUMN_MNA1, this.mna1 == null ? JSONObject.NULL : this.mna1);
        json.put(singleForm.COLUMN_MNA2, this.mna2 == null ? JSONObject.NULL : this.mna2);
        json.put(singleForm.COLUMN_MNA3, this.hFacility == null ? JSONObject.NULL : this.hFacility);
        json.put(singleForm.COLUMN_MNA4, this.lhwCode == null ? JSONObject.NULL : this.lhwCode);
        json.put(singleForm.COLUMN_MNA5, this.houseHold == null ? JSONObject.NULL : this.houseHold);
        json.put(singleForm.COLUMN_MNA6, this.childId == null ? JSONObject.NULL : this.childId);
        json.put(singleForm.COLUMN_MNA7, this.iStatus == null ? JSONObject.NULL : this.iStatus);


/*        json = jsonMerge(json, new JSONObject(this.sA));
        json = jsonMerge(json, new JSONObject(this.sB));
        json = jsonMerge(json, new JSONObject(this.sC));
        json = jsonMerge(json, new JSONObject(this.sD));
        json = jsonMerge(json, new JSONObject(this.sE));
        json = jsonMerge(json, new JSONObject(this.sF));
        json = jsonMerge(json, new JSONObject(this.sG));*/

        json.put(singleForm.COLUMN_SA, this.sA == null ? JSONObject.NULL : this.sA);
        json.put(singleForm.COLUMN_SB, this.sB == null ? JSONObject.NULL : this.sB);
        json.put(singleForm.COLUMN_SB, this.sB == null ? JSONObject.NULL : this.sB);
        json.put(singleForm.COLUMN_SC, this.sC == null ? JSONObject.NULL : this.sC);
        json.put(singleForm.COLUMN_SD, this.sD == null ? JSONObject.NULL : this.sD);
        json.put(singleForm.COLUMN_SE, this.sE == null ? JSONObject.NULL : this.sE);
        json.put(singleForm.COLUMN_SF, this.sF == null ? JSONObject.NULL : this.sF);
        json.put(singleForm.COLUMN_SG, this.sG == null ? JSONObject.NULL : this.sG);

        return json;
    }

    public JSONObject jsonMerge(JSONObject o1, JSONObject o2) throws JSONException {

        JSONObject jm = new JSONObject();

        //I assume that your two JSONObjects are o1 and o2
        JSONObject mergedObj = new JSONObject();

        Iterator i1 = o1.keys();
        Iterator i2 = o2.keys();
        String tmp_key;
        while (i1.hasNext()) {
            tmp_key = (String) i1.next();
            mergedObj.put(tmp_key, o1.get(tmp_key));
        }
        while (i2.hasNext()) {
            tmp_key = (String) i2.next();
            mergedObj.put(tmp_key, o2.get(tmp_key));
        }

        return mergedObj;
    }

    public static abstract class singleForm implements BaseColumns {

        public static final String TABLE_NAME = "forms";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String _ID = "_id";
        public static final String COLUMN_UID = "uid";
        public static final String COLUMN_PROJECT_NAME = "projectname";
        public static final String COLUMN_SURVEY_TYPE = "surveytype";
        public static final String COLUMN_DEVICE_ID = "deviceid";
        public static final String COLUMN_GPS_LAT = "gpslat";
        public static final String COLUMN_GPS_LNG = "gpslng";
        public static final String COLUMN_GPS_ACC = "gpsacc";
        public static final String COLUMN_GPS_TIME = "gpstime";
        public static final String COLUMN_SYNCED = "sync";
        public static final String COLUMN_SYNCED_DATE = "sync_date";
        public static final String COLUMN_MNA1 = "mna1";
        public static final String COLUMN_MNA2 = "mna2";
        public static final String COLUMN_MNA3 = "hFacility";
        public static final String COLUMN_MNA4 = "lhwCode";
        public static final String COLUMN_MNA5 = "houseHold";
        public static final String COLUMN_MNA6 = "childId";
        public static final String COLUMN_MNA6A = "mna6a";
        public static final String COLUMN_MNA7 = "iStatus";
        public static final String COLUMN_SA = "sa";
        public static final String COLUMN_SB = "sb";
        public static final String COLUMN_SC = "sc";
        public static final String COLUMN_SD = "sd";
        public static final String COLUMN_SE = "se";
        public static final String COLUMN_SF = "sf";
        public static final String COLUMN_SG = "sg";
    }
}


