package com.Dasha.idea;

import java.util.Scanner;
/*
Напишите программу-загадку: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”. Ответ: “Заархивированный вирус”.
У пользователя есть 3 попытки, чтобы отгадать загадку.
Если пользователь ввел верный ответ, вывести: “Правильно!” и завершить работу.
Если пользователь ввел неверный ответ на 1 или 2 попытке, вывести “Подумай еще!” и еще раз запросить ответ у пользователя.
Если пользователь сделал 3 неправильных попытки, вывести “Обидно, приходи в другой раз” и завершить работу.
Также пользователь имеет право на подсказку при первой попытке, при этом 2 и 3 попытки уже недоступны.
Если на первой попытке он введет строку “Подсказка”, вывести любую подсказку. Если на 2 и 3, вывести “Подсказка уже недоступна”.
Если пользователь, использовавший подсказку, ошибется,
вывести “Обидно, приходи в другой раз” и завершить работу.
*/
public class Itogovoe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int n = scanner.nextInt();
        int[] result = new int[n];
        String[] str1 = new String[n];
        boolean check = false;
        int counter = 0;
        int max = 0;
        String maxStr = null;
        for (int i = 0; i < n; i++) {
            System.out.println("Строка " + (i + 1) + ": ");
            String str = scanner.next();
            str1[i] = str;
            char[] charStr = str.toCharArray();
            for (int k = 0; k < charStr.length; k++) {
                check = !(str.substring(k + 1).contains(String.valueOf(charStr[k])));
                if (check) {
                    counter = ++counter;
                }
            }
            result[i] = counter;
            counter = 0;
            for (int j = 0; j < result.length; j++) {
                if (max < result[j]) {
                    max = result[j];
                    maxStr = str1[i];
                }
            }
        }
        System.out.println("Ответ: " + maxStr);
    }
}
