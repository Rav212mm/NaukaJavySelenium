import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Klasa do zapisu danych do plików tekstowych.
 */
public class WriteToFile {

    /**
     * Zapisuje podaną zawartość do pliku.
     *
     * @param filePath Ścieżka do pliku (np. "mojplik.txt" lub "sciezka/do/pliku/plik_do_zapisu.txt"). Plik zostanie utworzony, jeśli nie istnieje.
     * @param content  Treść do zapisania w pliku.
     * @param append   Jeśli true, zawartość zostanie dopisana na końcu pliku. Jeśli false, plik zostanie nadpisany.
     * @return true, jeśli zapis powiódł się; false w przypadku błędu.
     */
    public static boolean write(String filePath, String content, boolean append) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, append))) {
            bw.write(content);
            System.out.println("Zawartość została zapisana do pliku '" + filePath + "' (" + (append ? "dopisano" : "nadpisano") + ").");
            return true;
        } catch (IOException e) {
            System.err.println("Wystąpił błąd podczas zapisu do pliku '" + filePath + "': " + e.getMessage());
            return false;
        }
    }

    // Przykład użycia (opcjonalnie)
    /*
    public static void main(String[] args) {
        String filePath = "test_write.txt";
        String initialContent = "Pierwsza linia.\nDruga linia.";
        String additionalContent = "\nTrzecia linia (dopisana).";
        String overwriteContent = "To jest nowa zawartość (nadpisana).";

        // Zapisujemy początkową zawartość (nadpisując, jeśli plik istnieje)
        write(filePath, initialContent, false);

        // Dopisujemy dodatkową zawartość
        write(filePath, additionalContent, true);

        // Nadpisujemy plik nową zawartością
        write(filePath, overwriteContent, false);

        // Odczytujemy i wyświetlamy zawartość po zapisie (opcjonalnie, wymaga klasy ReadFile)
        // List<String> lines = ReadFile.readAllLines(filePath);
        // System.out.println("\nZawartość pliku po operacjach:");
        // for (String line : lines) {
        //     System.out.println(line);
        // }
    }
    */
}