import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        try (FileOutputStream fileOut = new FileOutputStream("book.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(book); // Serialize the object
            System.out.println("Book serialized and saved to 'book.ser'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Book implements Serializable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
