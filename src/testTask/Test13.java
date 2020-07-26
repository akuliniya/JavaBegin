package testTask;

/*
Необходимо провести сравнение длины двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные.
Вывести на экран строку с наибольшей длиной. Если длины равны, вывести соответствующее сообщение.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test13 {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Введите первую строку:");
            String str1 = reader.readLine();  //Перенесла объявление переменной в try
            System.out.println("Введите вторую строку:");
            String str2 = reader.readLine();  //Перенесла объявление переменной в try

            // использовала else if вместо if, перенесла выполнение условий в try
            if (str1.length() == str2.length())
                System.out.println("Длины строк равны.");
            else if (str1.length() > str2.length())
                System.out.println(str1);
            else
                System.out.println(str2);

        } catch (IOException e) {
            System.out.println("Кажется что-то пошло не так... \nПопробуйте начать с начала.");
        }

    }
}
