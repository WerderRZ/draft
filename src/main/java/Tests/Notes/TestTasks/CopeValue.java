package Tests.Notes.TestTasks;

public class CopeValue {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Barsik");
        System.out.println(cat1.getName());

        Cat cat2 = cat1;
        System.out.println(cat2.getName());

        cat2.setName("Murzik");
        System.out.println(cat2.getName());

        System.out.println(cat1.getName());

    }

    public static class Cat {

        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
