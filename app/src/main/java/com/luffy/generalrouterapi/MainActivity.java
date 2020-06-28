package com.luffy.generalrouterapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.luffy.routerapilib.router.RouterInvoke;
import com.luffy.routerapilib.rule.concreteRule.ActivityRule;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        RouterInvoke.invokeIntent(this, ActivityRule.ACTIVITY_SCHEME + "SchoolActivity");
    }
}
