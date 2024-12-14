package ru.itis.lab10.model;

public class Horse extends Entity {
    public Horse() {}

    public Horse(int x, int y) {
        super("Конь", x, y);
    }

    public void move() {
        //Конь ходит буквой Г
        int direction = (int) (Math.random() * 8);
        switch (direction) {
            case 0:
                if ((y-2 > 0) && (x-1 > 0)) {
                    y -= 2;
                    --x;
                }
                break;
            case 1:
                if ((y-2 > 0) && (x+1 < fieldWidth)) {
                    y -= 2;
                    ++x;
                }
                break;
            case 2:
                if ((x+2 < fieldWidth) && (y-1 > 0)) {
                    --y;
                    x += 2;
                }
                break;
            case 3:
                if ((x+2 < fieldWidth) && (y+1 < fieldHeigth)) {
                    ++y;
                    x += 2;
                }
                break;
            case 4:
                if ((y+2 < fieldHeigth) && (x+1 < fieldWidth)) {
                    y += 2;
                    ++x;
                }
                break;
            case 5:
                if ((y+2 < fieldHeigth) && (x-1 > 0)) {
                    y += 2;
                    --x;
                }
                break;
            case 6:
                if ((x-2 > 0) && (y+1 < fieldHeigth)) {
                    ++y;
                    x -= 2;
                }
                break;
            case 7:
                if ((x-2 > 0) && (y-1 > 0)) {
                    --y;
                    x -= 2;
                }
                break;
        }
    }
}
