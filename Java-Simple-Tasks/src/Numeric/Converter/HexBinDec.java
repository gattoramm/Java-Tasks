package Numeric.Converter;

import java.io.*;
import java.math.BigInteger;

public class HexBinDec {
    public static void main(String[] args) throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("c:\\WORKFLOW\\ARINKsystemNEW\\parseArinc\\df\\part2\\dfcosp2.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("c:\\WORKFLOW\\ARINKsystemNEW\\parseArinc\\df\\part2\\dfcosp2_comment.txt"))) {
            String line;
            StringBuilder stringBuilder;
            String dataResult;
            while(bufferedReader.ready()) {
                stringBuilder = new StringBuilder();
                line = bufferedReader.readLine();
                if(line.equals("")) {
                    bufferedWriter.newLine();
                    continue;
                }
                String hexToBin = new BigInteger(line,16).toString(2);
                String result = String.format("%32s", hexToBin).replace(" ", "0");

                String hexToDec = new BigInteger(line.substring(line.length()-2),16).toString(8);

                dataResult = result.substring(1, result.length()-8);

                // Вид - "HEX + Tab + BIN + DEC"
                stringBuilder.append(line).append("\t").append(dataResult).append("\t").append(hexToDec);
                bufferedWriter.write(stringBuilder.toString());
                bufferedWriter.newLine();
            }
        }
    }
}
