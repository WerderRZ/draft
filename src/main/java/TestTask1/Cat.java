package TestTask1;

import java.util.ArrayList;
import java.util.Arrays;

public class Cat {

    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        ArrayList<Cat> cats = new ArrayList<>();

        Cat thomas = new Cat("Томас");
        Cat behemoth = new Cat("Бегемот");
        Cat philipp = new Cat("Филипп Маркович");
        Cat pushok = new Cat("Пушок");

        cats.add(thomas);
        cats.add(behemoth);
        cats.add(philipp);
        cats.add(pushok);

        Cat[] catsArray = cats.toArray(new Cat[0]);

        System.out.println(Arrays.toString(catsArray));
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

}
