package ru.itis.lab10.model;

public class Game {
    private int fieldWidth;
    private int fieldHeigth;
    private Entity[] players;
    private int finishFieldWidth;
    private int finishFieldHeigth;
    private int finishX;
    private int finishY;

    public Game() {}

    public Game(int fieldWidth, int fieldHeigth, int finishFieldWidth, int finishFieldHeigth, int finishX, int finishY, Entity[] players) {
        this.fieldHeigth = fieldHeigth;
        this.fieldWidth = fieldWidth;
        this.players = players;
        this.finishFieldHeigth = finishFieldHeigth;
        this.finishFieldWidth = finishFieldWidth;
        this.finishX = finishX;
        this.finishY = finishY;
    }

    public Entity start() {
        while (true) {
            for (int i = 0; i < players.length; i++) {
                players[i].move();
            }

            for (int i = 0; i < players.length; i++) {
                if ((players[i].x > finishX && players[i].x <= finishX + finishFieldWidth)
                        && (players[i].y > finishY && players[i].y <= finishY + finishFieldHeigth)) {
                    System.out.println(players[i]);
                    return players[i];
                }
            }
        }
    }



}
