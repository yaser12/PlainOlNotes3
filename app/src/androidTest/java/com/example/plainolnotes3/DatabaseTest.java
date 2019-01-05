package com.example.plainolnotes3;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.example.plainolnotes3.database.AppDatabase;
import com.example.plainolnotes3.database.NoteDao;
import com.example.plainolnotes3.utilities.SampleData;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class DatabaseTest {
    public static final String TAG="Junit";
    private AppDatabase mDB;
    private NoteDao mDao;

    @Before
    public void creatDb(){
        Context context=InstrumentationRegistry.getTargetContext();
        mDB= Room.inMemoryDatabaseBuilder(context,AppDatabase.class).build();
        mDao=mDB.noteDao();
        Log.i(TAG,"createDb");


    }
    @After
    public void closeDB(){

        mDB.close();
        Log.i(TAG,"closeDb");
    }
    @Test
    public void createAndRetrieveNotes(){
        mDao.insertAll(SampleData.getNotes());
        int coutnt=mDao.getCount();
        Log.i(TAG,"count = "+coutnt);
        assertEquals(SampleData.getNotes().size(),coutnt);
    }
}
