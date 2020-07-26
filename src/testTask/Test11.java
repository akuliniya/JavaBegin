package testTask;
/*
Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test11 {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку:");

        try {
            //Убрала вообще переменнцю input, перенесла вывод в блок try
            System.out.println("Вы ввели строку: \"" + reader.readLine() + "\"");
        } catch (IOException e) {
            System.out.println("Кажется что-то пошло не так... \nПопробуйте начать с начала.");
        }

    }
}
