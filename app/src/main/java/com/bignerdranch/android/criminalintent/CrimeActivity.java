package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * CONTROLLER FOR THE FRAGMENTS TO BE HOSTED
 */

public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
