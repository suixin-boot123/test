package com.shang.test.day04;

/**
 * 无参构造输出结果：
 * i am static code of a!
 * i am static code of b!
 * i am the common code of a!
 * i am the constructor of a!
 * i am the common code of b!
 * i am the constructor of b!
 * 结论：
 * 1，静态代码块>>构造代码块>>构造方法
 * 2，父类>>子类
 *
 * 有参构造输出结果：
 * i am static code of a!
 * i am static code of b!
 * i am the common code of a!
 * i am the constructor of a!
 * i am the common code of b!
 * i am the param code constructor of b!有参测试
 * 结论：
 * 1，其他顺序一样，子类有参构造也会先调用父类无参构造
 */
public class Test {
    public static void main(String[] args) {
//        B b = new B();
        B b = new B("有参测试");
    }
}
