package com.chain_pattern.simple;

/**
 * 抽象的处理器
 *
 * @author sobann
 */
public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler handler) {
        this.successor = handler;
    }

    /**
     * 请求处理
     *
     * @param request
     */
    public abstract void handleRequest(int request);
}
