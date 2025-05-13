package ru.itis.inf403.lab203transport;

import ru.itis.inf403.lab203transport.service.TransportPrintService;
import ru.itis.inf403.lab203transport.service.TransportReadService;
import ru.itis.inf403.lab203transport.structures.List403;
import ru.itis.inf403.lab203transport.transport.Bus;
import ru.itis.inf403.lab203transport.transport.Transport;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        TransportReadService trs = new TransportReadService("transport.csv");
        List403<Transport> transports = trs.readAll();
        System.out.println(transports);

        //List403<Bus> busses = trs.readAllBus();
        TransportPrintService tps = new TransportPrintService();
        System.out.println("Парковые номера");
        tps.printParkNumbers(transports);

        System.out.println("Номера маршрутов");
        tps.printRouteNumbers(transports);

        System.out.println("Количество разных маршрутов");
        tps.printCountRoutes(transports);

        System.out.println("Количество разных транспортных средств");
        tps.printCountTransports(transports);

        System.out.println("Количество транспортных средств на каждом маршруте");
        tps.printCountTransportsOnRoutes(transports);
         /*
    - По списку вывести в упорядоченном виде парковые номера и время начала движения
    - По списку вывести в упорядоченном виде номера маршрутов, время начала и окончнания движения маршрута
    - По списку вывести кол-во разных маршрутов
    - По списку вывести кол-во разных транспортных средств
    - По списку вывести номер маршрута и кол-во транспортных средств на нем
     */
    }
}
