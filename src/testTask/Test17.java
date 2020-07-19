package testTask;
/*
Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
Пользователь при тестировании программы по правилу черного ящика должен понимать,
какой принцип остановки записи в файл он должен подать.
 */

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;

public class Test17 {
    public static void main(String[] args) {
        String file;
        String str;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите полный путь к файлу, в который нужно произвести запись: ");
        try {
            file = reader.readLine();
            if (!isTxt(file)){
                    System.out.println("Вы указали не \'.txt\' файл.\nНачните сначала");
                    return;
            }

            if(isFileExists(file))
                System.out.println("Файл уже существует. Введенный вам текст будет добавлен в конец файла.");

            FileWriter writer = new FileWriter(file, true);
            System.out.println("Ведите текст для записи в файл.\nЗапись в файл завершится, когда вы введете: \"stop\"");

            try{
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
        }catch (IOException e){
            System.out.println("Ошибка чтения файла.\n" +
                    "Ошибка могла возникнуть по одной из следующих причин:\n" +
                    "1. Вы указали имя каталога вместо имени файла для записи.\n" +
                    "2. Указанного файла не существует и он не может быть создан.\n" +
                    "3. Не удается открыть файл.\n"+ e);
        }

    }

        public static boolean isTxt(String file){
            boolean isTxt=true;
            if (!file.endsWith(".txt"))
                isTxt = false;
            return isTxt;
        }

        public static boolean isFileExists(String file){
            boolean isFileExists=false;
            Path path = java.nio.file.Paths.get(file);
            if (java.nio.file.Files.exists(path))
                isFileExists = true;
            return isFileExists;
        }
}
