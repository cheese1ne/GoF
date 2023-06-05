package com.proxy_pattern;

/**
 * Proxy代表的真实实体 就是被代理对象
 *
 * @author sobann
 */
public class RealSubject implements ISubject {

    @Override
    public void request() {
        System.out.println("真实的请求. ");
    }
}
