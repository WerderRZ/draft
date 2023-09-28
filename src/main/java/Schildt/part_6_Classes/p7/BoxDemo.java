package Schildt.part_6_Classes.p7;

public class BoxDemo {

    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20 ,15);
        Box myBox2 = new Box(3, 6, 9);

        System.out.println("Объем равен " + myBox1.volume());
        System.out.println("Объем равен " + myBox2.volume());
    }

}
