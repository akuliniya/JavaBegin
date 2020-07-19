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
        String sRate;
        String sRur;
        double rate;
        double rur;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.print("Введите курс: ");
            sRate= reader.readLine();
            rate = Double.parseDouble(sRate);

            System.out.print("Введите количество рублей: ");
            sRur= reader.readLine();
            rur = Double.parseDouble(sRur);

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
        double result = rur/rate;
        System.out.printf("Количество долларов: %.2f $", result);
    }
}
