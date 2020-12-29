package edu.aku.hassannaqvi.smk_pwd.contracts;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class PatientsContract {

    public static String CONTENT_AUTHORITY = "edu.aku.hassannaqvi.smk_pwd";

    public static abstract class PatientsTable implements BaseColumns {
        public static final String TABLE_NAME = "Patients";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SERIALNO = "serialno";
        public static final String COLUMN_PROVINCE = "province";
        public static final String COLUMN_PROVINCE_CODE = "province_code";
        public static final String COLUMN_DISTRICT = "district";
        public static final String COLUMN_DISTRICT_CODE = "district_code";
        public static final String COLUMN_TEHSIL = "tehsil";
        public static final String COLUMN_TEHSIL_CODE = "tehsil_code";
        public static final String COLUMN_UC = "uc";
        public static final String COLUMN_UC_CODE = "uc_code";
        public static final String COLUMN_HF = "hf";
        public static final String COLUMN_HF_CODE = "hf_code";
        public static final String COLUMN_SG = "si";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "tagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_STATUS = "status";
        public static final String COLUMN_APPVERSION = "appversion";
        public static String PATH = "patients";
        public static final String CONTENT_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH;
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH;
        public static Uri CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY)
                .buildUpon().appendPath(PATH).build();
        public static String SERVER_URL = "sync.php";


        public static String getMovieKeyFromUri(Uri uri) {
            return uri.getPathSegments().get(1);
        }

        public static Uri buildUriWithId(long id) {
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }
    }
}