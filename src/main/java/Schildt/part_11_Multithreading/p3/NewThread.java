package Schildt.part_11_Multithreading.p3;

class NewThread extends Thread {
    Thread t;
    NewThread() {
        super("Demo Thread");
        System.out.println("Дочерний поток: " + this);
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван");
        }
        System.out.println("Завершение дочернего потока");
    }
}
