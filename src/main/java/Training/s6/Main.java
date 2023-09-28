package Training.s6;

/*
Дан НЕУПОРФДОЧЕННЫЙ массив интервалов, где intervals[i] = [starti, endi],
    объедините все пересекающиеся интервалы и верните новый массив непересекающихся интервалов.
Пример:
Вход: intervals = [[2,6],[1,3],[8,10],[15,18]]
Выход: [[1,6],[8,10],[15,18]]
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Main {

    public static int[][] merge(int[][] intervals) {
        int starti = 0;
        int endi = 1;

        List<int[]> list = new ArrayList<>();

        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));

        for (int[] interval : intervals) {
            if (list.isEmpty() || (interval[starti] > list.get(list.size() - 1)[endi])) {
                list.add(interval);
            } else {
                list.get(list.size() - 1)[endi] = interval[endi];
            }
        }

        return list.toArray(new int[list.size()][2]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{2,6},{1,3},{8,10},{15,18}};
        int[][] array = merge(intervals);
        System.out.println(Arrays.deepToString(array));
    }
}