package Instance.task1;

public class inst1 {
    //общие поля в родительском классе
    public static class Car {

        private String model;
        private int maxSpeed;
        private int yerOfManufacture;

        public Car(String model, int maxSpeed, int yerOfManufacture) {
            this.model = model;
            this.maxSpeed = maxSpeed;
            this.yerOfManufacture = yerOfManufacture;
        }

        public void gas() {
            System.out.println("Let's go!");
        }

        public void brake() {
            System.out.println("Stop!");
        }
    }

    //классы конкретных типов машин наследуем от Car с помощью extends

    public static class Truck extends Car {

        public Truck(String model, int maxSpeed, int yerOfManufacture) {
            super(model, maxSpeed, yerOfManufacture);
        }
    }

    public static class Sedan extends Car {

        public Sedan(String model, int maxSpeed, int yerOfManufacture) {
            super(model, maxSpeed, yerOfManufacture);
        }
    }

    public static class F1Car extends  Car {
        public F1Car(String model, int maxSpeed, int yerOfManufacture) {
            super(model, maxSpeed, yerOfManufacture);
        }

        public void pitStop() {
            System.out.println("Go to pit-stop");
        }
    }

    public static void main(String[] args) {
        F1Car formula1Car = new F1Car("Ferrari", 350, 2014);
        formula1Car.gas();
        formula1Car.brake();
        formula1Car.pitStop();

        Truck truck = new Truck("Volvo", 200, 2015);
        System.out.println(truck instanceof Car);

        Car car = new Car("Nissan", 180, 2012);
        System.out.println(car instanceof Truck);

        System.out.println(car instanceof Object && truck instanceof Object);
    }
}
