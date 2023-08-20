import java.io.*;

public class DeserializationExample {
    public static void main(String[] args) {
        try (FileInputStream fileIn = new FileInputStream("book.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Book book = (Book) in.readObject(); // Deserialize the object
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
