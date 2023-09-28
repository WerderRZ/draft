package Schildt.part_8_Inheritance.p2;

class BoxWeigh extends Box {
    double weight;

    BoxWeigh(BoxWeigh ob) {
        super(ob);
        weight = ob.weight;
    }
    BoxWeigh(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }

    BoxWeigh() {
        super();
        weight = -1;
    }

    BoxWeigh(double len, double m) {
        super(len);
        weight = m;
    }
}
