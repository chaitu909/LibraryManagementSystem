package org.example;

public class Member extends User{

    private int borrowedBooksCount;
    private static final int MAX_BORROWED_BOOKS = 5;

    public Member() {
        super();
        this.borrowedBooksCount = 0;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Member DashBoard: Books Borrowed: " + borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        if (borrowedBooksCount<MAX_BORROWED_BOOKS) {
            return true;
        }else
            return false;
    }
}
