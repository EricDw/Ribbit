package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this,
                "CwL3gDNiUgcFxVJSaTDkjNdu31sDf6jhSb17FNWZ",
                "UIuA5eB77MvM4eiRQMEDHUftjzNkFPYUPKQgVN12");
    }
}
