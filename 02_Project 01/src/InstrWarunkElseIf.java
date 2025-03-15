import java.util.Scanner;

public class InstrWarunkElseIf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę (a):");
        float a = scanner.nextFloat();

        System.out.println("Podaj drugą liczbę (b):");
        float b = scanner.nextFloat();

        // sprawdzenie przypadków dla podanych liczb
        if (b > 0) {
            System.out.println("Wynik dzielenia (a/b) to: " + (a / b));
        } else if (b < 0) {
            System.out.println("Druga liczba (b) jest ujemna. Wynik dzielenia (a/b) to: " + (a / b));
        } else if (a == 0) {
            System.out.println("Obie liczby są zerem, wynik nieokreślony!");
        } else {
            System.out.println("Druga liczba jest zerem - nie można dzielić przez zero!");
        }

        scanner.close();
    }
}
