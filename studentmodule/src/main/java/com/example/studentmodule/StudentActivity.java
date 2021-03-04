package com.example.studentmodule;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.luffy.routerannotationlib.StaticRouter;
import com.luffy.router.api.router.RouterInvoke;
import com.luffy.router.api.rule.concreteRule.ActivityRule;

/**
 * Created by lvlufei on 2019/1/9
 *
 * @desc 学生界面
 */
@StaticRouter(ActivityRule.ACTIVITY_SCHEME + "StudentActivity")
public class StudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
    }

    public void click(View view) {
        RouterInvoke.invokeIntent(this, ActivityRule.ACTIVITY_SCHEME + "SchoolActivity");
    }
}
