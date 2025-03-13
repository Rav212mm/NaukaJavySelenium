public class OperatoryMatematyczne {
    public static void main(String[] args) {
        // Przykładowe zmienne
        int a = 10;
        int b = 5;

        // Dodawanie
        System.out.println("Dodawanie: " + (a + b));

        // Odejmowanie
        System.out.println("Odejmowanie: " + (a - b));

        // Mnożenie
        System.out.println("Mnożenie: " + (a * b));

        // Dzielenie
        System.out.println("Dzielenie: " + (a / b));

        // Reszta z dzielenia
        System.out.println("Reszta z dzielenia: " + (a % b));

        // Inkrementacja
        int a1 = a;
        a1++;
        System.out.println("Inkrementacja (a++): " + a1);

        // Dekrementacja
        int b1 = b;
        b1--;
        System.out.println("Dekrementacja (b--): " + b1);

        // Pre-inkrementacja i Pre-dekrementacja
        System.out.println("Pre-inkrementacja (++a): " + (++a)); // Pre-inkrementacja
        System.out.println("Pre-dekrementacja (--b): " + (--b)); // Pre-dekrementacja

        // Post-inkrementacja i Post-dekrementacja
        System.out.println("Post-inkrementacja (a++): " + (a++)); // Post-inkrementacja
        System.out.println("Post-dekrementacja (b--): " + (b--)); // Post-dekrementacja

        // Po post-inkrementacji i post-dekrementacji
        System.out.println("Po post-inkrementacji (a): " + a); // Wartość po post-inkrementacji
        System.out.println("Po post-dekrementacji (b): " + b); // Wartość po post-dekrementacji

        // Operatory przypisania
        a += b; // a = a + b
        System.out.println("Przypisanie (a += b): " + a);

        b *= 2; // b = b * 2
        System.out.println("Przypisanie (b *= 2): " + b);

        // Operatory porównania
        System.out.println("Czy a jest większe niż b? " + (a > b));
        System.out.println("Czy a jest mniejsze niż b? " + (a < b));
        System.out.println("Czy a jest równe b? " + (a == b));
        System.out.println("Czy a jest różne od b? " + (a != b));

        // Operatory logiczne
        boolean x = true;
        boolean y = false;
        System.out.println("x AND y: " + (x && y));
        System.out.println("x OR y: " + (x || y));
        System.out.println("NOT x: " + !x);
    }
}
