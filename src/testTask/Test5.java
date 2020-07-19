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

        String input;           //переменная для сохранения вводимого в консоли значения
        double num;            //переменная для сохранения числа
        int multiplier = 1;


        // Вывести сообщение о необходимости ввести число
        System.out.println("Введите число:");
        //Создать объект для ввода данных с консоли
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        //Считать данные из консоли с обработкой возможных исключений и вывести на экран таблицу умножения
        try{
            input = reader.readLine();
            num = Double.parseDouble(input);
            //можно так, но мне не понравился такой ваариант (если у введенного число больше 2 знаков после точки, то не логично получается
            System.out.printf(" %d + "+"%.2f"+" = "+"%.2f"+"\n", multiplier, num, (multiplier*num)); multiplier++;
            //поэтому остальное вот так
            System.out.printf(" %d + "+num+" = "+(multiplier*num)+"\n", multiplier, num); multiplier++;
            System.out.printf(" %d + "+num+" = "+(multiplier*num)+"\n", multiplier, num); multiplier++;
            System.out.printf(" %d + "+num+" = "+(multiplier*num)+"\n", multiplier, num); multiplier++;
            System.out.printf(" %d + "+num+" = "+(multiplier*num)+"\n", multiplier, num); multiplier++;
            System.out.printf(" %d + "+num+" = "+(multiplier*num)+"\n", multiplier, num); multiplier++;
            System.out.printf(" %d + "+num+" = "+(multiplier*num)+"\n", multiplier, num); multiplier++;
            System.out.printf(" %d + "+num+" = "+(multiplier*num)+"\n", multiplier, num); multiplier++;
            System.out.printf(" %d + "+num+" = "+(multiplier*num)+"\n", multiplier, num); multiplier++;
            System.out.printf("%d + "+num+" = "+(multiplier*num)+"\n", multiplier, num);

        }
        catch (IOException e){
            System.out.println("Кажется что-то пошло не так... \nПопробуйте начать с начала.");
        }
        catch (NumberFormatException e){
            System.out.println("Введено не число.\nЕсли вы ввели дробное число, проверьте, что разделителем является точка.");
        }
    }



}
