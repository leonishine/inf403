package ru.itis.inf403.func_int;

public class Main2 {
    public static void main(String[] args) {
        Apple[] apples = {new Apple(120, "Голд"),
                new Apple(110, "Семеринка")};
        ArrayUtils.print(apples);
        Apple comparator = new Apple();
        ArrayUtils.sort(apples, comparator);
        ArrayUtils.print(apples);
    }
}