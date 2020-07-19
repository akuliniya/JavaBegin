package testTask;

/*
Необходимо написать программу, которая будет реализовывать следующие действия:
1. Ввод числа с клавиатуры и запись его в строковую переменную S
2. Конвертация строковой переменной S в числовую переменную X типа int
3. Конвертация числа X типа int в число Y типа double
Все три числа разных типов необходимо в столбик вывести на экран
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test14 {
    public static void main(String[] args) {
        String s;        //переменная для сохранения вводимого в консоли значения
        int x;           //переменная для созранения числа int
        double y;        //переменная для созранения числа double

        //Создать объект для ввода данных с консоли
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Вывести сообщение о необходимости ввести число
        System.out.println("Введите целое число:");

        //Считать данные из консоли с обработкой возможного исключения
        try{
            s = reader.readLine();
            x = (int)Integer.parseInt(s);
            y = x;

            System.out.println(s);
            System.out.println(x);
            System.out.println(y);
        }
        catch (IOException e){
            System.out.println("Кажется что-то пошло не так... \nПопробуйте начать с начала.");
        }
        catch (NumberFormatException e){
            System.out.println("Введено не целое число.");
        }


    }
}
