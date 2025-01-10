package ru.itis.inf403.lab14;

public class Matrix {
    private float[][] components;

    public Matrix(float[][] components) {
        this.components = components;
    }

    public Matrix(LAVector[] rows) {
        for(int i = 0; i < rows.length; i++) {
            this.components[i] = rows[i].getComponents();
        }
    }

    public Matrix(int rows, int colums) {
        this.components = new float[rows][colums];
    }

    public Matrix(int size, float diagElement) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i==j) {
                    this.components[i][j] = diagElement;
                }
            }
        }
    }

    public int rows() {
        return components.length;
    }

    public int columns() {
        return components[0].length;
    }

    public float det() {
        if (this.rows() == 1) {
            return this.components[0][0];
        } else {
            float result = 0;
            for (int i = 0; i < this.rows(); i++) {
                result += this.components[0][i] * Math.pow(-1,i) * this.ally(0, i).det();
            }
            return result;
        }
    }

    public Matrix ally(int row, int col) {
        int size = this.rows();
        float[][] result = new float[size - 1][size - 1];
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1; j++) {
                int ci = i;
                int cj = j;
                if (i >= row) {
                    ci++;
                }
                if (j >= col) {
                    cj++;
                }
                result[i][j] = this.getIJ(ci,cj);
            }
        }
        return new Matrix(result);
    }

    public Matrix multLVector(LAVector vector) {
        float[][] result = new float[this.rows()][vector.size()];
        if (this.rows() == 1) {
            for (int i = 0; i < this.columns(); i++) {
                for (int j = 0; j < vector.size(); j++) {
                    result[i][j] = components[i][0] * vector.getComponent(j);
                }
            }

            return new Matrix(result);
        } else {
            return null;
        }

    }

    public LAVector multRVector(LAVector vector) {
        float[] result = new float[this.columns()];
        if (vector.size() == this.rows()) {

            for (int i = 0; i < this.columns(); i++) {
                float s = 0;
                for (int j = 0; j < vector.size(); j++) {
                    s += components[j][i] * vector.getComponent(j);
                }
                result[i] = s;
            }

            return new LAVector(result);
        } else {
            return null;
        }
    }

    public Matrix plusMatrix(Matrix other) {
        if (rows() == other.rows() && columns() == other.columns()) {
            float[][] result = new float[rows()][columns()];
            for (int i = 0; i < rows(); i++) {
                for (int j = 0; j < columns(); j++) {
                    result[i][j] = components[i][j] + other.getIJ(i, j);
                }
            }
            return new Matrix(result);
        } else {
            return null;
        }
    }

    public void print() {
        for (int i = 0; i < rows(); i++) {
            System.out.println(new LAVector(components[i]));
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < rows(); i++) {
            s += new LAVector(components[i]).toString() + "\n";
        }
        return s;
    }

    public float getIJ(int i, int j) {
        return this.components[i][j];
    }



}
