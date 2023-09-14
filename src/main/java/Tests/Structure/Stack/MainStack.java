package Tests.Structure.Stack;

import Tests.Structure.Queue.MySimpleQueue;

public class MainStack {
    public static void main(String[] args) {
        MySimpleStack<Integer> mySimpleStack = new MySimpleStack<>();

        System.out.println("My Simple Stack is empty: " + mySimpleStack.isEmpty());

        mySimpleStack.push(11);
        mySimpleStack.push(12);
        mySimpleStack.push(13);

        System.out.println("My Simple Stack is empty: " + mySimpleStack.isEmpty());

        System.out.println(mySimpleStack.getLast());
        mySimpleStack.pop();
        System.out.println(mySimpleStack.getLast());

        mySimpleStack.pop();
        mySimpleStack.pop();
        //mySimpleStack.pop(); //throw
    }
}
