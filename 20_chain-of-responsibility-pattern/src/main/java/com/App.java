package com;

import com.chain_pattern.process.Request;
import com.chain_pattern.process.chain.CommonManager;
import com.chain_pattern.process.chain.Director;
import com.chain_pattern.process.chain.GeneralManager;
import com.chain_pattern.simple.ConcreteHandler1;
import com.chain_pattern.simple.ConcreteHandler2;
import com.chain_pattern.simple.ConcreteHandler3;
import com.chain_pattern.simple.Handler;

/**
 * 责任链模式：使得多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系，将这些对象连成一条链，并沿着这条链传递改请求，直到有一个对象处理它为止
 * spring security 过滤器链就是典型的责任链模式
 *
 * 优点：接受者和发送者都没有对方的明确信息，且链中的对象只耦合指向后继者的引用 (实际上是链表数据结构的使用)
 *
 * Java类加载的双亲委派模型也可以用责任链来理解(实际上是优先上级类加载器加载)
 *
 * @author sobann
 */
public class App {

    public static void main(String[] args) {
//        simple();
        process();
    }

    /**
     * 责任链模式一个简单的例子
     */
    private static void simple() {
        // 责任链初始化
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        // 测试处理
        int[] requests = {2, 5, 14, 22, 18, 3, 27, 20};
        for (int request : requests) {
            handler1.handleRequest(request);
        }
    }

    /**
     * 普通经理 -> 总监 -> 总经理
     */
    public static void process() {
        // 责任链初始化
        CommonManager commonManager = new CommonManager("金立");
        Director director = new Director("宗剑");
        GeneralManager generalManager = new GeneralManager("种敬礼");

        commonManager.setSuperior(director);
        director.setSuperior(generalManager);

        // 请假天数小于2天
        Request request = new Request();
        request.setRequestType("请假");
        request.setNumber(1);
        request.setRequestContent("小菜请假");
        commonManager.requestExecution(request);

        // 请假天数超过2天，但小于5天
        request = new Request();
        request.setRequestType("请假");
        request.setNumber(4);
        request.setRequestContent("小菜请假");
        commonManager.requestExecution(request);

        // 请假天数10天
        request = new Request();
        request.setRequestType("请假");
        request.setNumber(10);
        request.setRequestContent("小菜请假");
        commonManager.requestExecution(request);

        // 加薪4000
        request = new Request();
        request.setRequestType("加薪");
        request.setNumber(4000);
        request.setRequestContent("小菜请求加薪");
        commonManager.requestExecution(request);

        // 加薪10000
        request = new Request();
        request.setRequestType("加薪");
        request.setNumber(10000);
        request.setRequestContent("小菜请求加薪");
        commonManager.requestExecution(request);
    }
}
