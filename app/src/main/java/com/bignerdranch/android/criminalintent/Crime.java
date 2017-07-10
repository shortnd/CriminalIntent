package com.bignerdranch.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/** THIS IS THE MODEL LAYER FOR THIS APPLICATION */

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        // Creates a random unique ID for each crime
        mId = UUID.randomUUID();
        // Saves the data as today's date
        mDate = new Date();
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

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
