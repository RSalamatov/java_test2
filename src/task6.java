import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        int metr = 1;
        int milli = 2;
        int yard = 3;
        int fut = 4;

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние: ");
        Scanner qwe = new Scanner(System.in);
        int num = qwe.nextInt();

        if (num == 2) {
            System.out.print("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут: ");
            int num2 = qwe.nextInt();
            if (num2 == metr) {
                System.out.println("Введите число: ");
                double num3 = qwe.nextInt();
                System.out.println("Метры:" + num3);
                System.out.println("МИЛИ:" + num3 * 0.0006);
                System.out.println("ярды:" + num3 * 1.094);
                System.out.println("футы:" + num3 * 3.281);
            } else {
                if (num2 == milli) {
                    System.out.println("Введите число: ");
                    double num3 = qwe.nextInt();
                    System.out.println("Метры:" + num3 * 1609.34);
                    System.out.println("МИЛИ:" + num3);
                    System.out.println("ярды:" + num3 * 1760);
                    System.out.println("футы:" + num3 * 5280);
                } else {
                    if (num2 == yard) {
                        System.out.println("Введите число: ");
                        double num3 = qwe.nextInt();
                        System.out.println("Метры:" + num3 * 0.9144);
                        System.out.println("МИЛИ:" + num3 * 0.0006);
                        System.out.println("ярды:" + num3);
                        System.out.println("футы:" + num3 * 3);
                    } else {
                        if (num2 == fut) {
                            System.out.println("Введите число: ");
                            double num3 = qwe.nextInt();
                            System.out.println("Метры:" + num3 * 0.3048);
                            System.out.println("МИЛИ:" + num3 * 0.000189);
                            System.out.println("ярды:" + num3 * 0.333);
                            System.out.println("футы:" + num3);
                        }

                    }
                }
            }
        } else if (num == 1) {
            System.out.println("Вы ввели массу (1), а надо расстояние (2)");
        }

    }
}


