package com.example.studentmodule;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.luffy.routerannotationlib.StaticRouter;
import com.luffy.routerapilib.router.Router;
import com.luffy.routerapilib.rule.concreteRule.ActivityRule;

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
        if (Router.resolveRouter(ActivityRule.ACTIVITY_SCHEME + "SchoolActivity")) {
            Intent it = Router.invoke(this, ActivityRule.ACTIVITY_SCHEME + "SchoolActivity");
            startActivity(it);
        }
    }
}
