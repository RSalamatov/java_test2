public class task3 {
    public static void main(String[] args) {
        int [] num = {460, 4, 22, 12, 3};

        int last = num[num.length - 1];
        int first = num[0];
        num[0]=last;
        num[num.length - 1]=first;
        System.out.println(num[0]+num[num.length/2]);

    }
}
