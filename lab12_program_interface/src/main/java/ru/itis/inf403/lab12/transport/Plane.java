package ru.itis.inf403.lab12.transport;

import ru.itis.inf403.lab12.City;
import ru.itis.inf403.lab12.Passenger;
import ru.itis.inf403.lab12.TransportAction;

public class Plane implements TransportAction {

    public int boardNumber;

    @Override
    public void move(City cityFrom, City cityTo, Passenger passenger) {
        System.out.println(passenger + "moved by Plane from " + cityFrom + " to " + cityTo);
    }

    public void setBoardNumber(int boardNumber) {
        this.boardNumber = boardNumber;
    }

    public int getBoardNumber() {
        return boardNumber;
    }
}
