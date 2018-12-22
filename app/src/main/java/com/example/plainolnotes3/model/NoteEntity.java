package com.example.plainolnotes3.model;

import java.util.Date;

public class NoteEntity {
    private  int id;
    
    private Date date;
    private String text;

    public NoteEntity(Date date, String text) {
        this.date = date;

        this.text = text;
    }

    public NoteEntity(int id, Date date, String text) {
        this.id = id;
        this.text = text;
        this.date = date;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
