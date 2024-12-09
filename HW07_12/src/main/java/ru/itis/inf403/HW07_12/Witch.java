package ru.itis.inf403.HW07_12;

public class Witch extends Mage {
    private String hat;

    public Witch(){}

    public Witch(String name, int maxHp, int lvl, int maxMana, String hat) {
        super(name, maxHp, lvl, maxMana);
        this.hat = hat;
    }

    private void enchant(Character enemy) {
        this.mana -= 3;
        enemy.setEnchanted(true);
    }

    public String toString() {
        return name + " " + lvl + " lvl, " + hp + "/" + maxHp + "hp, " + (enchanted ? "enchanted, " : "" + "atk: " + atk + ", wears a " + hat + " hat");
    }

    public String getHat() {
        return hat;
    }

    public void setHat(String hat) {
        this.hat = hat;
    }
}
