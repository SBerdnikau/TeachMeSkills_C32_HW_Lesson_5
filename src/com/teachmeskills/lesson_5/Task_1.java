package com.teachmeskills.lesson_5;

/**
 * 1*. Шахматная доска
 * Создать программу для раскраски шахматной доски с помощью цикла.
 * Создать двумерный массив String'ов 8х8. С помощью циклов задать
 * элементам циклам значения B(Black) или W(White). Результат работы
 * программы:
 * W B W B W B W B
 * B W B W B W B W
 * W B W B W B W B
 * B W B W B W B W
 * W B W B W B W B
 * B W B W B W B W
 * W B W B W B W B
 * B W B W B W B W
 */
public class Task_1 {
    public static void main(String[] args) {

        String[][] chessboard  = new String[8][8];

        for (int i = 0; i < chessboard.length; i++) {
            System.out.println();
            for (int j = 0; j < chessboard[i].length; j++) {
                if ( (i + j) % 2 == 0  ) {
                    chessboard[i][j] = "W";
                }else {
                    chessboard[i][j] = "B";
                }

                System.out.print(chessboard[i][j] + "  ");
            }
        }
    }
}
