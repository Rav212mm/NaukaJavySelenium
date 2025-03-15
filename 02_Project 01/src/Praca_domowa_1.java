import java.util.Scanner;

public class Praca_domowa_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę:");
        int a = scanner.nextInt();

        System.out.println("Podaj drugą liczbę:");
        int b = scanner.nextInt();

        System.out.println("Dodawanie: " + (a + b));
        System.out.println("Odejmowanie: " + (a - b));
        System.out.println("Mnożenie: " + (a * b));

        if(b != 0) { // uniknięcie dzielenia przez zero
            System.out.println("Dzielenie: " + (a / b));
            System.out.println("Reszta z dzielenia: " + (a % b));
        } else {
            System.out.println("Nie można dzielić przez zero!");
        }

        int a1 = a + 1;
        System.out.println("Inkrementacja (a + 1): " + a1);

        int b1 = b - 1;
        System.out.println("Dekrementacja (b - 1): " + b1);

        ++a;
        System.out.println("Pre-inkrementacja (++a): " + a);

        --b;
        System.out.println("Pre-dekrementacja (--b): " + b);

        int var10001 = a++;
        System.out.println("Post-inkrementacja (a++): " + var10001);

        var10001 = b--;
        System.out.println("Post-dekrementacja (b--): " + var10001);

        System.out.println("Po post-inkrementacji (a): " + a);
        System.out.println("Po post-dekrementacji (b): " + b);

        a += b;
        System.out.println("Przypisanie (a += b): " + a);

        b *= 2;
        System.out.println("Przypisanie (b *= 2): " + b);

        System.out.println("Czy a jest większe niż b? " + (a > b));
        System.out.println("Czy a jest mniejsze niż b? " + (a < b));
        System.out.println("Czy a jest równe b? " + (a == b));
        System.out.println("Czy a jest różne od b? " + (a != b));

        boolean x = true;
        boolean y = false;

        System.out.println("x AND y: " + (x && y));
        System.out.println("x OR y: " + (x || y));
        System.out.println("NOT x: " + !x);

        scanner.close();
    }
}
