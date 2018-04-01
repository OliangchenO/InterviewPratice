package com.interview.aop.interfaces.impl;

import com.interview.aop.interfaces.IStudent;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class StudentImpl implements IStudent,BeanNameAware {
    @Override
    public void addStudent(String name) {
        System.out.println(" 欢迎  " + name + "  你加入Spring家庭! ");
    }

    @Override
    public void setBeanName(String s) {

    }
}
