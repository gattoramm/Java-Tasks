package epamElearn.JavaFundamental;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *  Ввести с консоли n - размерность матрицы a [n] [n].
 *  Задать значения элементов матрицы в интервале значений от -M до M
 *  с помощью генератора случайных чисел (класс Random).
 *  Упорядочить строки (столбцы) матрицы в порядке возрастания значений
 *  элементов k-го столбца (строки).
 */

public class Task1 {
    public static void main(String[] args){

        int dem, bound;
//        int[][] massive = new int[rand];

        dem = readInputValue();
        bound = readInputValue();

//        Random rand = new Random();
//        IntStream rr = rand.ints(-bound, bound+1);



//        for(int i : dem) {
//
//        }

        System.out.println(dem);
        System.out.println(bound);

    }

    public static Integer readInputValue() {
        try {
            Scanner scanner = new Scanner(new InputStreamReader(System.in));
            return scanner.nextInt();
        }
        catch (Exception ex) {
            System.out.println("I/O Error!");
        }
        return null;
    }
}
