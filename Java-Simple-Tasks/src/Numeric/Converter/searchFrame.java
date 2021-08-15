package Numeric.Converter;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;

public class searchFrame {
    public static void main(String[] args) throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("c:\\WORKFLOW\\ARINKsystemNEW\\parseArinc\\df\\df_example.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("c:\\WORKFLOW\\ARINKsystemNEW\\parseArinc\\df\\df_example_frames.txt"))) {
            String line;
            ArrayList<String> list;
            String lineWithoutAddress;
            String address;
            while(bufferedReader.ready()) {
                line = bufferedReader.readLine();
                lineWithoutAddress = line.substring(3, line.length()-9);
                address = line.substring(line.length()-9);

                list = new ArrayList<>();

                // пока не встретим 113 адрес, все данные (строки добавляем с список)
                while(!address.equals("01001011"))
                    list.add(lineWithoutAddress);

                // инвертируем данные с контрольной суммы

                for(String item : list) {

                }
                //int num1 = Integer.parseInt("11000", 2);
                BigInteger hexToBin = new BigInteger(line,2);

                // после того, как встретили, берем данные, инвертируем
                // затем, начиная с конца списка считываем данные без адреса и бита четности и матрицы и суммируем
                // до тех пор, пока сумма не сойдется с инвертированными заранее данными
                // или
                // начиная с конца списка считываем данные без адреса и бита четности и матрицы и
                // вычитаем из инфертированных данных, пока не станет равным нулю
            }
        }
    }
}
