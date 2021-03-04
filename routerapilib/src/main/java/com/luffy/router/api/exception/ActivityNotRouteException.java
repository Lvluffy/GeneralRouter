package com.luffy.router.api.exception;

/**
 * Created by lvlufei on 2019/1/9
 *
 * @desc Activity-无规则异常处理
 */
public class ActivityNotRouteException extends NotRouteException {

    public ActivityNotRouteException(String pattern) {
        super("Activity", pattern);
    }
}
