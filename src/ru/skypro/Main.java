package ru.skypro;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write your code here
        // Задание №1
        //1.Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3
        int [] numbers = new int [3];
        numbers [0] = 1;
        numbers [1] = 2;
        numbers [2] = 3;

        //2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986
        double [] numbersTwo = {1.57,7.654,9.986};

        //3.Произвольный массив
        int [] numbersThree = {90,80,110};

        //Задание №2.
        // 1.
        for (int i = 0; i < numbers.length; i++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(numbers[i]);
        }
        System.out.println();

        // 2.
        for (int i = 0; i < numbersTwo.length; i++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(numbersTwo[i]);
        }
        System.out.println();

        // 3.
        for (int i = 0; i < numbersThree.length; i++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(numbersThree[i]);
        }
        System.out.println();


        //Задание №3
        // 1.
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        // 2.
        for (int i = numbersTwo.length - 1; i >= 0; i--) {
            System.out.print(numbersTwo[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        //3.
        for (int i = numbersThree.length - 1; i >= 0; i--) {
            System.out.print(numbersThree[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        //Задание №4
        for (int i = 0; i < numbers.length; i++) {
            if (numbers [i] % 2 != 0)
                numbers [i] = numbers [i] + 1;
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(numbers[i]);
        }
    }
}








