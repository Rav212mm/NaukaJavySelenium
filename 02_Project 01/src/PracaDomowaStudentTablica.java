public class PracaDomowaStudentTablica {

    // Pola klasy
    private String imie;
    private String nazwisko;
    private int wiek;
    private String kierunek;

    // Konstruktor klasy
    public PracaDomowaStudentTablica(String imie, String nazwisko, int wiek, String kierunek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.kierunek = kierunek;
    }

    // Metoda ucz się
    public void uczSie() {
        System.out.println(imie + " uczy się.");
    }

    // Metoda odpoczywaj
    public void odpoczywaj() {
        System.out.println(imie + " odpoczywa.");
    }

    // Metoda wyświetlająca informacje o studencie
    public void info() {
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Wiek: " + wiek);
        System.out.println("Kierunek: " + kierunek);
    }

    // Przykładowe użycie
    public static void main(String[] args) {
        Student student1 = new Student("Anna", "Kowalska", 21, "Informatyka");
        Student student2 = new Student("Jan", "Nowak", 22, "Matematyka");
        Student student3 = new Student("Piotr", "Nowak", 23, "Fizyka");

        Student[] studenci = {student1, student2, student3};

        for (Student s : studenci) {
            s.info();
            s.uczSie();
            s.odpoczywaj();
            System.out.println();
        }
    }
}
