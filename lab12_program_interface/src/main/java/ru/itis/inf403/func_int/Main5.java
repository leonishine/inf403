package ru.itis.inf403.func_int;

public class Main5 {
    public static void main(String[] args) {
        Apple[] apples = {new Apple(120, "Голд"),
                new Apple(110, "Семеринка")};

        ArrayUtils.print(apples);

        ArrayUtils.sort(apples, new ICompareObject() {
            @Override
            public int compare(Object var1, Object var2) {
                return ((Apple)var1).getPrice() - ((Apple)var2).getPrice();
            }
        });

        ArrayUtils.print(apples);
    }

}
