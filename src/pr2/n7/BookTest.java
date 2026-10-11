package pr2.n7;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Ф. М. Достоевский", "Преступление и наказание", 1866, 600);
        System.out.println(book);
        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Название: " + book.getTitle());
        System.out.println("Год: " + book.getYear());
        System.out.println("Количество страниц: " + book.getPage());
        BookShelf shelf = new BookShelf(5);
        shelf.addBook("Александр Пушкин", "Капитанская дочка", 1836, 130);
        shelf.addBook("Лев Толстой", "Война и мир", 1869, 1200);
        shelf.addBook("Михаил Булгаков", "Мастер и Маргарита", 1967, 400);
        System.out.println("\nВсе книги на полке:");
        shelf.printBooks();
        System.out.println("\nСамая ранняя книга:");
        System.out.println(shelf.getEarliestBook());
        System.out.println("\nСамая поздняя книга:");
        System.out.println(shelf.getLatestBook());
        shelf.sortByYear();
        System.out.println("\nКниги после сортировки по году:");
        shelf.printBooks();
    }
}