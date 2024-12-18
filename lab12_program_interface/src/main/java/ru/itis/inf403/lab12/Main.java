package ru.itis.inf403.lab12;

import ru.itis.inf403.lab12.transport.Plane;
import ru.itis.inf403.lab12.transport.Ship;
import ru.itis.inf403.lab12.transport.Train;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        City Kazan = new City("Казань");
        City Saransk = new City("Саранск");
        Passenger Roma = new Passenger("~$");
        TransportAction[] transportActions = { new Plane(), new Ship(), new Train() };
        Random random = new Random();
        int index = random.nextInt(3);
        transportActions[index].move(Kazan,Saransk,Roma);

        Plane plane = (Plane) (transportActions[index]);

    }
}
