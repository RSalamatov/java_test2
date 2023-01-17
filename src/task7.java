import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {


        int x = 10;
        int y = 20;
        int z = 30;

        System.out.println("Введите длину массива: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arrey = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите элемент массива: ");
            int elements = sc.nextInt();
            arrey[i] = elements;
            if (elements == x) {
                System.out.println("Данное значение имеется в константах x");
            } else if (elements == y) {
                System.out.println("Данное значение имеется в константах y");
            } else if (elements == z) {
                System.out.println("Данное значение имеется в константах z");
            }
        }
        for (int i = 0; i < arrey.length; i++) {
            System.out.print(arrey[i] + " ");
        }
    }

}




