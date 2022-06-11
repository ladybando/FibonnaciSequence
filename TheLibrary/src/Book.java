import java.util.*;

public class Book {
    public static void main(String[] args) {
        System.out.println("List of initial Books: " + getListOfInitialBooks());
        System.out.println("Catalog: " + getCatalog());
    }

    String title = "n/a";
    String author = "n/a";
    String genre = "n/a";
    static HashMap<String, String> catalog = new HashMap<>();

    public Book(String book_title, String book_author) {
        this.title = book_title;
        this.author = book_author;
    }
    public Book() {}

    public Book(String book_title) {
        this.title = book_title;
    }

    public Book(String book_title, String book_author, String book_genre) {
        this.title = book_title;
        this.author = book_author;
        this.genre = book_genre;
    }

    static List<Book> getListOfInitialBooks() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Harry Potter", "JK Rowling"));
        books.add(new Book("Think and Grow Rich", "Napoleon Hill", "Non-Fiction"));
        books.add(new Book("Start with Why"));
        books.add(new Book("Lord of the Flies"));
        books.add(new Book("The Midnight Library"));
        books.add(new Book("The Giver"));
        books.add(new Book("The Book Thief"));
        books.add(new Book("To Kill a Mockingbird"));
        books.add(new Book("Animal Farm"));
        books.add(new Book("Harry Potter", "JK Rowling"));
        books.add(new Book("Lord of the Flies"));
        books.add(new Book("Harry Potter", "JK Rowling"));
        books.add(new Book("To Kill a Mockingbird"));
        books.add(new Book("Harry Potter", "JK Rowling"));
        books.add(new Book("Wild Seed", "Octavia Butler", "Fiction"));
        return books;
    }
    // 1. Using maps, create a 'library catalog' of books
    // What should be the key and value for our map?
    // Key = author (string), Value = title (String)
    // The books we have, the number of copies of each book we have.
    public static Map<String, String> getCatalog() {
        List<Book> initialList = getListOfInitialBooks();
        int countCopies = 0;

        for (Book book : initialList){
            boolean bookExists = catalog.containsKey(book.title);
            if (bookExists){

                catalog.get(book.title);
                countCopies++;
                catalog.put("title", book.title);

            }else {
                // If it doesn't, add it to the map
                catalog.put("title", book.title);
                catalog.put("author", book.author);
                catalog.put("genre", book.genre);

            }
            countCopies++;
        }
        return catalog;
    }
}