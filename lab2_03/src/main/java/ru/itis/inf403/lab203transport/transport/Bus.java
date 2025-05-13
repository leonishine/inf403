package ru.itis.inf403.lab203transport.transport;

public class Bus extends Transport {
    public Bus(String number, String routeNumber, String workTimeBegin,  String workTimeEnd) {
        super(number, routeNumber, workTimeBegin, workTimeEnd);
    }

    @Override
    public String toString() {
        return "Bus №" + number + ", route №" + routeNumber + ", " + workTimeBegin + " - " + workTimeEnd;
    }
}
