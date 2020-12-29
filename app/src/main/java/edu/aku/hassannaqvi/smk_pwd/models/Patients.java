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

    private String sG = "";

    private String ga01 = "";
    private String ga02d = "";
    private String ga02m = "";
    private String ga02y = "";
    private String ga02h = "";
    private String ga02mi = "";
    private String ga02s = "";
    private String ga03 = "";
    private String ga04 = "";
    private String ga05 = "";
    private String ga06y = "";
    private String ga06m = "";
    private String ga07 = "";
    private String ga08a = "";
    private String ga08b = "";
    private String ga08c = "";
    private String ga08d = "";
    private String ga08e = "";
    private String ga08f = "";
    private String ga09 = "";
    private String ga09bx = "";
    private String ga09cx = "";
    private String ga10 = "";
    private String ga10bx = "";
    private String ga10cx = "";
    private String ga11 = "";
    private String ga11ax = "";
    private String ga11bx = "";
    private String ga12 = "";
    private String ga13 = "";
    private String ga14 = "";
    private String ga14ax = "";
    private String ga14bx = "";
    private String ga14cx = "";
    private String ga15 = "";
    private String ga1596x = "";
    private String ga16 = "";

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


    public String getsG() {
        return sG;
    }

    public void setsG(String sG) {
        this.sG = sG;
    }

    public String getGa01() {
        return ga01;
    }

    public void setGa01(String ga01) {
        this.ga01 = ga01;
    }

    public String getGa02d() {
        return ga02d;
    }

    public void setGa02d(String ga02d) {
        this.ga02d = ga02d;
    }

    public String getGa02m() {
        return ga02m;
    }

    public void setGa02m(String ga02m) {
        this.ga02m = ga02m;
    }

    public String getGa02y() {
        return ga02y;
    }

    public void setGa02y(String ga02y) {
        this.ga02y = ga02y;
    }

    public String getGa02h() {
        return ga02h;
    }

    public void setGa02h(String ga02h) {
        this.ga02h = ga02h;
    }

    public String getGa02mi() {
        return ga02mi;
    }

    public void setGa02mi(String ga02mi) {
        this.ga02mi = ga02mi;
    }

    public String getGa02s() {
        return ga02s;
    }

    public void setGa02s(String ga02s) {
        this.ga02s = ga02s;
    }

    public String getGa03() {
        return ga03;
    }

    public void setGa03(String ga03) {
        this.ga03 = ga03;
    }

    public String getGa04() {
        return ga04;
    }

    public void setGa04(String ga04) {
        this.ga04 = ga04;
    }

    public String getGa05() {
        return ga05;
    }

    public void setGa05(String ga05) {
        this.ga05 = ga05;
    }

    public String getGa06y() {
        return ga06y;
    }

    public void setGa06y(String ga06y) {
        this.ga06y = ga06y;
    }

    public String getGa06m() {
        return ga06m;
    }

    public void setGa06m(String ga06m) {
        this.ga06m = ga06m;
    }

    public String getGa07() {
        return ga07;
    }

    public void setGa07(String ga07) {
        this.ga07 = ga07;
    }

    public String getGa08a() {
        return ga08a;
    }

    public void setGa08a(String ga08a) {
        this.ga08a = ga08a;
    }

    public String getGa08b() {
        return ga08b;
    }

    public void setGa08b(String ga08b) {
        this.ga08b = ga08b;
    }

    public String getGa08c() {
        return ga08c;
    }

    public void setGa08c(String ga08c) {
        this.ga08c = ga08c;
    }

    public String getGa08d() {
        return ga08d;
    }

    public void setGa08d(String ga08d) {
        this.ga08d = ga08d;
    }

    public String getGa08e() {
        return ga08e;
    }

    public void setGa08e(String ga08e) {
        this.ga08e = ga08e;
    }

    public String getGa08f() {
        return ga08f;
    }

    public void setGa08f(String ga08f) {
        this.ga08f = ga08f;
    }

    public String getGa09() {
        return ga09;
    }

    public void setGa09(String ga09) {
        this.ga09 = ga09;
    }

    public String getGa09bx() {
        return ga09bx;
    }

    public void setGa09bx(String ga09bx) {
        this.ga09bx = ga09bx;
    }

    public String getGa09cx() {
        return ga09cx;
    }

    public void setGa09cx(String ga09cx) {
        this.ga09cx = ga09cx;
    }

    public String getGa10() {
        return ga10;
    }

    public void setGa10(String ga10) {
        this.ga10 = ga10;
    }

    public String getGa10bx() {
        return ga10bx;
    }

    public void setGa10bx(String ga10bx) {
        this.ga10bx = ga10bx;
    }

    public String getGa10cx() {
        return ga10cx;
    }

    public void setGa10cx(String ga10cx) {
        this.ga10cx = ga10cx;
    }

    public String getGa11() {
        return ga11;
    }

    public void setGa11(String ga11) {
        this.ga11 = ga11;
    }

    public String getGa11ax() {
        return ga11ax;
    }

    public void setGa11ax(String ga11ax) {
        this.ga11ax = ga11ax;
    }

    public String getGa11bx() {
        return ga11bx;
    }

    public void setGa11bx(String ga11bx) {
        this.ga11bx = ga11bx;
    }

    public String getGa12() {
        return ga12;
    }

    public void setGa12(String ga12) {
        this.ga12 = ga12;
    }

    public String getGa13() {
        return ga13;
    }

    public void setGa13(String ga13) {
        this.ga13 = ga13;
    }

    public String getGa14() {
        return ga14;
    }

    public void setGa14(String ga14) {
        this.ga14 = ga14;
    }

    public String getGa14ax() {
        return ga14ax;
    }

    public void setGa14ax(String ga14ax) {
        this.ga14ax = ga14ax;
    }

    public String getGa14bx() {
        return ga14bx;
    }

    public void setGa14bx(String ga14bx) {
        this.ga14bx = ga14bx;
    }

    public String getGa14cx() {
        return ga14cx;
    }

    public void setGa14cx(String ga14cx) {
        this.ga14cx = ga14cx;
    }

    public String getGa15() {
        return ga15;
    }

    public void setGa15(String ga15) {
        this.ga15 = ga15;
    }

    public String getGa1596x() {
        return ga1596x;
    }

    public void setGa1596x(String ga1596x) {
        this.ga1596x = ga1596x;
    }

    public String getGa16() {
        return ga16;
    }

    public void setGa16(String ga16) {
        this.ga16 = ga16;
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

        this.sG = jsonObject.getString(PatientsContract.PatientsTable.COLUMN_SG);

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

        sGHydrate(cursor.getString(cursor.getColumnIndex(PatientsContract.PatientsTable.COLUMN_SG)));

        return this;
    }


    //TODO: Try this instead of toJSONObject
    @Override
    public String toString() {
        return new GsonBuilder().create().toJson(this, Patients.class);
    }


    public String sGtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("ga01", ga01)
                    .put("ga02d", ga02d)
                    .put("ga02m", ga02m)
                    .put("ga02y", ga02y)
                    .put("ga02h", ga02h)
                    .put("ga02mi", ga02mi)
                    .put("ga02s", ga02s)
                    .put("ga03", ga03)
                    .put("ga04", ga04)
                    .put("ga05", ga05)
                    .put("ga06y", ga06y)
                    .put("ga06m", ga06m)
                    .put("ga07", ga07)
                    .put("ga08a", ga08a)
                    .put("ga08b", ga08b)
                    .put("ga08c", ga08c)
                    .put("ga08d", ga08d)
                    .put("ga08e", ga08e)
                    .put("ga08f", ga08f)
                    .put("ga09", ga09)
                    .put("ga09bx", ga09bx)
                    .put("ga09cx", ga09cx)
                    .put("ga10", ga10)
                    .put("ga10bx", ga10bx)
                    .put("ga10cx", ga10cx)
                    .put("ga11", ga11)
                    .put("ga11ax", ga11ax)
                    .put("ga11bx", ga11bx)
                    .put("ga12", ga12)
                    .put("ga13", ga13)
                    .put("ga14", ga14)
                    .put("ga14ax", ga14ax)
                    .put("ga14bx", ga14bx)
                    .put("ga14cx", ga14cx)
                    .put("ga15", ga15)
                    .put("ga1596x", ga1596x)
                    .put("ga16", ga16);
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

            json.put(PatientsContract.PatientsTable.COLUMN_SG, new JSONObject(sGtoString()));

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

            if (this.sG != null && !this.sG.equals("")) {
                json.put(PatientsContract.PatientsTable.COLUMN_SG, new JSONObject(this.sG));
            }

            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }


    private void sGHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);
                this.ga01 = json.getString("ga01");
                this.ga02d = json.getString("ga02d");
                this.ga02m = json.getString("ga02m");
                this.ga02y = json.getString("ga02y");
                this.ga02h = json.getString("ga02h");
                this.ga02mi = json.getString("ga02mi");
                this.ga02s = json.getString("ga02s");
                this.ga03 = json.getString("ga03");
                this.ga04 = json.getString("ga04");
                this.ga05 = json.getString("ga05");
                this.ga06y = json.getString("ga06y");
                this.ga06m = json.getString("ga06m");
                this.ga07 = json.getString("ga07");
                this.ga08a = json.getString("ga08a");
                this.ga08b = json.getString("ga08b");
                this.ga08c = json.getString("ga08c");
                this.ga08d = json.getString("ga08d");
                this.ga08e = json.getString("ga08e");
                this.ga08f = json.getString("ga08f");
                this.ga09 = json.getString("ga09");
                this.ga09bx = json.getString("ga09bx");
                this.ga09cx = json.getString("ga09cx");
                this.ga10 = json.getString("ga10");
                this.ga10bx = json.getString("ga10bx");
                this.ga10cx = json.getString("ga10cx");
                this.ga11 = json.getString("ga11");
                this.ga11ax = json.getString("ga11ax");
                this.ga11bx = json.getString("ga11bx");
                this.ga12 = json.getString("ga12");
                this.ga13 = json.getString("ga13");
                this.ga14 = json.getString("ga14");
                this.ga14ax = json.getString("ga14ax");
                this.ga14bx = json.getString("ga14bx");
                this.ga14cx = json.getString("ga14cx");
                this.ga15 = json.getString("ga15");
                this.ga1596x = json.getString("ga1596x");
                this.ga16 = json.getString("ga16");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


}
