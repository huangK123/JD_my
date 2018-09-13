package com.test;

import java.util.ArrayList;
import java.util.List;

public class TestV1P1 {

    public static void main(String args[]){
        System.out.println("test1");
        List<String> list1 = new ArrayList<>();
        list1.add("test1");
        list1.add("test2");
        list1.add("test3");
        for(String str : list1){
            System.out.println(str);
        }
    }
}
