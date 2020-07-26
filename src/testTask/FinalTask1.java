package testTask;
/*
Ввести с консоли число в бинарном формате.
Перевести его в десятичный формат, записать в переменную int и вывести на экран.
Необходимо использовать циклы, нельзя использования готовые методы языка Java,
для перевода числа из одной системы счисления в другую.

Прошу, прощенья, я просто скопипастила сюда свой код из задания 4))
Он полностью подходит под рлстановку задачи.
Это я, видимо, в задании 4 перестаралась
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinalTask1 {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число в бинарном формате:");

        try{
            String input = reader.readLine(); //Перенесла объявление переменной, ьеперь она сразу инициалихируется
            if (checkForBinarFormat(input)) {
                System.out.println("Ваше число в десятичном формате = " + convert(input));
            }
            else  // Перенесла  в else вывод сообщения из метода checkForBinarFormat
                System.out.println("Введено число не в бинарном формате! Попробуйте начать сначала.");
        }
        catch (IOException e){
            System.out.println("Кажется что-то пошло не так... \nПопробуйте начать с начала.");
        }
    }


    //Метод для перевода числа из двоичной чмстемы в десятичную
    public static int convert(String str){
        int n = 0;
        for (int i = 0; i < str.length(); i++) {
            if (n > 2000000000 || n < -2000000000) //Убрала лишние скобки, добавила пробелы
                System.out.println("Введено слишком большое число! Результат конвертвции в десятичную систему будет не точным.");
            n <<= 1;
            if (str.charAt(i) == '1') n++;
        }
        return n;
    }


    //Метод для проверки на формат
    public static boolean checkForBinarFormat(String str) {
        boolean isBimarNum = true;      /* Ваш комментарий "по cути лишняя переменная, можно просто приписать return false в if"
                                        Нельзя, т.к. возникает ошибка "missing return statement", даже если if без фигурных скобок
                                        К тому же лучше прервать выполнение метода, когда уже понятно, что число не бинароное
                                        ну или я что-то не поняла */
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) != '1' && str.charAt(i) != '0') {//Убрала лишние скобки, добавила пробелы
                isBimarNum = false;
                break;
            }
        return isBimarNum;
    }

}
