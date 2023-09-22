package leetcode.easy.p1700_number_of_students_unable_to_eat_lunch;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        int[] students = {1, 1, 1, 0, 0, 1};
        int[] sandwiches = {1, 0, 0, 0, 1, 1};

        Solution s = new Solution();
        System.out.println(s.countStudents(students, sandwiches));
    }

}
