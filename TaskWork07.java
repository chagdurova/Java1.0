package com.Dasha.idea;

import java.util.Scanner;

/*Пользователь вводит размер массива и данные с клавиатуры в массив
 Сравнить элементы массива с заранее заданными константами x, y, z
 Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах"*/
public class TaskWork07 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        System.out.println("Введите размер массива: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int array[] = new int[a];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < a; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < a; i++) {
            if (array[i] == x) {
                System.out.println(x + "- Данное значение имеется в константах");
            } else if (array[i] == y) {
                System.out.println(y + "- Данное значение имеется в константах");
            } else if (array[i] == z) {
                System.out.println(z + "- Данное значение имеется в константах");
            }
        }
        System.out.println("Значение отсутствует в константах");
    }
}
