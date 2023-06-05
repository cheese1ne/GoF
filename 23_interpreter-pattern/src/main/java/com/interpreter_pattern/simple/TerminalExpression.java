package com.interpreter_pattern.simple;

/**
 * 终结符表达式
 *
 * @author sobann
 */
public class TerminalExpression extends AbstractExpression {

    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}
