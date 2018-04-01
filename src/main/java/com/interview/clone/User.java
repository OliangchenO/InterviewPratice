package com.interview.clone;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@NoArgsConstructor
class Address implements Cloneable {
    private String add;
    @Override
    public Object clone(){
        Address add = null;
        try {
            add = (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            log.error(e.getMessage(),e);
        }
        return add;
    }
}

@Data
@Slf4j
@NoArgsConstructor
public class User implements Cloneable {
    private String id;
    private String name;
    private int age;
    private Address add;

    public User(String id){
        super();
        this.id = id;
    }
    
    @Override
    public Object clone(){
        User u = null;
        try {
            u = (User) super.clone();
        } catch (CloneNotSupportedException e) {
            log.error(e.getMessage(), e);
        }
        u.add = (Address) add.clone();
        return u;
    }
    
    public static void main(String[] args){  
        User u1 = new User();
        u1.setId("1234");
        Address add = new Address();
        add.setAdd("上海");
        u1.setAdd(add);
        User u2 = (User) u1.clone();
        System.out.println("u1:"+u1);
        System.out.println("u2:"+u2);
        add.setAdd("闵行");
        System.out.println("u1:"+u1);
        System.out.println("u2:"+u2);
    }  
    
}
