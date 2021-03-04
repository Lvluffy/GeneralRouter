package com.luffy.router.api.rule.concreteRule;

import android.app.Service;

import com.luffy.router.api.exception.ServiceNotRouteException;
import com.luffy.router.api.rule.abstractRule.BaseIntentRule;

/**
 * Created by lvlufei on 2019/1/9
 *
 * @desc Service-路由规则实现类
 */
public class ServiceRule extends BaseIntentRule<Service> {

    /**
     * Service-路由计划
     */
    public static final String SERVICE_SCHEME = "Service://";

    @Override
    public void throwException(String pattern) {
        throw new ServiceNotRouteException(pattern);
    }
}