package com.fausgoal.freeline.sample;

import android.app.Application;

import com.antfortune.freeline.FreelineCore;

/**
 * Description：Application
 * <br/><br/>Created by Fausgoal on 2016/10/21.
 * <br/><br/>
 */
public class GLAPP extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // init freeline core
        FreelineCore.init(this);
    }
}
