package Schildt.part_6_Classes.p6;

class Box {
    double width;
    double height;
    double depth;

    public Box() {
        System.out.println("Конструирование Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }

}
