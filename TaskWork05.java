package com.Dasha.idea;
import java.util.Scanner;
/*
Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’.
В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
 */
public class TaskWork05 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double result;
        char operation;
        Scanner reader = new Scanner(System.in);
        System.out.print("ВВедите два числа: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("Введите оператор:  ");
        operation = reader.next().charAt(0);
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.printf("не верный оператор");
                return;
        }
        System.out.printf("Ответ: " + result);
    }
}
