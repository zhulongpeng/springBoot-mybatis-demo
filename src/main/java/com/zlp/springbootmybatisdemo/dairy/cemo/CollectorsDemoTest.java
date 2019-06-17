package com.zlp.springbootmybatisdemo.dairy.cemo;

import com.alibaba.fastjson.JSON;
import com.zlp.springbootmybatisdemo.business.entity.Java8Test;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;


public class CollectorsDemoTest {

    @Test
    public void testDemo(){
        List<String> alpha = Arrays.asList("a", "s", "d", "w", "c", "o", "f", "p");
        //before Java8
        List<String> alphaUpper = new ArrayList<>();
        for(String s : alpha){
            alphaUpper.add(s.toUpperCase());
        }
        System.out.println("****************alpha:");
        System.out.println(JSON.toJSONString(alpha));
        System.out.println("****************alphaUpper");
        System.out.println(JSON.toJSONString(alphaUpper));
        //java 8
        List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("********************collect");
        System.out.println(JSON.toJSONString(collect));

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> intrger = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println("*******************integer");
        System.out.println(JSON.toJSONString(intrger));
    }

    @Test
    public void testJavaTest(){
        List<Java8Test> java8Tests = Arrays.asList(
                new Java8Test("asdf", 14, "girl"),
                new Java8Test("xswd", 15, "boy"),
                new Java8Test("hryj", 18, "girl")
        );
        //before java8
        List<String> nameLists = new ArrayList<>();
        for(Java8Test names : java8Tests){
            nameLists.add(names.getName());
        }
        System.out.println("*************************nameLists");
        System.out.println(JSON.toJSONString(nameLists));

        //java 8
        List<String> list = java8Tests.stream().map(Java8Test::getName).collect(Collectors.toList());
        System.out.println("**************list");
        System.out.println(JSON.toJSONString(list));
    }

    @Test
    public void testCollector(){
        List<Java8Test> java8Tests = Arrays.asList(
                new Java8Test("asdf", 17, "girl"),
                new Java8Test("xswd", 15, "boy"),
                new Java8Test("hryj", 18, "girl")
        );
        System.out.println("****************java8Tests");
        System.out.println(JSON.toJSONString(java8Tests));
        List<Integer> collect = java8Tests.stream().map(Java8Test::getAge).collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(o -> 0))), ArrayList::new));
        System.out.println("******************collect");
        System.out.println(JSON.toJSONString(collect));
    }
}
