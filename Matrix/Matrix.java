package com.company;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
    int[][] matrix;
    private Scanner Scan;
    public Matrix(Scanner scanner) {
        Scan = scanner;
    }
    public int[][] getParametr() {
        int m;
        int CountString;
        do {
            System.out.println("Введите количество строк матрицы(от 1): ");
            CountString = Scan.nextInt();
        } while (CountString < 0);
        do {
            System.out.println("Введите количество столбцов матрицы(от 1): ");
            m = Scan.nextInt();
        } while (m < 0);
        matrix = new int[CountString][m];
        return matrix;
    }
    public void getElemetsMatrixs(int n, int m) {
        final int max = 10;
        final int min = -5;
        Random random = new Random();
        matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = random.nextInt(max - min) + min;
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void multiplyMatrix(Matrix otherMatrix) {
        System.out.println("Результат умножения 2-ух матриц: ");
        int[][] resultMatrix = new int[matrix.length][otherMatrix.matrix[0].length];
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[0].length; j++) {
                resultMatrix[i][j] = 0;
                for (int k = 0; k < otherMatrix.matrix.length; k++) {
                    resultMatrix[i][j] += matrix[i][k] * otherMatrix.matrix[k][j];
                }
                System.out.print(" " + resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
