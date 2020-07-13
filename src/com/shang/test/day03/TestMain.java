package com.shang.test.day03;

public class TestMain {
    public static void main(String[] args) {
//        XYZ xyz = new XYZ();
//        System.out.println(xyz.name);
        Class<XYZ> baseClass = XYZ.class;
        System.out.println("-------分割线-------");

        try {
            Class<?> xyz = Class.forName("XYZ");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class XYZ {
    public static String name = "luoxn28";

    static {
        System.out.println("xyz静态块");
    }

    public XYZ() {
        System.out.println("xyz构造了");
    }
}