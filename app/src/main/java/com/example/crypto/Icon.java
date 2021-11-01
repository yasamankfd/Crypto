package com.example.crypto;

import android.content.Intent;

public class Icon {

    private String name;
    private int id;
    private Intent activity;

    public Icon(String name, int id, Intent activity) {
        this.name = name;
        this.id = id;
        this.activity = activity;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Intent getActivity() {
        return activity;
    }
}
