package testTask;

/*
Произведите ввод данных с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран,
где каждый элемент умножается на 3. Размерность матрицы задается пользователем.
 */

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        int[][] array;
        int lines;
        int columns;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер матрицы.\nКоличество строк: ");
        lines = in.nextInt();
        System.out.print("Количество столбцов: ");
        columns = in.nextInt();

        array = new int[lines][columns];

        System.out.println("Заполните матрицу: ");

        for(int i=0;i<lines;i++){
            for(int j=0;j<columns;j++)
                array[i][j] = in.nextInt();
        }

        for(int i=0;i<lines;i++){
            for(int j=0;j<columns;j++) {
                System.out.print((array[i][j] * 3) + " ");
            }
            System.out.println();
        }

    }
}
