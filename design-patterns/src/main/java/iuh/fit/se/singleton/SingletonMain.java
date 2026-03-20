package iuh.fit.se.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();

        config1.setVersion("1.1.0");

        System.out.println("config1 == config2: " + (config1 == config2));
        System.out.println("App: " + config2.getAppName());
        System.out.println("Version: " + config2.getVersion());
    }
}