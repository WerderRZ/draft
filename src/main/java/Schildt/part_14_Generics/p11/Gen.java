package Schildt.part_14_Generics.p11;

class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }
}
