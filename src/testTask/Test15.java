package testTask;

/*
Написать программу сортировки по возрастанию заданного пользователем массива чисел.
Использовать пузырьковый метод сортировки.
 */

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        int[] array;
        int length;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        length = in.nextInt();
        array = new int[length];

        System.out.println("Заполните массив: ");
        for(int i=0;i<length;i++){
            array[i] = in.nextInt();
        }

        for (int i=0; i < array.length; i++)
            for (int j = 0; j<array.length-1; j++)
                if (array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
}
