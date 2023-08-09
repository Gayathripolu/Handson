import java.util.ArrayList;
import java.util.HashSet;

public class NotRepeatedDigitsPrinter {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8 };

        ArrayList<Integer> notRepeatedDigits = new ArrayList<>();
        HashSet<Integer> repeatedDigits = new HashSet<>();

        for (int num : numbers) {
            if (!repeatedDigits.contains(num)) {
                if (notRepeatedDigits.contains(num)) {
                    notRepeatedDigits.remove(Integer.valueOf(num));
                    repeatedDigits.add(num);
                } else {
                    notRepeatedDigits.add(num);
                }
            }
        }

        System.out.println("Not-repeated digits in the array:");
        for (int digit : notRepeatedDigits) {
            System.out.print(digit + " ");
        }
    }
}

