package pr3.Obolochki;

public class Main {
    public static void main(String[] args) {
        Double number1 = Double.valueOf(3.14);
        Double number2 = Double.valueOf("25.5");

        System.out.println("1. Объекты Double:");
        System.out.println(number1);
        System.out.println(number2);

        String text = "12.75";
        double parsedNumber = Double.parseDouble(text);

        System.out.println("2. String в double:");
        System.out.println(parsedNumber);

        Double number = Double.valueOf(12.75);
        byte b = number.byteValue();
        short s = number.shortValue();
        int i = number.intValue();
        long l = number.longValue();
        float f = number.floatValue();
        double d = number.doubleValue();

        System.out.println("3. Преобразования:");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);

        System.out.println("4. Вывод объекта:");
        System.out.println(number);

        String result = Double.toString(3.14);

        System.out.println("5. double в String:");
        System.out.println(result);
    }
}