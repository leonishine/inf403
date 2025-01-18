package ru.itis.inf403.lab16.cars;

public class MainCars {
    public static void main(String[] args) {
        int wayLength = 1000;
        int check = 100;
        int chance = 60;
        int[] cars = {2,2,2,2,2,2,2,2,2,2};
        //Значение в каждой ячейке соответствует числу пассажиров в машине. Если 0, машина сломана.
        for (int i = 0; i < wayLength; i += check) {
            if (isBroken(chance)) {

            }
        }
    }

    public static void transfer(int[] cars) {

    }

    public static boolean isBroken(int chance) throws CarBrokenException {
        //int chance = 60;
        int t = (int) (Math.random()*100);
        if (t >= chance) {
            return true;
        } else {
            throw new CarBrokenException();
        }
    }
}

/*
Экспедиция:
10 машин вероятность поломки 60%
в машине 2 человека, а мест 5
Если машина ломается, то экипаж пересаживается в свободные автомобили
экспидиция неудачна, если после очередной поломки не хватает мест
1000 км
каждые (50) 100 км определяется наличие критической неисправности
факт поломки машины в программе отражается выбросом исключения
 */