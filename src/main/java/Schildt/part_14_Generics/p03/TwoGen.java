package Schildt.part_14_Generics.p03;

class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    T getOb1() {
        return ob1;
    }
    V getOb2() {
        return ob2;
    }

    void showTypes() {
        System.out.println("Type T is " + ob1.getClass().getName());
        System.out.println("Type V is " + ob2.getClass().getName());
    }
}
