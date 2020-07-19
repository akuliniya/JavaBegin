package testTask;

/*
Написать программу, которая будет выполнять следующие действия:
1. Ввод трех чисел с клавиатуры x, y, z
2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
3. Деление среднего арифметического на 2 без остатка
4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {
    public static void main(String[] args) {
        //переменные для хранения вводимых в консоли значений
        String inputX;
        String inputY;
        String inputZ;

        //переменные для хранения чисел
        double x =0;
        double y =0;
        double z =0;



        //Создать объект для ввода данных с консоли
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Считать данные из консоли с обработкой возможных исключений
        try {
            // Вывести число x
            System.out.println("Введите число x:");
            inputX = reader.readLine();
            x = Double.parseDouble(inputX);
            // Вывести число y
            System.out.println("Введите число y:");
            inputY = reader.readLine();
            y = Double.parseDouble(inputY);
            // Вывести число z
            System.out.println("Введите число z:");
            inputZ = reader.readLine();
            z = Double.parseDouble(inputZ);

        }catch(IOException e){
            System.out.println("Кажется что-то пошло не так... \nПопробуйте начать с начала.");
        }
        catch(NumberFormatException e){
            System.out.println("Введено не число.\nЕсли вы ввели дробное число, проверьте, что разделителем является точка.");
        }

        //Среднее арифметическое
        double arithmeticMean = (x+y+z)/3;
        System.out.printf("%.3f\n", arithmeticMean);

        //Деление на 2 без остатка
        int divisionRes = (int)arithmeticMean/2;

        //Сравнение и вывод
        if (divisionRes>3)
            System.out.println("Программа выполнена корректно");

    }
}
