package com.shang.test.day04;

public class B extends A{
    private String msg;
    static {
        System.out.println("i am static code of b!");
    }

    public B(){
        System.out.println("i am the constructor of b!");
    }

        {
        System.out.println("i am the common code of b!");
    }
    public B(String msg){
        this.msg = msg;
        System.out.println("i am the param code constructor of b!" + msg);
    }
}


