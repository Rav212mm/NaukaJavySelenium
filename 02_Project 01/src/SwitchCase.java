import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ocenę (1-5):");
        int ocena = scanner.nextInt();

        switch (ocena) {
            case 1:
                System.out.println("Ocena niedostateczna");
                break;
            case 2:
                System.out.println("Ocena dopuszczająca");
                break;
            case 3:
                System.out.println("Ocena dostateczna");
                break;
            case 4:
                System.out.println("Ocena dobra");
                break;
            case 5:
                System.out.println("Ocena bardzo dobra");
                break;
            default:
                System.out.println("Podano błędną ocenę!");
                break;
        }

        scanner.close();
    }
}
