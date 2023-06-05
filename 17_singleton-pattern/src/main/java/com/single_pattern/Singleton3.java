package com.single_pattern;

/**
 * 单例3 饿汉式
 *
 * @author sobann
 */
public class Singleton3 {

    /**
     * volatile在多线程环境下正确的处理synchronized 遍历初始化的过程
     */
    private static final Singleton3 instance = new Singleton3();

    private Singleton3() {
    }

    /**
     * 多线程加锁
     *
     * @return
     */
    public static Singleton3 createInstance() {
        return instance;
    }
}
