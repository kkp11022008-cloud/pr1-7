package pr7;

public class ProcessStringsTest {

    public static void main(String[] args) {

        ProcessStrings processor = new ProcessStrings();

        String text = "abcdef";

        System.out.println("Исходная строка: " + text);
        System.out.println("Количество символов: "
                + processor.countChars(text));

        System.out.println("Символы на нечётных позициях: "
                + processor.getOddPositionChars(text));

        System.out.println("Строка наоборот: "
                + processor.reverseString(text));
    }
}
