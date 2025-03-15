import java.util.Scanner;

public class OperatoryPorownaniaAsk {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę (x):");
        int x = scanner.nextInt();

        System.out.println("Podaj drugą liczbę (y):");
        int y = scanner.nextInt();

        System.out.println("x = " + x + ", y = " + y);

        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));

        scanner.close();
    }
}
