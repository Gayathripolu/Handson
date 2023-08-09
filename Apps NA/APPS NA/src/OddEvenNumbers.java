public class OddEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = { 10, 5, 20, 8, 15, 12, 25, 18 };

        System.out.println("Even numbers:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\nOdd numbers:");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
