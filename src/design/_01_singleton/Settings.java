package design._01_singleton;

public class Settings {

    public Settings() {

    }

    private static class SettingsHolder {
        private static final Settings SETTINGS = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.SETTINGS;
    }
}
