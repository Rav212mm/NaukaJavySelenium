import java.util.Scanner;

public class WhilePetla {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int liczba;

        System.out.println("Podaj liczbę (0 kończy pętlę):");
        liczba = scanner.nextInt();

        while (liczba != 0) {
            System.out.println("Podałeś liczbę: " + liczba);

            System.out.println("Podaj następną liczbę (0 kończy pętlę):");
            liczba = scanner.nextInt();
        }

        System.out.println("Pętla zakończona.");

        scanner.close();
    }
}
