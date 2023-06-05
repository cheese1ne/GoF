package com.chain_pattern.process;

/**
 * 管理者抽象
 *
 * @author sobann
 */
public abstract class Manager {
    protected String name;
    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    /**
     * 处理请求
     *
     * @param request
     */
    public abstract void requestExecution(Request request);
}
