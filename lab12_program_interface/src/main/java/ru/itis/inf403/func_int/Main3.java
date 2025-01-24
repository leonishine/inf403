package ru.itis.inf403.func_int;

public class Main3 {
    public static void main(String[] args) {
        Apple[] apples = {new Apple(120, "Голд"),
                new Apple(110, "Семеринка")};

        ArrayUtils.print(apples);

        AppleComparator comparator = new AppleComparator();

        ArrayUtils.sort(apples, comparator);

        ArrayUtils.print(apples);
    }

    private static class AppleComparator implements ICompareObject {
        @Override
        public int compare(Object var1, Object var2) {
            return ((Apple) var1).getPrice() - ((Apple) var2).getPrice();
        }
    }
}
