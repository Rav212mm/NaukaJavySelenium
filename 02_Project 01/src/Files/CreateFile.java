import java.io.File;
import java.io.IOException;

/**
 * Klasa do tworzenia nowych plików tekstowych.
 */
public class CreateFile {

    /**
     * Tworzy nowy pusty plik o podanej nazwie.
     *
     * @param filePath Ścieżka do pliku (np. "mojplik.txt" lub "sciezka/do/pliku/nowyplik.txt").
     * @return true, jeśli plik został utworzony pomyślnie lub już istnieje; false w przypadku błędu.
     */
    public static boolean create(String filePath) {
        File file = new File(filePath);
        try {
            if (file.createNewFile()) {
                System.out.println("Plik '" + filePath + "' został utworzony.");
                return true;
            } else {
                System.out.println("Plik '" + filePath + "' już istnieje.");
                return true; // Zwraca true, ponieważ cel (posiadanie pliku) został osiągnięty
            }
        } catch (IOException e) {
            System.err.println("Wystąpił błąd podczas tworzenia pliku '" + filePath + "': " + e.getMessage());
            return false;
        }
    }

    // Przykład użycia (opcjonalnie, można usunąć lub zakomentować)
    /*
    public static void main(String[] args) {
        create("test_create.txt");
        create("folder/inny_plik.txt"); // Przykład tworzenia w podfolderze (folder musi istnieć)
    }
    */
}