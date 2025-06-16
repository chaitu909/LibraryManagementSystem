# LibraryManagementSystem
MileStone C
Task 1: Set Up Collections
Objective: Understand and implement collections to manage system-wide data.
Step 1.1: Create a class LibraryManagementSystem with:
A List<Book> named bookInventory to store all books.
A List<User> named registeredUsers to store all registered users.
Step 1.2: Explain the purpose of using collections 
Step 1.3: Add methods:
addBook(Book book) to add a book to bookInventory.
registerUser(User user) to add a user to registeredUsers.
Step 1.4: Test the collections by adding a few books and users, then print their details.

Task 2: Implement Search Functionality
Objective: Demonstrate compile-time polymorphism through method overloading.
Step 2.1: Add a static method searchBooks(String criteria) to search for books by title or author. Use a loop to iterate over bookInventory and add matching books to a result list.
Step 2.2: Overload searchBooks with additional parameters:
searchBooks(String criteria, String type) for searching books of a specific type ("TextBook" or "NovelBook").
Implement this method to filter results based on the type of book.
Java Enums
Step 2.3: Test the overloaded methods with different inputs and ensure they return correct results.

Task 3: Integrate Book and User Management
Objective: Combine book and user features to demonstrate system functionality.
Step 3.1: In the main method:
Create a few instances of TextBook and NovelBook.
Add these books to the library using addBook.
Step 3.2: Create instances of Member and Librarian.
Register them using registerUser.
Step 3.3: Print the details of all books and users to verify the inventory and registration system.

Task 4: Demonstrate Lending Functionality
Objective: Practice the interaction between users and books.
Step 4.1: Simulate lending a book:
Attempt to lend a TextBook to a Member using the lend(User user) method.
Print a success message if the lending operation is successful.
Step 4.2: Add logic to handle the following scenarios:
A user attempts to borrow a book that is already lent.
A user exceeds their borrowing limit.
Step 4.3: Test lending with different types of books and users.

Task 5: Manage Returns
Objective: Complete the book borrowing cycle.
Step 5.1: Simulate returning a book:
Use the returnBook(User user) method to mark a book as available again.
Step 5.2: Ensure the book can be lent to another user after it is returned.
Step 5.3: Test the return functionality by printing the availability status of books before and after returning.

Task 6: Advanced Features
Objective: Explore additional features to extend the system.
Step 6.1: Add a method displayAllBooks to print the details of all books in bookInventory.
Step 6.2: Add a method displayRegisteredUsers to print the details of all users in registeredUsers.
Step 6.3: Demonstrate searching:
Search for books by title or author using searchBooks.
Search for books by type using the overloaded method.
