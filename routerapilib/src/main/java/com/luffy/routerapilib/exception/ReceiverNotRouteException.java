package com.luffy.routerapilib.exception;

/**
 * Created by lvlufei on 2019/1/9
 *
 * @desc Receiver-无规则异常处理
 */
public class ReceiverNotRouteException extends NotRouteException {

    public ReceiverNotRouteException(String pattern) {
        super("Receiver", pattern);
    }
}
