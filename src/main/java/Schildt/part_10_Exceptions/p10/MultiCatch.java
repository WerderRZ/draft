package Schildt.part_10_Exceptions.p10;

class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int[] vals = {1, 2, 3};
        try {
            int result = a / b;
            vals[10] = 19;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
        System.out.println("После множественного перехвата");
    }
}
