package com.example.przygotowaniedokolosa

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.os.Build

class MyDatabaseHelper(context: Context?) :
    SQLiteOpenHelper(context, NAME, null, VERSION) {
    companion object{
        val NAME ="BazaImion"
        val VERSION = 1
        val TABLE_NAME = "Imiona"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val createQuery =
            "CREATE TABLE ${TABLE_NAME}(id INTEGER PRIMARY KEY AUTOINCREMENT, Imie TEXT)"
        db?.execSQL(createQuery)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }
    fun insert(imie :String){
        var db = this.writableDatabase
        var myValues = ContentValues()
        myValues.apply {
            put("Imie", imie)
        }
        db.insert(TABLE_NAME, null, myValues)
        db.close()
    }
    fun selectAll(): ArrayList<String> {
        var results = ArrayList<String>()
        var db = this.readableDatabase
        val cursor = db.rawQuery("SELECT * FROM $TABLE_NAME", null)
        if (cursor.moveToFirst()) {
            while (!cursor.isAfterLast) {
                results.add("${cursor.getString(1)}")
                cursor.moveToNext()
            }
        }
        db.close()
        return results
    }

}