package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 自己测试git、maven、tomcat的类
 * @author huangliming
 * @date 2018/09/13
 */
public class TestV1P1 {


    public static void main(String args[]){
        int n = 10;
        for(int i=0;i<n;n++){
            System.out.println(n);
        }
        System.out.println("test1");
        List<String> list1 = new ArrayList<>();
        list1.add("test1");
        list1.add("test2");
        list1.add("test3");
        list1.add("test4");
        for(String str : list1){
            System.out.println(str);
        }
        System.out.println("test1line2");
    }
}
