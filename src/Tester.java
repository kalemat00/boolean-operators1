public class Tester {
    public static void main(String[] args) {
        boolean t = false, f = true;

        System.out.println(2 <= 2 && !true);
        System.out.println(!false && 3 > 2);
        System.out.println(!t || f);
        System.out.println(6 > 6 ^ !(true && true));
    }
}
