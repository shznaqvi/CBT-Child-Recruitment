package edu.aku.hassannaqvi.cbt_child_recruitment.contracts;


import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

public class IMsContract {

    private static final String TAG = "IM_CONTRACT";

    private Long _ID;
    private String UID;
    private String chid;
    private String im;
    private String tagId = "";

    public IMsContract() {
    }

    public static String getTAG() {

        return TAG;
    }

    public IMsContract sync(JSONObject jsonObject) throws JSONException {
        this._ID = jsonObject.getLong(singleIms._ID);
        this.UID = jsonObject.getString(singleIms.COLUMN_UID);
        this.chid = jsonObject.getString(singleIms.COLUMN_CHID);
        this.im = jsonObject.getString(singleIms.COLUMN_IM);
        this.tagId = jsonObject.getString(singleIms.COLUMN_DEVICETAGID);

        return this;
    }

    public IMsContract hydrate(Cursor cursor) {
        this._ID = cursor.getLong(cursor.getColumnIndex(singleIms._ID));
        this.UID = cursor.getString(cursor.getColumnIndex(singleIms.COLUMN_UID));
        this.chid = cursor.getString(cursor.getColumnIndex(singleIms.COLUMN_CHID));
        this.im = cursor.getString(cursor.getColumnIndex(singleIms.COLUMN_IM));
        this.im = cursor.getString(cursor.getColumnIndex(singleIms.COLUMN_DEVICETAGID));

        return this;
    }

    public Long getId() {
        return this._ID;
    }

    public void setId(String id) {
        this._ID = Long.valueOf(id);
    }

    public Long get_ID() {

        return _ID;
    }

    public void set_ID(Long _ID) {
        this._ID = _ID;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String getIM() {
        return this.im;
    }

    public void setIM(String im) {
        this.im = im;
    }

    public String getChid() {
        return this.chid;
    }

    public void setChid(String chid) {
        this.chid = chid;
    }

    public String getUID() {
        return this.UID;
    }

    public void setUID(String frmno) {
        this.UID = frmno;
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(singleIms._ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(singleIms.COLUMN_UID, this.UID == null ? JSONObject.NULL : this.UID);
        json.put(singleIms.COLUMN_CHID, this.chid == null ? JSONObject.NULL : this.chid);
        json.put(singleIms.COLUMN_IM, this.im == null ? JSONObject.NULL : this.im);
        json.put(singleIms.COLUMN_DEVICETAGID, this.tagId == null ? JSONObject.NULL : this.tagId);
        return json;
    }

    public static abstract class singleIms implements BaseColumns {

        public static final String TABLE_NAME = "Ims";
        public static final String _ID = "_ID";
        public static final String COLUMN_CHID = "CHID";
        public static final String COLUMN_UID = "UID";
        public static final String COLUMN_IM = "IM";
        public static final String COLUMN_DEVICETAGID = "tagId";

    }

}