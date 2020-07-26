package testTask;

/*
Написать программу сортировки по возрастанию заданного пользователем массива чисел.
Использовать пузырьковый метод сортировки.
 */

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int length = in.nextInt();       //Перенесла объявление переменной
        int[] array = new int[length];  //Перенесла объявление переменной

        System.out.println("Заполните массив: ");
        for(int i = 0; i < length; i++){  //Добавила пробелы
            array[i] = in.nextInt();
        }

        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length - 1; j++) //Добавила пробелы
                if (array[j] > array[j + 1]){
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }

        for(int value : array){  //Заменила fo loop на enhanced for
            System.out.print(value);
        }

    }
}
