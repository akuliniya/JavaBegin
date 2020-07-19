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
        //переменные для сохранения введенных в консоли значений
        String str1="";
        String str2="";

        //Создать объект для ввода данных с консоли
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Считать данные из консоли с обработкой возможного исключения
        try {
            System.out.println("Введите первую строку:");
            str1 = reader.readLine();
            System.out.println("Введите вторую строку:");
            str2 = reader.readLine();

        } catch (IOException e) {
            System.out.println("Кажется что-то пошло не так... \nПопробуйте начать с начала.");
        }

        //Сравнить длины строк
        if (str1.length() == str2.length())
            System.out.println("Длины строк равны.");
        if (str1.length() > str2.length())
            System.out.println(str1);
        if (str1.length() < str2.length())
            System.out.println(str2);

    }
}
