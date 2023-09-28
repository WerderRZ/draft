package Schildt.part_6_Classes.p3;

class Box {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.print("Объем равен ");
        System.out.println(width * height * depth);
    }
}
