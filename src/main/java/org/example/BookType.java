package org.example;

public enum BookType {
    // Enum constants representing different types of books

    NOVEL("Novel", "A work of fiction"),
    TEXTBOOK("Textbook", "Used for educational purposes"),
    MAGAZINE("Magazine", "A periodical publication"),
    COMIC("Comic", "Contains comic art and stories");

    private final String displayName;
    private final String description;

    BookType(String displayName, String description) {
        this.displayName = displayName;
        this.description = description;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDescription() {
        return description;
    }
}
