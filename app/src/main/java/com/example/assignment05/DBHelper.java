package com.example.assignment05;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    private static final int VERSION = 1;
    private static final String DBNAME = "login.db";
    private static final String LOGIN_TABLE = "login";
//    private static final String SIGN_UP_TABLE = "signUp";

    private static final String USERNAME = "userName", PASSWORD = "password";

    public DBHelper(Context context) {
        super(context, DBNAME, null, VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String LOGIN_TABLE_CREATE_QUERY = "CREATE TABLE "+LOGIN_TABLE+
                "("
                +USERNAME + " TEXT PRIMARY KEY,"
                +PASSWORD + " TEXT"
                +")";
        db.execSQL(LOGIN_TABLE_CREATE_QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String DROP_LOGIN_TABLE_QUERY = "DROP TABLE IF EXISTS " + LOGIN_TABLE;
        db.execSQL(DROP_LOGIN_TABLE_QUERY);
    }

    public Boolean insertData(String username, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("username", username);
        contentValues.put("password", password);
        long result = db.insert(LOGIN_TABLE, null,contentValues);
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }

    //check username
    public Boolean checkUsername (String username) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("Select * from login where username = ?",
                new String[]{username});
        if (cursor.getCount() > 0) {
            return true;
        } else {
            return false;
        }
    }

    //check username and password
    public Boolean checkUsernameAndPassword(String username, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("Select * from login where username = ? and password = ?",
                new String[]{username,password});
        if (cursor.getCount() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
