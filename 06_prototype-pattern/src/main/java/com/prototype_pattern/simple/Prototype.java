package com.prototype_pattern.simple;

/**
 * 原型类
 * 在Java中原型模式实现Cloneable并重写clone方法即可
 * 需要注意的是，原型中的所有成员也需要实现Cloneable并重写clone方法
 *
 * @author sobann
 */
public class Prototype implements Cloneable {

    private String property;

    public Prototype(String property) {
        this.property = property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object object = null;
        try {
            object = super.clone();
        }catch (CloneNotSupportedException e) {
            System.out.println("clone error");
        }
        return object;
    }
}
