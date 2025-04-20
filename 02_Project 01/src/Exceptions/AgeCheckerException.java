import java.util.Scanner; // Importujemy klasę Scanner do pobierania danych od użytkownika

// Główna klasa programu
public class AgeCheckerException {

    // Metoda do pobierania wieku od użytkownika z walidacją
    public static int getAgeFromUser() throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in); // Tworzymy obiekt Scanner do odczytu danych z konsoli
        int age;

        System.out.print("Podaj swój wiek: "); // Prosimy użytkownika o podanie wieku
        age = scanner.nextInt(); // Odczytujemy podany wiek jako liczbę całkowitą

        // Sprawdzamy, czy wiek jest mniejszy od zera
        if (age < 0) {
            // Jeśli wiek jest ujemny, wyrzucamy własny wyjątek InvalidAgeException
            throw new InvalidAgeException("Wiek nie może być liczbą ujemną.");
        }

        // Zamykamy skaner, aby zwolnić zasoby (ważne w rzeczywistych aplikacjach)
        // W tym prostym przykładzie możemy go zamknąć tutaj, ale w bardziej złożonych
        // scenariuszach zarządzanie zasobami wymaga innego podejścia (np. try-with-resources w Java 7+)
        // Dla uproszczenia w tym przykładzie zamykamy go po jednorazowym użyciu.
        scanner.close();

        return age; // Zwracamy poprawny wiek
    }

    // Metoda główna, w której uruchamiamy program
    public static void main(String[] args) {
        try {
            // Próbujemy pobrać wiek od użytkownika
            int age = getAgeFromUser();

            // Sprawdzamy, czy użytkownik jest pełnoletni
            if (age >= 18) {
                System.out.println("Jesteś pełnoletni."); // Komunikat dla pełnoletnich
            } else {
                System.out.println("Jesteś niepełnoletni."); // Komunikat dla niepełnoletnich
            }

        } catch (InvalidAgeException e) {
            // Jeśli wystąpi wyjątek InvalidAgeException (wiek ujemny), łapiemy go
            System.err.println("Błąd: " + e.getMessage()); // Wypisujemy komunikat błędu na standardowe wyjście błędów
        } catch (java.util.InputMismatchException e) {
            // Łapiemy wyjątek, jeśli użytkownik wprowadzi coś, co nie jest liczbą całkowitą
            System.err.println("Błąd: Wprowadzono nieprawidłową wartość. Proszę podać liczbę całkowitą.");
        }
    }
}
