package testTask;

/*
Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран,
где каждый элемент массива умножается на 2. Размер массива задается пользователем.
 */

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int length = in.nextInt();
        int[] array = new int[length];

        System.out.println("Заполните массив: ");
        for(int i = 0; i < length; i++){ //Добавила пробелы
            array[i] = in.nextInt();
        }

        for (int value : array) {
            System.out.print((value * 2) + " "); //Добавила пробелы
        }

    }
}
