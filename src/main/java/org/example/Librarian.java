package org.example;

public class Librarian extends User{
    private String libraryName;
    private String libraryAddress;

    public Librarian() {
        super();
        this.libraryName = "Default Library";
        this.libraryAddress = "Default Address";
    }

    public Librarian(String name, String contactInfo, String libraryName, String libraryAddress) {
        super(name, contactInfo);
        this.libraryName = libraryName;
        this.libraryAddress = libraryAddress;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard: ");
        System.out.println("Library Name: " + libraryName);
        System.out.println("Library Address: " + libraryAddress);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLibraryAddress() {
        return libraryAddress;
    }

    public void setLibraryAddress(String libraryAddress) {
        this.libraryAddress = libraryAddress;
    }
}
