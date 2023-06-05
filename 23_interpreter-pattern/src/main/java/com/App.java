package com;

import com.interpreter_pattern.music.Expression;
import com.interpreter_pattern.music.PlayContext;
import com.interpreter_pattern.music.parser.Note;
import com.interpreter_pattern.music.parser.Scale;
import com.interpreter_pattern.music.parser.Speed;
import com.interpreter_pattern.simple.AbstractExpression;
import com.interpreter_pattern.simple.Context;
import com.interpreter_pattern.simple.NonterminalExpression;
import com.interpreter_pattern.simple.TerminalExpression;

import java.util.ArrayList;
import java.util.List;

/**
 * 解释器模式：
 * 给定一个语言，定义它问法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子
 * 如果一种特定类型的问题发生频率足够高，可以将问题表述为一个特定的句子，这样就可以构建一个解释器来解释这些句子来解决这个问题
 * <p>
 * 一般的解释器配合正则表达式使用
 * <p>
 * Spring的Spel就是典型的解释器模式
     * CheeseShiro中对identifier标识符的解析
 * <p>
 * 通常的程序设计语言需要 语法分析器 + 编译器 + 解释器 完成功能解读
 *
 * @author sobann
 */
public class App {

    public static void main(String[] args) {
//        simple();
        music();
    }

    /**
     * 解释器模式一个简单的例子
     */
    private static void simple() {
        Context context = new Context();
        List<AbstractExpression> expressions = new ArrayList<>();
        expressions.add(new TerminalExpression());
        expressions.add(new NonterminalExpression());
        expressions.add(new TerminalExpression());
        expressions.add(new TerminalExpression());

        for (AbstractExpression expression : expressions) {
            expression.interpret(context);
        }
    }


    /**
     * 乐曲解析
     */
    public static void music() {
        PlayContext context = new PlayContext();
        System.out.println("音乐-上海滩：");
        context.setPlayText("T 300 0 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 0 3 C 1 0 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");
        Expression expression = null;
        while (context.getPlayText().length() > 0) {
            String str = context.getPlayText().substring(0, 1);
            switch (str) {
                case "0":
                    expression = new Scale();
                    break;
                case "C":
                case "D":
                case "E":
                case "F":
                case "G":
                case "A":
                case "B":
                case "P":
                    expression = new Note();
                    break;
                case "T":
                default:
                    expression = new Speed();
                    break;
            }
            expression.interpret(context);
        }

    }
}
