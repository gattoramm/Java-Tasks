package Threads.task1;

class MyThread extends Thread {
    // Конструктор нового потока
    MyThread(String name) {
        super(name);
    }

    // Точка входа для потока
    @Override
    public void run() {
        System.out.println(getName() + " - запуск");
        try {
            for(int count=0; count<10; count++) {
                Thread.sleep(400);
                System.out.println("В " + getName() + ", счетчик: " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(getName() + " - прерван");
        }
        System.out.println(getName() + " - завершение.");
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока.");
        MyThread mt = new MyThread("Порожденный поток #1");

        mt.start();

        for(int i=0; i<50;  i++) {
            System.out.println(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока.");
            }
        }
        System.out.println("Завершение основного потока.");
    }
}
