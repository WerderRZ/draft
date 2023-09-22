package leetcode.easy.p225_implements_stack_using_queues;

import java.util.ArrayDeque;

class MyStack {

    private ArrayDeque<Integer> data;

    public MyStack() {
        data = new ArrayDeque<>();
    }

    public void push(int x) {
        data.addLast(x);
    }

    public int pop() {
        return data.pollLast();
    }

    public int top() {
        return data.getLast();
    }

    public boolean empty() {
        return data.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
