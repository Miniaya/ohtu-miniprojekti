package logic;

import java.util.ArrayList;
import java.util.List;

import dao.BookmarkDao;

public class Book implements Bookmark {

    private String title, author;
    private int pageCount, currentPage;
    private ArrayList<String> tags = new ArrayList<>(); // TODO: hae tietokannasta

    private int id;

    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;

        this.pageCount = pageCount;
    }

    public Book(String title, String author, int currentPage, int pageCount) {
        this.title = title;
        this.author = author;
        this.currentPage = currentPage;
        this.pageCount = pageCount;
    }

    public Book(String title, String author, int currentPage, int pageCount, ArrayList<String> tags) {
        this.title = title;
        this.author = author;
        this.currentPage = currentPage;
        this.pageCount = pageCount;
        this.tags = tags;
    }

    @Override
    public List<String> getTags() {
        return tags;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pageCount;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return pageCount == book.pageCount
                && title.equals(book.title)
                && author.equals(book.author);
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.title + " ," + this.author + " ,sivumäärä: " + this.pageCount + ", nykyinen sivu: " + this.currentPage;

    }

}
