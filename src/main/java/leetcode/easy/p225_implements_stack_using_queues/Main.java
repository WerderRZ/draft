package leetcode.easy.p225_implements_stack_using_queues;

public class Main {
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(15);
        obj.push(16);
        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();
    }
}
