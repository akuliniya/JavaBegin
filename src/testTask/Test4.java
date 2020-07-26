package testTask;

/*
Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {
    public static void main(String[] args) {

        //Создать объект для ввода данных с консоли
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Вывести сообщение о необходимости ввести число
        System.out.println("Введите число в бинарном формате:");

        //Считать данные из консоли с обработкой возможного исключения
        try{
            String input = reader.readLine(); //переменная для сохранения вводимого в консоли значения
            //Преобразовать введенное строковое значение в число в бинарном формате
            if (checkForBinarFormat(input)) {
                //Вывод на экран результата
                System.out.println("Ваше число в десятичном формате = " + convert(input));
            }
        }
        catch (IOException e){
            System.out.println("Кажется что-то пошло не так... \nПопробуйте начать с начала.");
        }
    }


    //Метод для перевода числа из двоичной чмстемы в десятичную
    public static int convert(String str){
        int n = 0;          //переменная для сохранения результата смещений
        for (int i = 0; i < str.length(); i++) {
            if (n > 2000000000 || n < -2000000000)
                System.out.println("Введено слишком большое число! Результат конвертвции в десятичную систему будет не точным.");
            n <<= 1;
            if (str.charAt(i) == '1') n++;
        }
        return n;
    }


    //Метод для проверки на формат
    public static boolean checkForBinarFormat(String str) {
        boolean isBinarNum = true;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) != '1' && str.charAt(i) != '0') {
                isBinarNum = false;
                System.out.println("Введено число не в бинарном формате! Попробуйте начать сначала.");
                break;
            }
        return isBinarNum;
    }

}
