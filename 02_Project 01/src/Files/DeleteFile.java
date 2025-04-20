import java.io.File;

/**
 * Klasa do usuwania plików tekstowych.
 */
public class DeleteFile {

    /**
     * Usuwa plik o podanej nazwie.
     *
     * @param filePath Ścieżka do pliku (np. "mojplik.txt" lub "sciezka/do/pliku/plik_do_usuniecia.txt").
     * @return true, jeśli plik został usunięty pomyślnie; false, jeśli plik nie istnieje lub wystąpił błąd.
     */
    public static boolean delete(String filePath) {
        File file = new File(filePath);

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("Plik '" + filePath + "' został usunięty.");
                return true;
            } else {
                System.err.println("Nie można usunąć pliku '" + filePath + "'. Sprawdź uprawnienia.");
                return false;
            }
        } else {
            System.out.println("Plik '" + filePath + "' nie istnieje.");
            return false;
        }
    }

    // Przykład użycia (opcjonalnie)
    /*
    public static void main(String[] args) {
        // Najpierw utwórz plik do usunięcia (dla celów testowych)
        CreateFile.create("plik_do_usuniecia.txt");
        // Teraz spróbuj go usunąć
        delete("plik_do_usuniecia.txt");
        // Spróbuj usunąć plik, który nie istnieje
        delete("nieistniejacy_plik.txt");
    }
    */
}