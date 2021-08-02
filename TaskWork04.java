package com.Dasha.idea;

import java.util.Scanner;

/*
Ввести три числа с клавиатуры x, y, z
Найти и вывести в консоль среднее арифметическое этих чисел.
Разделить среднее арифметическое на 2 и округлить в меньшую сторону
Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
 */
public class TaskWork04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size = 3;
        int array[] = new int[size];
        System.out.println("Введите три числа:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double average = sum / array.length;
        System.out.println("Среднее значение введенных чисел = " + average);
        average /= 2;
        System.out.println("Среднее значение введенных чисел деленное на 2 = " + average);
        System.out.println("Среднее значение введенных чисел деленное на 2 и округленное в меньшую сторону" + Math.floor(average));
        if (average > 3) {
            System.out.println("Программа выполнена корректно");
        } else{
            System.out.println("Программа выполнена НЕ корректно");
        }
    }
}

