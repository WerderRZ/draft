package Schildt.part_12_Enum_Autoboxing_Annotation.p3;


class EnumDemo3 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("WineSap apples cost " + Apple.WineSap.getPrice() + " cents.\n");

        System.out.println("Prices for all varieties jf apples:");
        for (Apple a : Apple.values()) {
            System.out.println(a + " apples cost " + a.getPrice() + " cents.");
        }




    }
}
