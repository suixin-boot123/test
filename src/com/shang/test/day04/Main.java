package com.shang.test.day04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("123");
        list.add("1234");
        list.add("123");
        list.add("1237");
        list.add("123");
        list.add("1235");
        list.add("1236");

        System.out.println(list);
        System.out.println("------------------");

        list.stream().distinct().forEach(System.out::println);

        System.out.println("------------------");
        list.stream().map(Integer::parseInt).forEach(System.out::println);

        System.out.println("------------------");
        list.stream().sorted().forEach(System.out::println);
    }

}
