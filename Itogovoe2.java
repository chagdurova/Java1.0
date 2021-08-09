package com.Dasha.idea;

import java.util.Scanner;
/*
Напишите программу, которая позволит решить простое уравнение относительно x.
Программа принимает на вход строку длиной 5 символов.
Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке.
Нужно найти неизвестное.
*/
public class Itogovoe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввведите уравнение (х на латинице): ");
        String str = scanner.nextLine();
        char[] charArray = str.toCharArray();
        int x = str.indexOf('x');
        int result = 0;
        int a = Character.getNumericValue(charArray[0]);
        int b = Character.getNumericValue(charArray[2]);
        int c = Character.getNumericValue(charArray[4]);

        if (charArray.length == 5) {
            if (charArray[1] == '+') {
                switch (x) {
                    case (0):
                        result = c - b;
                        break;
                    case (2):
                        result = c - a;
                        break;
                    case (4):
                        result = a + b;
                        break;
                }
                System.out.println("Вывод: " + result);
            } else if (charArray[1] == '-') {
                switch (x) {
                    case (0):
                        result = c + b;
                        break;
                    case (2):
                        result = a - c;
                        break;
                    case (4):
                        result = a - b;
                        break;
                }
                System.out.println("Вывод: " + result);
            } else {
                System.out.println("ОШИБКА!ввели не правильный операнд");
            }
        } else {
            System.out.println("ОШИБКА! ввели больше 5 символов");
        }
    }
}
