public class MetodyTest {

    public static void main(String[] args) {
        // Wywołanie metody bezparametrowej z klasy Metody
        Metody.powitaj();

        // Wywołanie metody z parametrem z klasy Metody
        Metody.wyswietlTekst("To jest przykładowy tekst.");

        // Wywołanie metody z parametrami, zwracającej wartość z klasy Metody
        int wynik = Metody.dodaj(12, 8);
        System.out.println("Wynik dodawania to: " + wynik);
    }
}
