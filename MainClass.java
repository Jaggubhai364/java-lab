// MainClass.java
public class MainClass {
    public static void main(String[] args) {
        HelperClass helper = new HelperClass();
        helper.displayMessage();
    }
}

// HelperClass.java
class HelperClass {
    public void displayMessage() {
        System.out.println("Hello from HelperClass!");
    }
}
