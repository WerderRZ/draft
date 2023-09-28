package Schildt.part_7_Methods.p4;

class Test {
    int a, b;

    public Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalTo(Test o) {
        return o.a == a && o.b == b;
    }
}
