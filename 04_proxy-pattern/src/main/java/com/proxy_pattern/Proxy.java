package com.proxy_pattern;

/**
 * 代理对象
 * 代理对象初始化时，被代理对象一定也被初始化
 *
 * @author sobann
 */
public class Proxy implements ISubject{

    private final ISubject rs;

    public Proxy() {
        this.rs = new RealSubject();
    }

    @Override
    public void request() {
        this.rs.request();
    }
}
