package Tests.Structure.Stack;

public interface MyStack<T> {
    void push(T value);
    T pop();
    boolean isEmpty();
    T getLast();
}
