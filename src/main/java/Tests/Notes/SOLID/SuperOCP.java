package Tests.Notes.SOLID;

public class SuperOCP {

    public void sentText(String text, String sentType) {
        System.out.println("Hello from super OCP");
    }

}

class ChildOCP extends SuperOCP {
    @Override
    public void sentText(String text, String sentType) {
        System.out.println("Child OCP - before");
        super.sentText(text, sentType);
        System.out.println("Child OCP - after");
    }
}
