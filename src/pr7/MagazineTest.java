package pr7;

public class MagazineTest {

    public static void main(String[] args) {

        Magazine magazine1 = new Magazine("Наука и жизнь");
        Magazine magazine2 = new Magazine("Техника и жизнь");

        Book book1 = new Book("Война и мир");
        Book book2 = new Book("Преступление и наказание");

        Printable[] printable = {
                magazine1,
                book1,
                magazine2,
                book2
        };

        System.out.println("Названия журналов:");

        Magazine.printMagazines(printable);
    }
}