package com.interview.aop;

import com.interview.aop.interfaces.IStudent;
import com.interview.aop.interfaces.impl.StudentImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:aop.xml");
        IStudent student = (StudentImpl) ac.getBean("studentImpl");
        student.addStudent("asdf");     
    }  
    
}
