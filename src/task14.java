import java.util.Random;

public class task14 {
    public static void main(String[] args) {

        Random ran = new Random();
        int[] mass = new int[15];
        int min = -20;
        int max = 20;

        for (int i = 0; i < mass.length; ++i) {
            mass[i] = min + (ran.nextInt(max - min));
            System.out.println(mass[i]);
        }
        int num1 = mass[0];
        int num2 = mass[0];
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] > num1) num1 = mass[i];
            else if (mass[i] < num2) num2 = mass[i];
        }
        System.out.println("Максимум: " + num1);
        System.out.println("Минимум: " + num2);
        int modul1 = Math.abs(num1);
        int modul2 = Math.abs(num2);
        int ResultModul = Math.max(modul1, modul2);
        System.out.println("Большeе значение из максимального и минимального значения по модуюлю: " + ResultModul);
    }


}