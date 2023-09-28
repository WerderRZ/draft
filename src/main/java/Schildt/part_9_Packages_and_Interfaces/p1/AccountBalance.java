package Schildt.part_9_Packages_and_Interfaces.p1;

class AccountBalance {
    public static void main(String[] args) {
        Balance[] current = new Balance[3];
        current[0] = new Balance("One", 123.23);
        current[1] = new Balance("Two", 157.02);
        current[2] = new Balance("Three", -12.33);

        for (int i = 0; i < 3; i++) {
            current[i].show();
        }

    }
}
