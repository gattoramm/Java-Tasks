package ITVDN.Part3_Liskov_Substitution_Principle.part34_homework.source;

public class Square extends Rectangle{

    private int size;

    public Square(int size)
    {
        super(size, size);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    public int perimeter() {
        return 4 * size;
    }
}
