package com.example.schoolmodule;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.luffy.routerannotationlib.StaticRouter;
import com.luffy.router.api.router.RouterInvoke;
import com.luffy.router.api.rule.concreteRule.ActivityRule;

/**
 * Created by lvlufei on 2019/1/9
 *
 * @desc 院校界面
 */
@StaticRouter(ActivityRule.ACTIVITY_SCHEME + "SchoolActivity")
public class SchoolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);
    }

    public void click(View view) {
        RouterInvoke.invokeIntent(this, ActivityRule.ACTIVITY_SCHEME + "StudentActivity");
    }
}
