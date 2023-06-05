package com;

import com.command_pattern.barbecuer.Barbecuer;
import com.command_pattern.barbecuer.Command;
import com.command_pattern.barbecuer.command.BakeChickenWingCommand;
import com.command_pattern.barbecuer.command.BakeMuttonCommand;
import com.command_pattern.barbecuer.command.Waiter;
import com.command_pattern.simple.ConcreteCommand;
import com.command_pattern.simple.Invoker;
import com.command_pattern.simple.Receiver;

/**
 * 命令模式
 * 将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化，对请求排队或记录请求日志，以及支持可撤销的操作
 *
 * 优点：
 *  1.比较容易的设计一个命令队列
 *  2.在需要时可以较容易的将命令记入日志
 *  3.允许接收请求的一方决定是否要否决请求
 *  4.可以容易地实现对请求的撤销和重做
 *  5.由于加进新的具体命令类不影响其他类，拓展很容易
 *  6.将请求一个操作的对象和执行一个操作的对象解耦
 *
 *
 * 在需要如撤销/恢复操作功能时考虑使用命令模式
 *
 * @author sobann
 */
public class App {

    public static void main(String[] args) {
//        simple();
        barbecue();
    }

    /**
     * 命令模式一个简单的例子
     */
    private static void simple() {
        Receiver receiver = new Receiver();
        ConcreteCommand command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker();

        invoker.setCommand(command);
        invoker.executeCommand();
    }


    /**
     * 食客 --(创建命令)--> 服务员 --(传达命令)--> 厨师
     */
    private static void barbecue(){
        // 开店准备
        Barbecuer barbecuer = new Barbecuer();
        Command bakeMuttonCommand = new BakeMuttonCommand(barbecuer);
        Command bakeChickenWingCommand = new BakeChickenWingCommand(barbecuer);
        Waiter waiter = new Waiter();

        // 食客进店下单
        waiter.setOrder(bakeChickenWingCommand);
        waiter.setOrder(bakeMuttonCommand);
        waiter.setOrder(bakeMuttonCommand);
        waiter.setOrder(bakeMuttonCommand);
        waiter.setOrder(bakeMuttonCommand);
        waiter.cancelOrder(bakeMuttonCommand);

        System.out.println("点菜完毕，通知厨房");
        waiter.notifyCommand();



    }

}
