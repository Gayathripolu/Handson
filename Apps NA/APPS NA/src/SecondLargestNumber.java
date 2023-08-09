public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] numbers = { 10, 5, 20, 8, 15, 12, 25, 18 };

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest number in the array.");
        } else {
            System.out.println("The second largest number in the array is: " + secondLargest);
        }
    }
}

