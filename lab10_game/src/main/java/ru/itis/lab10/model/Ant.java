package ru.itis.lab10.model;

public class Ant extends Entity {
    public Ant() {}

    public Ant(int x, int y) {
        super("Муравей", x, y);
    }

    @Override
    public void move() {
        //Муравей перемещается в случайном направлении на случайное количество от 1 до 3 шагов (если может сделать выбранное число)
        int direction = (int) (Math.random() * 4);
        int step = (int) (Math.random() * 3 + 1);
        switch (direction) {
            case 0:
                if (y - step > 0) {
                    y -= step;
                }
                break;
            case 1:
                if (x + step < fieldWidth) {
                    x += step;
                }
                break;
            case 2:
                if (y + step < fieldHeigth) {
                    y += step;
                }
                break;
            case 3:
                if (x - step > 0) {
                    x -= step;
                }
                break;
        }
    }

}
