package testTask;
/*
Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа. Использовать циклы запрещено.

Вообще не поняино, почему нельзя использрвать циклы и верно ли я в таком случае поняла задание
В чем смысл такого задания? Выглядит стремно))
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {
    public static void main(String[] args) {

        int multiplier = 1;

        System.out.println("Введите число:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        //Считать данные из консоли с обработкой возможных исключений и вывести на экран таблицу умножения
        try{
            double num = Double.parseDouble(reader.readLine());  // Убрала лищнюю переменную, перенесла обявление в блок try
            System.out.printf(" %d + " + "%.2f" + " = " + "%.2f" + "\n", multiplier, num, (multiplier*num)); multiplier++;
            //добавила пробелы
            System.out.printf(" %d + " + num + " = " + (multiplier * num) + "\n", multiplier, num); multiplier++;
            System.out.printf(" %d + " + num + " = " + (multiplier * num) + "\n", multiplier, num); multiplier++;
            System.out.printf(" %d + " + num + " = " + (multiplier * num) + "\n", multiplier, num); multiplier++;
            System.out.printf(" %d + " + num + " = " + (multiplier * num) + "\n", multiplier, num); multiplier++;
            System.out.printf(" %d + " + num + " = " + (multiplier * num) + "\n", multiplier, num); multiplier++;
            System.out.printf(" %d + " + num + " = " + (multiplier * num) + "\n", multiplier, num); multiplier++;
            System.out.printf(" %d + " + num + " = " + (multiplier * num) + "\n", multiplier, num); multiplier++;
            System.out.printf(" %d + " + num + " = " + (multiplier * num) + "\n", multiplier, num); multiplier++;
            System.out.printf("%d + " + num + " = " + (multiplier * num) + "\n", multiplier, num);

        }
        catch (IOException e){
            System.out.println("Кажется что-то пошло не так... \nПопробуйте начать с начала.");
        }
        catch (NumberFormatException e){
            System.out.println("Введено не число.\nЕсли вы ввели дробное число, проверьте, что разделителем является точка.");
        }
    }



}
