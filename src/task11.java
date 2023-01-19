
import java.util.Scanner;
public class task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ввести первое число: ");
        Integer one = sc.nextInt();
        String one1 = Integer.toString(one);

        System.out.println("Ввести второе число: ");
        Integer two = sc.nextInt();

        Integer te = Integer.max(one, two);
        Integer fo = Integer.min(one, two);
        System.out.println("Максимальное значение: " + te);
        double tee = fo.doubleValue();
        System.out.println("Минимальное значение: " + tee);

    }
}
