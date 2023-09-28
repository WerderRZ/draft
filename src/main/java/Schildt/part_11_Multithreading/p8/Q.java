package Schildt.part_11_Multithreading.p8;

class Q {
    int n;
    synchronized int get() {
        System.out.println("Получено: " + n);
        return n;
    }

    synchronized void put(int n) {
        this.n = n;
        System.out.println("Отправлено: " + n);
    }
}
