package testTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Для введенной с клавиатуры строки необходимо провести отсев пробелов. Результат в виде строки без пробелов вывести на экран.
 */
public class Test12 {
    public static void main(String[] args) {
        //переменная для сохранения введенной строки
        String str="";

        //Создать объект для ввода данных с консоли
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Считать данные из консоли с обработкой возможного исключения
        try {
            System.out.print("Вводи уже свою строку: ");
            str = reader.readLine();


        } catch (IOException e) {
            System.out.println("Кажется что-то пошло не так... \nПопробуйте начать с начала.");
        }

        //Удалить пробелы и вывести в консоль
        System.out.println(str.replaceAll(" ", ""));

    }

}
