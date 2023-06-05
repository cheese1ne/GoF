package com.chain_pattern.simple;

/**
 * 具体处理器2.负责 20~30 的请求处理
 * 处理不了的请求让后继者处理器处理
 *
 * @author sobann
 */
public class ConcreteHandler3 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 20 && request < 30) {
            System.out.println(this.getClass().getSimpleName() + " 处理请求 " + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
