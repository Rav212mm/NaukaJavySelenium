import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Klasa do odczytywania zawartości plików tekstowych.
 */
public class ReadFile {

    /**
     * Odczytuje wszystkie linie z pliku tekstowego.
     *
     * @param filePath Ścieżka do pliku (np. "mojplik.txt" lub "sciezka/do/pliku/plik_do_odczytu.txt").
     * @return Lista Stringów, gdzie każdy String to linia z pliku. Zwraca pustą listę w przypadku błędu lub gdy plik jest pusty.
     */
    public static List<String> readAllLines(String filePath) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            System.out.println("Plik '" + filePath + "' został odczytany.");
        } catch (IOException e) {
            System.err.println("Wystąpił błąd podczas odczytu pliku '" + filePath + "': " + e.getMessage());
            // Można zwrócić null lub rzucić wyjątek, w zależności od wymagań
        }
        return lines;
    }

    // Przykład użycia (opcjonalnie)
    /*
    public static void main(String[] args) {
        // Najpierw utwórz plik z zawartością do odczytu
        String content = "To jest pierwsza linia.\nTo jest druga linia.";
        WriteToFile.write(filePath, content, false); // Używamy WriteToFile do przygotowania pliku

        List<String> lines = readAllLines(filePath);

        if (!lines.isEmpty()) {
            System.out.println("Zawartość pliku:");
            for (String line : lines) {
                System.out.println(line);
            }
        } else {
            System.out.println("Plik jest pusty lub wystąpił błąd podczas odczytu.");
        }

        // Przykład odczytu nieistniejącego pliku
        readAllLines("nieistniejacy_plik_do_odczytu.txt");
    }
    */
}