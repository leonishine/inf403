package ru.itis.inf403.lab202.setGen;

public class Fruit {
    private String name;
    private Integer sugar;

    public Fruit(String name, Integer sugar) {
        this.name = name;
        this.sugar = sugar;
    }

    public String getName() {
        return name;
    }

    public Integer getSugar() {
        return sugar;
    }

    @Override
    public String toString() {
        return "Fruit:" + name + ", " + sugar + "%";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        Fruit v = (Fruit) obj;
        if ((name.equals(v.name)) && (sugar == v.sugar)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int h = super.hashCode();
        for (int i = 0; i < name.length(); i++) {
            h = h ^ name.charAt(i);
        }

        h = h * sugar * 17;
        return h;
    }
}
