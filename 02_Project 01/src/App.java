public class App {
    protected String name;

    public App(String name) {
        this.name = name;
    }

    public void appInfo() {
        System.out.println("Application name: " + name);
    }
}
