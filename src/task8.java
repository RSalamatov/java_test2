import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        System.out.println("Ввести любое положительное число n: ");
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i = i + 2) {
            sum = sum + i;
        }
        if (n < 0) {
            System.out.println("Вы ввели отрицательное число");
        } else {
            System.out.println("Сумма нечетных чисел = " + sum);
        }
    }
}

