package ru.itis.inf403.lab16.cars;

public class MainCars {
    public static void main(String[] args) throws CarBrokenException, ImpossibleToTranferException {
        int wayLength = 1000;
        int check = 100;
        int[] cars = {2,2,2,2,2,2,2,2,2,2};
        //Значение в каждой ячейке соответствует числу пассажиров в машине. Если 0, машина сломана.

        for (int i = 0; i < wayLength; i += check) {
            try {
                move();
                System.out.println(i + "км. Контрольная точка пройдена");
            } catch (CarBrokenException e) {
                try {
                    System.out.println(i + "км. Машина сломалась, осуществляется пересадка");
                    cars = transfer(cars);
                    printCars(cars);
                } catch (ImpossibleToTranferException e2) {
                    System.out.println("Невозможно пересадить людей: в оставшихся машинах недостаточно мест. Экспедиция неудачна.");
                    return;
                }
            }
        }
        System.out.println("Экспедиция успешна! Результат:");
        printCars(cars);

    }


    public static int[] transfer(int[] cars) throws ImpossibleToTranferException {
        int people;
        int seats = 5;
        boolean flag = false;
        for (int i = 0; i < cars.length; ++i) {
            if (cars[i] != 0) {
                people = cars[i];
                cars[i] = 0;
                for (int j = i + 1; (j < cars.length && people != 0); ++j) {
                    if (cars[j] < 5) {
                        cars[j] += people;
                        people = Math.max(0, cars[j] - seats);
                        cars[j] -= people;
                    }
                    if (cars[j] == 5 && j == cars.length - 1 && people > 0) {
                        throw new ImpossibleToTranferException();
                    }
                }
                break;
            }
        }
        return cars;
    }

    public static void move() throws CarBrokenException {
        int chance = 60;

        int t = (int) (Math.random()*100);
        if (t < chance) {
            throw new CarBrokenException();
        }
    }

    public static void printCars(int[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");

        }
        System.out.print("\n");
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