package com.teachmeskills.lesson_5;

import java.util.Arrays;

/**
 * 3. Создайте двумерный массив целых чисел. Выведите на консоль сумму
 * всех элементов массива.
 */
public class Task_3 {
    public static void main(String[] args) {

        int[][] twoDeepArray = new int[2][5];
        int sum = 0;

        for (int i = 0; i < twoDeepArray.length; i++){
            for (int j = 0; j < twoDeepArray[i].length; j++){
                twoDeepArray[i][j] = (int) (Math.random() * 100);
                sum += twoDeepArray[i][j];
            }
        }

        System.out.println(Arrays.deepToString(twoDeepArray));

        System.out.printf("The sum of elements a two-dimensional array: %d", sum);
    }
}
