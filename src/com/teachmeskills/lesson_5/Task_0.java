package com.teachmeskills.lesson_5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 0. Создать трехмерный массив из целых чисел.
 * С помощью циклов "пройти" по всему массиву и увеличить каждый
 * элемент на заданное число. Пусть число, на которое будет
 * увеличиваться каждый элемент, задается из консоли.
 */
public class Task_0 {
    public static void main(String[] args) {

        int[][][] treeDimArray = new int[5][5][5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert is a magnification factor:");
        int magnificationFactor = scanner.nextInt();

        for (int i = 0; i < treeDimArray.length; i++){
            for (int j = 0; j < treeDimArray.length; j++){
                for (int k = 0; k < treeDimArray.length; k++) {
                    treeDimArray[i][j][k] = (int)(Math.random() * 100);
                }
            }
        }

        System.out.println(Arrays.deepToString(treeDimArray));

        for (int i = 0; i < treeDimArray.length; i++){
            for (int j = 0; j < treeDimArray.length; j++){
                for (int k = 0; k < treeDimArray.length; k++) {
                    treeDimArray[i][j][k] += magnificationFactor;
                }
            }
        }

        System.out.println(Arrays.deepToString(treeDimArray));
    }
}
