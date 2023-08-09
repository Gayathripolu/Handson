
    import java.util.Arrays;
import java.util.Scanner;

    public class NumberDigitsAscending {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            String numberStr = scanner.nextLine();

            char[] digitsArray = numberStr.toCharArray();
            Arrays.sort(digitsArray);

            String sortedDigits = new String(digitsArray);

            System.out.println("Digits in ascending order: " + sortedDigits);
        }
    }


