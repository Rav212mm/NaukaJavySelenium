// Definicja interfejsu WebDriver
public interface WebDriver {

    /**
     * Metoda służąca do nawigacji do podanego adresu URL.
     * @param url Adres URL strony do załadowania.
     */
    void get(String url);

    /**
     * Metoda służąca do znajdowania elementu na stronie przy użyciu podanego lokalizatora.
     * W rzeczywistości zwracałaby obiekt reprezentujący element (np. WebElement).
     * @param locator Lokalizator elementu (np. CSS Selector, XPath).
     */
    void findElement(String locator);
}