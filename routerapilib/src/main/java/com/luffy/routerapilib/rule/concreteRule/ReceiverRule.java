package com.luffy.routerapilib.rule.concreteRule;

import android.content.BroadcastReceiver;

import com.luffy.routerapilib.exception.ReceiverNotRouteException;
import com.luffy.routerapilib.rule.abstractRule.BaseIntentRule;

/**
 * Created by lvlufei on 2019/1/9
 *
 * @desc Receiver-路由规则实现类
 */
public class ReceiverRule extends BaseIntentRule<BroadcastReceiver> {

    /**
     * Receiver-路由计划
     */
    public static final String RECEIVER_SCHEME = "Receiver://";

    @Override
    public void throwException(String pattern) {
        throw new ReceiverNotRouteException(pattern);
    }
}
