import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите уравнение с x и числами от 0 до 9:");
        String strUravnenie = sc.nextLine();
        char[] charsarrey = strUravnenie.toCharArray();

        if (charsarrey[1] == '+') {
            if (charsarrey[0] == 'x') {
                int result = (Character.getNumericValue(charsarrey[4])) - (Character.getNumericValue(charsarrey[2]));
                System.out.println("Ответ: x = " + result);
            } else if (charsarrey[2] == 'x') {
                int result = (Character.getNumericValue(charsarrey[4])) - (Character.getNumericValue(charsarrey[0]));
                System.out.println("Ответ: x = " + result);
            } else {
                int result = (Character.getNumericValue(charsarrey[0])) + (Character.getNumericValue(charsarrey[2]));
                System.out.println("Ответ: x = " + result);
            }
        } else if (charsarrey[1] == '-') {
            if (charsarrey[0] == 'x') {
                int result = (Character.getNumericValue(charsarrey[4])) + (Character.getNumericValue(charsarrey[2]));
                System.out.println("Ответ: x = " + result);
            } else if (charsarrey[2] == 'x') {
                int result = (Character.getNumericValue(charsarrey[0])) - (Character.getNumericValue(charsarrey[4]));
                System.out.println("Ответ: x = " + result);
            } else if (charsarrey[4] == 'x') {
                int result = (Character.getNumericValue(charsarrey[0])) - (Character.getNumericValue(charsarrey[2]));
                System.out.println("Ответ: x = " + result);
            } else {
                System.out.println("Неверный ввод");
            }
        }
    }
}


