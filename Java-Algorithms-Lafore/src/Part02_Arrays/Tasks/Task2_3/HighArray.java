package Part02_Arrays.Tasks.Task2_3;

// Класс массива с высокоуровневым интерфейсом
// Добавить метод, возвращающий наибольшее значение ключа или -1, если массив пуст
// Элемент с наибольшим ключем должен удаляться из массива
// Реализовать алгоритм сортировки, который не изменяет класса HighArray (а изменяет только код main())

class HighArray {
    private long[] a;
    private int nElems;

    public HighArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    public boolean find(long searchKey) {
        int j;
        for(j=0; j<nElems; j++)
            if(a[j] == searchKey)
                break;
        if(j == nElems)
            return false;
        else
            return true;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int j;
        for(j=0; j<nElems; j++)
            if(value == a[j])
                break;
        if(j == nElems)
            return false;
        else {
            for(int k=j; k<nElems; k++)
                a[k] = a[k+1];
            nElems--;
            return true;
        }
    }

    public void display() {
        for(int j=0; j<nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println("");
    }

    public long removeMax() {
        long max = -1;

        for(int j=0; j<nElems; j++)
            if(a[j] > max)
                max = a[j];

        delete(max);
        return max;
    }
}

class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 20;
        HighArray arr, sortedArr;
        arr = new HighArray(maxSize);
        sortedArr = new HighArray(maxSize);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);

        System.out.println("Print array: ");
        arr.display();

        for(int j=0; j<maxSize; j++)
            sortedArr.insert(arr.removeMax());

        System.out.println("Print sorted array: ");
        sortedArr.display();
    }
}
