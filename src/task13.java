import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task13 {
    public static void main(String[] args) {


        String stroka = "I love java 8 Я люблю java 14 core1";
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