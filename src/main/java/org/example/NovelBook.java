package org.example;

public class NovelBook extends Book {

    private String genre;

    public NovelBook(String title, String isbn, String genre) {
        super(title, isbn,"");
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
                ", isbn='" + getIsbn() + '\'' +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
