import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swój wiek:");
        int wiek = scanner.nextInt();

        if (wiek < 18) {
            System.out.println("Przykro mi, nie możesz kupić alkoholu.");
        } else {
            System.out.println("Dziękujemy za zakupy!");
        }

        scanner.close();
    }
}
