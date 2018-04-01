package com.interview.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnotationTest {
    @Pointcut("execution(* *.addStudent(..))")
    public void addStudent() {
    }

    @Before("addStudent()")
    public void before(){
        System.out.println( " 这是BeforeAdvice类的before方法. " );
    }

    @After("addStudent()")
    public void after(){
        System.out.println(" 这是AfterAdvice类的afterReturning方法. ");
    }

    @Around("addStudent()")
    public void addStudent(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("注解类型环绕通知..环绕前");
        pjp.proceed();//执行方法
        System.out.println("注解类型环绕通知..环绕后");
    }
}
