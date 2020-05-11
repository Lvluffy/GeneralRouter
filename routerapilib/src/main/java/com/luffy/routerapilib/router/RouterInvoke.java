package com.luffy.routerapilib.router;

import android.content.Context;
import android.content.Intent;

/**
 * Created by lvlufei on 2020-05-04
 *
 * @name 路由调用（供调用者使用，进行intent跳转）
 */
public class RouterInvoke {
    /**
     * 调用Activity-公共界面
     *
     * @param context     上下文对象
     * @param routerTag   路由
     * @param routerExtra 自定义传参
     */
    public static void invokeIntent(Context context, String routerTag, RouterExtra routerExtra) {
        if (Router.resolveRouter(routerTag)) {
            Intent intent = Router.invoke(context, routerTag);
            if (routerExtra != null) {
                context.startActivity(routerExtra.putExtra(intent));
            } else {
                context.startActivity(intent);
            }
        }
    }

    public interface RouterExtra {
        Intent putExtra(Intent intent);
    }
}
