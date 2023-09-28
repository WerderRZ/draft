package Schildt.part_9_Packages_and_Interfaces.p5;

interface IntStack {
    void push(int item);
    int pop();

    default void clear() {
        System.out.println("Метод clear() не реализован.");
    }
}
