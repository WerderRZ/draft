package Tests.Structure.Queue;

public class MainQueue {
    public static void main(String[] args) {
        MySimpleQueue<Integer> mySimpleQueue = new MySimpleQueue<>();

        System.out.println("My Simple Queue is empty: " + mySimpleQueue.isEmpty());

        mySimpleQueue.add(11);
        mySimpleQueue.add(12);
        mySimpleQueue.add(13);

        System.out.println("My Simple Queue is empty: " + mySimpleQueue.isEmpty());

        System.out.println("first: " + mySimpleQueue.getFirst());
        System.out.println("last:" + mySimpleQueue.getLast());

        mySimpleQueue.remove();
        System.out.println("first: " + mySimpleQueue.getFirst());
        System.out.println("last:" + mySimpleQueue.getLast());

        mySimpleQueue.remove();
        System.out.println("first: " + mySimpleQueue.getFirst());
        System.out.println("last:" + mySimpleQueue.getLast());


        mySimpleQueue.remove();
//        //mySimpleQueue.remove(); //throw

    }
}
