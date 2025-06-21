package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryManagementSystem {

    List<Book> bookInventory = new ArrayList<Book>();

    List<User> registeredUsers = new ArrayList<User>();

    public LibraryManagementSystem() {

    }

    public LibraryManagementSystem(List<Book> bookInventory, List<User> registeredUsers) {
        this.bookInventory = bookInventory;
        this.registeredUsers = registeredUsers;
    }


    public void addBook(Book book) {
        // Logic to add a book to the inventory
        System.out.println("Adding book: " + book.getTitle());
        bookInventory.add(book);
        System.out.println("Book : " + book.getTitle()+" added to inventory."+" Inventory size: " + bookInventory.size());
    }

    public void addUser(User user) {
        // Logic to add a user to the registered users list
        System.out.println("Adding user: " + user.getName());
        registeredUsers.add(user);
        System.out.println("User : " + user.getName()+" added to Registered users."+" Registered users size: " + registeredUsers.size());
    }

    public static List<Book> searchBooks(String criteria,String value,List<Book> bookInventory) {
        // Logic to search for books based on criteria
        // For simplicity, let's assume criteria is a title substring
        System.out.println("Searching for books with criteria: " + criteria);
        if (bookInventory == null || bookInventory.isEmpty()) {
            System.out.println("No books available in inventory.");
            return new ArrayList<>();
        }
        List<Book> foundBooks = new ArrayList<>();
        if(criteria!=null && criteria.equals("title")){
            for(Book book: bookInventory) {
                if (book.getTitle().equals(value)) {
                    System.out.println("Found book: " + book);
                    foundBooks.add(book);
                }
            }
        }else if(criteria!=null && criteria.equals("author")){
            for(Book book: bookInventory) {
                if (book.getAuthor().contains(value)) {
                    System.out.println("Found book by author: " + book);
                    foundBooks.add(book);
                }
            }
        }
        return foundBooks;
    }

    // SearchBooks based on Book Type- Overloaded method
    public static List<Book> searchBooks(String criteria,String value, String bookType,List<Book> bookInventory) {
        System.out.println("Searching for books with bookType: " + bookType);
        if (bookInventory == null || bookInventory.isEmpty()) {
            System.out.println("No books available in inventory.");
            return new ArrayList<>();
        }
        List<Book> foundBooks = bookInventory.stream()
                .filter(book -> {
                    if("title".equals(criteria) && book.getTitle().equals(criteria) && book.getBookType().equals(bookType)){
                        System.out.println("Found book: " + book.getTitle() + " of type: " + bookType);
                    } else if("author".equals(criteria) && book.getTitle().equals(criteria) && book.getBookType().equals(bookType)){
                        System.out.println("Found book: " + book.getTitle() + " of type: " + bookType);
                    }else {
                        System.out.println("Found Not book: " + book.getTitle() + " of type: " + bookType);
                    }
                    return false;
                }).collect(Collectors.toList());
        return foundBooks;
    }

}
