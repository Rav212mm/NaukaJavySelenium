public class PodzielnePrzezTrzy {

    public static void main(String[] args) {

        System.out.println("Liczby od 1 do 100 podzielne przez 3:");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
