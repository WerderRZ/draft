package Schildt.part_10_Exceptions.p2;

class MultipleCatches {
    public static void main(String[] args) {
        try {
            //int a = args.length;
            int a = 1;
            System.out.println("a = " + a);
            int b = 42 / a;
            int[] c = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за границы массива: " + e);
        }
        System.out.println("После блоков try/catch.");
    }
}
