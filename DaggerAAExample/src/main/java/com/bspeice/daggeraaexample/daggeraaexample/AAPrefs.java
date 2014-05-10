package com.bspeice.daggeraaexample.daggeraaexample;

import org.androidannotations.annotations.sharedpreferences.DefaultBoolean;
import org.androidannotations.annotations.sharedpreferences.SharedPref;

/**
 * Created by bspeice on 5/10/14.
 */
@SharedPref
public interface AAPrefs {

    @DefaultBoolean(value = false)
    boolean isWorking();
}
