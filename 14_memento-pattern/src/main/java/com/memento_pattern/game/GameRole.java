package com.memento_pattern.game;

/**
 * 游戏角色
 *
 * @author sobann
 */
public class GameRole {
    private int vitality;
    private int attack;
    private int defense;


    /**
     * 创建角色状态存档
     *
     * @return
     */
    public RoleStateMemento createMemento() {
        return new RoleStateMemento(this.vitality, this.attack, this.defense);
    }

    /**
     * 恢复到存档点
     *
     * @param memento
     */
    public void recoveryState(RoleStateMemento memento) {
        this.vitality = memento.getVitality();
        this.attack = memento.getAttack();
        this.defense = memento.getDefense();
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    /**
     * 状态初始化 数据从磁盘读取或者远程数据接口
     */
    public void initState() {
        this.vitality = 100;
        this.attack = 100;
        this.defense = 100;
    }

    /**
     * 状态展示
     */
    public void displayState() {
        System.out.println("角色当前状态: ");
        System.out.println("体力: " + this.vitality);
        System.out.println("攻击力: " + this.attack);
        System.out.println("防御力: " + this.defense);
        System.out.println();
    }

    /**
     * boss战失败，状态变更
     */
    public void defeat() {
        this.vitality = 0;
        this.attack = 0;
        this.defense = 0;
    }
}
