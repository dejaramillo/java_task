package model;

public class Book {
    private String ISBN;
    private String title;
    private String author;
    private int numberPages;

    public String  getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    @Override
    public String toString() {
        return "El libro con ISBN " +ISBN+ " creado por " +author+ " tiene " +numberPages;
    }

    //Constructor

    public Book(String ISBN, String title, String author, int numberPages) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.numberPages = numberPages;
    }


}
