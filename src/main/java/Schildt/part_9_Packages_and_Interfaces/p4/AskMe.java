package Schildt.part_9_Packages_and_Interfaces.p4;

class AskMe implements SharedConstants {
    static void answer(int result) {
        switch (result) {
            case NO: {
                System.out.println("Нет");
                break;
            }
            case YES: {
                System.out.println("Да");
                break;
            }
            case MAYBE: {
                System.out.println("Возможно");
                break;
            }
            case LATER: {
                System.out.println("Позже");
                break;
            }
            case SOON: {
                System.out.println("Скоро");
                break;
            }
            case NEVER: {
                System.out.println("Никогда");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());

    }

}
