package com;

import com.state_pattern.simple.Context;
import com.state_pattern.simple.impl.ConcreteStateA;
import com.state_pattern.thread.Thread;
import com.state_pattern.thread.state.Ready;

/**
 * 状态模式
 *  Client------------> Context(InitState)
 *                   Context.request切换上下文中的状态
 *  tip:状态模式将各种状态转移逻辑分布到状态实例实现之间，来减少相互间的依赖
 *  当一个对象的行为取决于它的状态、并且它必须在运行时刻根据状态改变它的行为时，考虑使用状态模式
 *  一般根据生命周期具有不同行为特征的对象都可以使用对象模式进行设计
 *
 * @author sobann
 */
public class App {
    public static void main(String[] args) {
        simple();
        // 一个具有生命周期的行为的实际例子
        thread();
    }

    /**
     * 状态模式一个简单的例子
     * 因为状态A和状态B互为对方的下一个状态，这里仅仅是为了演示，现实中此种情况可以理解为 布尔值
     */
    private static void simple() {
        Context context = new Context(new ConcreteStateA());
        context.request();
        context.request();
        context.request();
        context.request();
        context.request();
    }

    /**
     * 一个线程的生命周期
     * run过程在状态切换之前完成一个
     */
    private static void thread() {
        Thread thread = new Thread(new Ready());
        thread.run();
        thread.run();
        thread.run();
    }
}
