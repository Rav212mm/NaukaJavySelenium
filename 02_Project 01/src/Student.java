public class Student {

    // Pola klasy
    private String imie;
    private String nazwisko;
    private int wiek;
    private String kierunek;

    // Konstruktor klasy
    public Student(String imie, String nazwisko, int wiek, String kierunek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.kierunek = kierunek;
    }

    // Metoda ucz się
    public void uczSie() {
        System.out.println(imie + ' ' + nazwisko + " uczy się.");
    }

    // Metoda odpoczywaj
    public void odpoczywaj() {
        System.out.println(imie + ' ' + nazwisko + " odpoczywa.");
    }

    // Metoda wyświetlająca informacje o studencie
    public void info() {
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Wiek: " + wiek);
        System.out.println("Kierunek studiów: " + kierunek);
    }

    // Przykładowe użycie
    public static void main(String[] args) {
        Student student1 = new Student("Anna", "Kowalska", 21, "Informatyka");
        student1.info();
        student1.uczSie();
        student1.odpoczywaj();
    }
}
