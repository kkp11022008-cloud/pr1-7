package pr3.MathAndRandom;

import java.util.Arrays;
import java.util.Random;
public class n1 {

    public static void main(String[] args) {

        double[] numbersMath = new double[10];

        for (int i = 0; i < numbersMath.length; i++) {
            numbersMath[i] = Math.random() * 100;
        }

        System.out.println("Math.random()");
        System.out.println("До сортировки:");
        System.out.println(Arrays.toString(numbersMath));

        Arrays.sort(numbersMath);

        System.out.println("После сортировки:");
        System.out.println(Arrays.toString(numbersMath));

        Random random = new Random();

        double[] numbersRandom = new double[10];

        for (int i = 0; i < numbersRandom.length; i++) {
            numbersRandom[i] = random.nextDouble() * 100;
        }

        System.out.println("Класс Random:");
        System.out.println("До сортировки:");
        System.out.println(Arrays.toString(numbersRandom));

        Arrays.sort(numbersRandom);

        System.out.println("После сортировки:");
        System.out.println(Arrays.toString(numbersRandom));
    }
}