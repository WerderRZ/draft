package Schildt.part_8_Inheritance.p2;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeigh mybox1 = new BoxWeigh(10, 20, 15, 34.3);
        BoxWeigh mybox2 = new BoxWeigh(2, 3, 4, 0.076);
        BoxWeigh mybox3 = new BoxWeigh();
        BoxWeigh mycube = new BoxWeigh(3, 2);
        BoxWeigh myclone = new BoxWeigh(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Объем mybox3 равен " + vol);
        System.out.println("Вес mybox3 равен " + mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Объем myclone равен " + vol);
        System.out.println("Вес myclone равен " + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);
        System.out.println("Вес mycube равен " + mycube.weight);
        System.out.println();


    }
}
