import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        System.out.println("Введите длину массива: ");
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        double[] arrey = new double[size];
        double sum = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Введите элемент массива: ");
            double elements = scr.nextInt();
            arrey[i] = elements;
            sum = sum + elements;
        }
        for (int i = 0; i < arrey.length; i++) {
            System.out.print(arrey[i] + " ");
        }
        double srarif = sum / size;
        System.out.println("\n" + srarif);
        for (int i = 0; i < arrey.length; i++) {
            System.out.print(arrey[i] * srarif + " ");
        }
    }
}