package Schildt.part_14_Generics.p12;

class DemoGen {
    public static void main(String[] args) {
        Gen<String> w = new Gen<>("Welcome", 47);
        System.out.print(w.getOb() + " ");
        System.out.println(w.getnum());
    }
}
