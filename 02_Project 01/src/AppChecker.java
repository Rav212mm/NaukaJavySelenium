public class AppChecker {
    public static void main(String[] args) {  // poprawiona sygnatura
        AndroidApp androidApp = new AndroidApp("Messenger");
        IphoneApp iphoneApp = new IphoneApp("Safari");

        androidApp.appInfo();
        androidApp.runAndroidApp();

        iphoneApp.appInfo();
        iphoneApp.runIphoneApp();
    }
}
