package cn.ihna.demo.spring.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author xianyingda@gmail.com
 * @serial
 * @since 2020/8/4 9:55 下午
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAop {
}
