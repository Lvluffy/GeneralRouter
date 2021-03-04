package com.luffy.router.api.router;

import android.content.Context;

import com.luffy.router.api.exception.NotRouteException;
import com.luffy.router.api.rule.abstractRule.Rule;
import com.luffy.router.api.rule.concreteRule.ActivityRule;
import com.luffy.router.api.rule.concreteRule.ReceiverRule;
import com.luffy.router.api.rule.concreteRule.ServiceRule;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by lvlufei on 2019/1/9
 *
 * @desc 内部路由器（Router真实调用类）
 */
public class RouterInternal {

    private static RouterInternal sInstance;

    /**
     * scheme->路由规则
     */
    private HashMap<String, Rule> mRules;

    private RouterInternal() {
        mRules = new HashMap<>();
        initDefaultRouter();
    }

    /**
     * 添加默认的Activity，Service，Receiver路由
     */
    private void initDefaultRouter() {
        addRule(ActivityRule.ACTIVITY_SCHEME, new ActivityRule());
        addRule(ServiceRule.SERVICE_SCHEME, new ServiceRule());
        addRule(ReceiverRule.RECEIVER_SCHEME, new ReceiverRule());
    }

    static RouterInternal getInstance() {
        if (sInstance == null) {
            synchronized (RouterInternal.class) {
                if (sInstance == null) {
                    sInstance = new RouterInternal();
                }
            }
        }
        return sInstance;
    }

    /**
     * 添加自定义路由规则
     *
     * @param scheme 路由计划
     * @param rule   路由规则
     * @return Router真实调用类
     */
    public final RouterInternal addRule(String scheme, Rule rule) {
        mRules.put(scheme, rule);
        return this;
    }

    /**
     * 获取所有的自定义路由规则
     *
     * @param pattern 路由uri
     * @param <T>     路由类型
     * @param <V>     返回值类型
     * @return 路由规则
     */
    private <T, V> Rule<T, V> getRule(String pattern) {
        HashMap<String, Rule> rules = mRules;
        Set<String> keySet = rules.keySet();
        Rule<T, V> rule = null;
        for (String scheme : keySet) {
            if (pattern.startsWith(scheme)) {
                rule = rules.get(scheme);
                break;
            }
        }
        return rule;
    }

    /**
     * 添加路由
     *
     * @param pattern 路由uri
     * @param klass   路由class
     * @param <T>     路由类型
     * @return Router真实调用类
     */
    public final <T> RouterInternal router(String pattern, Class<T> klass) {
        Rule<T, ?> rule = getRule(pattern);
        if (rule == null) {
            throw new NotRouteException("unknown", pattern);
        }

        rule.router(pattern, klass);
        return this;
    }

    /**
     * 路由调用
     *
     * @param ctx     Context
     * @param pattern 路由uri
     * @param <V>     返回值类型
     * @return 返回值类型
     */
    final <V> V invoke(Context ctx, String pattern) {
        Rule<?, V> rule = getRule(pattern);
        if (rule == null) {
            throw new NotRouteException("unknown", pattern);
        }

        return rule.invoke(ctx, pattern);
    }

    /**
     * 是否存在该路由
     *
     * @param pattern 路由uri
     * @return
     */
    final boolean resolveRouter(String pattern) {
        Rule<?, ?> rule = getRule(pattern);
        return rule != null && rule.resolveRule(pattern);
    }
}
