package ru.itis.inf403.HW07_12;

public class Warrior extends Character {
    private int armor;

    public Warrior() {}

    public Warrior(String name, int maxHp, int lvl) {
        super(name, maxHp, lvl);
        this.atk = 4;
        this.armor = 0;
    }

    public void defend(int n) {
        this.armor += n;
    }

    @Override
    public void getDamage(int damage) {
        this.hp -= Math.max(0, (damage - this.armor));
        this.armor = Math.max(0, this.armor - damage);
    }

    public String toString() {
        return name + " " + lvl + " lvl, " + hp + "/" + maxHp + "hp, " + (enchanted ? "enchanted, " : "" + "atk: " + atk + ", armor: " + armor);
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }


}
