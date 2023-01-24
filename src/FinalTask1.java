import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите текущий курс доллара к рублю: ");
        double TekushiyKurs = sc.nextDouble();

        System.out.println("Колличество переводимых рублей: ");
        double KollRub = sc.nextDouble();

        double result = KollRub / TekushiyKurs;
        System.out.printf("Итого в $: %.2f", result);

    }
}


