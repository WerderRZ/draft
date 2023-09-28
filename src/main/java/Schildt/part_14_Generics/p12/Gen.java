package Schildt.part_14_Generics.p12;

class Gen<T> extends NonGen {
    T ob;

    Gen(T ob, int num) {
        super(num);
        this.ob = ob;
    }

    T getOb() {
        return ob;
    }
}
