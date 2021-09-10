package epamElearn.JavaFundamental;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tmp {
    public static void main(String[] args) {
        int a;
        double b;

        a = Integer.parseInt(getString());
        b = Double.parseDouble(getString());

        double sum = a+b;
        System.out.println("sum: " + sum);
    }

    public static String getString() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            return br.readLine();
        }
        catch (IOException ex) {
            System.out.println("I/O Error!");
        }
        return null;
    }
}
