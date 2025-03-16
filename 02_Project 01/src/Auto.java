public class Auto {

    // Pola klasy
    private String marka;
    private String model;
    private int rok;
    private int przebieg;

    // Konstruktor klasy
    public Auto(String marka, String model, int rok, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.rok = rok;
        this.przebieg = przebieg;
    }

    // Metoda jedź
    public void jedz() {
        System.out.println("Jedź");
    }

    // Metoda hamuj
    public void hamuj() {
        System.out.println("Hamuj");
    }

    // Metoda wyświetlająca informacje o aucie
    public void info() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + rok);
        System.out.println("Przebieg: " + przebieg + " km");
    }

    // Przykładowe użycie
    public static void main(String[] args) {
        Auto toyota = new Auto("Toyota", "Corolla", 2020, 50000);
        toyota.info();
        toyota.jedz();
        toyota.hamuj();

        Auto mercedes = new Auto("Mercedes", "AMG", 2050, 50);
        mercedes.info();
        mercedes.jedz();
        mercedes.hamuj();
    }
}
