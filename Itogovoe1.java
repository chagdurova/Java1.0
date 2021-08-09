package com.Dasha.idea;

import java.util.Scanner;

/*
Напишите программу конвертер валют.
Программа должна переводить рубли в доллары по текущему курсу.
Пользователь вводит текущий курс и количество рублей.
Итоговое значение должно быть округлено до двух знаков после запятой.
*/
public class Itogovoe1 {
    public static void main(String[] args) {
        System.out.println("Введите, текущий курс валюты $: ");
        Scanner usd = new Scanner(System.in);
        double a = usd.nextDouble();
        System.out.println("Введите, количество рублей: ");
        Scanner rub = new Scanner(System.in);
        int b = rub.nextInt();
        double c = b / a;
        System.out.printf("Итого: %.2f долларов", c);
    }
}
