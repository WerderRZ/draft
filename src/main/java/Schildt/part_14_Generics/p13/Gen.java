package Schildt.part_14_Generics.p13;

class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }
}
