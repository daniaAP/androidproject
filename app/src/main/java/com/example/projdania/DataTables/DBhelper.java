package com.example.projdania.DataTables;

import static com.example.projdania.DataTables.QueryString.*;
import static com.example.projdania.DataTables.TablesString.ProductTable.*;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Bundle;
import android.provider.BaseColumns;

public class DBhelper
{

    private static final String DATABASE_NAME = "MyProject.db";
    private static final int DATABASE_VERSION = 1;


    private Context mContext;
    private DataBaseHelper dbhelper;
    private SQLiteDatabase db;

    public SQLiteDatabase getDb() {
        return db;
    }

    private class DataBaseHelper extends SQLiteOpenHelper {
        DataBaseHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            //sqLiteDatabase.execSQL(SQL_CREATE_PRODUCT);

        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
            sqLiteDatabase.execSQL(SQL_DELETE_PRODUCT);
            onCreate(sqLiteDatabase);
        }

    }
    public void Reset(){

        dbhelper.onUpgrade(db,1,1);
    }
    public DBhelper(Context context){
        mContext = context;
        dbhelper = new DataBaseHelper(mContext);
    }
    public DBhelper OpenWriteAble() throws SQLException{
        db = dbhelper.getWritableDatabase();
        return this;
    }
    public DBhelper OpenReadAble() throws SQLException{
        db = dbhelper.getReadableDatabase();
        return this;
    }

    public void Close(){
        dbhelper.close();
    }

}


