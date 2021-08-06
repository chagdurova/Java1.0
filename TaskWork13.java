package com.Dasha.idea;

import java.util.Scanner;

/*
Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами.
Например: “I love java 8 Я люблю java 14 core1”. Выполните следующие действия:
Выведите слова, состоящие только из латиницы.
Выведите количество этих слов.
*/

public class TaskWork13 {
    public static void main(String[] args) {
        System.out.println("Введите строку - ");
        int a = 0;
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] str1 = str.split(" ");
        for (int i = 0; i < str1.length; i++) {
            if (str1[i].matches("^[a-zA-Z]+$")) {
                System.out.println(str1[i]);
                a++;
            }
        }
        System.out.println(a);
    }
}