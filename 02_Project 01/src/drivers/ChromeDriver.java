// Klasa implementująca interfejs WebDriver dla przeglądarki Chrome
public class ChromeDriver implements WebDriver {

    /**
     * Implementacja metody get() dla ChromeDriver.
     * Nawiguje do podanego adresu URL w przeglądarce Chrome.
     * @param url Adres URL strony do załadowania.
     */
    @Override
    public void get(String url) {
        System.out.println("Otwieranie adresu URL w przeglądarce Chrome: " + url);
        // Tutaj byłaby rzeczywista logika otwierania strony w Chrome
    }

    /**
     * Implementacja metody findElement() dla ChromeDriver.
     * Znajduje element przy użyciu podanego lokalizatora w przeglądarce Chrome.
     * @param locator Lokalizator elementu.
     */
    @Override
    public void findElement(String locator) {
        System.out.println("Wyszukiwanie elementu w przeglądarce Chrome przy użyciu lokalizatora: " + locator);
        // Tutaj byłaby rzeczywista logika wyszukiwania elementu w Chrome
    }
}