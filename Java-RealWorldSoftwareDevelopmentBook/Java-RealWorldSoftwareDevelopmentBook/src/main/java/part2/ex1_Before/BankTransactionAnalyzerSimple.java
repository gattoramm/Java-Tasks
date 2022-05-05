package main.java.part2.ex1_Before;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * если файл пустой?...
 * как посчитать сумму из файла, если данные повреждены?...
 * что, если пропущены какие-либо данные?...
 */

public class BankTransactionAnalyzerSimple {
    private static final String RESOURCES = "src/main/resources/";

    public static void main(String[] args) throws IOException {
        // вычисление суммы операций
        final Path path = Paths.get(RESOURCES + "file.csv");
        final List<String> lines = Files.readAllLines(path);
        double total = 0d;
        for (final String line: lines) {
            final String[] columns = line.split(",");
            final double amounts = Double.parseDouble(columns[1]);
            total += amounts;
        }
        System.out.println("The total for all transactions is " + total);
    }
}
