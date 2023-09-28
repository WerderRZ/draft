package Schildt.part_11_Multithreading.p3;

class ExtendDemo {

    public static void main(String[] args) {
        NewThread nt = new NewThread();
        nt.start();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Завершение главного потока");
    }

}
