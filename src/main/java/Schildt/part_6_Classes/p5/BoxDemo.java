package Schildt.part_6_Classes.p5;

public class BoxDemo {

    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        myBox1.setDim(10, 20,15);
        myBox2.setDim(3, 6, 9);

        System.out.println("Объем равен " + myBox1.volume());
        System.out.println("Объем равен " + myBox2.volume());
    }

}
