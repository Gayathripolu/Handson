
    import java.util.HashSet;
import java.util.Set;

    public class RemoveCharacters {
        public static String removeChars(String str1, String str2) {
            // Create a set of characters from the second string
            Set<Character> charSet = new HashSet<>();
            for (char c : str2.toCharArray()) {
                charSet.add(c);
            }

            // Build the new string without characters from the second string
            StringBuilder result = new StringBuilder();
            for (char c : str1.toCharArray()) {
                if (!charSet.contains(c)) {
                    result.append(c);
                }
            }

            return result.toString();
        }

        public static void main(String[] args) {
            String str1 = "Hello World";
            String str2 = "ldH";

            String result = removeChars(str1, str2);
            System.out.println(result); // Output: "eo Wor"
        }
    }


