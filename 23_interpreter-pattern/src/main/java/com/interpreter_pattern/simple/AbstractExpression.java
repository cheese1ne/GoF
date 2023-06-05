package com.interpreter_pattern.simple;

/**
 * 抽象表达式
 *
 * @author sobann
 */
public abstract class AbstractExpression {

    /**
     * 解释操作
     *
     * @param context
     */
    public abstract void interpret(Context context);
}
