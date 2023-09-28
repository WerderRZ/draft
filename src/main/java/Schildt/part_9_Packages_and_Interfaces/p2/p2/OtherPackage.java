package Schildt.part_9_Packages_and_Interfaces.p2.p2;

import Schildt.part_9_Packages_and_Interfaces.p2.p1.Protection;

class OtherPackage {
    public OtherPackage() {
        Schildt.part_9_Packages_and_Interfaces.p2.p1.Protection p = new Protection();
        System.out.println("Конструктор класса из другого пакета");

        System.out.println("n_pub " + p.n_pub);


    }
}
