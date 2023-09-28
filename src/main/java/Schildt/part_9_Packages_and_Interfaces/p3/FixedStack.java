package Schildt.part_9_Packages_and_Interfaces.p3;

class FixedStack implements IntStack {
    private  int[] stck;
    private int tos;

    public FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Стек полон.");
        } else {
            stck[++tos] = item;
        }
    }

    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("Стек опустошен.");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
