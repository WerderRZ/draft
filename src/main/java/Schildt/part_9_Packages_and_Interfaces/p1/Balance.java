package Schildt.part_9_Packages_and_Interfaces.p1;

class Balance {
    String name;
    double bal;

    public Balance(String n, double b) {
        name = n;
        bal = b;
    }

    void show() {
        if (bal<0) {
            System.out.println("--> ");
            System.out.println(name + ": $" + bal);
        }
    }
}
