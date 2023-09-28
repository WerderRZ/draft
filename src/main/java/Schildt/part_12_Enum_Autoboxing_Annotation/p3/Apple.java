package Schildt.part_12_Enum_Autoboxing_Annotation.p3;

enum Apple {
    Johnatan(10), GoldenDel(9), RedDel(12), WineSap(15), Cortland(8);
    private int price;

    Apple(int price) {
        this.price = price;
    }

    int getPrice() {
        return price;
    }
}
