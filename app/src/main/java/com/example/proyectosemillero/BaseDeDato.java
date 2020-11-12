package com.example.proyectosemillero;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BaseDeDato extends SQLiteOpenHelper {

    final String tabla = "CREATE TABLE InicioyRegistro (email TEXT PRIMARY KEY NOT NULL, nombre TEXT NOT NULL, password NOT NULL)";

    public BaseDeDato(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(tabla);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        db.execSQL("DROP TABLE IF EXISTS Iniciosesion");
        db.execSQL(tabla);

    }
}
