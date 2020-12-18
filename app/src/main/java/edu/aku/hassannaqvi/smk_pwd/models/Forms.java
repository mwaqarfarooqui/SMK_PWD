package edu.aku.hassannaqvi.smk_pwd.models;


import android.database.Cursor;

import androidx.lifecycle.LiveData;

import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.smk_pwd.contracts.FormsContract.FormsTable;

public class Forms extends LiveData<Forms> {

    private final String projectName = "smkPwd";

    private String _ID = "";
    private String _UID = "";
    private String sysdate = "";
    private String username = ""; // Interviewer
    private String istatus = ""; // Interview Status
    private String istatus96x = ""; // Interview Status
    private String endingdatetime = "";
    private String gpsLat = "";
    private String gpsLng = "";
    private String gpsDT = "";
    private String gpsAcc = "";
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

    private String sB = "";
    private String sC = "";
    private String sD = "";
    private String sE = "";
    private String sF = "";
    private String sG = "";
    private String sH = "";
    private String sI = "";

    private String aa01d = "";
    private String aa01m = "";
    private String aa01y = "";
    private String aa02 = "";
    private String aa03 = "";
    private String aa04 = "";
    private String aa05 = "";
    private String aa06 = "";
    private String aa07 = "";
    private String aa08 = "";
    private String aa09 = "";
    private String aa10 = "";
    private String aa11 = "";
    private String aa12 = "";
    private String aa13 = "";
    private String aa14 = "";
    private String ba01a1 = "";
    private String ba01a2 = "";
    private String ba01a3 = "";
    private String ba01a4 = "";
    private String ba01a5 = "";
    private String ba01b1 = "";
    private String ba01b2 = "";
    private String ba01b3 = "";
    private String ba01b4 = "";
    private String ba01b5 = "";
    private String ba01c1 = "";
    private String ba01c2 = "";
    private String ba01c3 = "";
    private String ba01c4 = "";
    private String ba01c5 = "";
    private String ba01d1 = "";
    private String ba01d2 = "";
    private String ba01d3 = "";
    private String ba01d4 = "";
    private String ba01d5 = "";
    private String ba01e1 = "";
    private String ba01e2 = "";
    private String ba01e3 = "";
    private String ba01e4 = "";
    private String ba01e5 = "";
    private String ba01f1 = "";
    private String ba01f2 = "";
    private String ba01f3 = "";
    private String ba01f4 = "";
    private String ba01f5 = "";
    private String ba01g1 = "";
    private String ba01g2 = "";
    private String ba01g3 = "";
    private String ba01g4 = "";
    private String ba01g5 = "";
    private String ba01h1 = "";
    private String ba01h2 = "";
    private String ba01h3 = "";
    private String ba01h4 = "";
    private String ba01h5 = "";
    private String ca01 = "";
    private String ca02 = "";
    private String cb01 = "";
    private String cb02 = "";
    private String cb03 = "";
    private String cb04 = "";
    private String cb05 = "";
    private String cc01 = "";
    private String cc02 = "";
    private String cc03 = "";
    private String cc04 = "";
    private String cc05 = "";
    private String cc06 = "";
    private String cc07 = "";
    private String cc08 = "";
    private String cd01 = "";
    private String cd0211 = "";
    private String cd0211c = "";
    private String cd0212 = "";
    private String cd0212c = "";
    private String cd0221 = "";
    private String cd0221c = "";
    private String cd0222 = "";
    private String cd0222c = "";
    private String cd0231 = "";
    private String cd0231c = "";
    private String cd0232 = "";
    private String cd0232c = "";
    private String cd0241 = "";
    private String cd0241c = "";
    private String cd0242 = "";
    private String cd0242c = "";
    private String cd10 = "";
    private String cd11 = "";
    private String cd12 = "";
    private String cd13 = "";
    private String cd14 = "";
    private String cd15 = "";
    private String cd16 = "";
    private String cd17 = "";
    private String cd18 = "";
    private String cd19 = "";
    private String cd20 = "";
    private String ce01 = "";
    private String ce02 = "";
    private String ce03 = "";
    private String ce04 = "";
    private String ce05 = "";
    private String ce06 = "";
    private String ce07 = "";
    private String ce08 = "";
    private String ce08a = "";
    private String ce08b = "";
    private String ce08c = "";
    private String ce08e = "";
    private String ce08d = "";
    private String ce08f = "";
    private String ce08g = "";
    private String ce08h = "";
    private String ce08i = "";
    private String cf01 = "";
    private String cf0196x = "";
    private String cf02 = "";
    private String cf0296x = "";
    private String cf03 = "";
    private String cf04 = "";
    private String cf05 = "";
    private String cf06 = "";
    private String cg01 = "";
    private String cg02f = "";
    private String cg03 = "";
    private String cg04f = "";
    private String cg05 = "";
    private String cg06f = "";
    private String cg07 = "";
    private String cg08f = "";
    private String cg09 = "";
    private String cg10f = "";
    private String cg11 = "";
    private String cg12f = "";
    private String cg13 = "";
    private String cg14f = "";
    private String cg15 = "";
    private String cg16f = "";
    private String cg17 = "";
    private String cg18f = "";
    private String cg19 = "";
    private String cg20f = "";
    private String cg21 = "";
    private String cg22f = "";
    private String cg23 = "";
    private String cg24f = "";
    private String cg25 = "";
    private String cg26f = "";
    private String cg27 = "";
    private String cg28f = "";
    private String cg29 = "";
    private String cg30f = "";
    private String cg31 = "";
    private String cg32f = "";
    private String cg33 = "";
    private String cg34f = "";
    private String cg35 = "";
    private String cg36f = "";
    private String cg37 = "";
    private String cg38f = "";
    private String cg39 = "";
    private String cg40f = "";
    private String cg41 = "";
    private String cg42f = "";
    private String cg43 = "";
    private String cg44f = "";
    private String cg45 = "";
    private String cg46f = "";
    private String da01 = "";
    private String da02 = "";
    private String da03 = "";
    private String da04 = "";
    private String da05 = "";
    private String da06 = "";
    private String da07 = "";
    private String da08 = "";
    private String da09 = "";
    private String da10 = "";
    private String da11 = "";
    private String da12 = "";
    private String da13 = "";
    private String da14 = "";
    private String da15 = "";
    private String da16 = "";
    private String da17 = "";
    private String da18 = "";
    private String da1896x = "";
    private String da1911 = "";
    private String da1912 = "";
    private String da1921 = "";
    private String da1922 = "";
    private String da1931 = "";
    private String da1932 = "";
    private String da1941 = "";
    private String da1942 = "";
    private String da1951 = "";
    private String da1952 = "";
    private String da2011 = "";
    private String da2012 = "";
    private String da2021 = "";
    private String da2022 = "";
    private String da2031 = "";
    private String da2032 = "";
    private String da2041 = "";
    private String da2042 = "";
    private String da2051 = "";
    private String da2052 = "";
    private String da2061 = "";
    private String da2062 = "";
    private String da2071 = "";
    private String da2072 = "";
    private String da2111 = "";
    private String da2112 = "";
    private String da2121 = "";
    private String da2122 = "";
    private String da2131 = "";
    private String da2132 = "";
    private String da2141 = "";
    private String da2142 = "";
    private String da2211 = "";
    private String da2212 = "";
    private String da2221 = "";
    private String da2222 = "";
    private String da2231 = "";
    private String da2232 = "";
    private String da2241 = "";
    private String da2242 = "";
    private String da2251 = "";
    private String da2252 = "";
    private String da2261 = "";
    private String da2262 = "";
    private String da2271 = "";
    private String da2272 = "";
    private String da2281 = "";
    private String da2282 = "";

    private String da2311 = "";
    private String da2312 = "";
    private String da2321 = "";
    private String da2322 = "";
    private String da2331 = "";
    private String da2332 = "";
    private String da2341 = "";
    private String da2342 = "";

    private String da2411 = "";
    private String da2412 = "";
    private String da2421 = "";
    private String da2422 = "";
    private String da2431 = "";
    private String da2432 = "";
    private String da2441 = "";
    private String da2442 = "";
    private String da2451 = "";
    private String da2452 = "";
    private String da2461 = "";
    private String da2462 = "";
    private String da2471 = "";
    private String da2472 = "";
    private String da2481 = "";
    private String da2482 = "";

    private String db01 = "";
    private String db02 = "";
    private String db03 = "";
    private String db04 = "";
    private String db05 = "";
    private String db06 = "";
    private String db07 = "";
    private String db08 = "";
    private String db09 = "";
    private String db10 = "";
    private String db11 = "";
    private String db12 = "";
    private String db13 = "";
    private String db14 = "";
    private String db15 = "";
    private String db16 = "";
    private String db1696x = "";
    private String ea01 = "";
    private String ea0196x = "";
    private String ea02 = "";
    private String ea03 = "";
    private String ea0396x = "";
    private String ea04 = "";
    private String ea05d = "";
    private String ea05m = "";
    private String ea06 = "";
    private String ea0696x = "";
    private String ea07 = "";
    private String ea0796x = "";
    private String ea08 = "";
    private String ea09d = "";
    private String ea09m = "";
    private String ea10 = "";
    private String ea11 = "";
    private String ea12 = "";
    private String ea13 = "";
    private String ea14 = "";
    private String eb01 = "";
    private String eb02 = "";
    private String eb03 = "";
    private String eb03t = "";
    private String eb04 = "";
    private String eb05 = "";
    private String eb06 = "";
    private String eb07 = "";
    private String eb08 = "";
    private String eb08a = "";
    private String eb08b = "";
    private String eb08c = "";
    private String eb08d = "";
    private String eb0896 = "";
    private String eb0896x = "";
    private String ec01a = "";
    private String ec02d = "";
    private String ec02m = "";
    private String ec03a = "";
    private String ec04d = "";
    private String ec04m = "";
    private String ec05a = "";
    private String ec06d = "";
    private String ec06m = "";
    private String ec07a = "";
    private String ec08d = "";
    private String ec08m = "";
    private String ec09a = "";
    private String ec10d = "";
    private String ec10m = "";
    private String ec11a = "";
    private String ec12d = "";
    private String ec12m = "";
    private String fam1m = "";
    private String fam1y = "";
    private String fam2m = "";
    private String fam2y = "";
    private String fam3m = "";
    private String fam3y = "";
    private String fb01 = "";
    private String fb02 = "";
    private String fb03 = "";
    private String fb04 = "";
    private String fc01m1 = "";
    private String fc01m2 = "";
    private String fc01m3 = "";
    private String fc01a = "";
    private String fc02m1 = "";
    private String fc02m2 = "";
    private String fc02m3 = "";
    private String fc02a = "";
    private String fc03m1 = "";
    private String fc03m2 = "";
    private String fc03m3 = "";
    private String fc03a = "";
    private String fc04m1 = "";
    private String fc04m2 = "";
    private String fc04m3 = "";
    private String fc04a = "";
    private String fc05m1 = "";
    private String fc05m2 = "";
    private String fc05m3 = "";
    private String fc05a = "";
    private String fc06m1 = "";
    private String fc06m2 = "";
    private String fc06m3 = "";
    private String fc06a = "";
    private String fc07m1 = "";
    private String fc07m2 = "";
    private String fc07m3 = "";
    private String fc07a = "";
    private String fc08m1 = "";
    private String fc08m2 = "";
    private String fc08m3 = "";
    private String fc08a = "";
    private String fc09m1 = "";
    private String fc09m2 = "";
    private String fc09m3 = "";
    private String fc09a = "";
    private String fc10m1 = "";
    private String fc10m2 = "";
    private String fc10m3 = "";
    private String fc10a = "";
    private String fc11m1 = "";
    private String fc11m2 = "";
    private String fc11m3 = "";
    private String fc11a = "";
    private String fc12m1 = "";
    private String fc12m2 = "";
    private String fc12m3 = "";
    private String fc12a = "";
    private String fc13m1 = "";
    private String fc13m2 = "";
    private String fc13m3 = "";
    private String fc13a = "";
    private String fc14m1 = "";
    private String fc14m2 = "";
    private String fc14m3 = "";
    private String fc14a = "";
    private String fd01 = "";
    private String fd0196x = "";
    private String fe01 = "";
    private String fe0196x = "";
    private String ff01 = "";
    private String ff02d = "";
    private String ff03 = "";
    private String ff04 = "";
    private String ff05 = "";
    private String ff06 = "";
    private String fg01 = "";
    private String fg02 = "";
    private String fg03 = "";
    private String fg04 = "";
    private String fg05 = "";
    private String fh01 = "";
    private String fh02 = "";
    private String fh03 = "";
    private String fh04 = "";
    private String fh05 = "";
    private String fh06 = "";
    private String fh07 = "";
    private String fi01 = "";
    private String fi02 = "";
    private String fj01 = "";
    private String fj02 = "";
    private String fj03 = "";
    private String fk01 = "";
    private String fk02 = "";
    private String fk03 = "";
    private String fl01 = "";
    private String fl02 = "";
    private String fl03 = "";
    private String fl04 = "";
    private String fl05 = "";
    private String fl06 = "";
    private String fm01 = "";
    private String fm02 = "";
    private String fm03 = "";
    private String fm04 = "";
    private String fm05 = "";
    private String fm06 = "";
    private String fm07 = "";
    private String fm08 = "";
    private String fn01 = "";
    private String fn02 = "";
    private String fn03 = "";
    private String fo01a = "";
    private String fo01b = "";
    private String fo02a = "";
    private String fo02b = "";
    private String fo03a = "";
    private String fo03b = "";
    private String fo04a = "";
    private String fo04b = "";
    private String fo05a = "";
    private String fo05b = "";
    private String fp01a = "";
    private String fp01b = "";
    private String fp01c = "";
    private String fp01dd = "";
    private String fp01dm = "";
    private String fp02a = "";
    private String fp02b = "";
    private String fp02c = "";
    private String fp02dd = "";
    private String fp02dm = "";
    private String fp03a = "";
    private String fp03b = "";
    private String fp03c = "";
    private String fp03dd = "";
    private String fp03dm = "";
    private String fp04a = "";
    private String fp04b = "";
    private String fp04c = "";
    private String fp04dd = "";
    private String fp04dm = "";
    private String fp05a = "";
    private String fp05b = "";
    private String fp05c = "";
    private String fp05dd = "";
    private String fp05dm = "";
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
    private String ha01 = "";
    private String ha02 = "";
    private String ha03 = "";
    private String ha04 = "";
    private String ha05 = "";
    private String ha06 = "";
    private String ha07 = "";
    private String ha08 = "";
    private String ha09 = "";
    private String ha10 = "";
    private String ha11 = "";
    private String ha12 = "";
    private String ha13 = "";
    private String ha14 = "";
    private String ha14a = "";
    private String ha14b = "";
    private String ha14c = "";
    private String ha14d = "";
    private String ha14e = "";
    private String ha14f = "";
    private String ha1496 = "";
    private String ha1496x = "";
    private String hb01 = "";
    private String hb02 = "";
    private String hb03 = "";
    private String hb04 = "";
    private String hb05 = "";
    private String hb06 = "";
    private String hb07 = "";
    private String hb07a = "";
    private String hb07b = "";
    private String hb07c = "";
    private String hb07d = "";
    private String hb0796 = "";
    private String hb0796x = "";
    private String hc01 = "";
    private String hc02 = "";
    private String hc03 = "";
    private String hc04 = "";
    private String hc05 = "";
    private String hc06 = "";
    private String hc06a = "";
    private String hc06b = "";
    private String hc06c = "";
    private String hc06d = "";
    private String hc06e = "";
    private String hc0696 = "";
    private String hc0696x = "";
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

    public Forms() {
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


    public String getIstatus() {
        return istatus;
    }

    public void setIstatus(String istatus) {
        this.istatus = istatus;
    }


    public String getIstatus96x() {
        return istatus96x;
    }

    public void setIstatus96x(String istatus96x) {
        this.istatus96x = istatus96x;
    }


    public String getEndingdatetime() {
        return endingdatetime;
    }

    public void setEndingdatetime(String endingdatetime) {
        this.endingdatetime = endingdatetime;
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


    public String getGpsDT() {
        return gpsDT;
    }

    public void setGpsDT(String gpsDT) {
        this.gpsDT = gpsDT;
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


    public String getsH() {
        return sH;
    }

    public void setsH(String sH) {
        this.sH = sH;
    }


    public String getsI() {
        return sI;
    }

    public void setsI(String sI) {
        this.sI = sI;
    }


    public String getAa01d() {
        return aa01d;
    }

    public void setAa01d(String aa01d) {
        this.aa01d = aa01d;
    }


    public String getAa01m() {
        return aa01m;
    }

    public void setAa01m(String aa01m) {
        this.aa01m = aa01m;
    }


    public String getAa01y() {
        return aa01y;
    }

    public void setAa01y(String aa01y) {
        this.aa01y = aa01y;
    }


    public String getAa02() {
        return aa02;
    }

    public void setAa02(String aa02) {
        this.aa02 = aa02;
    }


    public String getAa03() {
        return aa03;
    }

    public void setAa03(String aa03) {
        this.aa03 = aa03;
    }


    public String getAa04() {
        return aa04;
    }

    public void setAa04(String aa04) {
        this.aa04 = aa04;
    }


    public String getAa05() {
        return aa05;
    }

    public void setAa05(String aa05) {
        this.aa05 = aa05;
    }


    public String getAa06() {
        return aa06;
    }

    public void setAa06(String aa06) {
        this.aa06 = aa06;
    }


    public String getAa07() {
        return aa07;
    }

    public void setAa07(String aa07) {
        this.aa07 = aa07;
    }


    public String getAa08() {
        return aa08;
    }

    public void setAa08(String aa08) {
        this.aa08 = aa08;
    }


    public String getAa09() {
        return aa09;
    }

    public void setAa09(String aa09) {
        this.aa09 = aa09;
    }


    public String getAa10() {
        return aa10;
    }

    public void setAa10(String aa10) {
        this.aa10 = aa10;
    }


    public String getAa11() {
        return aa11;
    }

    public void setAa11(String aa11) {
        this.aa11 = aa11;
    }


    public String getAa12() {
        return aa12;
    }

    public void setAa12(String aa12) {
        this.aa12 = aa12;
    }


    public String getAa13() {
        return aa13;
    }

    public void setAa13(String aa13) {
        this.aa13 = aa13;
    }


    public String getAa14() {
        return aa14;
    }

    public void setAa14(String aa14) {
        this.aa14 = aa14;
    }


    public String getBa01a1() {
        return ba01a1;
    }

    public void setBa01a1(String ba01a1) {
        this.ba01a1 = ba01a1;
    }


    public String getBa01a2() {
        return ba01a2;
    }

    public void setBa01a2(String ba01a2) {
        this.ba01a2 = ba01a2;
    }


    public String getBa01a3() {
        return ba01a3;
    }

    public void setBa01a3(String ba01a3) {
        this.ba01a3 = ba01a3;
    }


    public String getBa01a4() {
        return ba01a4;
    }

    public void setBa01a4(String ba01a4) {
        this.ba01a4 = ba01a4;
    }


    public String getBa01a5() {
        return ba01a5;
    }

    public void setBa01a5(String ba01a5) {
        this.ba01a5 = ba01a5;
    }


    public String getBa01b1() {
        return ba01b1;
    }

    public void setBa01b1(String ba01b1) {
        this.ba01b1 = ba01b1;
    }


    public String getBa01b2() {
        return ba01b2;
    }

    public void setBa01b2(String ba01b2) {
        this.ba01b2 = ba01b2;
    }


    public String getBa01b3() {
        return ba01b3;
    }

    public void setBa01b3(String ba01b3) {
        this.ba01b3 = ba01b3;
    }


    public String getBa01b4() {
        return ba01b4;
    }

    public void setBa01b4(String ba01b4) {
        this.ba01b4 = ba01b4;
    }


    public String getBa01b5() {
        return ba01b5;
    }

    public void setBa01b5(String ba01b5) {
        this.ba01b5 = ba01b5;
    }


    public String getBa01c1() {
        return ba01c1;
    }

    public void setBa01c1(String ba01c1) {
        this.ba01c1 = ba01c1;
    }


    public String getBa01c2() {
        return ba01c2;
    }

    public void setBa01c2(String ba01c2) {
        this.ba01c2 = ba01c2;
    }


    public String getBa01c3() {
        return ba01c3;
    }

    public void setBa01c3(String ba01c3) {
        this.ba01c3 = ba01c3;
    }


    public String getBa01c4() {
        return ba01c4;
    }

    public void setBa01c4(String ba01c4) {
        this.ba01c4 = ba01c4;
    }


    public String getBa01c5() {
        return ba01c5;
    }

    public void setBa01c5(String ba01c5) {
        this.ba01c5 = ba01c5;
    }


    public String getBa01d1() {
        return ba01d1;
    }

    public void setBa01d1(String ba01d1) {
        this.ba01d1 = ba01d1;
    }


    public String getBa01d2() {
        return ba01d2;
    }

    public void setBa01d2(String ba01d2) {
        this.ba01d2 = ba01d2;
    }


    public String getBa01d3() {
        return ba01d3;
    }

    public void setBa01d3(String ba01d3) {
        this.ba01d3 = ba01d3;
    }


    public String getBa01d4() {
        return ba01d4;
    }

    public void setBa01d4(String ba01d4) {
        this.ba01d4 = ba01d4;
    }


    public String getBa01d5() {
        return ba01d5;
    }

    public void setBa01d5(String ba01d5) {
        this.ba01d5 = ba01d5;
    }


    public String getBa01e1() {
        return ba01e1;
    }

    public void setBa01e1(String ba01e1) {
        this.ba01e1 = ba01e1;
    }


    public String getBa01e2() {
        return ba01e2;
    }

    public void setBa01e2(String ba01e2) {
        this.ba01e2 = ba01e2;
    }


    public String getBa01e3() {
        return ba01e3;
    }

    public void setBa01e3(String ba01e3) {
        this.ba01e3 = ba01e3;
    }


    public String getBa01e4() {
        return ba01e4;
    }

    public void setBa01e4(String ba01e4) {
        this.ba01e4 = ba01e4;
    }


    public String getBa01e5() {
        return ba01e5;
    }

    public void setBa01e5(String ba01e5) {
        this.ba01e5 = ba01e5;
    }


    public String getBa01f1() {
        return ba01f1;
    }

    public void setBa01f1(String ba01f1) {
        this.ba01f1 = ba01f1;
    }


    public String getBa01f2() {
        return ba01f2;
    }

    public void setBa01f2(String ba01f2) {
        this.ba01f2 = ba01f2;
    }


    public String getBa01f3() {
        return ba01f3;
    }

    public void setBa01f3(String ba01f3) {
        this.ba01f3 = ba01f3;
    }


    public String getBa01f4() {
        return ba01f4;
    }

    public void setBa01f4(String ba01f4) {
        this.ba01f4 = ba01f4;
    }


    public String getBa01f5() {
        return ba01f5;
    }

    public void setBa01f5(String ba01f5) {
        this.ba01f5 = ba01f5;
    }


    public String getBa01g1() {
        return ba01g1;
    }

    public void setBa01g1(String ba01g1) {
        this.ba01g1 = ba01g1;
    }


    public String getBa01g2() {
        return ba01g2;
    }

    public void setBa01g2(String ba01g2) {
        this.ba01g2 = ba01g2;
    }


    public String getBa01g3() {
        return ba01g3;
    }

    public void setBa01g3(String ba01g3) {
        this.ba01g3 = ba01g3;
    }


    public String getBa01g4() {
        return ba01g4;
    }

    public void setBa01g4(String ba01g4) {
        this.ba01g4 = ba01g4;
    }


    public String getBa01g5() {
        return ba01g5;
    }

    public void setBa01g5(String ba01g5) {
        this.ba01g5 = ba01g5;
    }


    public String getBa01h1() {
        return ba01h1;
    }

    public void setBa01h1(String ba01h1) {
        this.ba01h1 = ba01h1;
    }


    public String getBa01h2() {
        return ba01h2;
    }

    public void setBa01h2(String ba01h2) {
        this.ba01h2 = ba01h2;
    }


    public String getBa01h3() {
        return ba01h3;
    }

    public void setBa01h3(String ba01h3) {
        this.ba01h3 = ba01h3;
    }


    public String getBa01h4() {
        return ba01h4;
    }

    public void setBa01h4(String ba01h4) {
        this.ba01h4 = ba01h4;
    }


    public String getBa01h5() {
        return ba01h5;
    }

    public void setBa01h5(String ba01h5) {
        this.ba01h5 = ba01h5;
    }


    public String getCa01() {
        return ca01;
    }

    public void setCa01(String ca01) {
        this.ca01 = ca01;
    }


    public String getCa02() {
        return ca02;
    }

    public void setCa02(String ca02) {
        this.ca02 = ca02;
    }


    public String getCb01() {
        return cb01;
    }

    public void setCb01(String cb01) {
        this.cb01 = cb01;
    }


    public String getCb02() {
        return cb02;
    }

    public void setCb02(String cb02) {
        this.cb02 = cb02;
    }


    public String getCb03() {
        return cb03;
    }

    public void setCb03(String cb03) {
        this.cb03 = cb03;
    }


    public String getCb04() {
        return cb04;
    }

    public void setCb04(String cb04) {
        this.cb04 = cb04;
    }

    public String getCb05() {
        return cb05;
    }

    public void setCb05(String cb05) {
        this.cb05 = cb05;
    }

    public String getCc01() {
        return cc01;
    }

    public void setCc01(String cc01) {
        this.cc01 = cc01;
    }

    public String getCc02() {
        return cc02;
    }

    public void setCc02(String cc02) {
        this.cc02 = cc02;
    }

    public String getCc03() {
        return cc03;
    }

    public void setCc03(String cc03) {
        this.cc03 = cc03;
    }

    public String getCc04() {
        return cc04;
    }

    public void setCc04(String cc04) {
        this.cc04 = cc04;
    }

    public String getCc05() {
        return cc05;
    }

    public void setCc05(String cc05) {
        this.cc05 = cc05;
    }

    public String getCc06() {
        return cc06;
    }

    public void setCc06(String cc06) {
        this.cc06 = cc06;
    }

    public String getCc07() {
        return cc07;
    }

    public void setCc07(String cc07) {
        this.cc07 = cc07;
    }

    public String getCc08() {
        return cc08;
    }

    public void setCc08(String cc08) {
        this.cc08 = cc08;
    }

    public String getCd01() {
        return cd01;
    }

    public void setCd01(String cd01) {
        this.cd01 = cd01;
    }

    public String getCd0211() {
        return cd0211;
    }

    public void setCd0211(String cd0211) {
        this.cd0211 = cd0211;
    }

    public String getCd0211c() {
        return cd0211c;
    }

    public void setCd0211c(String cd0211c) {
        this.cd0211c = cd0211c;
    }

    public String getCd0212() {
        return cd0212;
    }

    public void setCd0212(String cd0212) {
        this.cd0212 = cd0212;
    }

    public String getCd0212c() {
        return cd0212c;
    }

    public void setCd0212c(String cd0212c) {
        this.cd0212c = cd0212c;
    }

    public String getCd0221() {
        return cd0221;
    }

    public void setCd0221(String cd0221) {
        this.cd0221 = cd0221;
    }

    public String getCd0221c() {
        return cd0221c;
    }

    public void setCd0221c(String cd0221c) {
        this.cd0221c = cd0221c;
    }

    public String getCd0222() {
        return cd0222;
    }

    public void setCd0222(String cd0222) {
        this.cd0222 = cd0222;
    }

    public String getCd0222c() {
        return cd0222c;
    }

    public void setCd0222c(String cd0222c) {
        this.cd0222c = cd0222c;
    }

    public String getCd0231() {
        return cd0231;
    }

    public void setCd0231(String cd0231) {
        this.cd0231 = cd0231;
    }

    public String getCd0231c() {
        return cd0231c;
    }

    public void setCd0231c(String cd0231c) {
        this.cd0231c = cd0231c;
    }

    public String getCd0232() {
        return cd0232;
    }

    public void setCd0232(String cd0232) {
        this.cd0232 = cd0232;
    }

    public String getCd0232c() {
        return cd0232c;
    }

    public void setCd0232c(String cd0232c) {
        this.cd0232c = cd0232c;
    }

    public String getCd0241() {
        return cd0241;
    }

    public void setCd0241(String cd0241) {
        this.cd0241 = cd0241;
    }

    public String getCd0241c() {
        return cd0241c;
    }

    public void setCd0241c(String cd0241c) {
        this.cd0241c = cd0241c;
    }

    public String getCd0242() {
        return cd0242;
    }

    public void setCd0242(String cd0242) {
        this.cd0242 = cd0242;
    }

    public String getCd0242c() {
        return cd0242c;
    }

    public void setCd0242c(String cd0242c) {
        this.cd0242c = cd0242c;
    }

    public String getCd10() {
        return cd10;
    }

    public void setCd10(String cd10) {
        this.cd10 = cd10;
    }

    public String getCd11() {
        return cd11;
    }

    public void setCd11(String cd11) {
        this.cd11 = cd11;
    }

    public String getCd12() {
        return cd12;
    }

    public void setCd12(String cd12) {
        this.cd12 = cd12;
    }

    public String getCd13() {
        return cd13;
    }

    public void setCd13(String cd13) {
        this.cd13 = cd13;
    }

    public String getCd14() {
        return cd14;
    }

    public void setCd14(String cd14) {
        this.cd14 = cd14;
    }

    public String getCd15() {
        return cd15;
    }

    public void setCd15(String cd15) {
        this.cd15 = cd15;
    }

    public String getCd16() {
        return cd16;
    }

    public void setCd16(String cd16) {
        this.cd16 = cd16;
    }

    public String getCd17() {
        return cd17;
    }

    public void setCd17(String cd17) {
        this.cd17 = cd17;
    }

    public String getCd18() {
        return cd18;
    }

    public void setCd18(String cd18) {
        this.cd18 = cd18;
    }

    public String getCd19() {
        return cd19;
    }

    public void setCd19(String cd19) {
        this.cd19 = cd19;
    }

    public String getCd20() {
        return cd20;
    }

    public void setCd20(String cd20) {
        this.cd20 = cd20;
    }

    public String getCe01() {
        return ce01;
    }

    public void setCe01(String ce01) {
        this.ce01 = ce01;
    }

    public String getCe02() {
        return ce02;
    }

    public void setCe02(String ce02) {
        this.ce02 = ce02;
    }

    public String getCe03() {
        return ce03;
    }

    public void setCe03(String ce03) {
        this.ce03 = ce03;
    }

    public String getCe04() {
        return ce04;
    }

    public void setCe04(String ce04) {
        this.ce04 = ce04;
    }

    public String getCe05() {
        return ce05;
    }

    public void setCe05(String ce05) {
        this.ce05 = ce05;
    }

    public String getCe06() {
        return ce06;
    }

    public void setCe06(String ce06) {
        this.ce06 = ce06;
    }

    public String getCe07() {
        return ce07;
    }

    public void setCe07(String ce07) {
        this.ce07 = ce07;
    }

    public String getCe08() {
        return ce08;
    }

    public void setCe08(String ce08) {
        this.ce08 = ce08;
    }

    public String getCe08a() {
        return ce08a;
    }

    public void setCe08a(String ce08a) {
        this.ce08a = ce08a;
    }

    public String getCe08b() {
        return ce08b;
    }

    public void setCe08b(String ce08b) {
        this.ce08b = ce08b;
    }

    public String getCe08c() {
        return ce08c;
    }

    public void setCe08c(String ce08c) {
        this.ce08c = ce08c;
    }

    public String getCe08e() {
        return ce08e;
    }

    public void setCe08e(String ce08e) {
        this.ce08e = ce08e;
    }

    public String getCe08d() {
        return ce08d;
    }

    public void setCe08d(String ce08d) {
        this.ce08d = ce08d;
    }

    public String getCe08f() {
        return ce08f;
    }

    public void setCe08f(String ce08f) {
        this.ce08f = ce08f;
    }

    public String getCe08g() {
        return ce08g;
    }

    public void setCe08g(String ce08g) {
        this.ce08g = ce08g;
    }

    public String getCe08h() {
        return ce08h;
    }

    public void setCe08h(String ce08h) {
        this.ce08h = ce08h;
    }

    public String getCe08i() {
        return ce08i;
    }

    public void setCe08i(String ce08i) {
        this.ce08i = ce08i;
    }

    public String getCf01() {
        return cf01;
    }

    public void setCf01(String cf01) {
        this.cf01 = cf01;
    }

    public String getCf0196x() {
        return cf0196x;
    }

    public void setCf0196x(String cf0196x) {
        this.cf0196x = cf0196x;
    }

    public String getCf02() {
        return cf02;
    }

    public void setCf02(String cf02) {
        this.cf02 = cf02;
    }

    public String getCf0296x() {
        return cf0296x;
    }

    public void setCf0296x(String cf0296x) {
        this.cf0296x = cf0296x;
    }

    public String getCf03() {
        return cf03;
    }

    public void setCf03(String cf03) {
        this.cf03 = cf03;
    }

    public String getCf04() {
        return cf04;
    }

    public void setCf04(String cf04) {
        this.cf04 = cf04;
    }

    public String getCf05() {
        return cf05;
    }

    public void setCf05(String cf05) {
        this.cf05 = cf05;
    }

    public String getCf06() {
        return cf06;
    }

    public void setCf06(String cf06) {
        this.cf06 = cf06;
    }

    public String getCg01() {
        return cg01;
    }

    public void setCg01(String cg01) {
        this.cg01 = cg01;
    }

    public String getCg02f() {
        return cg02f;
    }

    public void setCg02f(String cg02f) {
        this.cg02f = cg02f;
    }

    public String getCg03() {
        return cg03;
    }

    public void setCg03(String cg03) {
        this.cg03 = cg03;
    }

    public String getCg04f() {
        return cg04f;
    }

    public void setCg04f(String cg04f) {
        this.cg04f = cg04f;
    }

    public String getCg05() {
        return cg05;
    }

    public void setCg05(String cg05) {
        this.cg05 = cg05;
    }

    public String getCg06f() {
        return cg06f;
    }

    public void setCg06f(String cg06f) {
        this.cg06f = cg06f;
    }

    public String getCg07() {
        return cg07;
    }

    public void setCg07(String cg07) {
        this.cg07 = cg07;
    }

    public String getCg08f() {
        return cg08f;
    }

    public void setCg08f(String cg08f) {
        this.cg08f = cg08f;
    }

    public String getCg09() {
        return cg09;
    }

    public void setCg09(String cg09) {
        this.cg09 = cg09;
    }

    public String getCg10f() {
        return cg10f;
    }

    public void setCg10f(String cg10f) {
        this.cg10f = cg10f;
    }

    public String getCg11() {
        return cg11;
    }

    public void setCg11(String cg11) {
        this.cg11 = cg11;
    }

    public String getCg12f() {
        return cg12f;
    }

    public void setCg12f(String cg12f) {
        this.cg12f = cg12f;
    }

    public String getCg13() {
        return cg13;
    }

    public void setCg13(String cg13) {
        this.cg13 = cg13;
    }

    public String getCg14f() {
        return cg14f;
    }

    public void setCg14f(String cg14f) {
        this.cg14f = cg14f;
    }

    public String getCg15() {
        return cg15;
    }

    public void setCg15(String cg15) {
        this.cg15 = cg15;
    }

    public String getCg16f() {
        return cg16f;
    }

    public void setCg16f(String cg16f) {
        this.cg16f = cg16f;
    }

    public String getCg17() {
        return cg17;
    }

    public void setCg17(String cg17) {
        this.cg17 = cg17;
    }

    public String getCg18f() {
        return cg18f;
    }

    public void setCg18f(String cg18f) {
        this.cg18f = cg18f;
    }

    public String getCg19() {
        return cg19;
    }

    public void setCg19(String cg19) {
        this.cg19 = cg19;
    }

    public String getCg20f() {
        return cg20f;
    }

    public void setCg20f(String cg20f) {
        this.cg20f = cg20f;
    }

    public String getCg21() {
        return cg21;
    }

    public void setCg21(String cg21) {
        this.cg21 = cg21;
    }

    public String getCg22f() {
        return cg22f;
    }

    public void setCg22f(String cg22f) {
        this.cg22f = cg22f;
    }

    public String getCg23() {
        return cg23;
    }

    public void setCg23(String cg23) {
        this.cg23 = cg23;
    }

    public String getCg24f() {
        return cg24f;
    }

    public void setCg24f(String cg24f) {
        this.cg24f = cg24f;
    }

    public String getCg25() {
        return cg25;
    }

    public void setCg25(String cg25) {
        this.cg25 = cg25;
    }

    public String getCg26f() {
        return cg26f;
    }

    public void setCg26f(String cg26f) {
        this.cg26f = cg26f;
    }

    public String getCg27() {
        return cg27;
    }

    public void setCg27(String cg27) {
        this.cg27 = cg27;
    }

    public String getCg28f() {
        return cg28f;
    }

    public void setCg28f(String cg28f) {
        this.cg28f = cg28f;
    }

    public String getCg29() {
        return cg29;
    }

    public void setCg29(String cg29) {
        this.cg29 = cg29;
    }

    public String getCg30f() {
        return cg30f;
    }

    public void setCg30f(String cg30f) {
        this.cg30f = cg30f;
    }

    public String getCg31() {
        return cg31;
    }

    public void setCg31(String cg31) {
        this.cg31 = cg31;
    }

    public String getCg32f() {
        return cg32f;
    }

    public void setCg32f(String cg32f) {
        this.cg32f = cg32f;
    }

    public String getCg33() {
        return cg33;
    }

    public void setCg33(String cg33) {
        this.cg33 = cg33;
    }

    public String getCg34f() {
        return cg34f;
    }

    public void setCg34f(String cg34f) {
        this.cg34f = cg34f;
    }

    public String getCg35() {
        return cg35;
    }

    public void setCg35(String cg35) {
        this.cg35 = cg35;
    }

    public String getCg36f() {
        return cg36f;
    }

    public void setCg36f(String cg36f) {
        this.cg36f = cg36f;
    }

    public String getCg37() {
        return cg37;
    }

    public void setCg37(String cg37) {
        this.cg37 = cg37;
    }

    public String getCg38f() {
        return cg38f;
    }

    public void setCg38f(String cg38f) {
        this.cg38f = cg38f;
    }

    public String getCg39() {
        return cg39;
    }

    public void setCg39(String cg39) {
        this.cg39 = cg39;
    }

    public String getCg40f() {
        return cg40f;
    }

    public void setCg40f(String cg40f) {
        this.cg40f = cg40f;
    }

    public String getCg41() {
        return cg41;
    }

    public void setCg41(String cg41) {
        this.cg41 = cg41;
    }

    public String getCg42f() {
        return cg42f;
    }

    public void setCg42f(String cg42f) {
        this.cg42f = cg42f;
    }

    public String getCg43() {
        return cg43;
    }

    public void setCg43(String cg43) {
        this.cg43 = cg43;
    }

    public String getCg44f() {
        return cg44f;
    }

    public void setCg44f(String cg44f) {
        this.cg44f = cg44f;
    }

    public String getCg45() {
        return cg45;
    }

    public void setCg45(String cg45) {
        this.cg45 = cg45;
    }

    public String getCg46f() {
        return cg46f;
    }

    public void setCg46f(String cg46f) {
        this.cg46f = cg46f;
    }

    public String getDa01() {
        return da01;
    }

    public void setDa01(String da01) {
        this.da01 = da01;
    }

    public String getDa02() {
        return da02;
    }

    public void setDa02(String da02) {
        this.da02 = da02;
    }

    public String getDa03() {
        return da03;
    }

    public void setDa03(String da03) {
        this.da03 = da03;
    }

    public String getDa04() {
        return da04;
    }

    public void setDa04(String da04) {
        this.da04 = da04;
    }

    public String getDa05() {
        return da05;
    }

    public void setDa05(String da05) {
        this.da05 = da05;
    }

    public String getDa06() {
        return da06;
    }

    public void setDa06(String da06) {
        this.da06 = da06;
    }

    public String getDa07() {
        return da07;
    }

    public void setDa07(String da07) {
        this.da07 = da07;
    }

    public String getDa08() {
        return da08;
    }

    public void setDa08(String da08) {
        this.da08 = da08;
    }

    public String getDa09() {
        return da09;
    }

    public void setDa09(String da09) {
        this.da09 = da09;
    }

    public String getDa10() {
        return da10;
    }

    public void setDa10(String da10) {
        this.da10 = da10;
    }

    public String getDa11() {
        return da11;
    }

    public void setDa11(String da11) {
        this.da11 = da11;
    }

    public String getDa12() {
        return da12;
    }

    public void setDa12(String da12) {
        this.da12 = da12;
    }

    public String getDa13() {
        return da13;
    }

    public void setDa13(String da13) {
        this.da13 = da13;
    }

    public String getDa14() {
        return da14;
    }

    public void setDa14(String da14) {
        this.da14 = da14;
    }

    public String getDa15() {
        return da15;
    }

    public void setDa15(String da15) {
        this.da15 = da15;
    }

    public String getDa16() {
        return da16;
    }

    public void setDa16(String da16) {
        this.da16 = da16;
    }

    public String getDa17() {
        return da17;
    }

    public void setDa17(String da17) {
        this.da17 = da17;
    }

    public String getDa18() {
        return da18;
    }

    public void setDa18(String da18) {
        this.da18 = da18;
    }

    public String getDa1896x() {
        return da1896x;
    }

    public void setDa1896x(String da1896x) {
        this.da1896x = da1896x;
    }

    public String getDa1911() {
        return da1911;
    }

    public void setDa1911(String da1911) {
        this.da1911 = da1911;
    }

    public String getDa1912() {
        return da1912;
    }

    public void setDa1912(String da1912) {
        this.da1912 = da1912;
    }

    public String getDa1921() {
        return da1921;
    }

    public void setDa1921(String da1921) {
        this.da1921 = da1921;
    }

    public String getDa1922() {
        return da1922;
    }

    public void setDa1922(String da1922) {
        this.da1922 = da1922;
    }

    public String getDa1931() {
        return da1931;
    }

    public void setDa1931(String da1931) {
        this.da1931 = da1931;
    }

    public String getDa1932() {
        return da1932;
    }

    public void setDa1932(String da1932) {
        this.da1932 = da1932;
    }

    public String getDa1941() {
        return da1941;
    }

    public void setDa1941(String da1941) {
        this.da1941 = da1941;
    }

    public String getDa1942() {
        return da1942;
    }

    public void setDa1942(String da1942) {
        this.da1942 = da1942;
    }

    public String getDa1951() {
        return da1951;
    }

    public void setDa1951(String da1951) {
        this.da1951 = da1951;
    }

    public String getDa1952() {
        return da1952;
    }

    public void setDa1952(String da1952) {
        this.da1952 = da1952;
    }

    public String getDa2011() {
        return da2011;
    }

    public void setDa2011(String da2011) {
        this.da2011 = da2011;
    }

    public String getDa2012() {
        return da2012;
    }

    public void setDa2012(String da2012) {
        this.da2012 = da2012;
    }

    public String getDa2021() {
        return da2021;
    }

    public void setDa2021(String da2021) {
        this.da2021 = da2021;
    }

    public String getDa2022() {
        return da2022;
    }

    public void setDa2022(String da2022) {
        this.da2022 = da2022;
    }

    public String getDa2031() {
        return da2031;
    }

    public void setDa2031(String da2031) {
        this.da2031 = da2031;
    }

    public String getDa2032() {
        return da2032;
    }

    public void setDa2032(String da2032) {
        this.da2032 = da2032;
    }

    public String getDa2041() {
        return da2041;
    }

    public void setDa2041(String da2041) {
        this.da2041 = da2041;
    }

    public String getDa2042() {
        return da2042;
    }

    public void setDa2042(String da2042) {
        this.da2042 = da2042;
    }

    public String getDa2051() {
        return da2051;
    }

    public void setDa2051(String da2051) {
        this.da2051 = da2051;
    }

    public String getDa2052() {
        return da2052;
    }

    public void setDa2052(String da2052) {
        this.da2052 = da2052;
    }

    public String getDa2061() {
        return da2061;
    }

    public void setDa2061(String da2061) {
        this.da2061 = da2061;
    }

    public String getDa2062() {
        return da2062;
    }

    public void setDa2062(String da2062) {
        this.da2062 = da2062;
    }

    public String getDa2071() {
        return da2071;
    }

    public void setDa2071(String da2071) {
        this.da2071 = da2071;
    }

    public String getDa2072() {
        return da2072;
    }

    public void setDa2072(String da2072) {
        this.da2072 = da2072;
    }

    public String getDa2111() {
        return da2111;
    }

    public void setDa2111(String da2111) {
        this.da2111 = da2111;
    }

    public String getDa2112() {
        return da2112;
    }

    public void setDa2112(String da2112) {
        this.da2112 = da2112;
    }

    public String getDa2121() {
        return da2121;
    }

    public void setDa2121(String da2121) {
        this.da2121 = da2121;
    }

    public String getDa2122() {
        return da2122;
    }

    public void setDa2122(String da2122) {
        this.da2122 = da2122;
    }

    public String getDa2131() {
        return da2131;
    }

    public void setDa2131(String da2131) {
        this.da2131 = da2131;
    }

    public String getDa2132() {
        return da2132;
    }

    public void setDa2132(String da2132) {
        this.da2132 = da2132;
    }

    public String getDa2141() {
        return da2141;
    }

    public void setDa2141(String da2141) {
        this.da2141 = da2141;
    }

    public String getDa2142() {
        return da2142;
    }

    public void setDa2142(String da2142) {
        this.da2142 = da2142;
    }

    public String getDa2211() {
        return da2211;
    }

    public void setDa2211(String da2211) {
        this.da2211 = da2211;
    }

    public String getDa2212() {
        return da2212;
    }

    public void setDa2212(String da2212) {
        this.da2212 = da2212;
    }

    public String getDa2221() {
        return da2221;
    }

    public void setDa2221(String da2221) {
        this.da2221 = da2221;
    }

    public String getDa2222() {
        return da2222;
    }

    public void setDa2222(String da2222) {
        this.da2222 = da2222;
    }

    public String getDa2231() {
        return da2231;
    }

    public void setDa2231(String da2231) {
        this.da2231 = da2231;
    }

    public String getDa2232() {
        return da2232;
    }

    public void setDa2232(String da2232) {
        this.da2232 = da2232;
    }

    public String getDa2241() {
        return da2241;
    }

    public void setDa2241(String da2241) {
        this.da2241 = da2241;
    }

    public String getDa2242() {
        return da2242;
    }

    public void setDa2242(String da2242) {
        this.da2242 = da2242;
    }

    public String getDa2251() {
        return da2251;
    }

    public void setDa2251(String da2251) {
        this.da2251 = da2251;
    }

    public String getDa2252() {
        return da2252;
    }

    public void setDa2252(String da2252) {
        this.da2252 = da2252;
    }

    public String getDa2261() {
        return da2261;
    }

    public void setDa2261(String da2261) {
        this.da2261 = da2261;
    }

    public String getDa2262() {
        return da2262;
    }

    public void setDa2262(String da2262) {
        this.da2262 = da2262;
    }

    public String getDa2271() {
        return da2271;
    }

    public void setDa2271(String da2271) {
        this.da2271 = da2271;
    }

    public String getDa2272() {
        return da2272;
    }

    public void setDa2272(String da2272) {
        this.da2272 = da2272;
    }

    public String getDa2281() {
        return da2281;
    }

    public void setDa2281(String da2281) {
        this.da2281 = da2281;
    }

    public String getDa2282() {
        return da2282;
    }

    public void setDa2282(String da2282) {
        this.da2282 = da2282;
    }

    public String getDa2311() {
        return da2311;
    }

    public void setDa2311(String da2311) {
        this.da2311 = da2311;
    }

    public String getDa2312() {
        return da2312;
    }

    public void setDa2312(String da2312) {
        this.da2312 = da2312;
    }

    public String getDa2321() {
        return da2321;
    }

    public void setDa2321(String da2321) {
        this.da2321 = da2321;
    }

    public String getDa2322() {
        return da2322;
    }

    public void setDa2322(String da2322) {
        this.da2322 = da2322;
    }

    public String getDa2331() {
        return da2331;
    }

    public void setDa2331(String da2331) {
        this.da2331 = da2331;
    }

    public String getDa2332() {
        return da2332;
    }

    public void setDa2332(String da2332) {
        this.da2332 = da2332;
    }

    public String getDa2341() {
        return da2341;
    }

    public void setDa2341(String da2341) {
        this.da2341 = da2341;
    }

    public String getDa2342() {
        return da2342;
    }

    public void setDa2342(String da2342) {
        this.da2342 = da2342;
    }

    public String getDa2411() {
        return da2411;
    }

    public void setDa2411(String da2411) {
        this.da2411 = da2411;
    }

    public String getDa2412() {
        return da2412;
    }

    public void setDa2412(String da2412) {
        this.da2412 = da2412;
    }

    public String getDa2421() {
        return da2421;
    }

    public void setDa2421(String da2421) {
        this.da2421 = da2421;
    }

    public String getDa2422() {
        return da2422;
    }

    public void setDa2422(String da2422) {
        this.da2422 = da2422;
    }

    public String getDa2431() {
        return da2431;
    }

    public void setDa2431(String da2431) {
        this.da2431 = da2431;
    }

    public String getDa2432() {
        return da2432;
    }

    public void setDa2432(String da2432) {
        this.da2432 = da2432;
    }

    public String getDa2441() {
        return da2441;
    }

    public void setDa2441(String da2441) {
        this.da2441 = da2441;
    }

    public String getDa2442() {
        return da2442;
    }

    public void setDa2442(String da2442) {
        this.da2442 = da2442;
    }

    public String getDa2451() {
        return da2451;
    }

    public void setDa2451(String da2451) {
        this.da2451 = da2451;
    }

    public String getDa2452() {
        return da2452;
    }

    public void setDa2452(String da2452) {
        this.da2452 = da2452;
    }

    public String getDa2461() {
        return da2461;
    }

    public void setDa2461(String da2461) {
        this.da2461 = da2461;
    }

    public String getDa2462() {
        return da2462;
    }

    public void setDa2462(String da2462) {
        this.da2462 = da2462;
    }

    public String getDa2471() {
        return da2471;
    }

    public void setDa2471(String da2471) {
        this.da2471 = da2471;
    }

    public String getDa2472() {
        return da2472;
    }

    public void setDa2472(String da2472) {
        this.da2472 = da2472;
    }

    public String getDa2481() {
        return da2481;
    }

    public void setDa2481(String da2481) {
        this.da2481 = da2481;
    }

    public String getDa2482() {
        return da2482;
    }

    public void setDa2482(String da2482) {
        this.da2482 = da2482;
    }

    public String getDb01() {
        return db01;
    }

    public void setDb01(String db01) {
        this.db01 = db01;
    }

    public String getDb02() {
        return db02;
    }

    public void setDb02(String db02) {
        this.db02 = db02;
    }

    public String getDb03() {
        return db03;
    }

    public void setDb03(String db03) {
        this.db03 = db03;
    }

    public String getDb04() {
        return db04;
    }

    public void setDb04(String db04) {
        this.db04 = db04;
    }

    public String getDb05() {
        return db05;
    }

    public void setDb05(String db05) {
        this.db05 = db05;
    }

    public String getDb06() {
        return db06;
    }

    public void setDb06(String db06) {
        this.db06 = db06;
    }

    public String getDb07() {
        return db07;
    }

    public void setDb07(String db07) {
        this.db07 = db07;
    }

    public String getDb08() {
        return db08;
    }

    public void setDb08(String db08) {
        this.db08 = db08;
    }

    public String getDb09() {
        return db09;
    }

    public void setDb09(String db09) {
        this.db09 = db09;
    }

    public String getDb10() {
        return db10;
    }

    public void setDb10(String db10) {
        this.db10 = db10;
    }

    public String getDb11() {
        return db11;
    }

    public void setDb11(String db11) {
        this.db11 = db11;
    }

    public String getDb12() {
        return db12;
    }

    public void setDb12(String db12) {
        this.db12 = db12;
    }

    public String getDb13() {
        return db13;
    }

    public void setDb13(String db13) {
        this.db13 = db13;
    }

    public String getDb14() {
        return db14;
    }

    public void setDb14(String db14) {
        this.db14 = db14;
    }

    public String getDb15() {
        return db15;
    }

    public void setDb15(String db15) {
        this.db15 = db15;
    }

    public String getDb16() {
        return db16;
    }

    public void setDb16(String db16) {
        this.db16 = db16;
    }

    public String getDb1696x() {
        return db1696x;
    }

    public void setDb1696x(String db1696x) {
        this.db1696x = db1696x;
    }

    public String getEa01() {
        return ea01;
    }

    public void setEa01(String ea01) {
        this.ea01 = ea01;
    }

    public String getEa0196x() {
        return ea0196x;
    }

    public void setEa0196x(String ea0196x) {
        this.ea0196x = ea0196x;
    }

    public String getEa02() {
        return ea02;
    }

    public void setEa02(String ea02) {
        this.ea02 = ea02;
    }

    public String getEa03() {
        return ea03;
    }

    public void setEa03(String ea03) {
        this.ea03 = ea03;
    }

    public String getEa0396x() {
        return ea0396x;
    }

    public void setEa0396x(String ea0396x) {
        this.ea0396x = ea0396x;
    }

    public String getEa04() {
        return ea04;
    }

    public void setEa04(String ea04) {
        this.ea04 = ea04;
    }

    public String getEa05d() {
        return ea05d;
    }

    public void setEa05d(String ea05d) {
        this.ea05d = ea05d;
    }

    public String getEa05m() {
        return ea05m;
    }

    public void setEa05m(String ea05m) {
        this.ea05m = ea05m;
    }

    public String getEa06() {
        return ea06;
    }

    public void setEa06(String ea06) {
        this.ea06 = ea06;
    }

    public String getEa0696x() {
        return ea0696x;
    }

    public void setEa0696x(String ea0696x) {
        this.ea0696x = ea0696x;
    }

    public String getEa07() {
        return ea07;
    }

    public void setEa07(String ea07) {
        this.ea07 = ea07;
    }

    public String getEa0796x() {
        return ea0796x;
    }

    public void setEa0796x(String ea0796x) {
        this.ea0796x = ea0796x;
    }

    public String getEa08() {
        return ea08;
    }

    public void setEa08(String ea08) {
        this.ea08 = ea08;
    }

    public String getEa09d() {
        return ea09d;
    }

    public void setEa09d(String ea09d) {
        this.ea09d = ea09d;
    }

    public String getEa09m() {
        return ea09m;
    }

    public void setEa09m(String ea09m) {
        this.ea09m = ea09m;
    }

    public String getEa10() {
        return ea10;
    }

    public void setEa10(String ea10) {
        this.ea10 = ea10;
    }

    public String getEa11() {
        return ea11;
    }

    public void setEa11(String ea11) {
        this.ea11 = ea11;
    }

    public String getEa12() {
        return ea12;
    }

    public void setEa12(String ea12) {
        this.ea12 = ea12;
    }

    public String getEa13() {
        return ea13;
    }

    public void setEa13(String ea13) {
        this.ea13 = ea13;
    }

    public String getEa14() {
        return ea14;
    }

    public void setEa14(String ea14) {
        this.ea14 = ea14;
    }

    public String getEb01() {
        return eb01;
    }

    public void setEb01(String eb01) {
        this.eb01 = eb01;
    }

    public String getEb02() {
        return eb02;
    }

    public void setEb02(String eb02) {
        this.eb02 = eb02;
    }

    public String getEb03() {
        return eb03;
    }

    public void setEb03(String eb03) {
        this.eb03 = eb03;
    }

    public String getEb03t() {
        return eb03t;
    }

    public void setEb03t(String eb03t) {
        this.eb03t = eb03t;
    }

    public String getEb04() {
        return eb04;
    }

    public void setEb04(String eb04) {
        this.eb04 = eb04;
    }

    public String getEb05() {
        return eb05;
    }

    public void setEb05(String eb05) {
        this.eb05 = eb05;
    }

    public String getEb06() {
        return eb06;
    }

    public void setEb06(String eb06) {
        this.eb06 = eb06;
    }

    public String getEb07() {
        return eb07;
    }

    public void setEb07(String eb07) {
        this.eb07 = eb07;
    }

    public String getEb08() {
        return eb08;
    }

    public void setEb08(String eb08) {
        this.eb08 = eb08;
    }

    public String getEb08a() {
        return eb08a;
    }

    public void setEb08a(String eb08a) {
        this.eb08a = eb08a;
    }

    public String getEb08b() {
        return eb08b;
    }

    public void setEb08b(String eb08b) {
        this.eb08b = eb08b;
    }

    public String getEb08c() {
        return eb08c;
    }

    public void setEb08c(String eb08c) {
        this.eb08c = eb08c;
    }

    public String getEb08d() {
        return eb08d;
    }

    public void setEb08d(String eb08d) {
        this.eb08d = eb08d;
    }

    public String getEb0896() {
        return eb0896;
    }

    public void setEb0896(String eb0896) {
        this.eb0896 = eb0896;
    }

    public String getEb0896x() {
        return eb0896x;
    }

    public void setEb0896x(String eb0896x) {
        this.eb0896x = eb0896x;
    }

    public String getEc01a() {
        return ec01a;
    }

    public void setEc01a(String ec01a) {
        this.ec01a = ec01a;
    }

    public String getEc02d() {
        return ec02d;
    }

    public void setEc02d(String ec02d) {
        this.ec02d = ec02d;
    }

    public String getEc02m() {
        return ec02m;
    }

    public void setEc02m(String ec02m) {
        this.ec02m = ec02m;
    }

    public String getEc03a() {
        return ec03a;
    }

    public void setEc03a(String ec03a) {
        this.ec03a = ec03a;
    }

    public String getEc04d() {
        return ec04d;
    }

    public void setEc04d(String ec04d) {
        this.ec04d = ec04d;
    }

    public String getEc04m() {
        return ec04m;
    }

    public void setEc04m(String ec04m) {
        this.ec04m = ec04m;
    }

    public String getEc05a() {
        return ec05a;
    }

    public void setEc05a(String ec05a) {
        this.ec05a = ec05a;
    }

    public String getEc06d() {
        return ec06d;
    }

    public void setEc06d(String ec06d) {
        this.ec06d = ec06d;
    }

    public String getEc06m() {
        return ec06m;
    }

    public void setEc06m(String ec06m) {
        this.ec06m = ec06m;
    }

    public String getEc07a() {
        return ec07a;
    }

    public void setEc07a(String ec07a) {
        this.ec07a = ec07a;
    }

    public String getEc08d() {
        return ec08d;
    }

    public void setEc08d(String ec08d) {
        this.ec08d = ec08d;
    }

    public String getEc08m() {
        return ec08m;
    }

    public void setEc08m(String ec08m) {
        this.ec08m = ec08m;
    }

    public String getEc09a() {
        return ec09a;
    }

    public void setEc09a(String ec09a) {
        this.ec09a = ec09a;
    }

    public String getEc10d() {
        return ec10d;
    }

    public void setEc10d(String ec10d) {
        this.ec10d = ec10d;
    }

    public String getEc10m() {
        return ec10m;
    }

    public void setEc10m(String ec10m) {
        this.ec10m = ec10m;
    }

    public String getEc11a() {
        return ec11a;
    }

    public void setEc11a(String ec11a) {
        this.ec11a = ec11a;
    }

    public String getEc12d() {
        return ec12d;
    }

    public void setEc12d(String ec12d) {
        this.ec12d = ec12d;
    }

    public String getEc12m() {
        return ec12m;
    }

    public void setEc12m(String ec12m) {
        this.ec12m = ec12m;
    }

    public String getFam1m() {
        return fam1m;
    }

    public void setFam1m(String fam1m) {
        this.fam1m = fam1m;
    }

    public String getFam1y() {
        return fam1y;
    }

    public void setFam1y(String fam1y) {
        this.fam1y = fam1y;
    }

    public String getFam2m() {
        return fam2m;
    }

    public void setFam2m(String fam2m) {
        this.fam2m = fam2m;
    }

    public String getFam2y() {
        return fam2y;
    }

    public void setFam2y(String fam2y) {
        this.fam2y = fam2y;
    }

    public String getFam3m() {
        return fam3m;
    }

    public void setFam3m(String fam3m) {
        this.fam3m = fam3m;
    }

    public String getFam3y() {
        return fam3y;
    }

    public void setFam3y(String fam3y) {
        this.fam3y = fam3y;
    }

    public String getFb01() {
        return fb01;
    }

    public void setFb01(String fb01) {
        this.fb01 = fb01;
    }

    public String getFb02() {
        return fb02;
    }

    public void setFb02(String fb02) {
        this.fb02 = fb02;
    }

    public String getFb03() {
        return fb03;
    }

    public void setFb03(String fb03) {
        this.fb03 = fb03;
    }

    public String getFb04() {
        return fb04;
    }

    public void setFb04(String fb04) {
        this.fb04 = fb04;
    }

    public String getFc01m1() {
        return fc01m1;
    }

    public void setFc01m1(String fc01m1) {
        this.fc01m1 = fc01m1;
    }

    public String getFc01m2() {
        return fc01m2;
    }

    public void setFc01m2(String fc01m2) {
        this.fc01m2 = fc01m2;
    }

    public String getFc01m3() {
        return fc01m3;
    }

    public void setFc01m3(String fc01m3) {
        this.fc01m3 = fc01m3;
    }

    public String getFc01a() {
        return fc01a;
    }

    public void setFc01a(String fc01a) {
        this.fc01a = fc01a;
    }

    public String getFc02m1() {
        return fc02m1;
    }

    public void setFc02m1(String fc02m1) {
        this.fc02m1 = fc02m1;
    }

    public String getFc02m2() {
        return fc02m2;
    }

    public void setFc02m2(String fc02m2) {
        this.fc02m2 = fc02m2;
    }

    public String getFc02m3() {
        return fc02m3;
    }

    public void setFc02m3(String fc02m3) {
        this.fc02m3 = fc02m3;
    }

    public String getFc02a() {
        return fc02a;
    }

    public void setFc02a(String fc02a) {
        this.fc02a = fc02a;
    }

    public String getFc03m1() {
        return fc03m1;
    }

    public void setFc03m1(String fc03m1) {
        this.fc03m1 = fc03m1;
    }

    public String getFc03m2() {
        return fc03m2;
    }

    public void setFc03m2(String fc03m2) {
        this.fc03m2 = fc03m2;
    }

    public String getFc03m3() {
        return fc03m3;
    }

    public void setFc03m3(String fc03m3) {
        this.fc03m3 = fc03m3;
    }

    public String getFc03a() {
        return fc03a;
    }

    public void setFc03a(String fc03a) {
        this.fc03a = fc03a;
    }

    public String getFc04m1() {
        return fc04m1;
    }

    public void setFc04m1(String fc04m1) {
        this.fc04m1 = fc04m1;
    }

    public String getFc04m2() {
        return fc04m2;
    }

    public void setFc04m2(String fc04m2) {
        this.fc04m2 = fc04m2;
    }

    public String getFc04m3() {
        return fc04m3;
    }

    public void setFc04m3(String fc04m3) {
        this.fc04m3 = fc04m3;
    }

    public String getFc04a() {
        return fc04a;
    }

    public void setFc04a(String fc04a) {
        this.fc04a = fc04a;
    }

    public String getFc05m1() {
        return fc05m1;
    }

    public void setFc05m1(String fc05m1) {
        this.fc05m1 = fc05m1;
    }

    public String getFc05m2() {
        return fc05m2;
    }

    public void setFc05m2(String fc05m2) {
        this.fc05m2 = fc05m2;
    }

    public String getFc05m3() {
        return fc05m3;
    }

    public void setFc05m3(String fc05m3) {
        this.fc05m3 = fc05m3;
    }

    public String getFc05a() {
        return fc05a;
    }

    public void setFc05a(String fc05a) {
        this.fc05a = fc05a;
    }

    public String getFc06m1() {
        return fc06m1;
    }

    public void setFc06m1(String fc06m1) {
        this.fc06m1 = fc06m1;
    }

    public String getFc06m2() {
        return fc06m2;
    }

    public void setFc06m2(String fc06m2) {
        this.fc06m2 = fc06m2;
    }

    public String getFc06m3() {
        return fc06m3;
    }

    public void setFc06m3(String fc06m3) {
        this.fc06m3 = fc06m3;
    }

    public String getFc06a() {
        return fc06a;
    }

    public void setFc06a(String fc06a) {
        this.fc06a = fc06a;
    }

    public String getFc07m1() {
        return fc07m1;
    }

    public void setFc07m1(String fc07m1) {
        this.fc07m1 = fc07m1;
    }

    public String getFc07m2() {
        return fc07m2;
    }

    public void setFc07m2(String fc07m2) {
        this.fc07m2 = fc07m2;
    }

    public String getFc07m3() {
        return fc07m3;
    }

    public void setFc07m3(String fc07m3) {
        this.fc07m3 = fc07m3;
    }

    public String getFc07a() {
        return fc07a;
    }

    public void setFc07a(String fc07a) {
        this.fc07a = fc07a;
    }

    public String getFc08m1() {
        return fc08m1;
    }

    public void setFc08m1(String fc08m1) {
        this.fc08m1 = fc08m1;
    }

    public String getFc08m2() {
        return fc08m2;
    }

    public void setFc08m2(String fc08m2) {
        this.fc08m2 = fc08m2;
    }

    public String getFc08m3() {
        return fc08m3;
    }

    public void setFc08m3(String fc08m3) {
        this.fc08m3 = fc08m3;
    }

    public String getFc08a() {
        return fc08a;
    }

    public void setFc08a(String fc08a) {
        this.fc08a = fc08a;
    }

    public String getFc09m1() {
        return fc09m1;
    }

    public void setFc09m1(String fc09m1) {
        this.fc09m1 = fc09m1;
    }

    public String getFc09m2() {
        return fc09m2;
    }

    public void setFc09m2(String fc09m2) {
        this.fc09m2 = fc09m2;
    }

    public String getFc09m3() {
        return fc09m3;
    }

    public void setFc09m3(String fc09m3) {
        this.fc09m3 = fc09m3;
    }

    public String getFc09a() {
        return fc09a;
    }

    public void setFc09a(String fc09a) {
        this.fc09a = fc09a;
    }

    public String getFc10m1() {
        return fc10m1;
    }

    public void setFc10m1(String fc10m1) {
        this.fc10m1 = fc10m1;
    }

    public String getFc10m2() {
        return fc10m2;
    }

    public void setFc10m2(String fc10m2) {
        this.fc10m2 = fc10m2;
    }

    public String getFc10m3() {
        return fc10m3;
    }

    public void setFc10m3(String fc10m3) {
        this.fc10m3 = fc10m3;
    }

    public String getFc10a() {
        return fc10a;
    }

    public void setFc10a(String fc10a) {
        this.fc10a = fc10a;
    }

    public String getFc11m1() {
        return fc11m1;
    }

    public void setFc11m1(String fc11m1) {
        this.fc11m1 = fc11m1;
    }

    public String getFc11m2() {
        return fc11m2;
    }

    public void setFc11m2(String fc11m2) {
        this.fc11m2 = fc11m2;
    }

    public String getFc11m3() {
        return fc11m3;
    }

    public void setFc11m3(String fc11m3) {
        this.fc11m3 = fc11m3;
    }

    public String getFc11a() {
        return fc11a;
    }

    public void setFc11a(String fc11a) {
        this.fc11a = fc11a;
    }

    public String getFc12m1() {
        return fc12m1;
    }

    public void setFc12m1(String fc12m1) {
        this.fc12m1 = fc12m1;
    }

    public String getFc12m2() {
        return fc12m2;
    }

    public void setFc12m2(String fc12m2) {
        this.fc12m2 = fc12m2;
    }

    public String getFc12m3() {
        return fc12m3;
    }

    public void setFc12m3(String fc12m3) {
        this.fc12m3 = fc12m3;
    }

    public String getFc12a() {
        return fc12a;
    }

    public void setFc12a(String fc12a) {
        this.fc12a = fc12a;
    }

    public String getFc13m1() {
        return fc13m1;
    }

    public void setFc13m1(String fc13m1) {
        this.fc13m1 = fc13m1;
    }

    public String getFc13m2() {
        return fc13m2;
    }

    public void setFc13m2(String fc13m2) {
        this.fc13m2 = fc13m2;
    }

    public String getFc13m3() {
        return fc13m3;
    }

    public void setFc13m3(String fc13m3) {
        this.fc13m3 = fc13m3;
    }

    public String getFc13a() {
        return fc13a;
    }

    public void setFc13a(String fc13a) {
        this.fc13a = fc13a;
    }

    public String getFc14m1() {
        return fc14m1;
    }

    public void setFc14m1(String fc14m1) {
        this.fc14m1 = fc14m1;
    }

    public String getFc14m2() {
        return fc14m2;
    }

    public void setFc14m2(String fc14m2) {
        this.fc14m2 = fc14m2;
    }

    public String getFc14m3() {
        return fc14m3;
    }

    public void setFc14m3(String fc14m3) {
        this.fc14m3 = fc14m3;
    }

    public String getFc14a() {
        return fc14a;
    }

    public void setFc14a(String fc14a) {
        this.fc14a = fc14a;
    }

    public String getFd01() {
        return fd01;
    }

    public void setFd01(String fd01) {
        this.fd01 = fd01;
    }

    public String getFd0196x() {
        return fd0196x;
    }

    public void setFd0196x(String fd0196x) {
        this.fd0196x = fd0196x;
    }

    public String getFe01() {
        return fe01;
    }

    public void setFe01(String fe01) {
        this.fe01 = fe01;
    }

    public String getFe0196x() {
        return fe0196x;
    }

    public void setFe0196x(String fe0196x) {
        this.fe0196x = fe0196x;
    }

    public String getFf01() {
        return ff01;
    }

    public void setFf01(String ff01) {
        this.ff01 = ff01;
    }

    public String getFf02d() {
        return ff02d;
    }

    public void setFf02d(String ff02d) {
        this.ff02d = ff02d;
    }

    public String getFf03() {
        return ff03;
    }

    public void setFf03(String ff03) {
        this.ff03 = ff03;
    }

    public String getFf04() {
        return ff04;
    }

    public void setFf04(String ff04) {
        this.ff04 = ff04;
    }

    public String getFf05() {
        return ff05;
    }

    public void setFf05(String ff05) {
        this.ff05 = ff05;
    }

    public String getFf06() {
        return ff06;
    }

    public void setFf06(String ff06) {
        this.ff06 = ff06;
    }

    public String getFg01() {
        return fg01;
    }

    public void setFg01(String fg01) {
        this.fg01 = fg01;
    }

    public String getFg02() {
        return fg02;
    }

    public void setFg02(String fg02) {
        this.fg02 = fg02;
    }

    public String getFg03() {
        return fg03;
    }

    public void setFg03(String fg03) {
        this.fg03 = fg03;
    }

    public String getFg04() {
        return fg04;
    }

    public void setFg04(String fg04) {
        this.fg04 = fg04;
    }

    public String getFg05() {
        return fg05;
    }

    public void setFg05(String fg05) {
        this.fg05 = fg05;
    }

    public String getFh01() {
        return fh01;
    }

    public void setFh01(String fh01) {
        this.fh01 = fh01;
    }

    public String getFh02() {
        return fh02;
    }

    public void setFh02(String fh02) {
        this.fh02 = fh02;
    }

    public String getFh03() {
        return fh03;
    }

    public void setFh03(String fh03) {
        this.fh03 = fh03;
    }

    public String getFh04() {
        return fh04;
    }

    public void setFh04(String fh04) {
        this.fh04 = fh04;
    }

    public String getFh05() {
        return fh05;
    }

    public void setFh05(String fh05) {
        this.fh05 = fh05;
    }

    public String getFh06() {
        return fh06;
    }

    public void setFh06(String fh06) {
        this.fh06 = fh06;
    }

    public String getFh07() {
        return fh07;
    }

    public void setFh07(String fh07) {
        this.fh07 = fh07;
    }

    public String getFi01() {
        return fi01;
    }

    public void setFi01(String fi01) {
        this.fi01 = fi01;
    }

    public String getFi02() {
        return fi02;
    }

    public void setFi02(String fi02) {
        this.fi02 = fi02;
    }

    public String getFj01() {
        return fj01;
    }

    public void setFj01(String fj01) {
        this.fj01 = fj01;
    }

    public String getFj02() {
        return fj02;
    }

    public void setFj02(String fj02) {
        this.fj02 = fj02;
    }

    public String getFj03() {
        return fj03;
    }

    public void setFj03(String fj03) {
        this.fj03 = fj03;
    }

    public String getFk01() {
        return fk01;
    }

    public void setFk01(String fk01) {
        this.fk01 = fk01;
    }

    public String getFk02() {
        return fk02;
    }

    public void setFk02(String fk02) {
        this.fk02 = fk02;
    }

    public String getFk03() {
        return fk03;
    }

    public void setFk03(String fk03) {
        this.fk03 = fk03;
    }

    public String getFl01() {
        return fl01;
    }

    public void setFl01(String fl01) {
        this.fl01 = fl01;
    }

    public String getFl02() {
        return fl02;
    }

    public void setFl02(String fl02) {
        this.fl02 = fl02;
    }

    public String getFl03() {
        return fl03;
    }

    public void setFl03(String fl03) {
        this.fl03 = fl03;
    }

    public String getFl04() {
        return fl04;
    }

    public void setFl04(String fl04) {
        this.fl04 = fl04;
    }

    public String getFl05() {
        return fl05;
    }

    public void setFl05(String fl05) {
        this.fl05 = fl05;
    }

    public String getFl06() {
        return fl06;
    }

    public void setFl06(String fl06) {
        this.fl06 = fl06;
    }

    public String getFm01() {
        return fm01;
    }

    public void setFm01(String fm01) {
        this.fm01 = fm01;
    }

    public String getFm02() {
        return fm02;
    }

    public void setFm02(String fm02) {
        this.fm02 = fm02;
    }

    public String getFm03() {
        return fm03;
    }

    public void setFm03(String fm03) {
        this.fm03 = fm03;
    }

    public String getFm04() {
        return fm04;
    }

    public void setFm04(String fm04) {
        this.fm04 = fm04;
    }

    public String getFm05() {
        return fm05;
    }

    public void setFm05(String fm05) {
        this.fm05 = fm05;
    }

    public String getFm06() {
        return fm06;
    }

    public void setFm06(String fm06) {
        this.fm06 = fm06;
    }

    public String getFm07() {
        return fm07;
    }

    public void setFm07(String fm07) {
        this.fm07 = fm07;
    }

    public String getFm08() {
        return fm08;
    }

    public void setFm08(String fm08) {
        this.fm08 = fm08;
    }

    public String getFn01() {
        return fn01;
    }

    public void setFn01(String fn01) {
        this.fn01 = fn01;
    }

    public String getFn02() {
        return fn02;
    }

    public void setFn02(String fn02) {
        this.fn02 = fn02;
    }

    public String getFn03() {
        return fn03;
    }

    public void setFn03(String fn03) {
        this.fn03 = fn03;
    }

    public String getFo01a() {
        return fo01a;
    }

    public void setFo01a(String fo01a) {
        this.fo01a = fo01a;
    }

    public String getFo01b() {
        return fo01b;
    }

    public void setFo01b(String fo01b) {
        this.fo01b = fo01b;
    }

    public String getFo02a() {
        return fo02a;
    }

    public void setFo02a(String fo02a) {
        this.fo02a = fo02a;
    }

    public String getFo02b() {
        return fo02b;
    }

    public void setFo02b(String fo02b) {
        this.fo02b = fo02b;
    }

    public String getFo03a() {
        return fo03a;
    }

    public void setFo03a(String fo03a) {
        this.fo03a = fo03a;
    }

    public String getFo03b() {
        return fo03b;
    }

    public void setFo03b(String fo03b) {
        this.fo03b = fo03b;
    }

    public String getFo04a() {
        return fo04a;
    }

    public void setFo04a(String fo04a) {
        this.fo04a = fo04a;
    }

    public String getFo04b() {
        return fo04b;
    }

    public void setFo04b(String fo04b) {
        this.fo04b = fo04b;
    }

    public String getFo05a() {
        return fo05a;
    }

    public void setFo05a(String fo05a) {
        this.fo05a = fo05a;
    }

    public String getFo05b() {
        return fo05b;
    }

    public void setFo05b(String fo05b) {
        this.fo05b = fo05b;
    }

    public String getFp01a() {
        return fp01a;
    }

    public void setFp01a(String fp01a) {
        this.fp01a = fp01a;
    }

    public String getFp01b() {
        return fp01b;
    }

    public void setFp01b(String fp01b) {
        this.fp01b = fp01b;
    }

    public String getFp01c() {
        return fp01c;
    }

    public void setFp01c(String fp01c) {
        this.fp01c = fp01c;
    }

    public String getFp01dd() {
        return fp01dd;
    }

    public void setFp01dd(String fp01dd) {
        this.fp01dd = fp01dd;
    }

    public String getFp01dm() {
        return fp01dm;
    }

    public void setFp01dm(String fp01dm) {
        this.fp01dm = fp01dm;
    }

    public String getFp02a() {
        return fp02a;
    }

    public void setFp02a(String fp02a) {
        this.fp02a = fp02a;
    }

    public String getFp02b() {
        return fp02b;
    }

    public void setFp02b(String fp02b) {
        this.fp02b = fp02b;
    }

    public String getFp02c() {
        return fp02c;
    }

    public void setFp02c(String fp02c) {
        this.fp02c = fp02c;
    }

    public String getFp02dd() {
        return fp02dd;
    }

    public void setFp02dd(String fp02dd) {
        this.fp02dd = fp02dd;
    }

    public String getFp02dm() {
        return fp02dm;
    }

    public void setFp02dm(String fp02dm) {
        this.fp02dm = fp02dm;
    }

    public String getFp03a() {
        return fp03a;
    }

    public void setFp03a(String fp03a) {
        this.fp03a = fp03a;
    }

    public String getFp03b() {
        return fp03b;
    }

    public void setFp03b(String fp03b) {
        this.fp03b = fp03b;
    }

    public String getFp03c() {
        return fp03c;
    }

    public void setFp03c(String fp03c) {
        this.fp03c = fp03c;
    }

    public String getFp03dd() {
        return fp03dd;
    }

    public void setFp03dd(String fp03dd) {
        this.fp03dd = fp03dd;
    }

    public String getFp03dm() {
        return fp03dm;
    }

    public void setFp03dm(String fp03dm) {
        this.fp03dm = fp03dm;
    }

    public String getFp04a() {
        return fp04a;
    }

    public void setFp04a(String fp04a) {
        this.fp04a = fp04a;
    }

    public String getFp04b() {
        return fp04b;
    }

    public void setFp04b(String fp04b) {
        this.fp04b = fp04b;
    }

    public String getFp04c() {
        return fp04c;
    }

    public void setFp04c(String fp04c) {
        this.fp04c = fp04c;
    }

    public String getFp04dd() {
        return fp04dd;
    }

    public void setFp04dd(String fp04dd) {
        this.fp04dd = fp04dd;
    }

    public String getFp04dm() {
        return fp04dm;
    }

    public void setFp04dm(String fp04dm) {
        this.fp04dm = fp04dm;
    }

    public String getFp05a() {
        return fp05a;
    }

    public void setFp05a(String fp05a) {
        this.fp05a = fp05a;
    }

    public String getFp05b() {
        return fp05b;
    }

    public void setFp05b(String fp05b) {
        this.fp05b = fp05b;
    }

    public String getFp05c() {
        return fp05c;
    }

    public void setFp05c(String fp05c) {
        this.fp05c = fp05c;
    }

    public String getFp05dd() {
        return fp05dd;
    }

    public void setFp05dd(String fp05dd) {
        this.fp05dd = fp05dd;
    }

    public String getFp05dm() {
        return fp05dm;
    }

    public void setFp05dm(String fp05dm) {
        this.fp05dm = fp05dm;
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

    public String getHa01() {
        return ha01;
    }

    public void setHa01(String ha01) {
        this.ha01 = ha01;
    }

    public String getHa02() {
        return ha02;
    }

    public void setHa02(String ha02) {
        this.ha02 = ha02;
    }

    public String getHa03() {
        return ha03;
    }

    public void setHa03(String ha03) {
        this.ha03 = ha03;
    }

    public String getHa04() {
        return ha04;
    }

    public void setHa04(String ha04) {
        this.ha04 = ha04;
    }

    public String getHa05() {
        return ha05;
    }

    public void setHa05(String ha05) {
        this.ha05 = ha05;
    }

    public String getHa06() {
        return ha06;
    }

    public void setHa06(String ha06) {
        this.ha06 = ha06;
    }

    public String getHa07() {
        return ha07;
    }

    public void setHa07(String ha07) {
        this.ha07 = ha07;
    }

    public String getHa08() {
        return ha08;
    }

    public void setHa08(String ha08) {
        this.ha08 = ha08;
    }

    public String getHa09() {
        return ha09;
    }

    public void setHa09(String ha09) {
        this.ha09 = ha09;
    }

    public String getHa10() {
        return ha10;
    }

    public void setHa10(String ha10) {
        this.ha10 = ha10;
    }

    public String getHa11() {
        return ha11;
    }

    public void setHa11(String ha11) {
        this.ha11 = ha11;
    }

    public String getHa12() {
        return ha12;
    }

    public void setHa12(String ha12) {
        this.ha12 = ha12;
    }

    public String getHa13() {
        return ha13;
    }

    public void setHa13(String ha13) {
        this.ha13 = ha13;
    }

    public String getHa14() {
        return ha14;
    }

    public void setHa14(String ha14) {
        this.ha14 = ha14;
    }

    public String getHa14a() {
        return ha14a;
    }

    public void setHa14a(String ha14a) {
        this.ha14a = ha14a;
    }

    public String getHa14b() {
        return ha14b;
    }

    public void setHa14b(String ha14b) {
        this.ha14b = ha14b;
    }

    public String getHa14c() {
        return ha14c;
    }

    public void setHa14c(String ha14c) {
        this.ha14c = ha14c;
    }

    public String getHa14d() {
        return ha14d;
    }

    public void setHa14d(String ha14d) {
        this.ha14d = ha14d;
    }

    public String getHa14e() {
        return ha14e;
    }

    public void setHa14e(String ha14e) {
        this.ha14e = ha14e;
    }

    public String getHa14f() {
        return ha14f;
    }

    public void setHa14f(String ha14f) {
        this.ha14f = ha14f;
    }

    public String getHa1496() {
        return ha1496;
    }

    public void setHa1496(String ha1496) {
        this.ha1496 = ha1496;
    }

    public String getHa1496x() {
        return ha1496x;
    }

    public void setHa1496x(String ha1496x) {
        this.ha1496x = ha1496x;
    }

    public String getHb01() {
        return hb01;
    }

    public void setHb01(String hb01) {
        this.hb01 = hb01;
    }

    public String getHb02() {
        return hb02;
    }

    public void setHb02(String hb02) {
        this.hb02 = hb02;
    }

    public String getHb03() {
        return hb03;
    }

    public void setHb03(String hb03) {
        this.hb03 = hb03;
    }

    public String getHb04() {
        return hb04;
    }

    public void setHb04(String hb04) {
        this.hb04 = hb04;
    }

    public String getHb05() {
        return hb05;
    }

    public void setHb05(String hb05) {
        this.hb05 = hb05;
    }

    public String getHb06() {
        return hb06;
    }

    public void setHb06(String hb06) {
        this.hb06 = hb06;
    }

    public String getHb07() {
        return hb07;
    }

    public void setHb07(String hb07) {
        this.hb07 = hb07;
    }

    public String getHb07a() {
        return hb07a;
    }

    public void setHb07a(String hb07a) {
        this.hb07a = hb07a;
    }

    public String getHb07b() {
        return hb07b;
    }

    public void setHb07b(String hb07b) {
        this.hb07b = hb07b;
    }

    public String getHb07c() {
        return hb07c;
    }

    public void setHb07c(String hb07c) {
        this.hb07c = hb07c;
    }

    public String getHb07d() {
        return hb07d;
    }

    public void setHb07d(String hb07d) {
        this.hb07d = hb07d;
    }

    public String getHb0796() {
        return hb0796;
    }

    public void setHb0796(String hb0796) {
        this.hb0796 = hb0796;
    }

    public String getHb0796x() {
        return hb0796x;
    }

    public void setHb0796x(String hb0796x) {
        this.hb0796x = hb0796x;
    }

    public String getHc01() {
        return hc01;
    }

    public void setHc01(String hc01) {
        this.hc01 = hc01;
    }

    public String getHc02() {
        return hc02;
    }

    public void setHc02(String hc02) {
        this.hc02 = hc02;
    }

    public String getHc03() {
        return hc03;
    }

    public void setHc03(String hc03) {
        this.hc03 = hc03;
    }

    public String getHc04() {
        return hc04;
    }

    public void setHc04(String hc04) {
        this.hc04 = hc04;
    }

    public String getHc05() {
        return hc05;
    }

    public void setHc05(String hc05) {
        this.hc05 = hc05;
    }

    public String getHc06() {
        return hc06;
    }

    public void setHc06(String hc06) {
        this.hc06 = hc06;
    }

    public String getHc06a() {
        return hc06a;
    }

    public void setHc06a(String hc06a) {
        this.hc06a = hc06a;
    }

    public String getHc06b() {
        return hc06b;
    }

    public void setHc06b(String hc06b) {
        this.hc06b = hc06b;
    }

    public String getHc06c() {
        return hc06c;
    }

    public void setHc06c(String hc06c) {
        this.hc06c = hc06c;
    }

    public String getHc06d() {
        return hc06d;
    }

    public void setHc06d(String hc06d) {
        this.hc06d = hc06d;
    }

    public String getHc06e() {
        return hc06e;
    }

    public void setHc06e(String hc06e) {
        this.hc06e = hc06e;
    }

    public String getHc0696() {
        return hc0696;
    }

    public void setHc0696(String hc0696) {
        this.hc0696 = hc0696;
    }

    public String getHc0696x() {
        return hc0696x;
    }

    public void setHc0696x(String hc0696x) {
        this.hc0696x = hc0696x;
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


    public Forms Sync(JSONObject jsonObject) throws JSONException {
        this._ID = jsonObject.getString(FormsTable.COLUMN_ID);
        this._UID = jsonObject.getString(FormsTable.COLUMN_UID);
        this.sysdate = jsonObject.getString(FormsTable.COLUMN_SYSDATE);

        this.istatus = jsonObject.getString(FormsTable.COLUMN_ISTATUS);
        this.istatus96x = jsonObject.getString(FormsTable.COLUMN_ISTATUS96x);
        this.endingdatetime = jsonObject.getString(FormsTable.COLUMN_ENDINGDATETIME);

        this.gpsLat = jsonObject.getString(FormsTable.COLUMN_GPSLAT);
        this.gpsLng = jsonObject.getString(FormsTable.COLUMN_GPSLNG);
        this.gpsDT = jsonObject.getString(FormsTable.COLUMN_GPSDATE);
        this.gpsAcc = jsonObject.getString(FormsTable.COLUMN_GPSACC);
        this.deviceID = jsonObject.getString(FormsTable.COLUMN_DEVICEID);
        this.devicetagID = jsonObject.getString(FormsTable.COLUMN_DEVICETAGID);
        this.synced = jsonObject.getString(FormsTable.COLUMN_SYNCED);
        this.synced_date = jsonObject.getString(FormsTable.COLUMN_SYNCED_DATE);
        this.appversion = jsonObject.getString(FormsTable.COLUMN_SYNCED_DATE);

        this.province = jsonObject.getString(FormsTable.COLUMN_PROVINCE);
        this.provinceCode = jsonObject.getString(FormsTable.COLUMN_PROVINCE_CODE);
        this.district = jsonObject.getString(FormsTable.COLUMN_DISTRICT);
        this.districtCode = jsonObject.getString(FormsTable.COLUMN_DISTRICT_CODE);
        this.tehsil = jsonObject.getString(FormsTable.COLUMN_TEHSIL);
        this.tehsilCode = jsonObject.getString(FormsTable.COLUMN_TEHSIL_CODE);
        this.uc = jsonObject.getString(FormsTable.COLUMN_UC);
        this.ucCode = jsonObject.getString(FormsTable.COLUMN_UC_CODE);
        this.hf = jsonObject.getString(FormsTable.COLUMN_HF);
        this.hfCode = jsonObject.getString(FormsTable.COLUMN_HF_CODE);

        this.sB = jsonObject.getString(FormsTable.COLUMN_SB);
        this.sC = jsonObject.getString(FormsTable.COLUMN_SC);
        this.sD = jsonObject.getString(FormsTable.COLUMN_SD);
        this.sE = jsonObject.getString(FormsTable.COLUMN_SE);
        this.sF = jsonObject.getString(FormsTable.COLUMN_SF);
        this.sG = jsonObject.getString(FormsTable.COLUMN_SG);
        this.sH = jsonObject.getString(FormsTable.COLUMN_SH);
        this.sI = jsonObject.getString(FormsTable.COLUMN_SI);

        return this;

    }


    public Forms Hydrate(Cursor cursor) {

        this._ID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ID));
        this._UID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_UID));
        this.sysdate = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SYSDATE));

        this.istatus = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ISTATUS));
        this.istatus96x = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ISTATUS96x));
        this.endingdatetime = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ENDINGDATETIME));

        this.gpsLat = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSLAT));
        this.gpsLng = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSLNG));
        this.gpsDT = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSDATE));
        this.gpsAcc = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSACC));
        this.deviceID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DEVICEID));
        this.devicetagID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DEVICETAGID));
        this.appversion = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_APPVERSION));

        this.province = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_PROVINCE));
        this.provinceCode = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_PROVINCE_CODE));
        this.district = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DISTRICT));
        this.districtCode = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DISTRICT_CODE));
        this.tehsil = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_TEHSIL));
        this.tehsilCode = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_TEHSIL_CODE));
        this.uc = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_UC));
        this.ucCode = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_UC_CODE));
        this.hf = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_HF));
        this.hfCode = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_HF_CODE));

        sbHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SB)));

        return this;
    }


    //TODO: Try this instead of toJSONObject
    @Override
    public String toString() {
        return new GsonBuilder().create().toJson(this, Forms.class);
    }


    public String sBtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("ba01a1", ba01a1)
                    .put("ba01a2", ba01a2)
                    .put("ba01a3", ba01a3)
                    .put("ba01a4", ba01a4)
                    .put("ba01a5", ba01a5)
                    .put("ba01b1", ba01b1)
                    .put("ba01b2", ba01b2)
                    .put("ba01b3", ba01b3)
                    .put("ba01b4", ba01b4)
                    .put("ba01b5", ba01b5)
                    .put("ba01c1", ba01c1)
                    .put("ba01c2", ba01c2)
                    .put("ba01c3", ba01c3)
                    .put("ba01c4", ba01c4)
                    .put("ba01c5", ba01c5)
                    .put("ba01d1", ba01d1)
                    .put("ba01d2", ba01d2)
                    .put("ba01d3", ba01d3)
                    .put("ba01d4", ba01d4)
                    .put("ba01d5", ba01d5)
                    .put("ba01e1", ba01e1)
                    .put("ba01e2", ba01e2)
                    .put("ba01e3", ba01e3)
                    .put("ba01e4", ba01e4)
                    .put("ba01e5", ba01e5)
                    .put("ba01f1", ba01f1)
                    .put("ba01f2", ba01f2)
                    .put("ba01f3", ba01f3)
                    .put("ba01f4", ba01f4)
                    .put("ba01f5", ba01f5)
                    .put("ba01g1", ba01g1)
                    .put("ba01g2", ba01g2)
                    .put("ba01g3", ba01g3)
                    .put("ba01g4", ba01g4)
                    .put("ba01g5", ba01g5)
                    .put("ba01h1", ba01h1)
                    .put("ba01h2", ba01h2)
                    .put("ba01h3", ba01h3)
                    .put("ba01h4", ba01h4)
                    .put("ba01h5", ba01h5);

        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";

        }
        return json.toString();
    }


    public JSONObject toJSONObject() {

        JSONObject json = new JSONObject();

        try {
            json.put(FormsTable.COLUMN_ID, this._ID == null ? JSONObject.NULL : this._ID);

            json.put(FormsTable.COLUMN_UID, this._UID == null ? JSONObject.NULL : this._UID);
            json.put(FormsTable.COLUMN_SYSDATE, this.sysdate == null ? JSONObject.NULL : this.sysdate);
            json.put(FormsTable.COLUMN_ISTATUS, this.istatus == null ? JSONObject.NULL : this.istatus);
            json.put(FormsTable.COLUMN_ISTATUS96x, this.istatus96x == null ? JSONObject.NULL : this.istatus96x);
            json.put(FormsTable.COLUMN_ENDINGDATETIME, this.endingdatetime == null ? JSONObject.NULL : this.endingdatetime);

            json.put(FormsTable.COLUMN_SB, new JSONObject(sBtoString()));

            json.put(FormsTable.COLUMN_GPSLAT, this.gpsLat == null ? JSONObject.NULL : this.gpsLat);
            json.put(FormsTable.COLUMN_GPSLNG, this.gpsLng == null ? JSONObject.NULL : this.gpsLng);
            json.put(FormsTable.COLUMN_GPSDATE, this.gpsDT == null ? JSONObject.NULL : this.gpsDT);
            json.put(FormsTable.COLUMN_GPSACC, this.gpsAcc == null ? JSONObject.NULL : this.gpsAcc);
            json.put(FormsTable.COLUMN_DEVICEID, this.deviceID == null ? JSONObject.NULL : this.deviceID);
            json.put(FormsTable.COLUMN_DEVICETAGID, this.devicetagID == null ? JSONObject.NULL : this.devicetagID);
            json.put(FormsTable.COLUMN_APPVERSION, this.appversion == null ? JSONObject.NULL : this.appversion);

            if (this.sB != null && !this.sB.equals("")) {
                json.put(FormsTable.COLUMN_SB, new JSONObject(this.sB));
            }

            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }


    private void sbHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);

                this.ba01a1 = json.getString("ba01a1");
                this.ba01a2 = json.getString("ba01a2");
                this.ba01a3 = json.getString("ba01a3");
                this.ba01a4 = json.getString("ba01a4");
                this.ba01a5 = json.getString("ba01a5");
                this.ba01b1 = json.getString("ba01b1");
                this.ba01b2 = json.getString("ba01b2");
                this.ba01b3 = json.getString("ba01b3");
                this.ba01b4 = json.getString("ba01b4");
                this.ba01b5 = json.getString("ba01b5");
                this.ba01c1 = json.getString("ba01c1");
                this.ba01c2 = json.getString("ba01c2");
                this.ba01c3 = json.getString("ba01c3");
                this.ba01c4 = json.getString("ba01c4");
                this.ba01c5 = json.getString("ba01c5");
                this.ba01d1 = json.getString("ba01d1");
                this.ba01d2 = json.getString("ba01d2");
                this.ba01d3 = json.getString("ba01d3");
                this.ba01d4 = json.getString("ba01d4");
                this.ba01d5 = json.getString("ba01d5");
                this.ba01e1 = json.getString("ba01e1");
                this.ba01e2 = json.getString("ba01e2");
                this.ba01e3 = json.getString("ba01e3");
                this.ba01e4 = json.getString("ba01e4");
                this.ba01e5 = json.getString("ba01e5");
                this.ba01f1 = json.getString("ba01f1");
                this.ba01f2 = json.getString("ba01f2");
                this.ba01f3 = json.getString("ba01f3");
                this.ba01f4 = json.getString("ba01f4");
                this.ba01f5 = json.getString("ba01f5");
                this.ba01g1 = json.getString("ba01g1");
                this.ba01g2 = json.getString("ba01g2");
                this.ba01g3 = json.getString("ba01g3");
                this.ba01g4 = json.getString("ba01g4");
                this.ba01g5 = json.getString("ba01g5");
                this.ba01h1 = json.getString("ba01h1");
                this.ba01h2 = json.getString("ba01h2");
                this.ba01h3 = json.getString("ba01h3");
                this.ba01h4 = json.getString("ba01h4");
                this.ba01h5 = json.getString("ba01h5");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


}
