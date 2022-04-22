package p4_ControllingExecution.Exercises.Ex17_RandomIntInfinity;
//: Напишите программу, которая генерирует 25 случайных значений типа int.
// Для каждого значения команда if-else сообщает, в каком отношении оно
// находится с другим случайно сгенерированным числом (больше, меньше, равно)
// Измените приложение так, чтобы код выполнялся в "бесконечном цикле" while

public class Ex17 {
    public static void main(String[] args) {
        int num1, num2;

       while(true) {
            num1 = (int) ( Math.random()*100 );
            num2 = (int) ( Math.random()*100 );

            System.out.print("num1 = " + num1 + ",\tnum2 = " + num2 + ".\t\t");

            if (num1 == num2)
                System.out.println("num1 = num2");
            else if (num1 < num2)
                System.out.println("num1 < num2");
            else
                System.out.println("num1 > num2");
        }
    }
}
