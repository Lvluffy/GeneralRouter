package com.luffy.generalrouterapi;

import android.app.Application;

import com.luffy.routerannotationlib.Components;
import com.luffy.routercompilerlib.RouterHelper;

@Components({"school", "student"})
public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        RouterHelper.install();
    }
}
