package Schildt.part_11_Multithreading.p6;

class Callme {
    synchronized void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прерван");
        }
        System.out.println("]");
    }
}
