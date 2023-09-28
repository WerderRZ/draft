package Tests.Notes.TestTask3;

public class Ferrari extends Car {
    private String name;
    private boolean isElecrtical;

    public Ferrari(String name) {
        this.name = name;
    }

    public void setProperties(String name) {
        this.name = name;
    }

    public void setProperties(String name, boolean isElecrtical) {
        this.name = name;
        this.isElecrtical = isElecrtical;
    }




}
