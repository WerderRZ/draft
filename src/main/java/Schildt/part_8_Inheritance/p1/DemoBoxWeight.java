package Schildt.part_8_Inheritance.p1;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeigh mybox1 = new BoxWeigh(10, 20, 15, 34.3);
        BoxWeigh mybox2 = new BoxWeigh(2, 3, 4, 0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
    }
}
