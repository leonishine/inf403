package ru.itis.inf403.HW07_12;

public class Character {
    protected String name;
    protected int hp;
    protected int maxHp;
    protected boolean enchanted;
    protected int lvl;
    protected int atk;

    public Character() {}

    public Character(String name, int maxHp, int lvl) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.lvl = lvl;
        this.enchanted = false;
    }

    public void getDamage(int damage) {
        this.hp -= damage;
    }

    public void attack(Character enemy) {
        enemy.getDamage(this.atk);
    }

    public void levelUp() {
        this.lvl += 1;
        this.maxHp += 5;
        this.hp = this.maxHp;
    }

    public String toString() {
        return name + " " + lvl + " lvl, " + hp + "/" + maxHp + "hp, " + (enchanted ? "enchanted, " : "" + "atk: " + atk);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setEnchanted(boolean enchanted) {
        this.enchanted = enchanted;
    }

    public boolean isEnchanted() {
        return enchanted;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }
}
