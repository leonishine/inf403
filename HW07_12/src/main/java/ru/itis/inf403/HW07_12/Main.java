package ru.itis.inf403.HW07_12;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Vasya", 20, 1);
        Berserk berserk = new Berserk("Valera", 20, 1);
        Witch witch = new Witch("Vicky", 20, 1, 15, "black");
        Healer healer = new Healer("Venera", 15, 1, 15, 3);

        System.out.println(warrior);
        System.out.println(berserk);

        healer.getDamage(5);
        warrior.attack(healer);
        healer.attack(witch);
        System.out.println(witch);
        System.out.println(healer);
    }
}