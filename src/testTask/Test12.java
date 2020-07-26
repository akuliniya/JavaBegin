package testTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Для введенной с клавиатуры строки необходимо провести отсев пробелов. Результат в виде строки без пробелов вывести на экран.
 */
public class Test12 {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Вводи уже свою строку: ");
            System.out.println(reader.readLine().replaceAll(" ", ""));  //убрала лищнюю переменную, перенесла вывод в блок try

        } catch (IOException e) {
            System.out.println("Кажется что-то пошло не так... \nПопробуйте начать с начала.");
        }

    }

}
