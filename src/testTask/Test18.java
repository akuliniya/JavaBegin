package testTask;
/*
Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.
 */

import java.io.*;

public class Test18 {
    public static void main(String[] args) {
        String file = "C:\\Users\\user\\Desktop\\test16.txt";
        String str;

        System.out.println("В файле "+file+" содержится текст:");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));

            while((str = reader.readLine()) != null)
                System.out.println(str);
            System.out.println();

        }catch (FileNotFoundException e) {
            System.out.println("Файл не найден.\n"+e);
        }catch (IOException e) {
            System.out.println("Ошибка ввода-вывода.\n"+e);
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ведите новый текст для записи в файл.\n" +
                "Прежний текст будет перезаписан.\n" +
                "Запись в файл завершится, когда вы введете: \"stop\"");

            try{
                FileWriter writer = new FileWriter(file);
                do{
                    System.out.print(": ");
                    str = reader.readLine();

                    if (str.compareTo("stop") == 0)     break;

                    str += "\r\n";
                    writer.write(str);

                }while(str.compareTo("stop") != 0);

                writer.close();

            }catch (IOException e){
                System.out.println("Ошибка ввода или записи в файл.\n"+e);
            }

    }
}
