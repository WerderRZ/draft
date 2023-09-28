package Schildt.part_11_Multithreading.p10;

import java.util.Objects;

public class Cat implements Cloneable{
    public String name;
    public int age;

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //    @Override
//    public boolean equals(Object o) {
//
//        if (o == null) {
//            return false;
//        }
//        if (this == o) {
//            return true;
//        }
//
//        if (!(o instanceof Cat)) {
//            return false;
//        }
//
//        Cat c = (Cat) o;
//        if (!(this.name.equals(c.name))) {
//            return false;
//        }
//        if (!(this.age == c.age)) {
//            return false;
//        }
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
//
//    @Override
//    public String toString() {
//        return "Cat[name=" + name + ",age=" + age + "]";
//    }

//    @Override
//    public Cat clone() throws CloneNotSupportedException {
//        return (Cat) super.clone();
//    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Cat cat1 = new Cat("Кот1", 12);
        Object cat2 = cat1.clone();
        System.out.println(cat1 == cat2);
        System.out.println(cat2);

        Cat cat3 = new Cat("dsd", 13);
        Cat cat4 = null;
        System.out.println(cat4.equals(cat3));
    }


}
