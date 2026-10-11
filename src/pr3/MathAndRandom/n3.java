package pr3.MathAndRandom;

import java.util.Arrays;
import java.util.Random;
public class n3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[4];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(90) + 10;
        }

        System.out.println("Массив: " + Arrays.toString(numbers));

        boolean increasing = true;

        for (int i = 0; i < numbers.length - 1; i++) {

            if (numbers[i] >= numbers[i + 1]) {
                increasing = false;
                break;
            }
        }

        if (increasing) {
            System.out.println(
                    "Массив является строго возрастающей последовательностью."
            );
        } else {
            System.out.println(
                    "Массив не является строго возрастающей последовательностью."
            );
        }
    }
}