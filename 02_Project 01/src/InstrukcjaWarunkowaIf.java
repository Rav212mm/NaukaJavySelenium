import java.util.Scanner;

public class InstrukcjaWarunkowaIf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę (a):");
        float a = scanner.nextFloat();

        System.out.println("Podaj drugą liczbę (b):");
        float b = scanner.nextFloat();

        if (b != 0) {
            System.out.println("Wynik dzielenia to: " + (a / b));
        } else {
            System.out.println("Nie można dzielić przez zero!");
        }

        scanner.close();
    }
}