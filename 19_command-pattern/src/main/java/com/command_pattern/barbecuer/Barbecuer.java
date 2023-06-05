package com.command_pattern.barbecuer;

/**
 * 烤肉串的人
 * 对应receiver 执行一个与请求相关的操作
 *
 * @author sobann
 */
public class Barbecuer {

    public void bakeMutton(){
        System.out.println("烤羊肉串!");
    }

    public void bakeChickenWing(){
        System.out.println("烤鸡翅!");
    }
}
