package com.interpreter_pattern.music.parser;

import com.interpreter_pattern.music.Expression;

/**
 * 音速
 *
 * @author sobann
 */
public class Speed extends Expression {

    @Override
    public void execute(String key, double value) {
        String speed;
        if (value < 500) {
            speed = "快速";
        } else if (value >= 1000) {
            speed = "慢速";
        } else {
            speed = "中速";
        }
        System.out.print(speed + " ");
    }
}
