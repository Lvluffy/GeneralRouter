package com.luffy.routerapilib.router;

import android.content.Context;

import com.luffy.routerapilib.rule.abstractRule.Rule;

/**
 * Created by lvlufei on 2019/1/9
 *
 * @desc 路由器
 * step 1. 调用Router.router方法-添加路由
 * step 2. 调用Router.invoke方法-根据pattern调用路由
 * <p>
 * 参考：https://github.com/qibin0506/Module2Module
 */
public class Router {

    /**
     * 添加自定义路由规则
     *
     * @param scheme 路由scheme
     * @param rule   路由规则
     * @return
     */
    public static RouterInternal addRule(String scheme, Rule rule) {
        RouterInternal router = RouterInternal.getInstance().addRule(scheme, rule);
        return router;
    }

    /**
     * 添加路由
     *
     * @param pattern 路由uri
     * @param klass   路由class
     * @param <T>     路由类型
     * @return 路由类型
     */
    public static <T> RouterInternal router(String pattern, Class<T> klass) {
        return RouterInternal.getInstance().router(pattern, klass);
    }

    /**
     * 路由调用
     *
     * @param ctx     Context
     * @param pattern 路由uri
     * @param <V>     返回值类型
     * @return 返回值类型
     */
    public static <V> V invoke(Context ctx, String pattern) {
        return RouterInternal.getInstance().invoke(ctx, pattern);
    }

    /**
     * 是否存在该路由
     *
     * @param pattern 路由uri
     * @return
     */
    public static boolean resolveRouter(String pattern) {
        return RouterInternal.getInstance().resolveRouter(pattern);
    }
}
