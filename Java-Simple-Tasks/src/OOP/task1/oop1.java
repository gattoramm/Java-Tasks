package OOP.task1;

public class oop1 {
    //Абстракция
    public static abstract class AbstractPhone {
        private int year;

        public AbstractPhone(int year) {
            this.year = year;
        }
        public abstract void call (int outputNumber);
        public abstract void ring (int inputNumber);
    }

    //Инкапсуляция
    public class SomePhone {
        private int year;
        private String company;
        public SomePhone (int year, String company) {
            this.year = year;
            this.company = company;
        }

        private void openConnection() {

        }

        public void call() {
            openConnection();
            System.out.println("Вызываю номер");
        }

        public void ring() {
            System.out.println("Динь-динь");
        }
    }

    //Наследование
    public abstract class WirelessPhone extends AbstractPhone {
        private int hour;

        public WirelessPhone(int year, int hour) {
            super(year);
            this.hour = hour;
        }
    }

    public class CellPhone extends WirelessPhone {
        public  CellPhone(int year, int hour) {
            super(year, hour);
        }

        @Override
        public void call (int outputNumber) {
            System.out.println("Вызываю номер " + outputNumber);
        }

        @Override
        public void ring (int inputNumber) {
            System.out.println("Вам звонит абонент " + inputNumber);
        }
    }

    public class SmartPhone extends CellPhone {
        private String operationSystem;

        public SmartPhone(int year, int hour, String operationSystem) {
            super(year, hour);
            this.operationSystem = operationSystem;
        }

        public void install (String program) {
            System.out.println("Устанавливаю " + program + " для " + operationSystem);
        }
    }

    //Полиморфизм
    public static class User {
        private  String name;

        public User(String name) {
            this.name = name;
        }

        public void callAnotherUser(int number, AbstractPhone phone) {
            phone.call(number);
        }
    }

    public static class ThomasEdisonPhone extends AbstractPhone {
        public ThomasEdisonPhone(int year) {
            super(year);
        }

        @Override
        public void call(int outputNumber) {
            System.out.println("Вращайте ручку");
            System.out.println("Сообщите номер");
        }

        @Override
        public void ring(int inputNumber) {
            System.out.println("Телефон звонит");
        }
    }

    public static class Phone extends AbstractPhone {
        public Phone(int year) {
            super(year);
        }

        @Override
        public void call(int outputNumber) {
            System.out.println("Вызываю номер " + outputNumber);
        }

        @Override
        public void ring(int inputNumber) {
            System.out.println("Телефон звонит");
        }
    }

    public static class VideoPhone extends AbstractPhone {
        public VideoPhone(int year) {
            super(year);
        }

        @Override
        public void call(int outputNumber) {
            System.out.println("Подключаю видеоканал для абонента " + outputNumber);
        }
        @Override
        public void ring(int inputNumber) {
            System.out.println("У вас входящий  видеовызов..." + inputNumber);
        }
    }

    public static void main(String[] args) {
        AbstractPhone firstphone = new ThomasEdisonPhone(1879);
        AbstractPhone phone = new Phone(1984);
        AbstractPhone videoPhone = new VideoPhone(2018);

        User user = new User("Андрей");
        user.callAnotherUser(224477, firstphone);
        user.callAnotherUser(224477, phone);
        user.callAnotherUser(224477, videoPhone);

    }
}
