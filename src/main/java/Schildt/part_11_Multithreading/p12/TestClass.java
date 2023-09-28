package Schildt.part_11_Multithreading.p12;


class TestClass implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("from close method");
    }

    public static void main(String[] args) {
        try (TestClass tc = new TestClass()) {
            System.out.println(1/0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("from finally block");
        }
    }
}
