package com.command_pattern.simple;

/**
 * 抽象接受者
 * 执行与请求相关的操作
 *
 * @author sobann
 */
public class Receiver {
    public void action() {
        System.out.println("请求执行!");
    }
}
