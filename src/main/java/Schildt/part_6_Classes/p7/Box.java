package Schildt.part_6_Classes.p7;

class Box {
    double width;
    double height;
    double depth;

    public Box(double width, double height, double depth) {
        System.out.println("Конструирование Box");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }

}
