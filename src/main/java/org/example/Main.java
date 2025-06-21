package org.example;

import static org.example.User.counter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
//        User user1 = new User();
//        User user2 = new User();

//        System.out.printf("counter: %s\n", +counter);
//        System.out.printf("counter: %s\n", +counter);

        //Testing Adding Books and Users - TASK 1
//        LibraryManagementSystem library = new LibraryManagementSystem();
//        Book book1 = new NovelBook("The Great Gatsby", "1234567890", "Fiction");
//        Book book2 = new NovelBook("1984", "0987654321", "Dystopian");
//        library.addBook(book1);
//        library.addBook(book2);
//
//        User user1 = new Member();
//        User user2 = new Member();
//        User user3 = new Librarian();
//        User user4 = new Librarian("Alice","test1", "City Library", "123 Main St");
//        User user5 = new Librarian("Bob","test2", "Town Library", "456 Elm St");
//        library.addUser(user1);
//        library.addUser(user2);
//        library.addUser(user3);
//        library.addUser(user4);
//        library.addUser(user5);

        //Testing Searching Books - TASK 2
        LibraryManagementSystem library = new LibraryManagementSystem();
        Book book1 = new NovelBook( "1234567890", "The Great Gatsby","Author1","Novel", "Fiction");
        Book book2 = new NovelBook( "0987654321","1984", "Author2","Novel", "Dystopian");
        library.addBook(book1);
        library.addBook(book2);

        //Positive test cases
        // Searching for books by title
        String searchTitle = "The Great Gatsby";
        System.out.println("Searching for books with title: " + LibraryManagementSystem.searchBooks("title", searchTitle, library.bookInventory));

        // Searching for books by author
        String author = "Author2";
        System.out.println("Searching for books by author: " + LibraryManagementSystem.searchBooks("author", author, library.bookInventory));
    }
}