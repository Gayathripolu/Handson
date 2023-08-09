
    import java.util.HashMap;

    public class UniqueCharacterFinder {
        public static void main(String[] args) {
            String input = "programming";

            String uniqueChars = findUniqueCharacters(input);
            System.out.println("Unique characters in the string: " + uniqueChars);
        }

        public static String findUniqueCharacters(String str) {
            // Create a HashMap to store the frequency of each character in the string.
            HashMap<Character, Integer> charFrequency = new HashMap<>();

            // Iterate through the string to count the occurrences of each character.
            for (char c : str.toCharArray()) {
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            }

            // Initialize an empty string to store the unique characters.
            StringBuilder uniqueChars = new StringBuilder();

            // Append characters with frequency 1 to the uniqueChars string.
            for (char c : str.toCharArray()) {
                if (charFrequency.get(c) == 1) {
                    uniqueChars.append(c);
                }
            }

            return uniqueChars.toString();
        }
    }


