package ru.itis.lab10;

import ru.itis.lab10.model.*;

public class Main {
    public static void main(String[] args) {
        int fieldWidth = 100;
        int fieldHeigth = 100;
        int finishFieldWidth = 4;
        int finishFieldHeigth = 4;
        int finishX = 48;
        int finishY = 48;
        Entity[] players = new Entity[4];
        players[0] = new Ant(0,0);
        players[1] = new Horse(0,0);
        players[2] = new Grasshopper(0,0);
        players[3] = new Creature(0,0);
        Entity.setFieldSize(fieldWidth, fieldHeigth);
        Game game = new Game(fieldWidth, fieldHeigth, finishFieldWidth, finishFieldHeigth, finishX, finishY, players);
        for (int i = 0; i < 10; i++) {
            Entity champ = game.start();

        }


    }
}
