package com.factory_method.operation;

/**
 * 工厂顶层
 *
 * @author sobann
 */
public interface IFactory {

    /**
     * 建造一个操作实例
     *
     * @param operate 操作标识符
     * @return 操作实例
     */
    Operation createOperation(String operate);
}
