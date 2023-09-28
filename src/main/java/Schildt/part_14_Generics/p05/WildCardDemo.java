package Schildt.part_14_Generics.p05;

class WildCardDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("Average value of iob is " + v);

        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<Double>(dnums);
        double w = dob.average();
        System.out.println("Average value of dob is " + w);

        Float[] fnums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fob = new Stats<Float>(fnums);
        double x = fob.average();
        System.out.println("Average value of fob is " + x);

        System.out.print("Average values of iob and dob are ");
        if (iob.isSameAvg(dob)) {
            System.out.println("same.");
        } else {
            System.out.println("different.");
        }

        System.out.print("Average values of iob and fob are ");
        if (iob.isSameAvg(fob)) {
            System.out.println("same.");
        } else {
            System.out.println("different.");
        }
    }
}
