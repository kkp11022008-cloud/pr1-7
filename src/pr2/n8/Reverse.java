package pr2.n8;

public class Reverse {
    public static void main(String[] args) {
        String[] words = {
                "один", "два", "три", "четыре", "пять"
        };
        System.out.println("До разворота:");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        int left = 0;
        int right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        System.out.println("После разворота:");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }
}