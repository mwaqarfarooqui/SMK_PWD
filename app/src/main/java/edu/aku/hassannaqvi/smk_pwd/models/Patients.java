package edu.aku.hassannaqvi.smk_pwd.models;


import android.database.Cursor;

import androidx.lifecycle.LiveData;

import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.smk_pwd.contracts.PatientsContract;


public class Patients extends LiveData<Patients> {

    private final String projectName = "smkPwd";

    private String _ID = "";
    private String _UID = "";
    private String _UUID = "";
    private String sysdate = "";
    private String username = ""; // Interviewer
    private String serialno = "";
    private String status = "";
    private String deviceID = "";
    private String devicetagID = "";
    private String synced = "";
    private String synced_date = "";
    private String appversion = "";

    private String province = "";
    private String provinceCode = "";
    private String district = "";
    private String districtCode = "";
    private String tehsil = "";
    private String tehsilCode = "";
    private String uc = "";
    private String ucCode = "";
    private String hf = "";
    private String hfCode = "";

    private String sI = "";

    private String ia01 = "";
    private String ia02 = "";
    private String ia03 = "";
    private String ia04 = "";
    private String ia05 = "";
    private String ia06 = "";
    private String ia07 = "";
    private String ib01 = "";
    private String ib01dx = "";
    private String ib01ex = "";
    private String ib02 = "";
    private String ib02dx = "";
    private String ib02ex = "";
    private String ib03 = "";
    private String ib03dx = "";
    private String ib03ex = "";
    private String ib04 = "";
    private String ib04dx = "";
    private String ib04ex = "";
    private String ib05 = "";
    private String ib05dx = "";
    private String ib05ex = "";
    private String ib06 = "";
    private String ib06dx = "";
    private String ib06ex = "";
    private String ib07 = "";
    private String ib07dx = "";
    private String ib07ex = "";
    private String ib08 = "";
    private String ib08dx = "";
    private String ib08ex = "";
    private String ic01 = "";
    private String ic02 = "";
    private String ic03 = "";
    private String ic04 = "";
    private String ic05 = "";
    private String ic06 = "";
    private String ic07 = "";
    private String ic08 = "";

    public Patients() {
    }


    public String getProjectName() {
        return projectName;
    }


    public String get_ID() {
        return _ID;
    }

    public void set_ID(String _ID) {
        this._ID = _ID;
    }


    public String get_UID() {
        return _UID;
    }

    public void set_UID(String _UID) {
        this._UID = _UID;
    }


    public String get_UUID() {
        return _UUID;
    }

    public void set_UUID(String _UUID) {
        this._UUID = _UUID;
    }


    public String getSysdate() {
        return sysdate;
    }

    public void setSysdate(String sysdate) {
        this.sysdate = sysdate;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getSerialno() {
        return serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }


    public String getDevicetagID() {
        return devicetagID;
    }

    public void setDevicetagID(String devicetagID) {
        this.devicetagID = devicetagID;
    }


    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }


    public String getSynced_date() {
        return synced_date;
    }

    public void setSynced_date(String synced_date) {
        this.synced_date = synced_date;
    }


    public String getAppversion() {
        return appversion;
    }

    public void setAppversion(String appversion) {
        this.appversion = appversion;
    }


    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }


    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }


    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }


    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }


    public String getTehsil() {
        return tehsil;
    }

    public void setTehsil(String tehsil) {
        this.tehsil = tehsil;
    }


    public String getTehsilCode() {
        return tehsilCode;
    }

    public void setTehsilCode(String tehsilCode) {
        this.tehsilCode = tehsilCode;
    }


    public String getUc() {
        return uc;
    }

    public void setUc(String uc) {
        this.uc = uc;
    }


    public String getUcCode() {
        return ucCode;
    }

    public void setUcCode(String ucCode) {
        this.ucCode = ucCode;
    }


    public String getHf() {
        return hf;
    }

    public void setHf(String hf) {
        this.hf = hf;
    }


    public String getHfCode() {
        return hfCode;
    }

    public void setHfCode(String hfCode) {
        this.hfCode = hfCode;
    }


    public String getsI() {
        return sI;
    }

    public void setsI(String sI) {
        this.sI = sI;
    }


    public String getIa01() {
        return ia01;
    }

    public void setIa01(String ia01) {
        this.ia01 = ia01;
    }

    public String getIa02() {
        return ia02;
    }

    public void setIa02(String ia02) {
        this.ia02 = ia02;
    }

    public String getIa03() {
        return ia03;
    }

    public void setIa03(String ia03) {
        this.ia03 = ia03;
    }

    public String getIa04() {
        return ia04;
    }

    public void setIa04(String ia04) {
        this.ia04 = ia04;
    }

    public String getIa05() {
        return ia05;
    }

    public void setIa05(String ia05) {
        this.ia05 = ia05;
    }

    public String getIa06() {
        return ia06;
    }

    public void setIa06(String ia06) {
        this.ia06 = ia06;
    }

    public String getIa07() {
        return ia07;
    }

    public void setIa07(String ia07) {
        this.ia07 = ia07;
    }

    public String getIb01() {
        return ib01;
    }

    public void setIb01(String ib01) {
        this.ib01 = ib01;
    }

    public String getIb01dx() {
        return ib01dx;
    }

    public void setIb01dx(String ib01dx) {
        this.ib01dx = ib01dx;
    }

    public String getIb01ex() {
        return ib01ex;
    }

    public void setIb01ex(String ib01ex) {
        this.ib01ex = ib01ex;
    }

    public String getIb02() {
        return ib02;
    }

    public void setIb02(String ib02) {
        this.ib02 = ib02;
    }

    public String getIb02dx() {
        return ib02dx;
    }

    public void setIb02dx(String ib02dx) {
        this.ib02dx = ib02dx;
    }

    public String getIb02ex() {
        return ib02ex;
    }

    public void setIb02ex(String ib02ex) {
        this.ib02ex = ib02ex;
    }

    public String getIb03() {
        return ib03;
    }

    public void setIb03(String ib03) {
        this.ib03 = ib03;
    }

    public String getIb03dx() {
        return ib03dx;
    }

    public void setIb03dx(String ib03dx) {
        this.ib03dx = ib03dx;
    }

    public String getIb03ex() {
        return ib03ex;
    }

    public void setIb03ex(String ib03ex) {
        this.ib03ex = ib03ex;
    }

    public String getIb04() {
        return ib04;
    }

    public void setIb04(String ib04) {
        this.ib04 = ib04;
    }

    public String getIb04dx() {
        return ib04dx;
    }

    public void setIb04dx(String ib04dx) {
        this.ib04dx = ib04dx;
    }

    public String getIb04ex() {
        return ib04ex;
    }

    public void setIb04ex(String ib04ex) {
        this.ib04ex = ib04ex;
    }

    public String getIb05() {
        return ib05;
    }

    public void setIb05(String ib05) {
        this.ib05 = ib05;
    }

    public String getIb05dx() {
        return ib05dx;
    }

    public void setIb05dx(String ib05dx) {
        this.ib05dx = ib05dx;
    }

    public String getIb05ex() {
        return ib05ex;
    }

    public void setIb05ex(String ib05ex) {
        this.ib05ex = ib05ex;
    }

    public String getIb06() {
        return ib06;
    }

    public void setIb06(String ib06) {
        this.ib06 = ib06;
    }

    public String getIb06dx() {
        return ib06dx;
    }

    public void setIb06dx(String ib06dx) {
        this.ib06dx = ib06dx;
    }

    public String getIb06ex() {
        return ib06ex;
    }

    public void setIb06ex(String ib06ex) {
        this.ib06ex = ib06ex;
    }

    public String getIb07() {
        return ib07;
    }

    public void setIb07(String ib07) {
        this.ib07 = ib07;
    }

    public String getIb07dx() {
        return ib07dx;
    }

    public void setIb07dx(String ib07dx) {
        this.ib07dx = ib07dx;
    }

    public String getIb07ex() {
        return ib07ex;
    }

    public void setIb07ex(String ib07ex) {
        this.ib07ex = ib07ex;
    }

    public String getIb08() {
        return ib08;
    }

    public void setIb08(String ib08) {
        this.ib08 = ib08;
    }

    public String getIb08dx() {
        return ib08dx;
    }

    public void setIb08dx(String ib08dx) {
        this.ib08dx = ib08dx;
    }

    public String getIb08ex() {
        return ib08ex;
    }

    public void setIb08ex(String ib08ex) {
        this.ib08ex = ib08ex;
    }

    public String getIc01() {
        return ic01;
    }

    public void setIc01(String ic01) {
        this.ic01 = ic01;
    }

    public String getIc02() {
        return ic02;
    }

    public void setIc02(String ic02) {
        this.ic02 = ic02;
    }

    public String getIc03() {
        return ic03;
    }

    public void setIc03(String ic03) {
        this.ic03 = ic03;
    }

    public String getIc04() {
        return ic04;
    }

    public void setIc04(String ic04) {
        this.ic04 = ic04;
    }

    public String getIc05() {
        return ic05;
    }

    public void setIc05(String ic05) {
        this.ic05 = ic05;
    }

    public String getIc06() {
        return ic06;
    }

    public void setIc06(String ic06) {
        this.ic06 = ic06;
    }

    public String getIc07() {
        return ic07;
    }

    public void setIc07(String ic07) {
        this.ic07 = ic07;
    }

    public String getIc08() {
        return ic08;
    }

    public void setIc08(String ic08) {
        this.ic08 = ic08;
    }


    public Patients Sync(JSONObject jsonObject) throws JSONException {
        this._ID = jsonObject.getString(PatientsContract.PatientsTable.COLUMN_ID);
        this._UID = jsonObject.getString(PatientsContract.PatientsTable.COLUMN_UID);
        this._UUID = jsonObject.getString(PatientsContract.PatientsTable.COLUMN_UUID);
        this.sysdate = jsonObject.getString(PatientsContract.PatientsTable.COLUMN_SYSDATE);
        this.username = jsonObject.getString(PatientsContract.PatientsTable.COLUMN_USERNAME);
        this.serialno = jsonObject.getString(PatientsContract.PatientsTable.COLUMN_SERIALNO);

        this.status = jsonObject.getString(PatientsContract.PatientsTable.COLUMN_STATUS);

        this.deviceID = jsonObject.getString(PatientsContract.PatientsTable.COLUMN_DEVICEID);
        this.devicetagID = jsonObject.getString(PatientsContract.PatientsTable.COLUMN_DEVICETAGID);
        this.synced = jsonObject.getString(PatientsContract.PatientsTable.COLUMN_SYNCED);
        this.synced_date = jsonObject.getString(PatientsContract.PatientsTable.COLUMN_SYNCED_DATE);
        this.appversion = jsonObject.getString(PatientsContract.PatientsTable.COLUMN_SYNCED_DATE);

        this.province = jsonObject.getString(PatientsContract.PatientsTable.COLUMN_PROVINCE);
        this.provinceCode = jsonObject.getString(PatientsContract.PatientsTable.COLUMN_PROVINCE_CODE);
        this.district = jsonObject.getString(PatientsContract.PatientsTable.COLUMN_DISTRICT);
        this.districtCode = jsonObject.getString(PatientsContract.PatientsTable.COLUMN_DISTRICT_CODE);
        this.tehsil = jsonObject.getString(PatientsContract.PatientsTable.COLUMN_TEHSIL);
        this.tehsilCode = jsonObject.getString(PatientsContract.PatientsTable.COLUMN_TEHSIL_CODE);
        this.uc = jsonObject.getString(PatientsContract.PatientsTable.COLUMN_UC);
        this.ucCode = jsonObject.getString(PatientsContract.PatientsTable.COLUMN_UC_CODE);
        this.hf = jsonObject.getString(PatientsContract.PatientsTable.COLUMN_HF);
        this.hfCode = jsonObject.getString(PatientsContract.PatientsTable.COLUMN_HF_CODE);

        this.sI = jsonObject.getString(PatientsContract.PatientsTable.COLUMN_SI);

        return this;

    }


    public Patients Hydrate(Cursor cursor) {

        this._ID = cursor.getString(cursor.getColumnIndex(PatientsContract.PatientsTable.COLUMN_ID));
        this._UID = cursor.getString(cursor.getColumnIndex(PatientsContract.PatientsTable.COLUMN_UID));
        this._UUID = cursor.getString(cursor.getColumnIndex(PatientsContract.PatientsTable.COLUMN_UUID));
        this.sysdate = cursor.getString(cursor.getColumnIndex(PatientsContract.PatientsTable.COLUMN_SYSDATE));
        this.username = cursor.getString(cursor.getColumnIndex(PatientsContract.PatientsTable.COLUMN_USERNAME));
        this.serialno = cursor.getString(cursor.getColumnIndex(PatientsContract.PatientsTable.COLUMN_SERIALNO));


        this.deviceID = cursor.getString(cursor.getColumnIndex(PatientsContract.PatientsTable.COLUMN_DEVICEID));
        this.devicetagID = cursor.getString(cursor.getColumnIndex(PatientsContract.PatientsTable.COLUMN_DEVICETAGID));
        this.status = cursor.getString(cursor.getColumnIndex(PatientsContract.PatientsTable.COLUMN_STATUS));
        this.appversion = cursor.getString(cursor.getColumnIndex(PatientsContract.PatientsTable.COLUMN_APPVERSION));

        this.province = cursor.getString(cursor.getColumnIndex(PatientsContract.PatientsTable.COLUMN_PROVINCE));
        this.provinceCode = cursor.getString(cursor.getColumnIndex(PatientsContract.PatientsTable.COLUMN_PROVINCE_CODE));
        this.district = cursor.getString(cursor.getColumnIndex(PatientsContract.PatientsTable.COLUMN_DISTRICT));
        this.districtCode = cursor.getString(cursor.getColumnIndex(PatientsContract.PatientsTable.COLUMN_DISTRICT_CODE));
        this.tehsil = cursor.getString(cursor.getColumnIndex(PatientsContract.PatientsTable.COLUMN_TEHSIL));
        this.tehsilCode = cursor.getString(cursor.getColumnIndex(PatientsContract.PatientsTable.COLUMN_TEHSIL_CODE));
        this.uc = cursor.getString(cursor.getColumnIndex(PatientsContract.PatientsTable.COLUMN_UC));
        this.ucCode = cursor.getString(cursor.getColumnIndex(PatientsContract.PatientsTable.COLUMN_UC_CODE));
        this.hf = cursor.getString(cursor.getColumnIndex(PatientsContract.PatientsTable.COLUMN_HF));
        this.hfCode = cursor.getString(cursor.getColumnIndex(PatientsContract.PatientsTable.COLUMN_HF_CODE));

        sIHydrate(cursor.getString(cursor.getColumnIndex(PatientsContract.PatientsTable.COLUMN_SI)));

        return this;
    }


    //TODO: Try this instead of toJSONObject
    @Override
    public String toString() {
        return new GsonBuilder().create().toJson(this, Patients.class);
    }


    public String sItoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("ia01", ia01)
                    .put("ia02", ia02)
                    .put("ia03", ia03)
                    .put("ia04", ia04)
                    .put("ia05", ia05)
                    .put("ia06", ia06)
                    .put("ia07", ia07)
                    .put("ib01", ib01)
                    .put("ib01dx", ib01dx)
                    .put("ib01ex", ib01ex)
                    .put("ib02", ib02)
                    .put("ib02dx", ib02dx)
                    .put("ib02ex", ib02ex)
                    .put("ib03", ib03)
                    .put("ib03dx", ib03dx)
                    .put("ib03ex", ib03ex)
                    .put("ib04", ib04)
                    .put("ib04dx", ib04dx)
                    .put("ib04ex", ib04ex)
                    .put("ib05", ib05)
                    .put("ib05dx", ib05dx)
                    .put("ib05ex", ib05ex)
                    .put("ib06", ib06)
                    .put("ib06dx", ib06dx)
                    .put("ib06ex", ib06ex)
                    .put("ib07", ib07)
                    .put("ib07dx", ib07dx)
                    .put("ib07ex", ib07ex)
                    .put("ib08", ib08)
                    .put("ib08dx", ib08dx)
                    .put("ib08ex", ib08ex)
                    .put("ic01", ic01)
                    .put("ic02", ic02)
                    .put("ic03", ic03)
                    .put("ic04", ic04)
                    .put("ic05", ic05)
                    .put("ic06", ic06)
                    .put("ic07", ic07)
                    .put("ic08", ic08);
        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";

        }
        return json.toString();
    }


    public JSONObject toJSONObject() {

        JSONObject json = new JSONObject();

        try {
            json.put(PatientsContract.PatientsTable.COLUMN_ID, this._ID == null ? JSONObject.NULL : this._ID);

            json.put(PatientsContract.PatientsTable.COLUMN_UID, this._UID == null ? JSONObject.NULL : this._UID);
            json.put(PatientsContract.PatientsTable.COLUMN_UUID, this._UUID == null ? JSONObject.NULL : this._UUID);
            json.put(PatientsContract.PatientsTable.COLUMN_SYSDATE, this.sysdate == null ? JSONObject.NULL : this.sysdate);
            json.put(PatientsContract.PatientsTable.COLUMN_USERNAME, this.username == null ? JSONObject.NULL : this.username);
            json.put(PatientsContract.PatientsTable.COLUMN_SERIALNO, this.serialno == null ? JSONObject.NULL : this.serialno);
            json.put(PatientsContract.PatientsTable.COLUMN_STATUS, this.status == null ? JSONObject.NULL : this.status);

            json.put(PatientsContract.PatientsTable.COLUMN_SI, new JSONObject(sItoString()));

            json.put(PatientsContract.PatientsTable.COLUMN_DEVICEID, this.deviceID == null ? JSONObject.NULL : this.deviceID);
            json.put(PatientsContract.PatientsTable.COLUMN_DEVICETAGID, this.devicetagID == null ? JSONObject.NULL : this.devicetagID);
            json.put(PatientsContract.PatientsTable.COLUMN_APPVERSION, this.appversion == null ? JSONObject.NULL : this.appversion);
            json.put(PatientsContract.PatientsTable.COLUMN_PROVINCE, this.province == null ? JSONObject.NULL : this.province);
            json.put(PatientsContract.PatientsTable.COLUMN_PROVINCE_CODE, this.provinceCode == null ? JSONObject.NULL : this.provinceCode);
            json.put(PatientsContract.PatientsTable.COLUMN_DISTRICT, this.district == null ? JSONObject.NULL : this.district);
            json.put(PatientsContract.PatientsTable.COLUMN_DISTRICT_CODE, this.districtCode == null ? JSONObject.NULL : this.districtCode);
            json.put(PatientsContract.PatientsTable.COLUMN_TEHSIL, this.tehsil == null ? JSONObject.NULL : this.tehsil);
            json.put(PatientsContract.PatientsTable.COLUMN_TEHSIL_CODE, this.tehsilCode == null ? JSONObject.NULL : this.tehsilCode);
            json.put(PatientsContract.PatientsTable.COLUMN_UC, this.uc == null ? JSONObject.NULL : this.uc);
            json.put(PatientsContract.PatientsTable.COLUMN_UC_CODE, this.ucCode == null ? JSONObject.NULL : this.ucCode);
            json.put(PatientsContract.PatientsTable.COLUMN_HF, this.hf == null ? JSONObject.NULL : this.hf);
            json.put(PatientsContract.PatientsTable.COLUMN_HF_CODE, this.hfCode == null ? JSONObject.NULL : this.hfCode);

            if (this.sI != null && !this.sI.equals("")) {
                json.put(PatientsContract.PatientsTable.COLUMN_SI, new JSONObject(this.sI));
            }

            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }


    private void sIHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);
                this.ia01 = json.getString("ia01");
                this.ia02 = json.getString("ia02");
                this.ia03 = json.getString("ia03");
                this.ia04 = json.getString("ia04");
                this.ia05 = json.getString("ia05");
                this.ia06 = json.getString("ia06");
                this.ia07 = json.getString("ia07");
                this.ib01 = json.getString("ib01");
                this.ib01dx = json.getString("ib01dx");
                this.ib01ex = json.getString("ib01ex");
                this.ib02 = json.getString("ib02");
                this.ib02dx = json.getString("ib02dx");
                this.ib02ex = json.getString("ib02ex");
                this.ib03 = json.getString("ib03");
                this.ib03dx = json.getString("ib03dx");
                this.ib03ex = json.getString("ib03ex");
                this.ib04 = json.getString("ib04");
                this.ib04dx = json.getString("ib04dx");
                this.ib04ex = json.getString("ib04ex");
                this.ib05 = json.getString("ib05");
                this.ib05dx = json.getString("ib05dx");
                this.ib05ex = json.getString("ib05ex");
                this.ib06 = json.getString("ib06");
                this.ib06dx = json.getString("ib06dx");
                this.ib06ex = json.getString("ib06ex");
                this.ib07 = json.getString("ib07");
                this.ib07dx = json.getString("ib07dx");
                this.ib07ex = json.getString("ib07ex");
                this.ib08 = json.getString("ib08");
                this.ib08dx = json.getString("ib08dx");
                this.ib08ex = json.getString("ib08ex");
                this.ic01 = json.getString("ic01");
                this.ic02 = json.getString("ic02");
                this.ic03 = json.getString("ic03");
                this.ic04 = json.getString("ic04");
                this.ic05 = json.getString("ic05");
                this.ic06 = json.getString("ic06");
                this.ic07 = json.getString("ic07");
                this.ic08 = json.getString("ic08");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


}
