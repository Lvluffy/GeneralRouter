package com.luffy.generalrouterapi;

import android.app.Application;

import com.luffy.router.annotation.Components;
import com.luffy.router.processor.RouterHelper;

@Components({"school", "student"})
public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        RouterHelper.install();
    }
}
