//package ru.itis.inf403.func_int;
//
//import ru.itis.inf403.hwLab12.CanCompare;
//
//public class Apple implements CanCompare {
//    private String kind;
//    private int price;
//
//    public Apple() {}
//
//    public Apple(String kind, int price) {
//        this.kind = kind;
//        this.price = price;
//    }
//
//    @Override
//    public int compare(CanCompare other) {
//        //if (this.getClass().equals(other.getClass())) {
//        return this.price - ((Apple)other).getPrice();
//        //}
//        //return 0;
//    }
//
//    @Override
//    public String toString() {
//        return kind + " " + price;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//}
