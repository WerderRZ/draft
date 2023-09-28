package Schildt.part_7_Methods.p2;

class OverloadDemo {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    void test(double a) {
        System.out.println("Внутри test (double) a: " + a);
    }
}

class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;

        ob.test();
        ob.test(10, 20);

        ob.test(i);
        ob.test(123.25);
    }
}
