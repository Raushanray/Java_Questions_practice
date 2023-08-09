package java_8_functions_questions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
Create a class Book with attributes like title, author, and genre.
Given a list of books, use a Predicate to filter and print books of a specific genre?
 */
class Book {

    private String title;
    private String author;
    private String genre;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }
}

public class BookFilterByGenre {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic"));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", "Classic"));
        books.add(new Book("The Hunger Games", "Suzanne Collins", "Young Adult"));
        books.add(new Book("1984", "George Orwell", "Dystopian"));
        books.add(new Book("Pride and Prejudice", "Jane Austen", "Classic"));

        // Define the Predicate to filter books by genre
        Predicate<Book> classicGenreFilter = book -> book.getGenre().equals("Classic");

        // Filter and print books of the "Classic" genre
        System.out.println("Books in the 'Classic' Genre:");
        books.stream()
                .filter(classicGenreFilter)
                .forEach(book -> System.out.println(book.getTitle()));

    }
}
