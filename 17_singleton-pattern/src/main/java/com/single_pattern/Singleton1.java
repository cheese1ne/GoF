package com.single_pattern;

/**
 * 单例1 懒汉式 方法加锁
 *
 * @author sobann
 */
public class Singleton1 {

    private static Singleton1 instance;

    private Singleton1() {
    }

    /**
     * 多线程加锁
     *
     * @return
     */
    public static synchronized Singleton1 createInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
