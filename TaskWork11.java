package com.Dasha.idea;

import java.util.Scanner;
/*
Ввести первое  число с клавиатуры и записать его в строковую переменную.
Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
Сравнить 2 числа и вывести большее на экран .
Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
*/


public class TaskWork11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        String stroka = scanner.nextLine();
        System.out.println("Введите второе число:");
        int chislo = scanner.nextInt();
        System.out.println("Наибольшее из двух чисел: " + Math.max(chislo, Integer.parseInt(stroka)));
        double min = Math.min(Double.parseDouble(stroka), chislo);
        System.out.println("Наименьшее из двух чисел с конвертацией в тип double: " + min);
    }
}
