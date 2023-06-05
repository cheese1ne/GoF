package com.chain_pattern.simple;

/**
 * 具体处理器2.负责 10~20 的请求处理
 * 处理不了的请求让后继者处理器处理
 *
 * @author sobann
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println(this.getClass().getSimpleName() + " 处理请求 " + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
