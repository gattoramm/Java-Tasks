package Patterns.Adapter.task1;

public interface BetaList {
    int getValue(int index);
    void setValue(int index, int value);
    int getSize();
    void setSize(int newSize);
}
