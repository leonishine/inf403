package ru.itis.inf403.lab2_11_Object_IO;

import java.io.*;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.setName("Лиса Алиса");
        animal.setAge(12);
        animal.setCategory(AnimalClass.МЛЕКОПИТАЮЩИЕ);
        animal.setType(AnimalType.ЛИСА);

        byte[] savedData = null;

        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(bos)) {

            oos.writeObject(animal);
            savedData = bos.toByteArray();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        for (byte b : savedData) {
//            System.out.println(b);
//        }

        try (ByteArrayInputStream bis = new ByteArrayInputStream(savedData);
                ObjectInputStream ois = new ObjectInputStream(bis)) {

            Animal animal2 = (Animal) ois.readObject();

            System.out.println(animal2);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
