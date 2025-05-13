package ru.itis.inf403.lab2_07.booking;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class MainBooking {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Bookings bookings =
                mapper.readValue(new File("bookings.json"), Bookings.class);

        printCount(bookings);
        printCountWomen(bookings);
        printCountFromMoscow(bookings);

    }

    //Вывести количество записей
    public static void printCount(Bookings bookings) {
        System.out.println(
                bookings
                .getBookings()
                .stream()
                .count()
        );
    }

    //Вывести количество женщин
    public static void printCountWomen(Bookings bookings) {
        System.out.println(
                bookings
                        .getBookings()
                        .stream()
                        .filter((b -> b.getPerson().getGender() != null))
                        .filter(b -> b.getPerson().getGender().equals("Female"))
                        .count()
        );
    }

    //Вывести количество гостей из Москвы
    public static void printCountFromMoscow(Bookings bookings) {
        System.out.println(
                bookings
                        .getBookings()
                        .stream()
                        .filter((b -> b.getPerson().getFromcity() != null))
                        .filter(b -> b.getPerson().getFromcity().equals("Город Москва"))
                        .count()
        );
    }
}
