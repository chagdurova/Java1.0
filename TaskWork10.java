package com.Dasha.idea;

import java.util.Scanner;


public class TaskWork10 {
    public static void main(String[] args) {
        System.out.println("Введите количество столбцов");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println("Введите количество строк");
        Scanner input1 = new Scanner(System.in);
        int y = input1.nextInt();
        int array[][] = new int[y][x];
        System.out.println("Введите элемент(ы) массива: ");
        for (
                int i = 0;
                i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextInt();
            }
        }
        System.out.println("Новая Матрица: элементы умножены на 3)");
        for (
                int h = 0;
                h < array.length; h++) {
            for (int k = 0; k < array[h].length; k++) {
                System.out.print(" " + (array[h][k] * 3) + " ");
            }
            System.out.println();
        }
    }
}
