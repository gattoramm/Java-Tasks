package p11_HoldingYourObjects.Exercises.Ex1;

class Gerbil {
    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public int hop() {
        System.out.print("Print gerbilNumber: ");
        return gerbilNumber;
    }
}




/*
* Создайте контейнер ArrayList и добавьте в него объекты Gerbil. Используйте метод get() для перебора элементов и вызова hop() для каждого объекта Gerbil.
* */
