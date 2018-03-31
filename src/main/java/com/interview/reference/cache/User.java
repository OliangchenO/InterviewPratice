package com.interview.reference.cache;

import lombok.Data;

@Data
public class User {
    private String id;
    private String name;
    private int age;

    public User(String id ){
        super();
        this.id = id;
    }

    public static void main(String[] args){
        User u = new User("1");

        System.out.println(u);
    }

}
