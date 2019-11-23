package com.luffy.routerapilib.exception;

/**
 * Created by lvlufei on 2019/1/9
 *
 * @desc 公共的-无规则异常处理
 */
public class NotRouteException extends RuntimeException {

    public NotRouteException(String name, String pattern) {
        super(String.format("%s cannot be resolved with pattern %s, have you declared it in your Router?", name, pattern));
    }
}
