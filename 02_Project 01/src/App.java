public class App {
    // Pole instancyjne (parametr)
    protected String name;

    // Konstruktor
    public App(String name) {
        this.name = name;
    }

    // Metoda instancyjna
    public void appInfo() {
        System.out.println("Application name: " + name);
    }
}
