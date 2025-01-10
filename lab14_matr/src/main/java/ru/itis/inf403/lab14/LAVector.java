package ru.itis.inf403.lab14;

public class LAVector {
    private float[] components;

    public LAVector(int size) {
        this.components = new float[size];
    }

    public LAVector(float[] components) {
        this.components = components;
    }

    public LAVector(int size, float value) {
        this.components = new float[size];
        for (int i = 0; i < size; i++) {
            this.components[i] = value;
        }
    }

    public LAVector plusVector(LAVector other) {
        int size = this.size();
        if (size == other.size()) {
            float[] result = new float[size];
            for (int i = 0; i < size; i++) {
                result[i] = this.components[i] + other.getComponent(i);
            }
            return new LAVector(result);
        } else {
            System.out.println("Векторы невозможно сложить");
            return null;
        }
    }

    public LAVector multNumber(float number) {
        int size = this.size();
        float[] result = new float[size];
        for (int i = 0; i < size; i++) {
            result[i] = this.components[i] * number;
        }
        return new LAVector(result);
    }

    public float scalarMult(LAVector other) {
        int size = this.size();
        if (size == other.size()) {
            float result = 0;
            for (int i = 0; i < size; i++) {
                result += this.components[i] * other.getComponent(i);
            }
            return result;
        } else {
            System.out.println("Векторы невозможно перемножить");
            return -1;
        }
    }

    public float abs() {
        float s = 0;
        for(int i = 0; i < this.size(); i++) {
            s += components[i] * components[i];
        }
        return (float) Math.sqrt(s);
    }

    public float getComponent(int n) {
        return components[n];
    }

    public int size() {
        return components.length;
    }

    public float[] getComponents() {
        return components;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < size(); i++) {
            s += (components[i] + " ");
        }
        return s;
    }
}
