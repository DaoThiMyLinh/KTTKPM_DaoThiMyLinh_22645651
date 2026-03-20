package iuh.fit.se.singleton;

public class AppConfig {
    private static volatile AppConfig instance;
    private String appName;
    private String version;

    private AppConfig() {
        this.appName = "KTTKPM";
        this.version = "1.0.0";
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            synchronized (AppConfig.class) {
                if (instance == null) {
                    instance = new AppConfig();
                }
            }
        }
        return instance;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}