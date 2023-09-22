package leetcode.easy.p2073_time_needed_to_buy_tickets;

public class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int steps = 0;

        while (tickets[k] != 0) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] != 0) {
                    tickets[i]--;
                    steps++;
                }
                if ((k == i) && (tickets[i] == 0)) {
                    break;
                }
            }
        }


        return steps;
    }
}
