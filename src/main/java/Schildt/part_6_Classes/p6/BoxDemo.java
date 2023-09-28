package Schildt.part_6_Classes.p6;

public class BoxDemo {

    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        System.out.println("Объем равен " + myBox1.volume());
        System.out.println("Объем равен " + myBox2.volume());
    }

}
