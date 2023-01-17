import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        System.out.println("Введите количество столбцов:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Введите количество строк");
        int y = sc.nextInt();
        int[][] twoArray = new int[x][y];
        int n = 3;
        for (int j = 0; j < y; j++) {
            for (int i = 0; i < x; i++) {
                System.out.println("Введите элемент матрицы " + (i + 1) + "," + (j + 1) + ":");
                int element = sc.nextInt();
                twoArray[i][j] = element;
            }

        }
        for (int j = 0; j < y; j++) {
            for (int i = 0; i < x; i++) {
                System.out.print(" " + twoArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < x; i++) {
            twoArray[i][0] = twoArray[i][0] * n;
            System.out.print(" " + twoArray[i][0] + " ");
        }

    }


}
