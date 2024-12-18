package ru.itis.inf403.lab12.transport;

import ru.itis.inf403.lab12.City;
import ru.itis.inf403.lab12.Passenger;
import ru.itis.inf403.lab12.TransportAction;

public class Ship implements TransportAction {

    private String name;

    @Override
    public void move(City cityFrom, City cityTo, Passenger passenger) {
        System.out.println(passenger + " moved by Ship from " + cityFrom + " to " + cityTo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
