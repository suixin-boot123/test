package com.shang.test.day03;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        // 不会初始化静态块
        Class clazz1 = Base.class;
        System.out.println("------");
        // 会初始化
        Class clazz2 = Class.forName("Base");
    }
}

