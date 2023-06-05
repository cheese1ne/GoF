package com;

import com.builder_pattern.person.NuWa;
import com.builder_pattern.person.Person;
import com.builder_pattern.person.PersonBuilder;
import com.builder_pattern.person.builder.ConcretePersonBuilder;
import com.builder_pattern.person.builder.ConcretePrettyPersonBuilder;
import com.builder_pattern.simple.Builder;
import com.builder_pattern.simple.Director;
import com.builder_pattern.simple.Product;
import com.builder_pattern.simple.builder.ConcreteBuilderA;
import com.builder_pattern.simple.builder.ConcreteBuilderB;

/**
 * 建造者模式
 * <p>
 * Client ----> Director(指挥者用于隐藏建造细节)、Builder(产品建造者，内部包含产品的组件生产流水线)
 *
 * @author sobann
 */
public class App {
    public static void main(String[] args) {
        // 一个简单的建造者-指挥者的栗子
        simple();
        // 女娲捏小人
        person();
    }

    /**
     * 一个简单的建造者-指挥者的栗子
     */
    public static void simple() {
        // 指挥者 用于指挥建造者完成产品组件的构建
        Director director = new Director();
        Builder builderA = new ConcreteBuilderA();
        Builder builderB = new ConcreteBuilderB();
        // 隐藏建造细节
        director.construct(builderA);
        director.construct(builderB);

        // 建造者A建造的产品
        Product product = builderA.getProduct();
        System.out.println("建造者A建造的产品: " + product);
        // 建造者B建造的产品
        product = builderB.getProduct();
        System.out.println("建造者B建造的产品: " + product);

    }

    /**
     * 女娲捏小人!
     */
    public static void person() {
        // 普通的人建造工厂
        PersonBuilder builder = new ConcretePersonBuilder();
        // 女娲调试建造机器，完成人体各个部分的建造
        NuWa nuWa = new NuWa(builder);
        nuWa.createPerson();
        Person person = builder.getPerson();
        System.out.println("person = " + person);

        // 好看的人建造工厂
        builder = new ConcretePrettyPersonBuilder();
        nuWa.setBuilder(builder);
        nuWa.createPerson();
        person = builder.getPerson();
        System.out.println("person = " + person);
    }
}
