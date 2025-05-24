package ru.itis.inf403.lab2_11_Object_IO;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

//@Getter @Setter
public class Animal implements Serializable {

    public static long version = 0;

    private String name;
    private Integer age;
    private AnimalType type;
    private AnimalClass category;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type=" + type +
                ", category=" + category +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public AnimalType getType() {
        return type;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    public AnimalClass getCategory() {
        return category;
    }

    public void setCategory(AnimalClass category) {
        this.category = category;
    }
}
