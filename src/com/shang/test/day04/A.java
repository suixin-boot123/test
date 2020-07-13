package com.shang.test.day04;

public class A {
    static {
        System.out.println("i am static code of a!");
    }

    public A(){
        System.out.println("i am the constructor of a!");
    }

    {
        System.out.println("i am the common code of a!");
    }
}

