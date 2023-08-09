public class StringReverseChecker {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "dcba";

        if (areStringsReverse(str1, str2)) {
            System.out.println("The strings are reverse of each other.");
        } else {
            System.out.println("The strings are not reverse of each other.");
        }
    }

 public static boolean areStringsReverse(String str1, String str2) {
        // Compare lengths first
        if (str1.length() != str2.length()) {
            return false;
        }

        // Iterate and compare characters
        int length = str1.length();
        for (int i = 0; i < length; i++) {
            if (str1.charAt(i) != str2.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}

