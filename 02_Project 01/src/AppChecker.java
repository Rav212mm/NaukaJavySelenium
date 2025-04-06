public class AppChecker {
    public static void AppChecker(String[] args) {
        AndroidApp androidApp = new AndroidApp("Messenger");
        IphoneApp iphoneApp = new IphoneApp("Safari");

        androidApp.appInfo();
        androidApp.runAndroidApp();

        iphoneApp.appInfo();
        iphoneApp.runIphoneApp();
    }
}
