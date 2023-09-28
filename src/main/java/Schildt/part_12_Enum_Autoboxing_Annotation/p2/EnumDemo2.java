package Schildt.part_12_Enum_Autoboxing_Annotation.p2;


class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("All constants is enumerators of Apple:");

        Apple[] apples = Apple.values();
        for (Apple  a : apples) {
            System.out.println(a);
        }
        System.out.println();

        ap = Apple.valueOf("WineSap");
        System.out.println("ap contains " + ap);


    }
}
