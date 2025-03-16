public class Tablica {
    public static void main(String[] args) {

        // utworzenie tablicy liczb całkowitych z 5 elementami
        int[] liczby = new int[5];

        // przypisanie wartości do elementów tablicy
        liczby[0] = 10;
        liczby[1] = 20;
        liczby[2] = 30;
        liczby[3] = 40;
        liczby[4] = 50;

        // wyświetlenie elementów tablicy przy pomocy pętli for
        for (int i = 0; i < liczby.length; i++) {
            System.out.println("liczby[" + i + "] = " + liczby[i]);
        }
    }
}

