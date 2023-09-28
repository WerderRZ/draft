package Tests.Notes.TestTask3;

public interface Buildiable {

    double PI = 3.14;

    void build();

    private void test() {
        System.out.println("dsd");
    }

    default void makeC() {
        System.out.println("sds");
        test();
    }
}
