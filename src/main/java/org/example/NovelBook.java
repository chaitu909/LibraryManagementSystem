package org.example;

public class NovelBook extends Book {

    private String genre;

    public NovelBook(String isbn, String title, String author, String bookType, String genre) {
        super(isbn,title,author, BookType.NOVEL.getDisplayName());
        this.genre = genre;
    }

    @Override
    public void someMethod() {
        System.out.println("Novel Book");
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "NovelBook{" +
                ",title='" + getTitle() + '\'' +
                ", isbn='" + getIsbn() + '\'' +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
