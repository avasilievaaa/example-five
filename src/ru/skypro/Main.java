package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Задание №1
        //1.Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3
        int [] numbers = new int [12];
        numbers [0] = 1;
        numbers [1] = 2;
        numbers [2] = 3;

        //2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986
        double [] numbersTwo = {1.57,7.654,9.986,0,0,0,0,0,0,0,0,0};

        //3.Произвольный массив
        int [] numbersThree = {90,80,110,0,0,0,0,0,0,0,0,0};

        //Задание №2.
        System.out.println(numbers[0] + "," + numbers[1] + "," + numbers[2]);
        System.out.println(numbersTwo[0] + "," + numbersTwo[1] + "," + numbersTwo[2]);
        System.out.println(numbersThree[0] + "," + numbersThree[1] + "," + numbersThree[2]);

        //Задание №3
        System.out.println(numbers[2] + "," + numbers[1] + "," + numbers[0]);
        System.out.println(numbersTwo[2] + "," + numbersTwo[1] + "," + numbersTwo[0]);
        System.out.println(numbersThree[2] + "," + numbersThree[1] + "," + numbersThree[1]);

        //Задание №4
        for (int i = 0; i < numbers.length; i++) {
            if (numbers [i] % 2 != 0) {
                numbers [i] = numbers [i] + 1;
                System.out.println(numbers[0] + "," + numbers[1] + "," + numbers[2]);
            }
            }
        }
        }



