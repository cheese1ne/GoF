package com;

import com.proxy_pattern.Proxy;

/**
 * 模拟上层模块调用
 *
 * 代理模式的使用场景:
 *  1.远程代理: 一个对象在不同的地址空间提供局部代表，隐藏一个对象在不同空间地址的事实
 *  2.虚拟代理: 存放需要很长时间实例化的真实对象
 *  3.安全代理: 控制真实对象的访问时的权限,在对象应该有不同的访问权限时使用
 *  4.智能指引: 当调用真实对象时,代理进行一些额外的操作
 *
 *                          ISubject
 * client -----------> Proxy ------> RealSubject
 *
 * @author sobann
 */
public class App {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }
}
