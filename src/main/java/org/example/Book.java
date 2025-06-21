package org.example;

public abstract class Book implements Lendable{

    String isbn;
    String title;
    String author;
    boolean isAvailable;
    String bookType;

    public Book(String isbn, String title, String author,String bookType) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // By default, a book is available when created
        this.bookType = bookType;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookType() {
        return bookType;
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

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                ", bookType='" + bookType + '\'' +
                '}';
    }
}
