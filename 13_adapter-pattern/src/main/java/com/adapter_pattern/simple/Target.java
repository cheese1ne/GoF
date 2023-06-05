package com.adapter_pattern.simple;

/**
 * 上层模块期待的接口
 *
 * @author sobann
 */
public class Target {

    public void request() {
        System.out.println("普通请求!");
    }
}
