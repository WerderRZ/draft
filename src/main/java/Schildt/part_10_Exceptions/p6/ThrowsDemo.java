package Schildt.part_10_Exceptions.p6;

class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("Внутри throwOne().");
        throw new IllegalAccessException("демонстрация");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Перехвачено " + e);
        }
    }
}
