package com.interview;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Data
@NoArgsConstructor
class User{
    private String id;
    private Address add;
}

@Data
@NoArgsConstructor
class Address {
    private String add;
}

public class Test {
    public static void main(String[] args) {
        User u = new User();
        u.setId("1234");
        Address add = new Address();
        add.setAdd("上海");
        u.setAdd(add);

    }

}
