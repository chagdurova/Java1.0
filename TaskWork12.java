package com.Dasha.idea;

import java.util.Scanner;
/*
Напишите программу, принимающую на вход строку “I like Java!!!”
Проверить, содержит ли строка подстроку “Java” (используйте contains()).
Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран  (используйте substring()).
*/

public class TaskWork12 {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner in = new Scanner(System.in);
        String stroka = in.nextLine();
        System.out.println("Строка содержит 'Java': " + stroka.contains("Java"));
        System.out.println("Строка начинается с 'i like': " + stroka.startsWith("i like"));
        System.out.println("Строка заканчивается на '!!!': " + stroka.endsWith("!!!"));
        if (stroka.contains("Java") & stroka.startsWith("i like") & stroka.endsWith("!!!")) {
            System.out.println(stroka.toUpperCase());
        }
        stroka = stroka.replace('a', 'o');
        String str1 = stroka.substring(7, 11);
        System.out.println(str1);
    }
}