package leetcode.easy.p2073_time_needed_to_buy_tickets;

public class Main {
    public static void main(String[] args) {
        int[] tickets = {5,1,1,1};
        int k = 0;

        Solution solution = new Solution();
        System.out.println(solution.timeRequiredToBuy(tickets, k));
    }
}
