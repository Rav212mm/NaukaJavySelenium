public class WebDriverTest {
    public static void main(String[] args) {
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://www.google.com");
        chrome.findElement("input[name='q']");

        System.out.println(); // Dodanie pustej linii dla lepszej czytelności

        WebDriver firefox = new FirefoxDriver();
        firefox.get("https://www.mozilla.org");
        firefox.findElement("button.primary");
    }
}