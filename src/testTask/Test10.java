package testTask;

/*
Произведите ввод данных с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран,
где каждый элемент умножается на 3. Размерность матрицы задается пользователем.
 */

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер матрицы.\nКоличество строк: ");
        int lines = in.nextInt();   //Перенесла объявление переменных
        System.out.print("Количество столбцов: ");
        int columns = in.nextInt(); //Перенесла объявление переменных

        int[][] array = new int[lines][columns];  //Перенесла объявление переменных

        System.out.println("Заполните матрицу: ");

        for(int i = 0; i < lines; i++){
            for(int j = 0; j < columns; j++) //Добавила пробелы
                array[i][j] = in.nextInt();
        }

        for(int i = 0; i < lines; i++){
            for(int j = 0; j < columns; j++) {
                if (i < 1) //Исправила. Умножается только первая строка
                    System.out.print((array[i][j] * 3) + " ");
                else
                    System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
