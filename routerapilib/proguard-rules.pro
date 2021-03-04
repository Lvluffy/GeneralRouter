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
#-keep @com.luffy.routerannotationcompilerlib.annotation.AutoRouter class * {*;}
#-keep @com.luffy.routerannotationcompilerlib.annotation.Component class * {*;}
#-keep @com.luffy.routerannotationcompilerlib.annotation.Components class * {*;}
#-keep @com.luffy.routerannotationcompilerlib.annotation.StaticRouter class * {*;}
#-keep class * {
#    @com.luffy.routerannotationcompilerlib.annotation.AutoRouter <fields>;
#    @com.luffy.routerannotationcompilerlib.annotation.Component <fields>;
#    @com.luffy.routerannotationcompilerlib.annotation.Components <fields>;
#    @com.luffy.routerannotationcompilerlib.annotation.StaticRouter <fields>;
#}
#-keepclassmembers class * {
#    @com.luffy.routerannotationcompilerlib.annotation.AutoRouter <methods>;
#    @com.luffy.routerannotationcompilerlib.annotation.Component <methods>;
#    @com.luffy.routerannotationcompilerlib.annotation.Components <methods>;
#    @com.luffy.routerannotationcompilerlib.annotation.StaticRouter <methods>;
#}

-keep class com.luffy.routerapilib.** { *; }
-keepclassmembers class com.luffy.routerapilib.** { *; }

#-keep class com.luffy.routercompilerlib.** { *; }
#-keepclassmembers class com.luffy.routercompilerlib.** { *; }
#
#-keep class com.luffy.routerannotationlib.** { *; }
#-keepclassmembers class com.luffy.routerannotationlib.** { *; }