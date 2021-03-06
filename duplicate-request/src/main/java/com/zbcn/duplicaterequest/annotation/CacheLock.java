package com.zbcn.duplicaterequest.annotation;

import java.lang.annotation.*;
import java.util.concurrent.TimeUnit;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface CacheLock {
	/**
	 * redis 锁key的前缀
	 * @return redis 锁key的前缀
	 */
	String prefix() default "";

	/**
	 * 过期秒数,默认为5秒
	 * @return 轮询锁的时间
	 */
	int expire() default 5;

	/**
	 * 超时时间单位
	 * @return 秒
	 */
	TimeUnit timeUnit() default TimeUnit.SECONDS;

	/**
	 * Key的分隔符（默认 :）
	 * 生成的Key：N:SO1008:500
	 * @return String
	 */
	String delimiter() default ":";
}
