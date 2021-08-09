package com.Dasha.idea;

import java.util.Arrays;
/*
Задайте массив из 5 любых целых чисел.
Поменяйте местами первый и последний элемент в массиве.
Вывести в консоль результат суммы первого и среднего элемента.
 */

public class TaskWork03 {
    public static void main(String[] args) {
        int[] number = {1, 10, 67, 434, 7};
        System.out.println("Начальный Массив = " + Arrays.toString(number));

        System.out.println("Первый элемент массива =" + number[0]);
        System.out.println("Последний элемент массива =" + number[4]);

        int average = number[(number.length - 1) / 2];
        int summ = average + number[0];
        System.out.printf("сумма первого и среднего элемента = %d", summ);
    }
}
