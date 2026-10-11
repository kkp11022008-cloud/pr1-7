package pr2.n7;

public class BookShelf {
    private Book[] books;
    private int count;
    public BookShelf(int capacity) {
        books = new Book[capacity];
        count = 0;
    }
    public boolean addBook(String author, String title, int year, int page) {
        if (count >= books.length) {
            return false;
        }
        books[count] = new Book(author, title, year, page);
        count++;
        return true;
    }
    public Book getEarliestBook() {
        if (count == 0) {
            return null;
        }
        Book earliest = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() < earliest.getYear()) {
                earliest = books[i];
            }
        }
        return earliest;
    }
    public Book getLatestBook() {
        if (count == 0) {
            return null;
        }
        Book latest = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() > latest.getYear()) {
                latest = books[i];
            }
        }
        return latest;
    }
    public void sortByYear() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (books[j].getYear() > books[j + 1].getYear()) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }
    public void printBooks() {
        if (count == 0) {
            System.out.println("Книжная полка пуста");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }
}