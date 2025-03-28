package ru.itis.inf403.hwLab12;

public class Apple implements CanCompare {
    private String color;
    private int weight;
    private String kind;
    private int price;

    public Apple() {}

    public Apple(String color, int weight, String kind, int price) {
        this.color = color;
        this.kind = kind;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public int compare(CanCompare other) {
        return this.price - ((Apple) other).getPrice();
    }

    @Override
    public String toString() {
        return color + " " + kind + " " + weight + " гр, " + price + " руб/кг";
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
