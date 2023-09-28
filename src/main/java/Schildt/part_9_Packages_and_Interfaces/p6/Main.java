package Schildt.part_9_Packages_and_Interfaces.p6;

import java.util.Arrays;

class Main {

    /* Метод принимает два отсортированых по неубыванию массива
    и объединяет их в один отсорированный по неубыванию массив,
    который нужно вернуть.
    Например,
    int[] a1 = new int[]{0, 2, 2}
    int[] a2 = new int[]{1, 3}
    метод должен вернуть {0, 1, 2, 2, 3}

    НУЖНО НАПИСАТЬ РЕШЕНИЕ ЗА ЛИНЕЙНОЕ ВРЕМЯ
    И БЕЗ ИСПОЛЬЗОВАНИЯ МЕТОДОВ СОРТИРОВКИ МАССИВОВ!

    */
    public static int[] mergeArrays(int[] a1, int[] a2) {

        int[] res = new int[a1.length + a2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (k < res.length) {

            if (i == a1.length || j == a2.length) {
                if (i == a1.length) {
                    res[k] = a2[j];
                    j++;
                } else {
                    res[k] = a1[i];
                    i++;
                }
            } else {

                if (a1[i] <= a2[j]) {
                    res[k] = a1[i];
                    i++;
                } else {
                    res[k] = a2[j];
                    j++;
                }
            }

            k++;

        }

        //i 0 1 2
        //j 0 1
        // 0 1 2 2


        return res;


    }

    public static void main(String[] args) {
        int[] a1 = {100};
        int[] a2 = {0};

        int[] a3 = mergeArrays(a1, a2);
        System.out.println(Arrays.toString(a3));

    }

}
