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
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите целое число:");

        try{
            String s = reader.readLine();  //пренесла объявление переменных в try
            int x = Integer.parseInt(s);
            double y = x;

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
