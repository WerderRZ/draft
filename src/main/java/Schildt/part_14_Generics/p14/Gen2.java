package Schildt.part_14_Generics.p14;

class Gen2<T> extends Gen<T> {
    Gen2(T o) {
        super(o);
    }

    @Override
    T getOb() {
        System.out.print("getOb() in Gen2: ");
        return ob;
    }
}
