package com.chain_pattern.process.chain;

import com.chain_pattern.process.Manager;
import com.chain_pattern.process.Request;

/**
 * 总监
 * 能处理所有请求
 *
 * @author sobann
 */
public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestExecution(Request request) {
        if ("请假".equals(request.getRequestType())) {
            System.out.println(this.name + ":" + request.getRequestContent() + " 数量：" + request.getNumber() + " 天，被批准");
        } else if ("加薪".equals(request.getRequestType()) && request.getNumber() <= 5000) {
            System.out.println(this.name + ":" + request.getRequestContent() + " 数量：" + request.getNumber() + " 元，被批准");
        } else if ("加薪".equals(request.getRequestType()) && request.getNumber() > 5000) {
            System.out.println(this.name + ":" + request.getRequestContent() + " 数量：" + request.getNumber() + " 元，再说吧");
        }

    }
}
