package aop.monitor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Aspect
@Component
public class ServiceMonitor {

    @Around("execution(* aop.service.*Service.*(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("before");

        Object str = proceedingJoinPoint.proceed();


        System.out.println("after");

        return str;
    }

}
