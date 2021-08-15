package IO.Adapter.PrintStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SystemRedirectService{
    public static void main(String[]args)throws FileNotFoundException{
        PrintStream filePrintStream = new PrintStream(new File("D:\\2.txt"));

         // сохранияем текущее значение System.out в отдельную переменную
         // чтобы потом переключиться обратно на вывод в консоль

        PrintStream console = System.out;

        // Присваиваем System.out новое значение
        System.setOut(filePrintStream);
        System.out.println("Эта строка будет записана в текстовый файл");

        // Возвращаем System.out старое значение
        System.setOut(console);
        System.out.println("Эта строка будет записана в консоль");
    }
}