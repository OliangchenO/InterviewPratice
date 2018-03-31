package com.interview;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String u = sc.next();
        List<Integer> sortList = new ArrayList<Integer>();
        Pattern p = Pattern.compile("\\d{2,}");//这个2是指连续数字的最少个数
        Matcher m = p.matcher(u);
        int i = 0;
        while (m.find()) {
            sortList.add(Integer.parseInt(m.group()));
        }
        Collections.sort(sortList);
        System.out.println(sortList);
    }

}
