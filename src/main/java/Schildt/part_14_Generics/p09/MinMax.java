package Schildt.part_14_Generics.p09;

interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}
