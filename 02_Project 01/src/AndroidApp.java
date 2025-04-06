public class AndroidApp extends App {

    public AndroidApp(String name) {
        super(name); // wywołanie konstruktora klasy bazowej
    }

    public void runAndroidApp() {
        System.out.println(name + " is running on Android.");
    }
}
