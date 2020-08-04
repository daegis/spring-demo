package cn.ihna.demo.spring.aop;

import lombok.SneakyThrows;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author xianyingda@gmail.com
 * @serial
 * @since 2020/8/4 9:56 下午
 */
@Aspect
@Component
public class TestAspect {

    @SneakyThrows
    @Around("@annotation(TestAop)")
    public Object doAround(ProceedingJoinPoint pjp) {
        System.out.println("before method");
        Object proceed = pjp.proceed();
        System.out.println("after method");
        return proceed;
    }
}
