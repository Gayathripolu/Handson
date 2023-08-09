
    import java.util.HashMap;
    public class RepeatedCharacter {
        public static void main(String[] args) {
            String input = "programming";

            System.out.println("Repeated characters in the string:");
            printRepeatedCharacters(input);
        }

        public static void printRepeatedCharacters(String str) {
            // Create a HashMap to store the frequency of each character in the string.
            HashMap<Character, Integer> charFrequency = new HashMap<>();

            // Iterate through the string to count the occurrences of each character.
            for (char c : str.toCharArray()) {
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            }

            // Print characters with frequency greater than 1 (i.e., repeated characters).
            for (char c : str.toCharArray()) {
                if (charFrequency.get(c) > 1) {
                    System.out.print(c + " ");
                    // To avoid printing a character multiple times if it occurs more than twice in the string,
                    // we set its frequency to 0 after printing it.
                    charFrequency.put(c, 0);
                }
            }
            System.out.println(); // Move to the next line after printing repeated characters.
        }
    }

