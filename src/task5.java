import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();

        System.out.println("Введите число: ");
        int num2 = scan.nextInt();

        System.out.println("Введите символ: ");
        char sim = scan.next().charAt(0);

        if (sim == '+') {
            System.out.println("Результат операции: " + (num1 + num2));
        } else if (sim == '-') {
            System.out.println("Результат операции: " + (num1 - num2));
        } else if (sim == '*') {
            System.out.println("Результат операции: " + (num1 * num2));
        } else if (sim == '/') {
            if (num2 == 0) {
                System.out.println("Математическая логика сломалась");
            } else {
            }
        }
        System.out.println("Результат операции: " + (num1 / num2));
    }
}

