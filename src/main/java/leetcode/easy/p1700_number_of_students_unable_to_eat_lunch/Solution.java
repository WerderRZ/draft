package leetcode.easy.p1700_number_of_students_unable_to_eat_lunch;

import java.util.ArrayDeque;

public class Solution {
       
    public int countStudents(int[] students, int[] sandwiches) {
        ArrayDeque<Integer> studentQueue = new ArrayDeque<>();
        int count = students.length;
        boolean finded = true;
        
        for (int student : students) {
            studentQueue.add(student);    
        }

        for (int current : sandwiches) {
            finded = false;
            for (int j = 0; j < count; j++) {
                int firstStudent = studentQueue.pollFirst();
                if (firstStudent == current) {
                    finded = true;
                    break;
                } else {
                    studentQueue.add(firstStudent);
                }
            }
            if (!finded) {
                return count;
            }
            count--;
        }

        return 0;
    }
}
