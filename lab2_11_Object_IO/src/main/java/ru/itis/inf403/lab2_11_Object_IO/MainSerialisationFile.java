package ru.itis.inf403.lab2_11_Object_IO;

import java.io.*;
import java.util.SortedMap;

public class MainSerialisationFile {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.setName("Лиса Алиса");
        animal.setAge(12);
        animal.setCategory(AnimalClass.МЛЕКОПИТАЮЩИЕ);
        animal.setType(AnimalType.ЛИСА);

        byte[] savedData = null;

        try (FileOutputStream fos = new FileOutputStream("lisa.obj");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(animal);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        for (byte b : savedData) {
//            System.out.println(b);
//        }

        try (FileInputStream fis = new FileInputStream("lisa.obj");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Animal animal2 = (Animal) ois.readObject();

            System.out.println(animal2);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
