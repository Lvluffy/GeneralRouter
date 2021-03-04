package com.luffy.router.api.rule.abstractRule;

import android.content.Context;

/**
 * Created by lvlufei on 2019/1/9
 *
 * @desc 路由规则接口
 * <p>
 * T-路由类型
 * V-返回值类型
 */
public interface Rule<T, V> {
    /**
     * 添加路由
     *
     * @param pattern 路由uri（路由模式）
     * @param klass   路由class
     */
    void router(String pattern, Class<T> klass);

    /**
     * 路由调用
     *
     * @param ctx     Context
     * @param pattern 路由uri（路由模式）
     * @return 返回值类型
     */
    V invoke(Context ctx, String pattern);

    /**
     * 是否存在该路由
     *
     * @param pattern 路由uri（路由模式）
     * @return
     */
    boolean resolveRule(String pattern);
}
