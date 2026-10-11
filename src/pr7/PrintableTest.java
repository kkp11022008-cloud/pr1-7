package pr7;

public class PrintableTest {

    public static void main(String[] args) {

        Book book1 = new Book("Война и мир");
        Book book2 = new Book("Преступление и наказание");

        Magazine magazine1 = new Magazine("Наука и жизнь");
        Magazine magazine2 = new Magazine("Техника и жизнь");

        Printable[] printable = {
                book1,
                magazine1,
                book2,
                magazine2
        };

        System.out.println("Только книги:");
        Book.printBooks(printable);

        System.out.println();

        System.out.println("Только журналы:");
        Magazine.printMagazines(printable);
    }
}
