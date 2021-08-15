package Threads.task2;

class MyThread implements Runnable {
    //объекты класса MyThread могут выполняться в своих собственных потоках,
    //поскольку класс MyThread реализует интерфейс Runnable
    String thirdName;

    MyThread(String name) {
        thirdName = name;
    }

    //точка входа в поток
    @Override
    public void run() {
        System.out.println(thirdName + " - запуск");

        try {
            for(int count=0; count<10; count++) {
                Thread.sleep(400);
                System.out.println("В " + thirdName + ", счетчик: " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(thirdName + " - прерван");
        }
        System.out.println(thirdName + " - завершение");
    }
}

class ImplementRunnable {
    public static void main(String[] args) {

        System.out.println("Запуск основного потока");

        // Сначала создать объект типа MyThread
        MyThread mt = new MyThread("Порожденный поток #1");	// Создание выполняемого объекта

        // Затем сформировать поток на основе этого объекта
        Thread newThread = new Thread(mt);					// Конструирование потока на основе этого объекта

        // Наконец начать выполнение потока
        newThread.start();	// Запуск потока на выполнение

        for(int i=0; i<50; i++) {
            System.out.println(".");
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException exc) {
                System.out.println("Прерывание основного потока");
            }
        }

        System.out.println("Завершение основного потока");
    }
}
