package ru.itis.lab10.model;

public class Grasshopper extends Entity {
    public Grasshopper() {}

    public Grasshopper(int x, int y) {
        super("Кузнечик", x, y);
    }

    @Override
    public void move() {
        //Кузнечик прыгает через одну клетку вперёд, влево или вправо, либо шагает на одну клетку вниз
        int direction = (int) (Math.random() * 4);
        switch (direction) {
            case 0:
                if (y-2 > 0) {
                    y -= 2;
                }
                break;
            case 1:
                if (x+2 < fieldWidth) {
                    x += 2;
                }
                break;
            case 2:
                if (y+1 < fieldHeigth) {
                    y += 1;
                }
                break;
            case 3:
                if (x-2 > 0) {
                    x -= 2;
                }
                break;
        }
    }
}
