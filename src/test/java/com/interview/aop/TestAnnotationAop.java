package com.interview.aop;

import com.interview.aop.interfaces.IStudent;
import com.interview.aop.interfaces.impl.StudentImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationAop {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:annotation-aop.xml");
        IStudent student = (StudentImpl) ac.getBean("studentImpl");
        student.addStudent("asdf");
    }
}
