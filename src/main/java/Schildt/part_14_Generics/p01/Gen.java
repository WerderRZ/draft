package Schildt.part_14_Generics.p01;

class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type T is " + ob.getClass().getName());
    }
}
