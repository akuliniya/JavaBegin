package testTask;

/*
Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test16 {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("test16.txt"));  //Указала относительный путь
            String str = null;  //Перенесла объявление переменной и проинициализировала ее
            while ((str = reader.readLine()) != null)
                System.out.println(str);

        }catch (FileNotFoundException e) {
            System.out.println("Файл не найден.\n"+e);
        }catch (IOException e) {
            System.out.println("Ошибка ввода-вывода.\n"+e);
        }
    }
}
