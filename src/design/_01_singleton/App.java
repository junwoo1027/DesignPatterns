package design._01_singleton;

public class App {
    public static void main(String[] args) {
//        Runtime runtime = Runtime.getRuntime();
//
//        System.out.println(runtime.maxMemory());
//        System.out.println(runtime.freeMemory());

        Settings instance = Settings.getInstance();
        Settings instance1 = Settings.getInstance();
        System.out.println(instance == instance1);
    }
}