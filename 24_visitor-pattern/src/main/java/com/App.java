package com;

import com.visitor_pattern.action.Failing;
import com.visitor_pattern.action.Man;
import com.visitor_pattern.action.Success;
import com.visitor_pattern.action.Woman;
import com.visitor_pattern.simple.*;

/**
 * 访问者模式: 将数据结构和作用于结构上的耦合解脱开，使得操作集合可以相对自由的演化
 *
 * 例子中man和woman就是稳定的数据结构
 *
 * JDK7中的Files和FileVisitor使用到了访问者模式
 * Spring中的PropertySourcesPlaceholderConfigurer进行替换 BeanDefinitionVisitor就是访问者
 *
 * 适合数据结构相对稳定的系统
 *
 * @author sobann
 */
public class App {

    public static void main(String[] args) {
//        simple();
        action();
    }

    /**
     * 访问者模式的简单使用
     */
    private static void simple() {
        ObjectStructure structure = new ObjectStructure();
        structure.attach(new ConcreteElementA());
        structure.attach(new ConcreteElementB());

        ConcreteVisitor1 concreteVisitor1 = new ConcreteVisitor1();
        ConcreteVisitor2 concreteVisitor2 = new ConcreteVisitor2();

        structure.accept(concreteVisitor1);
        structure.accept(concreteVisitor2);
    }

    /**
     * 男人、女人对于相同的事物的不同结果、状态
     */
    public static void action() {
        com.visitor_pattern.action.ObjectStructure structure = new com.visitor_pattern.action.ObjectStructure();
        structure.attach(new Man());
        structure.attach(new Woman());

        // 关于成功
        Success success = new Success();
        structure.display(success);

        // 关于失败
        Failing failing = new Failing();
        structure.display(failing);
    }
}
