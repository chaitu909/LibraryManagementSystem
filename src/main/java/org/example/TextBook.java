package org.example;

public class TextBook extends Book{
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

//    public TextBook() {
//        super();
//    }

    public TextBook(String isbn, String title, String author) {
        super(isbn, title, author);
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // By default, a textbook is available when created
    }

    @Override
    public boolean lend(User user) {
        if (isAvailable && user.canBorrowBooks()) {
            isAvailable = false;
            System.out.println("TextBook lent to " + user.getName());
            return true;
        } else {
            System.out.println("TextBook is not available or user cannot borrow books.");
            return false;
        }
    }

    @Override
    public void returnBook(User user) {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("TextBook returned by " + user.getName());
        } else {
            System.out.println("TextBook was not lent out.");
        }
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public void someMethod() {
        // Implementation of the abstract method from Book class
        System.out.println("This is a textbook with ISBN: " + isbn);
    }
}
