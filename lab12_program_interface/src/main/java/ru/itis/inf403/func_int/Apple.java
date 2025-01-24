package ru.itis.inf403.func_int;

import ru.itis.inf403.hwLab12.CanCompare;

public class Apple implements ICompareObject {
    private int price;
    private String kind;

    public Apple() {}

    public Apple(int price, String kind) {
        this.kind = kind;
        this.price = price;
    }

    @Override
    public int compare(Object var1, Object var2) {
        return ((Apple)var1).getPrice() - ((Apple)var2).getPrice();
    }

    @Override
    public String toString() {
        return kind + " " + price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
