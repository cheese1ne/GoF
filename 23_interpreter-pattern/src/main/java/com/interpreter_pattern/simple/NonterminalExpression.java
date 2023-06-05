package com.interpreter_pattern.simple;

/**
 * 非终结符表达式
 *
 * @author sobann
 */
public class NonterminalExpression extends AbstractExpression {

    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
