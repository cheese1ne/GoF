package com;

import com.brige_pattern.phone.HandsetBrand;
import com.brige_pattern.phone.brand.HandsetBrandM;
import com.brige_pattern.phone.brand.HandsetBrandN;
import com.brige_pattern.phone.soft.HandsetAddressList;
import com.brige_pattern.phone.soft.HandsetGame;
import com.brige_pattern.simple.Abstraction;
import com.brige_pattern.simple.ConcreteImplementorA;
import com.brige_pattern.simple.ConcreteImplementorB;
import com.brige_pattern.simple.RefinedAbstraction;

/**
 * 桥接模式：将抽象部分与它的实现部分分离，使得他们都可以独立地变化(实现指的是抽象类和它的派生类用来实现自己的对象)
 *  例子：手机既可以按照品牌分类，又可以按照功能分类 (将品牌和功能独立的抽象并进行组合)，品牌和功能的实现相互独立互不影响，将品牌和功能进行组合实现了变化
 *  如果只用某一类继承来实现，实现类的数量为笛卡尔积(因为品牌和功能如此之多)
 *
 * 合成-聚合复用原则
 * 聚合：聚合表示一种弱的拥有关系，体现的是A对象可以包含B对象，但B对象不是A对象的一部分
 * 合成：合成表示一种强的拥有关系，体现了严格的部分与整体的关系，部分和整体的生命周期一样
 *  合成-聚合服用原则的优点：
 *      优先使用对象的合成-聚合将有助于你保持每个类被封装，并被集中在单个任务上，这样类和类继承层次会保持较小规模，并且不太可能增长为不可控制的庞然大物
 * @author sobann
 */
public class App {


    public static void main(String[] args) {
//        simple();
        phone();
    }

    /**
     * 桥接模式一个简单的例子
     */
    private static void simple() {
        Abstraction ab;
        ab = new RefinedAbstraction();
        ab.setImplementor(new ConcreteImplementorA());
        ab.operation();

        ab.setImplementor(new ConcreteImplementorB());
        ab.operation();
    }



    /**
     * 手机系统与应用软件之间应该是组合的关系
     * 手机与软件之间不能用单纯的继承关系设计结构，应该单独的设计手机与软件，具体的手机包含软件的组合(弱)
     *
     */
    private static void phone() {
        HandsetBrand phone;
        phone = new HandsetBrandM();
        phone.setHandsetSoft(new HandsetGame());
        phone.run();
        phone.setHandsetSoft(new HandsetAddressList());
        phone.run();

        phone = new HandsetBrandN();
        phone.setHandsetSoft(new HandsetGame());
        phone.run();
        phone.setHandsetSoft(new HandsetAddressList());
        phone.run();
    }
}
