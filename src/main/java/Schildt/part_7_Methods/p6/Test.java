package Schildt.part_7_Methods.p6;

class Test {
    int a;
    Test(int i) {
        a = i;
    }

    public Test incrByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }
}
