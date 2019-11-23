#############################################
#
# 一、对于一些基本指令的添加
#
#############################################

#############################################
#
# 二、Android开发中一些需要保留的公共部分
#
#############################################

#############################################
#
# 三、自身项目相关处理（必须的，否则出问题-包括：实体类）。
# 在开发的时候我们可以将所有的实体类放在一个包内，这样我们写一次混淆就行了。
#
#############################################

# 注解
#-keep @com.luffy.routerannotationlib.AutoRouter class * {*;}
#-keep @com.luffy.routerannotationlib.Component class * {*;}
#-keep @com.luffy.routerannotationlib.Components class * {*;}
#-keep @com.luffy.routerannotationlib.StaticRouter class * {*;}
#-keep class * {
#    @com.luffy.routerannotationlib.AutoRouter <fields>;
#    @com.luffy.routerannotationlib.Component <fields>;
#    @com.luffy.routerannotationlib.Components <fields>;
#    @com.luffy.routerannotationlib.StaticRouter <fields>;
#}
#-keepclassmembers class * {
#    @com.luffy.routerannotationlib.AutoRouter <methods>;
#    @com.luffy.routerannotationlib.Component <methods>;
#    @com.luffy.routerannotationlib.Components <methods>;
#    @com.luffy.routerannotationlib.StaticRouter <methods>;
#}

-keep class com.luffy.routerapilib.** { *; }
-keepclassmembers class com.luffy.routerapilib.** { *; }

#-keep class com.luffy.routercompilerlib.** { *; }
#-keepclassmembers class com.luffy.routercompilerlib.** { *; }
#
#-keep class com.luffy.routerannotationlib.** { *; }
#-keepclassmembers class com.luffy.routerannotationlib.** { *; }