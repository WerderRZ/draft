package Tests.Structure.ArrayList;

public class MainArrayList {

    public static void main(String[] args) {

        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(8);
        myArrayList.add(13);
        myArrayList.add(8);
        myArrayList.add(13);
        myArrayList.add(8);
        myArrayList.add(13);
        myArrayList.add(8);
        myArrayList.add(13);
        myArrayList.add(8);
        myArrayList.add(13);
        System.out.println(myArrayList.size());

        myArrayList.add(15);
        System.out.println(myArrayList.size());

        int element11 = myArrayList.get(10);
        System.out.println(element11);

        myArrayList.set(10, 17);
        System.out.println(myArrayList.get(10));

        myArrayList.remove(9);
        System.out.println(myArrayList.size());

        myArrayList.add(25);

    }

}
