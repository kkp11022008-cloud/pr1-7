package pr3.MathAndRandom;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class n4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;

        while (true) {

            System.out.print("Введите размер массива: ");

            if (scanner.hasNextInt()) {

                n = scanner.nextInt();

                if (n > 0) {
                    break;
                }

            } else {
                scanner.next();
            }

            System.out.println(
                    "Ошибка! Необходимо целое число больше нуля."
            );
        }

        Random random = new Random();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(n + 1);
        }

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(numbers));

        int evenCount = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
        }

        int[] evenNumbers = new int[evenCount];

        int index = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {

                evenNumbers[index] = numbers[i];
                index++;
            }
        }

        if (evenCount > 0) {

            System.out.println("Массив чётных элементов:");
            System.out.println(Arrays.toString(evenNumbers));

        } else {

            System.out.println(
                    "В исходном массиве нет чётных элементов."
            );
        }
        scanner.close();
    }
}
