package com.chain_pattern.process.chain;

import com.chain_pattern.process.Manager;
import com.chain_pattern.process.Request;

/**
 * 普通经理
 * 能处理2天内请假的请求
 *
 * @author sobann
 */
public class CommonManager extends Manager {
    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestExecution(Request request) {
        if ("请假".equals(request.getRequestType()) && request.getNumber() <= 2) {
            System.out.println(this.name + ":" + request.getRequestContent() + " 数量：" + request.getNumber() + " 天，被批准");
        } else if (this.superior != null) {
            this.superior.requestExecution(request);
        }
    }
}
