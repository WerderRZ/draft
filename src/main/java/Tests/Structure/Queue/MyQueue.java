package Tests.Structure.Queue;

public interface MyQueue<T> {
    void add(T value);
    T remove();
    boolean isEmpty();
    T getFirst();
    T getLast();

}