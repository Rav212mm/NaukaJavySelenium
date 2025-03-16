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
        Auto mojeAuto = new Auto("Toyota", "Corolla", 2020, 50000);
        mojeAuto.info();
        mojeAuto.jedz();
        mojeAuto.hamuj();
    }
}
