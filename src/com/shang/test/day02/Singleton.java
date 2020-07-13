package com.shang.test.day02;

public class Singleton {
    private static Singleton lazyInstance = null;
    private static Singleton lazyInstance2 = null;
    private static final Singleton hungerInstance = new Singleton("i am hunger！");

    private String msg;
    //私有化构造函数，外部无法new对象
    private Singleton(){

    }
    private Singleton(String msg){
        this.msg = msg;
    }
    //对外提供方法获取对象

    public static Singleton getLazyInstance(){
        //懒汉式
        if(lazyInstance == null){
            lazyInstance = new Singleton("i am lazy！");
        }
        return lazyInstance;
    }
    //懒汉式优化，避免在if判断中创建多个实例
    public static Singleton getLazyInstance2(){
        if (lazyInstance2 == null){
            synchronized(Singleton.class){
                if (lazyInstance2 == null){//因为线程可能在第一个if判断时等待或者挂起，此时其他线程进入抢占Singleton对象创建单例对象
                    lazyInstance2 = new Singleton("i am lazy2!");
                }
            }
        }
        return lazyInstance2;
    }

    public static Singleton getHungerInstance(){
        //饿汉式
        return hungerInstance;
    }

    //内部类创建实例
    private static class InnerInstanceCreater{
        private static final Singleton innerClassInstance = new Singleton("i am innerInstanceCreater!");
    }
    public static Singleton getInnerClassInstance(){
        return InnerInstanceCreater.innerClassInstance;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Singleton{" ).append("msg='").append(msg).append('\'').append('}');
        return sb.toString();
    }
}
