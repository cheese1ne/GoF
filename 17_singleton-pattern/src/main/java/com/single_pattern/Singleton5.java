package com.single_pattern;

/**
 * 单例3 枚举
 *
 * @author sobann
 */
public class Singleton5 {

    /**
     * volatile在多线程环境下正确的处理synchronized 遍历初始化的过程
     */
    private static final Singleton5 instance = new Singleton5();

    private Singleton5() {
    }

    /**
     * 多线程加锁
     *
     * @return
     */
    public static Singleton5 createInstance() {
        return SingletonEnum.INSTANCE.getSingleton5();
    }


    public enum SingletonEnum {
        INSTANCE(new Singleton5());

        private final Singleton5 singleton5;

        SingletonEnum(Singleton5 singleton5) {
            this.singleton5 = singleton5;
        }

        public Singleton5 getSingleton5() {
            return singleton5;
        }
    }
}
