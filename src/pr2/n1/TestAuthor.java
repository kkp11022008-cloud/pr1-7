package pr2.n1;

public class TestAuthor {

    public static void main(String[] args) {

        Author author = new Author("Ivan Ivanov", "ivan@mirea.ru", 'm');

        System.out.println("Имя: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Пол: " + author.getGender());

        author.setEmail("vanya@mirea.ru");

        System.out.println("Новый email: " + author.getEmail());

        System.out.println(author);
    }
}