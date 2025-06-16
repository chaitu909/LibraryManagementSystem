package org.example;

public abstract class User {

    private String userId;
    private String name;
    private String contactInfo;

    public static int counter=0;

    public User(){
        this.userId = generateUniqueId();
    }

    private String generateUniqueId() {
        counter++;
        return String.valueOf(counter); // Generates a random unique ID
    }

    public User(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public User(User otherUser) {
        this.userId = otherUser.userId;
        this.name = otherUser.name;
        this.contactInfo = otherUser.contactInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    /* * Returns the unique identifier for the user.
     *
     * @return the userId
     * No Need of setter Method as per Requirement.
    **/
    public String getUserId() {
        return userId;
    }

    /** abstract methods/
     *
     */
    public abstract void displayDashboard();

    public abstract boolean canBorrowBooks();
}
