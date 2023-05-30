package com.example.appdiary;
//10120133 - Muhammad Saeful Rizki - IF 4
import android.database.Cursor;

import com.example.appdiary.Diary.Note;


public interface NoteInterface {
    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}