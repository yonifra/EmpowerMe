package com.cryptocodes.empowerme;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by JonathanF on 12/3/2015.
 */


public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault("fonts/Chunkfive.otf");
    }
}
