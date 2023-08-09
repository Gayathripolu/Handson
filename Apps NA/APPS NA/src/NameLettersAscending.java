import java.util.Arrays;
import java.util.Scanner;

    public class NameLettersAscending {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a name: ");
            String name = scanner.nextLine();

            char[] characters = name.toCharArray();
            Arrays.sort(characters);

            String sortedName = new String(characters);

            System.out.println("Letters in ascending order: " + sortedName);
        }
    }


