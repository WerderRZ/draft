package Schildt.part_9_Packages_and_Interfaces.p2.p1;

public class Protection {
    int n = 1;
    private int n_pri = 2;
    protected int n_pro = 3;
    public int n_pub = 4;

    public Protection() {
        System.out.println("Конструктор базового класса");
        System.out.println("n = " + n);
        System.out.println("n_pri " + n_pri);
        System.out.println("n_prо " + n_pro);
        System.out.println("n_pub " + n_pub);
    }
}
