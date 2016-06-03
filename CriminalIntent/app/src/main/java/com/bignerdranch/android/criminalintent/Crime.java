package com.bignerdranch.android.criminalintent;

import java.util.StringTokenizer;
import java.util.UUID;

/**
 * Created by Parents on 29.05.2016.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime(){
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
