package Schildt.part_10_Exceptions.p4;

class MethNestTry {
    static void nesttry(int a) {
        try {
            if (a == 1){
                a = a / (a - a);
            }
            if (a == 2) {
                int[] c = {1};
                c[42] = 99;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за допустимые пределы индекса в массиве: " + e);
        }
    }

    public static void main(String[] args) {
        try {
            //int a = args.length;
            int a = 2;
            int b = 42 / a;
            System.out.println("a = " + a);
            nesttry(a);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль: " + e);
        }

    }
}
