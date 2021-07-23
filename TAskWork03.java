package com.Dasha.idea;
/*
Задайте массив из 5 любых целых чисел.
Поменяйте местами первый и последний элемент в массиве.
Вывести в консоль результат суммы первого и среднего элемента.
 */

public class TAskWork03 {
    public static void main(String[] args){
        int[] number =  {1,  10, 67, 434, 7};
        System.out.println("Начальный Массив = " + number);

        System.out.println("Первый элемент массива =" + number[0]);
        System.out.println("Последний элемент массива =" + number[4]);

        int firstelement = number[0];
        number[0] = number[number.length-1];
        number[number.length-1] = firstelement;
        System.out.println("Новый Массив = " + number);
    }
}
