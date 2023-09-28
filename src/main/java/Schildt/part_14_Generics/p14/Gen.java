package Schildt.part_14_Generics.p14;

class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        System.out.print("getOb() in Gen: ");
        return ob;
    }
}
