package com.interpreter_pattern.music.parser;

import com.interpreter_pattern.music.Expression;

/**
 * 音符
 *
 * @author sobann
 */
public class Note extends Expression {

    @Override
    public void execute(String key, double value) {
        String note = "";
        switch (key) {
            case "C":
                // 如果key是C演奏1(do)
                note = "1";
                break;
            case "D":
                // 如果key是C演奏1(do)
                note = "2";
                break;
            case "E":
                note = "3";
                break;
            case "F":
                note = "4";
                break;
            case "G":
                note = "5";
                break;
            case "A":
                note = "6";
                break;
            case "B":
                note = "7";
                break;
            default:
                note = "";
                break;
        }
        System.out.print(note + " ");
    }
}
