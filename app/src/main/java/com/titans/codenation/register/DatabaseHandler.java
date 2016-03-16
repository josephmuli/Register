package com.titans.codenation.register;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by joseph on 3/16/16.
 */
public class DatabaseHandler extends SQLiteOpenHelper {


    public static final String DATABASE_NAME = "SQLiteExample.db";
    public static final int DATABASE_VERSION = 1;
    public static final String PERSON_TABLE_NAME = "person";
    public static final String PERSON_COLUMN_ID = "_id";
    public static final String PERSON_COLUMN_NAME = "name";
    public static final String PERSON_COLUMN_GENDER = "gender";
    public static final String PERSON_COLUMN_AGE = "age";



    //constructor
    public DatabaseHandler(Context context){
        super(context, DATABASE_NAME , null, DATABASE_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {

        //where each table schema is specified, where new db is created.
        db.execSQL("CREATE TABLE " + PERSON_TABLE_NAME + "("
                + PERSON_COLUMN_ID + INTEGER  PRIMARY KEY, "" +
                "P" ); PERSON_COLUMN_NAME + "TEXT, " + PERSON_COLUMN_NAME
                + "TEXT, " + PERSON_COLUMN_GENDER = "TEXT, " +
                PERSON_COLUMN_AGE + "INTEGER)"
        );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + PERSON_TABLE_NAME);

    }
}
