package ru.itis.inf403.lab14;

public class MainTest {
    public static void main(String[] args) {
        float[][] m1 = {{1,3,6},
                        {1,-3,4},
                        {2,1,1}
        };
        //det = 56
        float[][] m2 = {{-1},
                        {3},
                        {2}
        };

        float[][] m3 = {{3,0,2},
                        {-1,-1,-3},
                        {8,-3,1}
        };
        Matrix mat1 = new Matrix(m1);
        Matrix mat2 = new Matrix(m2);
        Matrix mat3 = new Matrix(m3);

        float[] v1 = {1, 2, -1};
        float[] v2 = {3, -4, 1};
        LAVector vec1 = new LAVector(v1);
        LAVector vec2 = new LAVector(v2);

        System.out.println("Матрица:");
        System.out.println(mat1);

        System.out.println("Значение определителя матрицы: " + mat1.det());

        System.out.println("Вектор: " + vec1);

        System.out.println("Матрица-столбец:");
        System.out.println(mat2);

        System.out.println("Матрица-столбец * вектор");
        System.out.println(mat2.multLVector(vec1));

        System.out.println("Вектор * матрица");
        System.out.println(mat1.multRVector(vec1));

        System.out.println("Третья матрица:");
        System.out.println(mat3);

        System.out.println("Сумма 1 и 3 матриц:");
        System.out.println(mat1.plusMatrix(mat3));

        System.out.println("Первый вектор: " + vec1);
        System.out.println("Второй вектор: " + vec2);

        System.out.println("Сумма векторов: " + vec1.plusVector(vec2));
        System.out.println("Скалярное произведение: " + vec1.scalarMult(vec2));
        System.out.println("Первый вектор * 3 = " + vec1.multNumber(3));
        System.out.println("Абсолют первого вектора: " + vec1.abs());
    }
}
