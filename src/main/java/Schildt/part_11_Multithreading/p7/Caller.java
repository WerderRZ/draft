package Schildt.part_11_Multithreading.p7;

class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
    }

    @Override
    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}
