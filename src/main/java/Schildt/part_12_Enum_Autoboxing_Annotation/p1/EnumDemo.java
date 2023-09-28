package Schildt.part_12_Enum_Autoboxing_Annotation.p1;

class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;
        System.out.println("Value of ap: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;

        if (ap == Apple.GoldenDel) {
            System.out.println("ap contains GoldenDel.\n");
        }

        switch (ap) {
            case Johnatan -> {
                System.out.println("It's Johnatan");
            }
            case GoldenDel -> {
                System.out.println("It's GoldenDel");
            }
            case RedDel -> {
                System.out.println("It's RedDel");
            }
            case WineSap -> {
                System.out.println("It's WineSap");
            }
            case Cortland -> {
                System.out.println("It's Cortland");
            }
        }
    }
}
