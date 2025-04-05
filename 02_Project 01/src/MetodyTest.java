public class MetodyTest {

    public static void main(String[] args) {
        // Tworzenie obiektu klasy Metody
        Metody obiektMetody = new Metody();

        // Wywołanie metody bezparametrowej z klasy Metody
        obiektMetody.powitaj();

        // Wywołanie metody z parametrem z klasy Metody
        obiektMetody.wyswietlTekst("To jest przykładowy tekst.");

        // Wywołanie metody z parametrami zwracającej wartość z klasy Metody
        int wynik = obiektMetody.dodaj(12, 8);
        System.out.println("Wynik dodawania to: " + wynik);

        // Wywołanie metody z parametrami zwracającej wartość z klasy Metody
        int wynikMet = obiektMetody.dodaj(40, 80);
        System.out.println("Wynik dodawania to: " + wynikMet);

    }
}
