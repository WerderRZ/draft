package Schildt.part_7_Methods.p8;

public class Test2 extends Test1 {
    //@Override
    public static void say() {
        System.out.println("Hi from Test2");
    }

    public static void main(String[] args) {

        Test2 test2 = new Test2();
        test2.say();
        say();

        Test1 test = new Test2();
        test.say();

        //Test1 testClone = test.clone();


    }
}
