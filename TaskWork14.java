package com.Dasha.idea;

import java.util.Arrays;


/*
Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20. Далее:
Выведите максимальный и минимальный элемент массива.
Из максимального и минимального значения выведите наибольшее по модулю.
*/

public class TaskWork14 {
    public static void main(String[] args) {
        int min = 0, max = 0;
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 40) - 20);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Масиив = " + Arrays.toString(array));
        System.out.println("Минимальный элемент = " + min);
        System.out.println("Максимальный элемент = " + max);
        if (Math.abs(max) > Math.abs(min)) {
            System.out.println(Math.abs(max));
        } else System.out.println("Наибольшое по модулю = " + Math.abs(min));
    }
}