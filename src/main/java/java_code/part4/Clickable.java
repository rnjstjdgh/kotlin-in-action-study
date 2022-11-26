package java_code.part4;

public interface Clickable {
    void click();

    default void showOff(String str) {
        System.out.println("I am clickable!");
    }
}
