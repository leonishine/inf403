package ru.itis.inf403.lab203transport.service;

import ru.itis.inf403.lab203transport.structures.List403;
import ru.itis.inf403.lab203transport.structures.List403Impl;
import ru.itis.inf403.lab203transport.transport.Bus;
import ru.itis.inf403.lab203transport.transport.Tram;
import ru.itis.inf403.lab203transport.transport.Transport;
import ru.itis.inf403.lab203transport.transport.Trolleybus;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TransportReadService {
    private File file;

    public TransportReadService(String filename) {
        this.file = new File(filename);
    }

    public List403<Transport> readAll () throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        if (sc.hasNextLine()) sc.nextLine();
        List403<Transport> result = new List403Impl<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] str = line.split(";");
            result.add(
                    switch (str[0]) {
                        case "bus" -> new Bus(str[1],str[2],str[3],str[4]);
                        case "tram" -> new Tram(str[1],str[2],str[3],str[4]);
                        case "trolleybus" -> new Trolleybus(str[1],str[2],str[3],str[4]);
                        default -> null;
                    }
            );
        }
        sc.close();
        return result;
    }

    public List403<Bus> readAllBus () throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        if (sc.hasNextLine()) sc.nextLine();
        List403<Bus> result = new List403Impl<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] str = line.split(";");
            if (str[0].equals("bus")) {
                result.add(new Bus(str[1], str[2], str[3], str[4]));
            }
        }
        sc.close();
        return result;
    }
    public List403<Tram> readAllTram () throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        if (sc.hasNextLine()) sc.nextLine();
        List403<Tram> result = new List403Impl<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] str = line.split(";");
            if (str[0].equals("bus")) {
                result.add(new Tram(str[1], str[2], str[3], str[4]));
            }
        }
        sc.close();
        return result;
    }
    public List403<Trolleybus> readAllTrolleybus () throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        if (sc.hasNextLine()) sc.nextLine();
        List403<Trolleybus> result = new List403Impl<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] str = line.split(";");
            if (str[0].equals("bus")) {
                result.add(new Trolleybus(str[1], str[2], str[3], str[4]));
            }
        }
        sc.close();
        return result;
    }
}
