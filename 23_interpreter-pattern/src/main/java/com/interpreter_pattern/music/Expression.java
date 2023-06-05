package com.interpreter_pattern.music;

/**
 * 抽象表达式
 *
 * @author sobann
 */
public abstract class Expression {

    public void interpret(PlayContext playContext) {
        if (playContext.getPlayText().length() == 0) {
            return;
        }
        String playKey = playContext.getPlayText().substring(0, 1);
        playContext.setPlayText(playContext.getPlayText().substring(2));

        double playValue = Double.parseDouble(playContext.getPlayText().substring(0, playContext.getPlayText().indexOf(" ")));
        playContext.setPlayText(playContext.getPlayText().substring(playContext.getPlayText().indexOf(" ") + 1));
        this.execute(playKey, playValue);
    }

    /**
     * 执行
     * @param key
     * @param value
     */
    public abstract void execute(String key, double value);
}
