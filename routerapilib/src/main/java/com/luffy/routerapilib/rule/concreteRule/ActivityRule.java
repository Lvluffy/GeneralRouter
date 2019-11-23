package com.luffy.routerapilib.rule.concreteRule;

import android.app.Activity;

import com.luffy.routerapilib.exception.ActivityNotRouteException;
import com.luffy.routerapilib.rule.abstractRule.BaseIntentRule;

/**
 * Created by lvlufei on 2019/1/9
 *
 * @desc Activity-路由规则实现类
 */
public class ActivityRule extends BaseIntentRule<Activity> {

    /**
     * Activity-路由计划
     */
    public static final String ACTIVITY_SCHEME = "Activity://";

    @Override
    public void throwException(String pattern) {
        throw new ActivityNotRouteException(pattern);
    }
}
