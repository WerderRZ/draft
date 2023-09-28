package Schildt.part_9_Packages_and_Interfaces.p2.p1;

class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("Конструктор класса из того же пакета");
        System.out.println("n = " + p.n);
        //System.out.println("n_pri " + n_pri);
        System.out.println("n_prо " + p.n_pro);
        System.out.println("n_pub " + p.n_pub);
    }
}
