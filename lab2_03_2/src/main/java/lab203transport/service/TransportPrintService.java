package lab203transport.service;

import lab203transport.structures.List403;
import lab203transport.structures.Set403;
import lab203transport.structures.Set403Impl;
import lab203transport.transport.Transport;

import java.util.Comparator;

public class TransportPrintService {
    public <T extends Transport> void printParkNumbers(List403<T> list) {
        list.sort(new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return Integer.parseInt(o1.getNumber()) -  Integer.parseInt(o2.getNumber());
            }
        });
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getNumber() + " " + list.get(i).getWorkTimeBegin());
        }
    }

    public <T extends Transport> void printRouteNumbers(List403<T> list) {
        list.sort(new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return Integer.parseInt(o1.getRouteNumber()) -  Integer.parseInt(o2.getRouteNumber());
            }
        });
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getRouteNumber() + " " + list.get(i).getWorkTimeBegin() + " - " + list.get(i).getWorkTimeEnd());
        }
    }

    public <T extends Transport> void printCountRoutes(List403<T> list) {
        Set403<String> set = new Set403Impl<>();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i).getRouteNumber());
        }
        System.out.println(set.size());
    }

    public <T extends Transport> void printCountTransports(List403<T> list) {
        Set403<T> set = new Set403Impl<>();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }
        System.out.println(set.size());
    }

    public <T extends Transport> void printCountTransportsOnRoutes(List403<T> list) {
        list.sort(new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return Integer.parseInt(o1.getRouteNumber()) -  Integer.parseInt(o2.getRouteNumber());
            }
        });
        int c = 1;
        for (int i = 1; i < list.size(); i++) {
            if (!list.get(i).getRouteNumber().equals(list.get(i-1).getRouteNumber())) {
                System.out.println("Route №" + list.get(i - 1).getRouteNumber() + ": " + c + " transports");
                c = 0;
            }
            c++;
        }
    }

}
