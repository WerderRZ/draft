package Schildt.part_11_Multithreading.p11;

class TestTask {

    //AAAABBRTTAWWE -> A4B2RT2AW2E

    private static String compressString(String original) {

        char[] chars = original.toCharArray();
        StringBuilder sb = new StringBuilder();

        char currentSymbol = '\u0000';
        int num = 0;

        for (char symbol : chars) {
            if (symbol != currentSymbol) {
                if (num > 1) {
                    sb.append(num);
                }
                num = 0;
                sb.append(symbol);
            }

            currentSymbol = symbol;
            num++;
        }

        if (num > 1) {
            sb.append(num);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String original = "AAAABBRTTAWWEEE";
        String second = compressString(original);
        System.out.println(original + " -> " + second);
    }

}
