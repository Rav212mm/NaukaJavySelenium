import java.util.ArrayList;
import java.util.Scanner;

public class TablicaOdwrocona {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Wprowadzaj liczby (naciśnij Enter bez liczby, aby zakończyć):");

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break; // zakończ, jeśli użytkownik nacisnął enter bez liczby
            }
            try {
                int liczba = Integer.parseInt(input);
                lista.add(liczba);
            } catch (NumberFormatException e) {
                System.out.println("To nie jest liczba, spróbuj jeszcze raz:");
            }
        }

        // Tworzymy tablicę z ArrayList
        int[] tablica = new int[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            tablica[i] = lista.get(i);
        }

        // Wyświetlenie tablicy wprowadzonej
        System.out.println("Tablica wprowadzona:");
        for (int liczba : tablica) {
            System.out.print(liczba + " ");
        }

        // Wyświetlenie tablicy odwróconej
        System.out.println("\nTablica odwrócona:");
        for (int i = tablica.length - 1; i >= 0; i--) {
            System.out.print(tablica[i] + " ");
        }

        scanner.close();
    }
}