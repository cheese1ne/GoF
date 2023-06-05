package com.adapter_pattern.translation;

/**
 * 前锋
 *
 * @author sobann
 */
public class Forwards extends Player{

    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("前锋 " + this.name + " 进攻");
    }

    @Override
    public void defense() {
        System.out.println("前锋 " + this.name + " 防守");
    }
}
