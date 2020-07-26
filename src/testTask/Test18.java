package testTask;
/*
Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.
 */

import java.io.*;

public class Test18 {
    public static void main(String[] args) {
        String file = "test16.txt";
        int linesBefore = 0;  //Добавила счетчик
        int linesAfter = 0;  //Добавила счетчик


        try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String str = null;  //Проинициализировала

                if (isFileEmpty(file)) {
                    System.out.println("Файл пуст.");
                    return;
                }
                else {
                    System.out.println("В файле " + file + " содержится текст:");
                    // Ваш комментарий "тут ошибка в цикле выведутся не все строчки". Исправила, добавила метод isFileEmpty для проверки
                    while((str = reader.readLine()) != null){
                        System.out.println(str);
                        linesBefore++;
                }
            }
        }catch (FileNotFoundException e) {
            System.out.println("Файл не найден.\n"+e);
        }catch (IOException e) {
            System.out.println("Ошибка ввода-вывода.\n"+e);
        }


        System.out.println("\nВедите новый текст для записи в файл.\n" +
                "Прежний текст будет перезаписан.\n" +
                "Запись будет прервана, когда количество введенных вами строк станет равно " + linesBefore);

        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileWriter writer = new FileWriter(file);
            String str = null;

            do{
                System.out.print(": ");
                str = reader.readLine();
                linesAfter++;

                if (linesAfter == linesBefore)  {
                    str += "\r\n";
                    writer.write(str);
                    break;
                    }

                str += "\r\n";
                writer.write(str);

            }while(linesAfter < linesBefore);  // Исправила условие(выходить из цикла не по stop, а по кол-ву строк

                writer.close();

        }catch (IOException e){
            System.out.println("Ошибка ввода или записи в файл.\n"+e.getMessage());
        }

    }


    public static boolean isFileEmpty (String file) throws java.io.IOException{
        boolean isEmpty = true;
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String str = null;
        if((str = reader.readLine()) != null) {
            isEmpty = false;
        }
        return isEmpty;
    }

}
