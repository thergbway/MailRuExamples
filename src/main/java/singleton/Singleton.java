package singleton;

public class Singleton {
    private static Singleton instance = new Singleton();

    public static Singleton instance() {
        return instance;
    }

    private Singleton() {
    }
}
