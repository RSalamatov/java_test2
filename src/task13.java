import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String stroka = sc.nextLine();

        List<String> spisokSlov = new ArrayList<>();
        spisokSlov = Arrays.asList(stroka.split(" "));
        List<String> spisokAngliiskihSlov = new ArrayList<>();
        for (String strokaIzSpiska : spisokSlov) {
            if (strokaIzSpiska.matches("^[a-zA-Z]+$")) {
                spisokAngliiskihSlov.add(strokaIzSpiska);
            }
        }

        for (String slovo : spisokAngliiskihSlov) {
            System.out.println(slovo);
        }

        System.out.println(spisokAngliiskihSlov.size());
    }
}