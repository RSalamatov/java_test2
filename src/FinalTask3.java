import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите колличество строк: ");
        int z = sc.nextInt();

        String[] strings = new String[z];
        for (int i = 0; i < z; i++) {
            System.out.println("Строка " + (i + 1) + ": ");
            strings[i] = sc.next();
        }
        int max = 0;
        String maxStroka = null;


        for (String stroka : strings) {
            char[] simv = stroka.toCharArray();

            int a = 0;
            for (int i = 0; i < simv.length; i++) {
                for (int j = 0; j < simv.length; j++) {
                    if (i != j) {
                        if (simv[i] == simv[j]) {
                            simv[j] = ' ';
                        }
                    }
                }
            }
            for (int i = 0; i < simv.length; i++) {
                if (simv[i] == ' ') {
                    a++;
                }
            }
            int r = simv.length - a;
            System.out.println(r);

            if (max < r) {
                max = r;
                maxStroka = stroka;
            }
        }
        System.out.println(maxStroka);
    }
}


