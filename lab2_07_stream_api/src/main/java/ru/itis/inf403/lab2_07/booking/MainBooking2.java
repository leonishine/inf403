package ru.itis.inf403.lab2_07.booking;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.awt.print.Book;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class MainBooking2 {
    public static void main(String[] args) throws IOException, ParseException {
        ObjectMapper mapper = new ObjectMapper();
        Bookings bookings =
                mapper.readValue(new File("bookings.json"), Bookings.class);
        //printChildren(bookings);
        //printMapHotelCity(bookings);
        //printCitiesBookings(bookings);
        printUniquePercent(bookings);

    }

    public static void printChildren(Bookings bookings) {
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2011-04-23");
            bookings
                    .getBookings()
                    .stream()
                    .filter(p -> p.getPerson().getBirthdate() != null)
                    .filter(p -> p.getPerson().getBirthdate().after(date))
                    .map(b -> b.getPerson())
                    .toList()
                    .forEach(System.out::println);
        } catch (ParseException e) {
            throw new RuntimeException();
            // мяу
        }
    }

    public static void printHotels(Bookings bookings) {
        Map<String, Integer> result = bookings.getBookings()
                .stream()
                .collect(Collectors.toMap(
                        b -> b.getHotel().getName(),
                        b -> 1,
                        (x,y) -> x+y
                ));
        result.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }
    //1. Вывести список гостиниц и кол-во бронирований женщинами
    public static void printHotelsWomen(Bookings bookings) {
        Map<String, Integer> result = bookings.getBookings()
                .stream()
                .filter(p -> p.getPerson().getGender() != null)
                .filter(p -> p.getPerson().getGender().equals("Female"))
                .collect(Collectors.toMap(
                        b -> b.getHotel().getName(),
                        b -> 1,
                        (x,y) -> x+y
                ));
        result.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }

    //2. Вывести список гостиниц и кол-во бронирований мужчинами
    public static void printHotelsMen(Bookings bookings) {
        Map<String, Integer> result = bookings.getBookings()
                .stream()
                .filter(p -> p.getPerson().getGender() != null)
                .filter(p -> p.getPerson().getGender().equals("Male"))
                .collect(Collectors.toMap(
                        b -> b.getHotel().getName(),
                        b -> 1,
                        (x,y) -> x+y
                ));
        result.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }

    //3. Вывести процент бронирований из Самарской области
    public static void printCountFromSamara(Bookings bookings) {
        System.out.println(
                bookings
                        .getBookings()
                        .stream()
                        .filter((b -> b.getPerson().getFromcity() != null))
                        .filter(b -> b.getPerson().getFromcity().equals("Самарская область, г Самара"))
                        .count() * 100 / bookings.getBookings().stream().count()
        );
    }

    //4. Вывести процент бронирований людьми в возрасте от 40 до 45 лет
    public static void printForties(Bookings bookings) {
        try {
            Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse("1980-04-23");
            Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse("1975-04-23");
            System.out.println(
                    bookings
                            .getBookings()
                            .stream()
                            .filter((b -> b.getPerson().getBirthdate() != null))
                            .filter(p -> p.getPerson().getBirthdate().after(date2))
                            .filter(p -> date2.after(p.getPerson().getBirthdate()))
                            .count() * 100 / bookings.getBookings().stream().count()
            );
        } catch (ParseException e) {
            throw new RuntimeException();
        }
    }

    //5. Вывести список городов и кол-во бронирований по ним (город ~ г ...)
    public static void printCitiesBookings(Bookings bookings) {
        Map<String, Integer> result = bookings.getBookings()
                .stream()
                .collect(Collectors.toMap(
                        b -> b.getPerson().getFromcity(),
                        b -> 1,
                        (x,y) -> x+y
                ));
        result.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }

    //6. Сформировать Map ключ - гостиница, значение - список городов
    public static void printMapHotelCity(Bookings bookings) {
        Map<String, Set<String>> result =
        bookings.getBookings()
                .stream()
                .collect(Collectors.toMap(
                        b -> b.getHotel().getName(),
                        b -> {
                            Set<String> set = new HashSet<>();
                            set.add(b.getPerson().getFromcity());
                            return set;
                        },
                        (x, y) -> {
                            Set<String> set = new HashSet<>();
                            set.addAll(x);
                            set.addAll(y);
                            return set;
                        }
                ));

        result.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }
    //7. Вывести процент уникальных людей (необходимо описать эквивалентность по полу, дате рождения)
    public static void printUniquePercent (Bookings bookings) {
        Set<Person> set = bookings.getBookings()
                .stream()
                .map(b -> b.getPerson())
                .collect(Collectors.toSet());
        System.out.println(set.size());
        System.out.println(((double)set.size())*100/bookings.getBookings().size() + "%");
    }



    /*
    1. Вывести список гостиниц и кол-во бронирований женщинами
2. Вывести список гостиниц и кол-во бронирований мужчинами
3. Вывести процент бронирований из Самарской области
4. Вывести процент бронирований людьми в возрасте от 40 до 45 лет
5. Вывести список городов и кол-во бронирований по ним (город ~ г ...)
6. Сформировать Map ключ - гостиница, значение - список городов
7. Вывести процент уникальных людей (необходимо описать эквивалентность по полу, дате рождения)

     */
}
