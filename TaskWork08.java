package com.Dasha.idea;

import java.util.Scanner;

/*
Напишите программу, где пользователь вводит любое целое положительное число n.
А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
 */
public class TaskWork08 {
    public static void main(String[] args) {
        int x = 0;
        System.out.println("Введите число: ");
        Scanner one = new Scanner(System.in);
        int a = one.nextInt();
        for (int i = 1; i <= a; ) {
            x = x + i;
            i = i + 2;
        }
        System.out.println("Сумма всех нечетных чисел от 1 до введенного пользователем числа: " + x);
    }
}