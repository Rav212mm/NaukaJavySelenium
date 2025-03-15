import java.util.Scanner;

public class CustomScanner {

    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("POdaj swoje imię");
        String name = scanner.nextLine();
        System.out.println("Cześć " + name + " !");
    } */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstnumber = scanner.nextInt();
        int kwadrat = firstnumber * firstnumber;
        System.out.println("Kwadrat tej liczny to: " + kwadrat);
    }

}
