package com.example.android.sqliteexample.DBUtil;

import android.provider.BaseColumns;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;

/**
 * Created by DaHoon on 2017-01-20.
 */
@RealmClass
public class MemoRealm extends RealmObject {

    @PrimaryKey
    private int id;

    private String title;
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
