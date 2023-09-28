package Schildt.part_12_Enum_Autoboxing_Annotation.p5;

class AskMe {
    static void answer(Answers result) {
        switch (result) {
            case NO -> System.out.println("Нет");
            case YES -> System.out.println("Да");
            case MAYBE -> System.out.println("Возможно");
            case LATER -> System.out.println("Позже");
            case SOON -> System.out.println("Скоро");
            case NEVER -> System.out.println("Никогда");
        }
    }

    public static void main(String[] args) {
        Question q = new Question();

        answer(q.ask());
    }
}
