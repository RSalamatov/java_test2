public class task12 {
    public static void main(String[] args) {

        String st = "I like Java!!!";

        boolean st1 = st.contains("like");
        System.out.println("Строка содержит подстроку 'Java': = " + st1);
        boolean st2 = st.startsWith("I like");
        System.out.println("Строка начинается с 'I like': = " + st2);
        boolean st3 = st.endsWith("!!!");
        System.out.println("Строка заканчивается на '!!!': = " + st3);

        if (st1 == true || st2 == true || st3 == true) {
            System.out.println(st.toUpperCase());
        } else {
            System.out.println("Не работает");
        }

        String st4 = st.replace("a", "o");
        System.out.println(st4.substring(7, 11));
    }
}
