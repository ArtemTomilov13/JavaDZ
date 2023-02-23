package OOP_HomeWork3;

public interface Linked<E> {
    void addLast(E e);
    void addFirst(E e);
    int size();
    E getElementByIndex(int counter);
}
