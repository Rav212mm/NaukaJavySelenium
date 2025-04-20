// Definiujemy własny wyjątek dla nieprawidłowego wieku
class InvalidAgeException extends Exception {
    // Konstruktor przyjmujący komunikat o błędzie
    public InvalidAgeException(String message) {
        super(message); // Przekazujemy komunikat do konstruktora klasy nadrzędnej Exception
    }
}
