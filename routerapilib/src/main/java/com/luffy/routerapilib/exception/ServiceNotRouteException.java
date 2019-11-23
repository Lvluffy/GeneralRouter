package com.luffy.routerapilib.exception;

/**
 * Created by lvlufei on 2019/1/9
 *
 * @desc Service-无规则异常处理
 */
public class ServiceNotRouteException extends NotRouteException {

    public ServiceNotRouteException(String pattern) {
        super("Service", pattern);
    }
}
