package ru.itis.inf403.lab2_11_Object_IO.labirint;

import java.io.*;
import java.util.Scanner;

public class Labirint {
    public static void labir(int ente, int siz) {
        Game g;
        File file = new File("labirint.txt");
        if (!file.exists()) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
                oos.writeObject(new Game(3, 7));
                oos.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            g = (Game) ois.readObject();
            System.out.println(g);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        int enter = ente;
        int size = siz;
        int[][] lab = {
                {1,1,1,0,1,1,1},
                {1,0,0,0,1,0,1},
                {1,0,1,1,0,0,1},
                {1,0,0,0,0,0,1},
                {1,0,1,0,1,0,1},
                {1,0,0,1,1,0,1},
                {1,1,1,1,1,0,1},
        };
        char re = '\u2588';




        Scanner sc = new Scanner(System.in);
        System.out.println("Твоя задача - пройти лабиринт\n W - вверх, A - влево, S - вниз, D - вправо\n 0 - сдаться, 1 - выйти, 2 - продолжить, 3 - начать игру");

        while (!g.exited) {
            char step = sc.next().charAt(0);
            if (step == '3') {
                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
                    oos.writeObject(new Game(enter, size));
                    oos.flush();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            if (step == '0') {
                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
                    oos.writeObject(new Game(enter, size));
                    oos.flush();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Вы сдались");
                break;
            }

            if (step == '1') {
                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
                    oos.writeObject(g);
                    oos.flush();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
            }

            if (step == '2') {
                try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
                    g = (Game) ois.readObject();
                } catch (IOException | ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }

            if (step == 'W') {
                if (g.y > 0) {
                    if (lab[g.y-1][g.x]==0) {
                        g.map[g.y][g.x] = '_';
                        g.y--;

                    } else {
                        if (g.map[g.y-1][g.x] == re) {
                            System.out.println("Сюда нельзя сходить, здесь стена");
                        } else {
                            g.map[g.y-1][g.x] = re;
                        }
                    }

                } else {
                    System.out.println("Сюда нельзя сходить, нельзя выходить за границы лабиринта");
                }
                g.steps ++;
            }

            if (step == 'S') {
                if ((g.y+1) < (size)) {
                    if (lab[g.y+1][g.x]==0) {
                        g.map[g.y][g.x] = '_';
                        g.y++;

                    } else {
                        if (g.map[g.y+1][g.x] == re) {
                            System.out.println("Сюда нельзя сходить, здесь стена");
                        } else {
                            g.map[g.y+1][g.x] = re;
                        }
                    }

                } else {
                    g.exited = true;
                }
                g.steps ++;
            }

            if (step == 'A') {
                if (g.x > 0) {
                    if (lab[g.y][g.x-1]==0) {
                        g.map[g.y][g.x] = '_';
                        g.x--;

                    } else {
                        if (g.map[g.y][g.x-1] == re) {
                            System.out.println("Сюда нельзя сходить, здесь стена");
                        } else {
                            g.map[g.y][g.x-1] = re;
                        }
                    }

                } else {
                    System.out.println("Сюда нельзя сходить, нельзя выходить за границы лабиринта");
                }
                g.steps ++;
            }

            if (step == 'D') {
                if ((g.x+1) < (size)) {
                    if (lab[g.y][g.x+1]==0) {
                        g.map[g.y][g.x] = '_';
                        g.x++;

                    } else {
                        if (g.map[g.y][g.x+1] == re) {
                            System.out.println("Сюда нельзя сходить, здесь стена");
                        } else {
                            g.map[g.y][g.x+1] = re;
                        }
                    }

                } else {
                    System.out.println("Сюда нельзя сходить, нельзя выходить за границы лабиринта");
                }
                g.steps ++;
            }

            if (g.exited) {
                System.out.println("Ура! Твой результат - " + g.steps + " шагов!");
                break;
            }
            System.out.println(g.steps + " шагов");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == g.y && j == g.x) {
                        System.out.print("X");
                    } else {
                        System.out.print(g.map[i][j]);
                    }
                }
                System.out.println();
            }
        }

    }
}