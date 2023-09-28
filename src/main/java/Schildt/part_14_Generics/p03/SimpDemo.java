package Schildt.part_14_Generics.p03;

class SimpDemo {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");
        tgObj.showTypes();

        int v = tgObj.getOb1();
        System.out.println("value: " + v);

        String str = tgObj.getOb2();
        System.out.println("value: " + str);



    }
}
