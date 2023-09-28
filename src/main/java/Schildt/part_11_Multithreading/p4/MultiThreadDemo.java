package Schildt.part_11_Multithreading.p4;

class MultiThreadDemo {

    public static void main(String[] args) {
        NewThread nt1 = new NewThread("One");
        NewThread nt2 = new NewThread("Two");
        NewThread nt3 = new NewThread("Three");

        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Завершение главного потока");
    }

}
