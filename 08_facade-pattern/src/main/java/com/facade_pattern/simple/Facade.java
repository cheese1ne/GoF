package com.facade_pattern.simple;

/**
 * 外观类
 * 它需要了解所有子系统的方法或属性，进行组合以备外界调用
 * tip: 外观模式用于处理复杂的遗留系统、对接外部系统使用
 *
 * @author sobann
 */
public class Facade {
    /**
     * 子系统1
     */
    private final SubSystemOne one;
    /**
     * 子系统2
     */
    private final SubSystemTwo two;
    /**
     * 子系统3
     */
    private final SubSystemThree three;
    /**
     * 子系统4
     */
    private final SubSystemFour four;

    public Facade() {
        this.one = new SubSystemOne();
        this.two = new SubSystemTwo();
        this.three = new SubSystemThree();
        this.four = new SubSystemFour();
    }

    public void methodA() {
        this.one.methodOne();
        this.two.methodTwo();
        this.three.methodThree();
        this.four.methodFour();
    }

    public void methodB() {
        this.two.methodTwo();
        this.three.methodThree();
    }

}
