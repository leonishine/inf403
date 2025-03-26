package ru.itis.inf403.lab201.obj;

public class List403Test {
    public static void main(String[] args) throws IndexOutOfBoundsException{
        List403Impl a = new List403Impl();
        Integer[] elems = new Integer[] {2,4,1,3,6,2,7,4,2};
        for (int i = 0; i < elems.length; i++) {
            a.add(elems[i]);
        }
        System.out.println(a);
        System.out.println("Добавляем ещё три элемента, проверка правильности работы add");
        System.out.println("Добавляем 5 в конец");
        a.add(5);
        System.out.println(a);

        System.out.println("Добавляем 4 на 3 позицию");
        a.add(4, 3);
        System.out.println(a);

        System.out.println("Добавляем 20 в конец");
        a.add(20);
        System.out.println(a);

        System.out.println("Удаляем элемент на 5 позиции");
        System.out.println("(Это элемент " + a.remove(5) + ")");
        System.out.println(a);

        System.out.println("Сортировка");
        a.sort(true);
        System.out.println(a);
        System.out.println("В обратную сторону");
        a.sort(false);
        System.out.println(a);
    }
}
