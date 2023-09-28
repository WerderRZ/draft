package Schildt.part_10_Exceptions.p8;

class MyException extends Exception {
    private int detail;
    MyException(int a) {
        detail = a;
    }

    @Override
    public String toString() {
        return "MyException[" + detail + "]";
    }
}
