package leetcode.easy.p232_implement_queue_using_stacks;

import java.util.Stack;

public class MyQueue {

    private final Stack<Integer> in = new Stack<>();
    private final Stack<Integer> out = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        int result = peek();
        out.pop();
        return result;
    }

    public int peek() {
        if (out.empty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.peek();
    }

    public boolean empty() {
        return in.empty() && out.empty();
    }
}
