package pr6;

public class Converter implements Convertable {

    @Override
    public double convert(double celsius, String targetScale) {

        if (targetScale.equalsIgnoreCase("K")) {
            return celsius + 273.15;
        } else if (targetScale.equalsIgnoreCase("F")) {
            return celsius * 9.0 / 5.0 + 32;
        } else {
            throw new IllegalArgumentException(
                    "Неизвестная шкала температуры."
            );
        }
    }
}