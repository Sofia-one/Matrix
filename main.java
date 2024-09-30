package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        Matrix matrixOne = new Matrix(Scan);
        Matrix matrixTwo = new Matrix(Scan);
        do {
            System.out.println("Количество столбцов первой матрицы должно быть равно количеству строк второй матрицы ");
            System.out.println("Введите параметры для 1 матрицы");
            matrixOne.getParametr();
            System.out.print("Введите параметры 2 матрицы. ");
            matrixTwo.getParametr();
        }while (matrixOne. matrix.length   != matrixTwo.matrix[0].length ||
                matrixOne.matrix[0].length != matrixTwo. matrix.length );
        Scan.close();
        System.out.println("Матрица 1: ");
        matrixOne.getElemetsMatrixs(matrixOne.matrix.length,
                                    matrixOne.matrix[0].length);
        System.out.println("Матрица 2: ");
        matrixTwo.getElemetsMatrixs(matrixTwo.matrix.length,
                                    matrixTwo.matrix[0].length);
        matrixOne.multiplyMatrix(matrixTwo);
    }
}
