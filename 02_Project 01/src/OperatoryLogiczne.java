import java.util.Scanner;

public class OperatoryLogiczne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą wartość logiczną (true/false):");
        boolean a = scanner.nextBoolean();

        System.out.println("Podaj drugą wartość logiczną (true/false):");
        boolean b = scanner.nextBoolean();

        System.out.println("a = " + a + ", b = " + b);

        System.out.println("a && b (AND): " + (a && b));
        System.out.println("a || b (OR): " + (a || b));
        System.out.println("!a (NOT a): " + (!a));
        System.out.println("!b (NOT b): " + (!b));

        scanner.close();
    }
}
