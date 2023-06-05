package com.chain_pattern.process.chain;

import com.chain_pattern.process.Manager;
import com.chain_pattern.process.Request;

/**
 * 总监
 * 能处理5天内的请假请求
 *
 * @author sobann
 */
public class Director extends Manager {
    public Director(String name) {
        super(name);
    }

    @Override
    public void requestExecution(Request request) {
        if ("请假".equals(request.getRequestType()) && request.getNumber() <= 5) {
            System.out.println(this.name + ":" + request.getRequestContent() + " 数量：" + request.getNumber() + " 天，被批准");
        } else if (this.superior != null) {
            this.superior.requestExecution(request);
        }
    }
}
