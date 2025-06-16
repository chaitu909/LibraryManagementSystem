package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Book implements Lendable{

    String isbn;
    String title;
    String author;
    boolean isAvailable;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // By default, a book is available when created
    }
    public boolean lend(User user) {
        if (isAvailable && user.canBorrowBooks()) {
            isAvailable = false;
            System.out.println("Book lent to " + user.getName());
            return true;
        } else {
            System.out.println("Book is not available or user cannot borrow books.");
            return false;
        }
    }

    public void returnBook(User user) {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book returned by " + user.getName());
            //return true;
        } else {
            System.out.println("Book was not lent out.");
            //return false;
        }
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public abstract void someMethod(); // Placeholder for an abstract method that subclasses must implement

    public static List<Book> searchBooks(String criteria) {
        List<BookInventory> books = new ArrayList<>();
         if(criteria!=null && criteria.equals("title")){
             for(BookInventory book: books) {
                 if (book.getTitle().contains(criteria)) {
                     System.out.println("Found book: " + book.getTitle());
                 }
             }
         }
    }
}
