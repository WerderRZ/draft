package Schildt.part_14_Generics.p02;

class NonGen {
    Object ob;

    NonGen(Object o) {
        ob = o;
    }

    Object getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type of ob: " + ob.getClass().getName());
    }
}
