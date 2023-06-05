package com.interpreter_pattern.music.parser;

import com.interpreter_pattern.music.Expression;

/**
 * 音阶
 *
 * @author sobann
 */
public class Scale extends Expression {
    @Override
    public void execute(String key, double value) {
        String scale = "";
        switch ((int) value) {
            case 1:
                scale = "低音";
                break;
            case 2:
                scale = "中音";
                break;
            case 3:
                scale = "高音";
                break;
            default:
                scale = "";
                break;
        }
        System.out.print(scale + " ");
    }
}
