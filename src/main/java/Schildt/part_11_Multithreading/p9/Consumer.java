package Schildt.part_11_Multithreading.p9;

class Consumer implements Runnable {
    Q q;
    Thread t;

    Consumer(Q q) {
        this.q = q;
        t = new Thread(this, "Потребитель");
    }

    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }

}
