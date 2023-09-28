package Schildt.part_9_Packages_and_Interfaces.p2.p1;

class Derived extends Protection {
    Derived() {
        System.out.println("Конструктор производного класса");
        System.out.println("n = " + n);
        //System.out.println("n_pri " + n_pri);
        System.out.println("n_prо " + n_pro);
        System.out.println("n_pub " + n_pub);
    }
}
