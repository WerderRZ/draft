package Schildt.part_14_Generics.p07;

class GenMethodDemo {
    static <T extends Comparable<T>, V extends T> boolean isIn (T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        if (isIn(2, nums)) {
            System.out.println("2 is in nums");
        }
        if (!isIn(7, nums)) {
            System.out.println("7 isn't in nums");
        }
        System.out.println();

        String[] strs = {"one", "two", "three", "four", "five"};
        if (isIn("two", strs)) {
            System.out.println("two is in strs");
        }
        if (!isIn("seven", strs)) {
            System.out.println("seven isn't in strs");
        }

//        if (isIn("two", nums)) {
//            System.out.println("two is in nums");
//        }
    }
}
