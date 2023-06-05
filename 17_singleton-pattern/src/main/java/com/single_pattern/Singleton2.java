package com.single_pattern;

/**
 * 单例2 懒汉式 双重判断+锁
 *
 * @author sobann
 */
public class Singleton2 {

    /**
     * volatile在多线程环境下正确的处理synchronized 遍历初始化的过程
     */
    private volatile static Singleton2 instance;

    private Singleton2() {
    }

    /**
     * 多线程加锁
     *
     * @return
     */
    public static Singleton2 createInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
