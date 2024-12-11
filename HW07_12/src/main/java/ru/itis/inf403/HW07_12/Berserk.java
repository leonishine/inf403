package ru.itis.inf403.HW07_12;

public class Berserk extends Character{
    private boolean rage;

    public Berserk() {}

    public Berserk(String name, int maxHp, int lvl) {
        super(name, maxHp, lvl);
        this.rage = false;
        this.atk = 5;
    }

    public void startRage(){
        this.rage = true;
        this.atk *= 2;
    }

    public void endRage() {
        this.rage = false;
        this.atk /= 2;
    }

    @Override
    public void getDamage(int damage) {
        if (rage) {
            this.hp -= 2 * damage;
        } else {
            this.hp -= damage;
        }
    }

    public String toString() {
        return name + " " + lvl + " lvl, " + hp + "/" + maxHp + "hp, " + (enchanted ? "enchanted, " : "" + (rage ? "rage, " : "") + "atk: " + atk);
    }

    public void setRage(boolean rage) {
        this.rage = rage;
    }

    public boolean isRage() {
        return rage;
    }
}
