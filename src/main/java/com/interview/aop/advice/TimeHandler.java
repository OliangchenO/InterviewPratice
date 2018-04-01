package com.interview.aop.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class TimeHandler {
    public void printTime()
    {
        System.out.println("CurrentTime = " + System.currentTimeMillis());
    }

    public void saveLog(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println(joinPoint.getTarget().getClass().getName()+"执行开始");
        joinPoint.proceed();
        System.out.println(joinPoint.getTarget().getClass().getName()+"执行结束");
    }
}
