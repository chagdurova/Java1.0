package com.Dasha.idea;

import java.util.Scanner;

/*
Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
Посчитайте среднее арифметическое элементов массива.
После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
 */
public class TaskWork09 {
    public static void main(String[] args) {
        double average = 0;
        double sum = 0;
        System.out.println("Введите размер массива: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        double array[] = new double[a];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < a; i++) {
            array[i] = input.nextDouble();
        }
        for (int i = 0; i < a; i++) {
            sum = sum + array[i];
        }
        average = sum / a;
        System.out.println("Среднее Арифметическое значние массива: " + average);
        System.out.println("Элементы массива умноженное на СА значение массива:");
        for (int i = 0; i < a; i++) {
            System.out.println(array[i] * average);
        }
    }
}
