import java.util.Scanner;

public class FinalTask4 {
    public static void main(String[] args) {
        System.out.println("Отгадайте загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        Scanner scrAnswer = new Scanner(System.in);
        String answer1;
        String answer2;

        for (int i = 1; i <= 3; i++) {
            String answerScan = scrAnswer.nextLine();

            answer1 = "Заархивированный вирус";
            answer2 = "Подсказка";

            if (answerScan.equals(answer1)) {
                System.out.println("Правильно!");
                break;
            }
            if (answerScan.equals(answer2)) {
                if (i == 1) {
                    System.out.println("Что-то закрытое и мерзкое");
                    System.out.println("Подумайте еще");

                    String answerScaner = scrAnswer.nextLine();
                    if (answerScaner.equals(answer1)) {
                        System.out.println("Правильно!");
                        break;
                    } else {
                        System.out.println("Обидно, приходи в другой раз");
                        break;
                    }
                } else if ((i == 2) || (i == 3)) {
                    System.out.println("Подсказка уже недоступна");
                }
            }
            if (!answerScan.equals(answer1)) {
                if ((i == 1) || (i == 2)) {
                    System.out.println("Подумайте еще");
                } else if (i == 3) {
                    System.out.println("Обидно, приходи в другой раз");
                }
            }
        }
    }
}
