public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10, 2);

        System.out.println("Liczby: " + calculator.getA() + " i " + calculator.getB());
        System.out.println("Suma: " + calculator.dodaj());
        System.out.println("Różnica: " + calculator.odejmij());
        System.out.println("Iloczyn: " + calculator.pomnoz());
        System.out.println("Iloraz: " + calculator.podziel());
        System.out.println("Modulo: " + calculator.modulo());
    }
}