package IO.FIS_FOS;
// Сумма всех байт
import java.io.FileInputStream;

public class FIS {
    public static void main(String[] args) throws Exception {
        //Создаем объект FileInputStream, привязанный к файлу
        FileInputStream inputStream = new FileInputStream("d:/1.txt");
        long sum = 0;

        while(inputStream.available() > 0) { //пока остались непрочитанные байты
            System.out.println("av = " + inputStream.available());
            int data = inputStream.read();//прочитать очередной байт

            System.out.println("data = " + data);
            sum += data;
        }

        inputStream.close();//закрываем поток

        System.out.println(sum);
    }
}
