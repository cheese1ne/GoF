package com;

import com.single_pattern.*;

/**
 * 单例模式
 * 懒汉式 方法加锁
 * 懒汉式 双重判断+锁
 * 饿汉式
 * 内部类 延时 + 安全
 * 枚举 算是饿汉式的一种实现方式
 *
 * @author sobann
 */
public class App {

    public static void main(String[] args) {
        simple();
    }


    /**
     * 单例模式
     */
    public static void simple() {
        Singleton1 singleton1 = Singleton1.createInstance();
        System.out.println("singleton1 = " + singleton1);

        Singleton2 singleton2 = Singleton2.createInstance();
        System.out.println("singleton2 = " + singleton2);

        Singleton3 singleton3 = Singleton3.createInstance();
        System.out.println("singleton3 = " + singleton3);

        Singleton4 singleton4 = Singleton4.createInstance();
        System.out.println("singleton4 = " + singleton4);

        Singleton5 singleton5 = Singleton5.createInstance();
        System.out.println("singleton5 = " + singleton5);
    }
}
