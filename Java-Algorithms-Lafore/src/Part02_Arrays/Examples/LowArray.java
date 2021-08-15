package Part02_Arrays.Examples;

// Класс массива с низкоуровневым интерфейсом

class LowArray {
    private long[] a;

    public LowArray(int size) {
        a = new long[size];
    }

    public void setElem(int index, long value) {
        a[index] = value;
    }

    public long getElem(int index) {
         return  a[index];
    }
}

class LowArrayApp {
    public static void main(String[] args) {
        LowArray arr;
        arr = new LowArray(100);
        int nElem = 0;
        int j;

        // вставска элементов
        arr.setElem(0, 77);
        arr.setElem(1, 99);
        arr.setElem(2, 44);
        arr.setElem(3, 55);
        arr.setElem(4, 22);
        arr.setElem(5, 88);
        arr.setElem(6, 11);
        arr.setElem(7, 0);
        arr.setElem(8, 66);
        arr.setElem(9, 33);
        nElem = 10;

        for(j=0; j<nElem; j++)
            System.out.print(arr.getElem(j) + " ");
        System.out.println("");

        // поиск элемента
        int searchKey = 26;
        for(j=0; j<nElem; j++)
            if(arr.getElem(j) == searchKey)
                break;
        if(j == nElem)
            System.out.println("Can't find " + searchKey);
        else
            System.out.println("Found " + searchKey);

        // удаление элемента
        System.out.println("Delete element with key = 55");
        for(j=0; j<nElem; j++)
            if(arr.getElem(j) == 55)
                break;
        for(int k=j; k<nElem; k++)
            arr.setElem(k, arr.getElem(k+1));
        nElem--;

        for(j=0; j<nElem; j++)
            System.out.print(arr.getElem(j) + " ");
        System.out.println("");
    }
}
