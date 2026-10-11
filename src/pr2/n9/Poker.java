package pr2.n9;

import java.util.Random;
import java.util.Scanner;

public class Poker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество игроков: ");
        int n = scanner.nextInt();

        if (n < 1 || n > 10) {
            System.out.println(
                    "Количество игроков должно быть от 1 до 10."
            );
            scanner.close();
            return;
        }

        String[] ranks = {
                "2", "3", "4", "5", "6", "7",
                "8", "9", "10", "Валет", "Дама", "Король", "Туз"
        };

        String[] suits = {
                "черви", "бубны", "трефы", "пики"
        };

        String[] deck = new String[52];

        int index = 0;

        for (int suit = 0; suit < suits.length; suit++) {

            for (int rank = 0; rank < ranks.length; rank++) {

                deck[index] = ranks[rank] + " " + suits[suit];
                index++;
            }
        }

        Random random = new Random();

        for (int i = deck.length - 1; i > 0; i--) {

            int j = random.nextInt(i + 1);

            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }

        int cardIndex = 0;

        for (int player = 1; player <= n; player++) {

            System.out.println("Игрок " + player + ":");

            for (int card = 0; card < 5; card++) {

                System.out.println(deck[cardIndex]);
                cardIndex++;
            }

            if (player < n) {
                System.out.println();
            }
        }

        scanner.close();
    }
}