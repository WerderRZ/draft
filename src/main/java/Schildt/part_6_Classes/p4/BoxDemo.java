package Schildt.part_6_Classes.p4;

public class BoxDemo {

    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        System.out.println("Объем равен " + myBox1.volume());
        System.out.println("Объем равен " + myBox2.volume());
    }

}
