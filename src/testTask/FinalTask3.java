package testTask;
/*
Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
Пользователь вводит текущий курс и количество рублей.
Итоговое значение должно быть округлено до двух знаков после запятой.
(Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinalTask3 {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.print("Введите курс: ");
            double rate = Double.parseDouble(reader.readLine());  //Перенесла объявление, убрала лишние переменные

            System.out.print("Введите количество рублей: ");
            double rur = Double.parseDouble(reader.readLine());  //Перенесла объявление, убрала лишние переменные

            convert(rate, rur);
        }
        catch (IOException e){
            System.out.println("Кажется что-то пошло не так... \nПопробуйте начать с начала.");
        }
        catch (NumberFormatException e){
            System.out.println("Введено не число.\nЕсли вы ввели дробное число, проверьте, что разделителем является точка.");
        }
    }

    public static void convert(double rate, double rur){
        double result = rur / rate;
        System.out.printf("Количество долларов: %.2f $", result);
    }
}
