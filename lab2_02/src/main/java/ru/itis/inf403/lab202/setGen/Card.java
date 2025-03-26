package ru.itis.inf403.lab202.setGen;

public class Card {
    private String name;
    private int power;
    private int defence;
    private int cost;

    public Card() {}

    public Card(String name, int power, int defence, int cost) {
        this.name = name;
        this.power = power;
        this.defence = defence;
        this.cost = cost;
    }


    @Override
    public String toString() {
        return name + " " + power + "/" + defence + "/" + cost;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!obj.getClass().equals(getClass())) return false;
        Card other = (Card) obj;
        return (other.name.equals(name) && other.power == power && other.defence == defence && other.cost == cost);
    }

}
