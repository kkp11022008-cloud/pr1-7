package pr3.Converter;

import java.util.Scanner;
public class Converter {

    private static final double RUB_PER_USD = 90.0;
    private static final double RUB_PER_EUR = 100.0;

    public double rublesToDollars(double rubles) {
        return rubles / RUB_PER_USD;
    }

    public double rublesToEuros(double rubles) {
        return rubles / RUB_PER_EUR;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму в рублях: ");
        double rubles = scanner.nextDouble();

        Converter converter = new Converter();

        double dollars = converter.rublesToDollars(rubles);
        double euros = converter.rublesToEuros(rubles);

        System.out.println("Результат конвертации:");

        System.out.printf("%.2f RUB = %.2f USD%n", rubles, dollars
        );

        System.out.printf("%.2f RUB = %.2f EUR%n", rubles, euros
        );

        scanner.close();
    }
}