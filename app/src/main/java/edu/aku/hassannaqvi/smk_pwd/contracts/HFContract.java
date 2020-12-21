package edu.aku.hassannaqvi.smk_pwd.contracts;


import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

public class HFContract {

    private static final String TAG = "HF_CONTRACT";
    String province;
    String pro_id;
    String district;
    String dist_id;
    String tehsil;
    String tehsil_id;
    String uc_name;
    String uc_id;
    String hf_name;
    String hfcode;

    public HFContract() {
        // Default Constructor
    }

    public HFContract Sync(JSONObject jsonObject) throws JSONException {
        this.province = jsonObject.getString(singleHF.COLUMN_PROVINCE);
        this.pro_id = jsonObject.getString(singleHF.COLUMN_PRO_ID);
        this.district = jsonObject.getString(singleHF.COLUMN_DISTRICT);
        this.dist_id = jsonObject.getString(singleHF.COLUMN_DIST_ID);
        this.tehsil = jsonObject.getString(singleHF.COLUMN_TEHSIL);
        this.tehsil_id = jsonObject.getString(singleHF.COLUMN_TEHSIL_ID);
        this.uc_name = jsonObject.getString(singleHF.COLUMN_UC_NAME);
        this.uc_id = jsonObject.getString(singleHF.COLUMN_UC_ID);
        this.hf_name = jsonObject.getString(singleHF.COLUMN_HF_NAME);
        this.hfcode = jsonObject.getString(singleHF.COLUMN_HFCODE);
        return this;
    }

    public HFContract HydrateHF(Cursor cursor) {
        this.province = cursor.getString(cursor.getColumnIndex(singleHF.COLUMN_PROVINCE));
        this.pro_id = cursor.getString(cursor.getColumnIndex(singleHF.COLUMN_PRO_ID));
        this.district = cursor.getString(cursor.getColumnIndex(singleHF.COLUMN_DISTRICT));
        this.dist_id = cursor.getString(cursor.getColumnIndex(singleHF.COLUMN_DIST_ID));
        this.tehsil = cursor.getString(cursor.getColumnIndex(singleHF.COLUMN_TEHSIL));
        this.tehsil_id = cursor.getString(cursor.getColumnIndex(singleHF.COLUMN_TEHSIL_ID));
        this.uc_name = cursor.getString(cursor.getColumnIndex(singleHF.COLUMN_UC_NAME));
        this.uc_id = cursor.getString(cursor.getColumnIndex(singleHF.COLUMN_UC_ID));
        this.hf_name = cursor.getString(cursor.getColumnIndex(singleHF.COLUMN_HF_NAME));
        this.hfcode = cursor.getString(cursor.getColumnIndex(singleHF.COLUMN_HFCODE));
        return this;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }


    public String getPro_id() {
        return pro_id;
    }

    public void setPro_id(String pro_id) {
        this.pro_id = pro_id;
    }


    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }


    public String getDist_id() {
        return dist_id;
    }

    public void setDist_id(String dist_id) {
        this.dist_id = dist_id;
    }


    public String getTehsil() {
        return tehsil;
    }

    public void setTehsil(String tehsil) {
        this.tehsil = tehsil;
    }


    public String getTehsil_id() {
        return tehsil_id;
    }

    public void setTehsil_id(String tehsil_id) {
        this.tehsil_id = tehsil_id;
    }


    public String getUc_name() {
        return uc_name;
    }

    public void setUc_name(String uc_name) {
        this.uc_name = uc_name;
    }


    public String getUc_id() {
        return uc_id;
    }

    public void setUc_id(String uc_id) {
        this.uc_id = uc_id;
    }


    public String getHf_name() {
        return hf_name;
    }

    public void setHf_name(String hf_name) {
        this.hf_name = hf_name;
    }


    public String getHfcode() {
        return hfcode;
    }

    public void setHfcode(String hfcode) {
        this.hfcode = hfcode;
    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();
        json.put(singleHF.COLUMN_PROVINCE, this.province == null ? JSONObject.NULL : this.province);
        json.put(singleHF.COLUMN_PRO_ID, this.pro_id == null ? JSONObject.NULL : this.pro_id);
        json.put(singleHF.COLUMN_DISTRICT, this.district == null ? JSONObject.NULL : this.district);
        json.put(singleHF.COLUMN_DIST_ID, this.dist_id == null ? JSONObject.NULL : this.dist_id);
        json.put(singleHF.COLUMN_TEHSIL, this.tehsil == null ? JSONObject.NULL : this.tehsil);
        json.put(singleHF.COLUMN_TEHSIL_ID, this.tehsil_id == null ? JSONObject.NULL : this.tehsil_id);
        json.put(singleHF.COLUMN_UC_NAME, this.uc_name == null ? JSONObject.NULL : this.uc_name);
        json.put(singleHF.COLUMN_UC_ID, this.uc_id == null ? JSONObject.NULL : this.uc_id);
        json.put(singleHF.COLUMN_HF_NAME, this.hf_name == null ? JSONObject.NULL : this.hf_name);
        json.put(singleHF.COLUMN_HFCODE, this.hfcode == null ? JSONObject.NULL : this.hfcode);
        return json;
    }


    public static abstract class singleHF implements BaseColumns {
        public static final String _ID = "_id";
        public static final String TABLE_NAME = "healthfacilities";
        public static final String COLUMN_PROVINCE = "province";
        public static final String COLUMN_PRO_ID = "pro_id";
        public static final String COLUMN_DISTRICT = "district";
        public static final String COLUMN_DIST_ID = "dist_id";
        public static final String COLUMN_TEHSIL = "tehsil";
        public static final String COLUMN_TEHSIL_ID = "tehsil_id";
        public static final String COLUMN_UC_NAME = "uc_name";
        public static final String COLUMN_UC_ID = "uc_id";
        public static final String COLUMN_HF_NAME = "hf_name";
        public static final String COLUMN_HFCODE = "hfcode";

        public static final String _URI = "healthfacilities.php";
    }
}