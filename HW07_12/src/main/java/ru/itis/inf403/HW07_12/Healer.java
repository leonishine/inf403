package ru.itis.inf403.HW07_12;

public class Healer extends Mage{
    private int herbs;

    public Healer() {}

    public Healer(String name, int maxHp, int lvl, int maxMana, int herbs) {
        super(name, maxHp, lvl, maxMana);
        this.herbs = herbs;
    }

    public void heal(Character character) {
        this.mana -= 3;
        character.setHp(Math.max(character.getHp() + herbs, character.getMaxHp()));
    }

    public String toString() {
        return name + " " + lvl + " lvl, " + hp + "/" + maxHp + "hp, " + (enchanted ? "enchanted, " : "" + "atk: " + atk + ", herbs: " + herbs);
    }

    public int getHerbs() {
        return herbs;
    }

    public void setHerbs(int herbs) {
        this.herbs = herbs;
    }
}
