public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int dodaj() {
        return a + b;
    }

    public int odejmij() {
        return a - b;
    }

    public int pomnoz() {
        return a * b;
    }

    public double podziel() {
        if (b == 0) {
            throw new ArithmeticException("Nie można dzielić przez zero!");
        }
        return (double) a / b;
    }

    // Nowa metoda - operacja modulo
    public int modulo() {
        if (b == 0) {
            throw new ArithmeticException("Nie można obliczyć modulo zero!");
        }
        return a % b;
    }
}