package Schildt.part_14_Generics.p06;

public class Coords<T extends TwoD> {
    T[] coords;

    Coords(T[] o) {
        coords = o;
    }
}
