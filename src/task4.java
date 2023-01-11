import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.println("Введите значение: X= ");
        Scanner scr = new Scanner(System.in);
        int x = scr.nextInt();
        System.out.println("Введите значение: Y= ");
        int y = scr.nextInt();
        System.out.println("Введите значение: Z= ");
        int z = scr.nextInt();

        double sum = x + y + z;
        double srar = sum / 3;
        System.out.println("Среднеарифметическое значение =" + " " + srar);
        System.out.println("Округление в меньшую сторону =" + " " + Math.floor(srar / 2));
        double srardva = srar / 2;
        if (srardva > 3) {
            System.out.println("Программа выполнена корректно");
        } else {
            System.out.println("Полученное число меньше 3");
        }
    }
}
