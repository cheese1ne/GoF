package com;

import com.prototype_pattern.resume.Resume;
import com.prototype_pattern.simple.ConcretePrototype;

/**
 * 原型模式
 * Cloneable
 * Prototype
 * ConcretePrototype
 * <p>
 * <p>
 * 在Java中原型模式实现Cloneable并重写clone方法即可
 * 需要注意的是，深拷贝原型中的所有成员也需要实现Cloneable并重写clone方法
 *
 * @author sobann
 */
public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        // 一个基础的原型模式
        simple();
        //
        resume();
    }

    /**
     * 一个基础的原型模式
     *
     * @throws CloneNotSupportedException
     */
    public static void simple() throws CloneNotSupportedException {
        ConcretePrototype prototype = new ConcretePrototype("9527");
        System.out.println("original property: " + prototype.getProperty());
        ConcretePrototype clone = (ConcretePrototype) prototype.clone();
        System.out.println("clone property: " + clone.getProperty());
    }

    /**
     * 模拟复杂对象的深拷贝
     *
     * @throws CloneNotSupportedException
     */
    public static void resume() throws CloneNotSupportedException {
        //原型
        Resume resume = new Resume("cheese");
        resume.setPersonInfo("男", "28");
        resume.setWorkExperience("2021-03-28至2022-06-03", "中地数码(武汉)科技有限公司");
        resume.display();
        //clone 并修改
        Resume clone = resume.clone();
        clone.setWorkExperience("2022-06-20至今", "浙江贵仁科技有限公司");
        clone.display();
    }
}
