package com.luffy.router.api.rule.abstractRule;

import android.content.Context;
import android.content.Intent;

import java.util.HashMap;

/**
 * Created by lvlufei on 2019/1/9
 *
 * @desc 公共的-路由规则实现类
 */
public abstract class BaseIntentRule<T> implements Rule<T, Intent> {

    private HashMap<String, Class<T>> mIntentRules;

    public BaseIntentRule() {
        mIntentRules = new HashMap<>();
    }

    @Override
    public void router(String pattern, Class<T> klass) {
        mIntentRules.put(pattern, klass);
    }

    @Override
    public Intent invoke(Context ctx, String pattern) {
        Class<T> klass = mIntentRules.get(pattern);
        if (klass == null) {
            throwException(pattern);
        }
        return new Intent(ctx, klass);
    }

    @Override
    public boolean resolveRule(String pattern) {
        return mIntentRules.get(pattern) != null;
    }

    /**
     * 当找不到路由规则时抛出异常
     *
     * @param pattern 路由uri（路由模式）
     */
    public abstract void throwException(String pattern);
}