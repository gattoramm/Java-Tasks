package IO.FIS_FOS;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FOS {
    public static void main(String[] args) throws Exception{
        // Создаем поток -чтения-байт из файла
        FileInputStream inputStream = new FileInputStream("d:/1.txt");
        //создаем поток-записи-байт в  файл
        FileOutputStream outputStream = new FileOutputStream("d:/2.txt");

        while(inputStream.available() > 0) {
            int data = inputStream.read();
            outputStream.write(data);
        }

        inputStream.close();
        outputStream.close();
    }
}
