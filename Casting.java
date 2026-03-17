public class Casting {
    public static void main (String[] args) {
        int x = 7;
        int y = 2;

        double r1 = x/y;
        double r2 = (double) x / y;
        double r3 = x/2.0;

        int e1 = 2+ 3 *4;
        int e2 = (2+3) *4;

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(e1);
        System.out.println(e2);
    }
}
