package com.single_pattern;

/**
 * 单例4 内部类
 *
 * @author sobann
 */
public class Singleton4 {

    /**
     * volatile在多线程环境下正确的处理synchronized 遍历初始化的过程
     */
    private Singleton4() {
    }

    /**
     * 多线程加锁
     *
     * @return
     */
    public static Singleton4 createInstance() {
        return Builder.INSTANCE;
    }


    /**
     * 内部类
     */
    static class Builder {
        private static final Singleton4 INSTANCE = new Singleton4();
    }
}
