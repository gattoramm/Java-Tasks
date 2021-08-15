package IO.FIS_FOS;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FOSBuffer{

    public static void main(String[]args) throws Exception{
        //создаем поток чтения байт из файла
        FileInputStream input = new FileInputStream("d://data.txt");

        //создаем поток записи байт в файл1
        FileOutputStream output1 = new FileOutputStream("d://result1.txt");

        //создаем поток записи байт в файл1
        FileOutputStream output2 = new FileOutputStream("d://result2.txt");

        //создаем поток записи байт в файл1
        FileOutputStream output3 = new FileOutputStream("d://result3.txt");

        //создадим поток чтения байт из файла, в который будем записывать
        FileInputStream inputOut = new FileInputStream("d://result1.txt");
        //определим количество байт в файле в который будем записывать
        int countOut = inputOut.available();

        System.out.println(input.available());
        //создаем массив из байт в размере 3
        byte[] buffer = new byte[1000];

        //создадим счетчик цикла
        int countWrite = 0;
        while(input.available()>0){//пока есть непрочитанные байты
            //читаем очередной блок байт в переменную buffer и реальное количество в count
            int count = input.read(buffer);

            //записываем данный очередной блок в поток записи в файл 1 начиная с начала
            output1.write(buffer, 0, count);

            //записываем данный очередной блок в поток записи в файл 2 начиная с середины
            output2.write(buffer, countOut/2, count);

            //записываем данный очередной блок в поток записи в файл 3 начиная с середины
            output3.write(buffer, countOut + 1, count);

            //выведем количество циклов записи
            System.out.println(++countWrite);
        }
        //закрываем потоки
        input.close();
        output1.close();
        output2.close();
        output3.close();
    }

}
