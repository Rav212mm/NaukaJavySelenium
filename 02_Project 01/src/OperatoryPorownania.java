public class OperatoryPorownania {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println("x = " + x + ", y = " + y);

        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));

        // dodatkowo porównanie dla wartości typu boolean
        boolean a = true;
        boolean b = false;

        System.out.println("a = " + a + ", b = " + b);

        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Porównanie typów znakowych (char)
        char c1 = 'A';
        char c2 = 'B';

        System.out.println("c1 = " + c1 + ", c2 = " + c2);

        System.out.println("c1 == c2: " + (c1 == c2));
        System.out.println("c1 != c2: " + (c1 != c2));
        System.out.println("c1 > c2: " + (c1 > c2));
        System.out.println("c1 < c2: " + (c1 < c2));
    }
}
