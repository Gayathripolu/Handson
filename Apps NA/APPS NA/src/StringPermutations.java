public class StringPermutations {

        public static void printPermutations(String str) {
            printPermutationsHelper(str, 0, str.length() - 1);
        }

        private static void printPermutationsHelper(String str, int left, int right) {
            if (left == right) {
                System.out.println(str);
            } else {
                for (int i = left; i <= right; i++) {
                    str = swap(str, left, i);
                    printPermutationsHelper(str, left + 1, right);
                    str = swap(str, left, i); // backtrack to original string
                }
            }
        }

        private static String swap(String str, int i, int j) {
            char[] charArray = str.toCharArray();
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            return String.valueOf(charArray);
        }

        public static void main(String[] args) {
            String input = "ABC";
            System.out.println("Permutations of the string " + input + ":");
            printPermutations(input);
        }
    }


