package DesignPattern.Singleton;

public class Singleton {
    private Singleton() {
    }

    private static final Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("in Singleton pattern");
    }
}
