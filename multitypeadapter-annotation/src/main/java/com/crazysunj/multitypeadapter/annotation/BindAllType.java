package com.crazysunj.multitypeadapter.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
public @interface BindAllType {

    int level();

    int layoutResId();

    int headerResId() default 0;

    int loadingLayoutResId() default 0;

    int loadingHeaderResId() default 0;

    int errorLayoutResId() default 0;

    int emptyLayoutResId() default 0;
}
