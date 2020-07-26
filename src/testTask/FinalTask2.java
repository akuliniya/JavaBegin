package testTask;
/*
Написать программу сортировки по возрастанию заданного пользователем массива чисел.
Пользователь программы должен задавать размер массива и наполнять его числами.
Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.
 */

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите размер массива: ");
            int length = in.nextInt();         //Перенесла объявление
            int[] array = new int[length];      //Перенесла объявление
            if (array.length == 0)
                return;

            System.out.println("Заполните массив: ");
            for (int i = 0; i < length; i++) {
                array[i] = in.nextInt();
            }

            System.out.println("Массив до сортировки:");
            System.out.println(Arrays.toString(array));

            quickSort(array, 0, length-1);
            
            System.out.println("Массив после сортировки:");
            System.out.println(Arrays.toString(array));

        }catch(InputMismatchException e){
            System.out.println("Вы ввели не число. Ошибка ввода: "+e);
        }

    }

    //метод быстрой сортировки
    public static void quickSort(int[] source, int leftBorder, int rightBorder){
        int leftMarker = leftBorder;                        //установить левый марке = левой границе массива
        int rightMarker = rightBorder;                      //установить правый маркер = правой границе массива
        int pivot = source[(leftMarker+rightMarker)/2];     //найти опорный элемент - pivot - ~средний член массива

        do{
            //сдвигаем левый маркер вправо пока элемент в позиции левого маркера гн станет >=pivot
            while(source[leftMarker] < pivot)
                leftMarker++;

            //сдвигаем правый маркер влево, пока элемент в позиции правого маркера не станет <=pivot
            while(source[rightMarker] > pivot)
                rightMarker--;

            //поменять местами элементы, на которые указывают маркеры, сели это нужно
            if (leftMarker <= rightMarker) {
                //левый маркер меньше правого как раз в том случае, когда нужно менять элементы местами
                if (leftMarker < rightMarker){
                    int tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                //сдвинуть маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        }while (leftMarker <= rightMarker);

        //выполнить рекурсивно все то же самое для левой и правой частей
        if (leftMarker < rightBorder)
            quickSort(source, leftMarker, rightBorder);
        if (rightMarker > leftBorder)
            quickSort(source, leftBorder, rightMarker);
    }
}
