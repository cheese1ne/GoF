package com;

import com.adapter_pattern.simple.Adapter;
import com.adapter_pattern.simple.Target;
import com.adapter_pattern.translation.Forwards;
import com.adapter_pattern.translation.Player;
import com.adapter_pattern.translation.Traslator;

/**
 * 适配器模式
 *
 * 适配器分为类适配器模式和对象适配器模式
 * Java中不支持多重继承、一个类只有一个父类 这里的适配器模式指的是对象适配器
 *
 * 适配器模式用与将一个类的接口转换成上层模块希望的另外一个接口，adapter模式将原本接口不兼容的类可以一起工作
 * 适配器让被适配者与调用这解耦
 *
 * @author sobann
 */
public class App {

    public static void main(String[] args) {
//        simple();

        translation();
    }


    /**
     * 适配器模式一个简单的例子
     * Adapter是属于Target继承体系下包装Adaptee的适配器
     *
     */
    private static void simple() {
        Target target = new Adapter();
        target.request();
    }

    /**
     * 翻译适配
     * 篮球比赛中统一语言环境
     * 姚明通过翻译这一适配器使用共同的语言
     */
    private static void translation() {
        Player forwards = new Forwards("巴塞尔");
        forwards.attack();
        Player guards = new Forwards("麦迪");
        guards.attack();
        // 通过Traslator来适配ForeignCenter
        Player center = new Traslator("姚明");
        center.defense();
    }
}
