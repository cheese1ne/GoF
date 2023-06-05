package com;

import com.mediator_pattern.simple.ConcreteColleague1;
import com.mediator_pattern.simple.ConcreteColleague2;
import com.mediator_pattern.simple.ConcreteMediator;
import com.mediator_pattern.unitednation.UnitedNationsSecurityCouncil;
import com.mediator_pattern.unitednation.country.Iraq;
import com.mediator_pattern.unitednation.country.USA;

/**
 * 中介者模式：用一个中介对象来封装一系列的对象交互。中介者各对象不需要显示地互相引用，从而使耦合松散，而且可以独立的改变他们之间的交互
 *
 *
 * 适用于一组对象以定义良好但是复杂的方式进行通信的场合，以及想定制一个分布在多个类中的行为而不想生成太多子类的场合
 *
 * 优点：
 *  1.mediator减少了各个colleague的耦合，使得可以独立地改变各个colleague和mediator而不影响到其他colleague
 *  2.关注对象之间的交互而不是对象各自本身的行为，站在一个更宏观的角度去看待系统
 * 缺点：
 *  1.mediator控制了集中化，将交互复杂性变为了中介者的复杂性
 *
 * @author sobann
 */
public class App {

    public static void main(String[] args) {
//        simple();

        unitedNations();
    }


    /**
     * 中介者模式一个简单的例子
     */
    private static void simple() {
        // 初始化结构
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
        mediator.setConcreteColleague1(colleague1);
        mediator.setConcreteColleague2(colleague2);

        colleague1.send("吃过饭了吗?");
        colleague2.send("没有呢，你打算请客?");
    }

    /**
     * 联合国安理会是美国和伊拉克的中介者
     * 中介者与被中介的人存在互相引用
     *
     */
    public static void unitedNations() {
        UnitedNationsSecurityCouncil unitedNation = new UnitedNationsSecurityCouncil();
        USA usa = new USA(unitedNation);
        Iraq iraq = new Iraq(unitedNation);

        unitedNation.setCountryUsa(usa);
        unitedNation.setCountryIraq(iraq);


        usa.declare("不准研制核武器，否则发动战争!");
        iraq.declare("我们没有核武器，也不怕侵略!");
    }
}
