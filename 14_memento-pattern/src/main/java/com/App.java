package com;

import com.memento_pattern.game.GameRole;
import com.memento_pattern.game.RoleStateCaretaker;
import com.memento_pattern.simple.Caretaker;
import com.memento_pattern.simple.Originator;

/**
 * 备忘录模式
 * 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样以后就可以将该对象恢复到原先保存的状态
 * Originator 发起者 负责创建一个备忘录，用与记录当前时刻它的内部状态，并可用备忘录与恢复内部状态，内部决定memento可以储存originator的哪些内部状态
 * Memento 备忘录 负责存储originator的内部状态 并防止originator之外的其他对象访问备忘录，caretaker具有备忘录的窄接口，originator具有备忘录的宽接口
 * Caretaker 管理者 负责保存备忘录，不能对备忘录的内容进行操作或检查
 *
 * @author sobann
 */
public class App {

    public static void main(String[] args) {
//        simple();
        game();
    }

    /**
     * 备忘录模式一个简单的例子
     * Caretaker内部维护一个Memento备忘录，备忘录中存储需要恢复的数据
     */
    private static void simple() {
        //备忘录数据的来源 Originator发起者
        Originator originator = new Originator();
        originator.setState("on");
        originator.show();
        //状态管理者保存发起者的状态
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        //Originator改变了状态为off
        originator.setState("off");
        originator.show();

        //恢复到保存的状态
        originator.recoveryMemento(caretaker.getMemento());
        originator.show();
    }

    /**
     * 游戏回档
     * 经典的备忘录模式
     */
    private static void game() {
        // 进入boss房间 初始化状态
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.displayState();

        // boss房间存档 进度保存
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setRoleStateMemento(gameRole.createMemento());

        // 与boss对战 失败
        gameRole.defeat();
        gameRole.displayState();

        // 回档 恢复游戏进度
        gameRole.recoveryState(caretaker.getRoleStateMemento());
        gameRole.displayState();
    }
}
