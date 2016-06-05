package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Rustam on 04.06.2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment CreateFragment() {
        return new CrimeListFragment();
    }
}
