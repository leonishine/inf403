package ru.itis.lab10.model;

public class Creature extends Entity {
    public Creature() {}

    public Creature(int x, int y) {
        super("Нечто", x, y);
    }

    @Override
    public void move() {
        //Нечто появляется в случайном месте
        x = (int) (Math.random() * fieldWidth + 1);
        y = (int) (Math.random() * fieldHeigth + 1);
    }
}
