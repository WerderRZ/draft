package Schildt.part_11_Multithreading.p8;

class PC {
    public static void main(String[] args) {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        p.t.start();
        c.t.start();

        System.out.println("Нажмите <Ctrl-C>, чтобы остановить программу.");
    }
}
