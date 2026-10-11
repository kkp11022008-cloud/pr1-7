package pr2.n7;

public class Book {
    private String author;
    private String title;
    private int year;
    private int page;
    public Book(String author, String title, int year, int page) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.page = page;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "Автор: " + author + ", название: " + title + ", год написания: " + year + ", количество страниц: " + page;
    }
}