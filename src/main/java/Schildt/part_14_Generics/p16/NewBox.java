package Schildt.part_14_Generics.p16;

import java.util.ArrayList;
import java.util.List;

public class NewBox {

    public static <T> void printValue(T value) {
        System.out.println(value);
    }

    public static void printAnimalList(List<? super Animal> animals) {
        //animals.forEach(a -> System.out.println(a));
        System.out.println(animals.get(0));
        System.out.println(animals.get(1));
        System.out.println(animals.get(2));
    }

    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("CatOne"));




        //printValue("Text");
        //List<Animal> animals = cats;

//        animals.add(new Animal("Animal1"));
//        animals.add(new Cat("Cat1"));
//        animals.add(new Dog("Sharick"));
//
//        printAnimalList(animals);

    }
}

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void sayMeow() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void sayWoof() {
        System.out.println("Woof");
    }
}
