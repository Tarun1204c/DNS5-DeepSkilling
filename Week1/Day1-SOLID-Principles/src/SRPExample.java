// SRP - Single Responsibility Principle
// Ek class ka sirf ek hi kaam hona chahiye

public class Book {
    private String name;
    private String author;
    private String text;

    // Book ka kaam - text handle karna
    public boolean isWordInText(String word) {
        return text.contains(word);
    }
}

// Printing ka kaam alag class karti hai
public class BookPrinter {
    public void printToConsole(String text) {
        System.out.println(text);
    }
}
