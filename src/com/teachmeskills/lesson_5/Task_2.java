package com.teachmeskills.lesson_5;

import java.util.Arrays;

/**
 * 2*. Умножение двух матриц
 * Создайте два массива целых чисел размером 3х3 (две матрицы).
 * Напишите программу для умножения двух матриц.
 * Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
 * Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
 * Ожидаемый результат: 1 2 3 1 1 1 0 0 0
 */
public class Task_2 {
    public static void main(String[] args) {
        int[][] oneTwoDeepArray = {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        int[][] secondTwoDeepArray = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
        int[][] resultArray = new int[oneTwoDeepArray.length][secondTwoDeepArray[0].length];

        for (int i  = 0; i < resultArray[0].length; i++){
            for (int j = 0; j < resultArray.length; j++){
                for (int k = 0; k < resultArray.length; k++){
                    resultArray[i][j] += oneTwoDeepArray[i][k] * secondTwoDeepArray[k][j];
                }
            }
        }

        System.out.println(Arrays.deepToString(resultArray));
    }
}
