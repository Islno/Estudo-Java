package Classe;

public class NullPointerException {
    public static void main(String[] args) {
        String str = null; // Variable initialized to null
        // str.length(); // This would cause a NullPointerException

        str = "Hello, World!"; // Assigning a value to the variable
        System.out.println(str.length()); // This will work fine
    }
}