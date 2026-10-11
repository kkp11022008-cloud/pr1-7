package pr6;

import java.util.Locale;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsius = scanner.nextDouble();

        Convertable converter = new Converter();

        double kelvin = converter.convert(celsius, "K");
        double fahrenheit = converter.convert(celsius, "F");

        System.out.printf(
                Locale.US,
                "%.2f °C = %.2f K%n",
                celsius,
                kelvin
        );

        System.out.printf(
                Locale.US,
                "%.2f °C = %.2f °F%n",
                celsius,
                fahrenheit
        );

        scanner.close();
    }
}