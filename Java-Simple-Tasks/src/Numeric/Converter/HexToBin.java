package Numeric.Converter;

import java.io.*;
import java.math.BigInteger;

public class HexToBin {
    public static void main(String[] args) throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("c:\\WORKFLOW\\ARINKsystemNEW\\parseArinc\\df\\df_all_orig.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("c:\\WORKFLOW\\ARINKsystemNEW\\parseArinc\\df\\df_all_orig_bin.txt"))) {
            String line;
            while(bufferedReader.ready()) {
                line = bufferedReader.readLine();
                if(line.equals("")) {
                    bufferedWriter.newLine();
                    continue;
                }
                String hexToBin = new BigInteger(line,16).toString(2);
                String result = String.format("%32s", hexToBin).replace(" ", "0");
                String dataResult = result.substring(3, result.length()-9);
                bufferedWriter.write(result);
                bufferedWriter.newLine();
            }
        }
    }
}
