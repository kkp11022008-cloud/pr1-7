package pr2.n10;

import java.util.Scanner;

public class Words {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        int count;

        if (text.trim().isEmpty()) {
            count = 0;
        } else {
            String[] words = text.trim().split("\\s+");
            count = words.length;
        }

        System.out.println("Количество слов: " + count);

        scanner.close();
    }
}