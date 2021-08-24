package part5.Initialization.Exercises.Ex1_DefaultInit;

//Создайте класс с неинициализированной ссылкой на String.
// Покажите, что Java инициализирует ссылку значением null

public class Ex1 {
    public static void main(String[] args) {
        String str = new String();
        if (str.isEmpty() )
            System.out.println("null");
        else
            System.out.println(str);
    }
}
