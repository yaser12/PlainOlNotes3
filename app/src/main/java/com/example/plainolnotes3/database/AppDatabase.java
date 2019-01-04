package com.example.plainolnotes3.database;

import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverter;

@TypeConverter(DateConverter.class)
public class AppDatabase extends RoomDatabase {
}
