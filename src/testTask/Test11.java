package testTask;
/*
Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test11 {
    public static void main(String[] args) {
        String input = "";       //переменная для сохранения введенного в консоли значения

        //Создать объект для ввода данных с консоли
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Вывести сообщение о необходимости ввести число
        System.out.println("Введите строку:");

        //Считать данные из консоли с обработкой возможного исключения
        try {
            input = reader.readLine();
        } catch (IOException e) {
            System.out.println("Кажется что-то пошло не так... \nПопробуйте начать с начала.");
        }

        System.out.println("Вы ввели строку: \""+input+"\"");
    }
}
