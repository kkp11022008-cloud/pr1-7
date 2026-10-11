package pr7;

public class ProcessStrings implements StringOperations {

    @Override
    public int countChars(String s) {
        return s.length();
    }

    @Override
    public String getOddPositionChars(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }

        return result.toString();
    }

    @Override
    public String reverseString(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));
        }

        return result.toString();
    }
}
