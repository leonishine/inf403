package ru.itis.inf403.HW07_12;

public class Mage extends Character {
    protected int mana;
    protected int maxMana;

    public Mage() {}

    public Mage(String name, int maxHp, int lvl, int maxMana) {
        super(name, maxHp, lvl);
        this.maxMana = maxMana;
        this.mana = maxMana;
        this.atk = 3;
    }

    @Override
    public void levelUp() {
        this.lvl += 1;
        this.maxHp += 5;
        this.hp = this.maxHp;
        this.maxMana += 3;
        this.mana = this.maxMana;
    }

    public void meditate() {
        this.mana = Math.max(this.lvl + this.mana, this.maxMana);
    }

    public String toString() {
        return name + " " + lvl + " lvl, " + hp + "/" + maxHp + "hp, " + mana + "/" + maxMana + "mana, " + (enchanted ? "enchanted, " : "" + "atk: " + atk);
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public void setMaxMana(int maxMana) {
        this.maxMana = maxMana;
    }
}
