package com.Dasha.idea;
import java.util.Scanner;
/*
Напишите программу конвертер физических величин.
 */
public class TaskWork06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int x = scanner.nextInt();
        if (x == 1) {
            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - центнер, 4 - тонна");
            int massa = scanner.nextInt();
            System.out.println("Введите число");
            double result = scanner.nextDouble();
            switch (massa) {
                case 1:
                    System.out.println("Грамм: " + result);
                    System.out.println("Килограмм: " + result / 1000);
                    System.out.println("Центнер: " + result / 100000);
                    System.out.println("Тонн: " + result / 1000000);
                    break;
                case 2:
                    System.out.println("Грамм: " + result * 1000);
                    System.out.println("Килограмм: " + result);
                    System.out.println("Центнер: " + result / 100);
                    System.out.println("Тонн: " + result / 1000);
                    break;
                case 3:
                    System.out.println("Грамм: " + result * 100000);
                    System.out.println("Килограмм: " + result * 100);
                    System.out.println("Центнер: " + result);
                    System.out.println("Тонн: " + result / 10);
                    break;
                case 4:
                    System.out.println("Грамм: " + result * 1000000);
                    System.out.println("Килограмм: " + result * 1000);
                    System.out.println("Центнер: " + result * 10);
                    System.out.println("Тонн: " + result);
                default:
                    System.out.println("Выбрано неправильное число");
                    break;
            }
        } else if (x == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int rasstoynie = scanner.nextInt();
            System.out.println("Введите число");
            double result = scanner.nextDouble();
            switch (rasstoynie) {
                case 1:
                    System.out.println("Метр: " + result);
                    System.out.println("Миля: " + result * 0.0006);
                    System.out.println("Ярд: " + result * 1.094);
                    System.out.println("Фут: " + result * 3.281);
                    break;
                case 2:
                    System.out.println("Метр: " + result / 0.0006);
                    System.out.println("Миля: " + result);
                    System.out.println("Ярд: " + result * 1760);
                    System.out.println("Фут: " + result * 5280);
                    break;
                case 3:
                    System.out.println("Метр: " + result / 1.094);
                    System.out.println("Миля: " + result / 1760);
                    System.out.println("Ярд: " + result);
                    System.out.println("Фут: " + result * 3);
                    break;
                case 4:
                    System.out.println("Метр: " + result / 3.281);
                    System.out.println("Миля: " + result / 5280);
                    System.out.println("Ярд: " + result / 3);
                    System.out.println("Фут: " + result);
                    break;
                default:
                    System.out.println("Не верно выбрали категорию перевода");
                    break;
            }
        } else {
            System.out.println("Не верно выбрали категорию перевода");
        }
    }
}
