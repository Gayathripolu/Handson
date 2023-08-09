
    public class SmallestSum {

        public static int findSmallestSum(int[] nums) {
            int left = 0; // Left pointer
            int right = 0; // Right pointer
            int sum = nums[0]; // Current sum
            int minSum = nums[0]; // Minimum sum found so far

            // Iterate through the array from index 1
            for (right = 1; right < nums.length; right++) {
                // Update the sum by adding the value of the current element
                sum += nums[right];

                // Adjust the window and update the sum
                while (sum > minSum && left <= right) {
                    sum -= nums[left];
                    left++;
                }

                // Update the minimum sum
                if (sum <= minSum) {
                    minSum = sum;
                }
            }

            return minSum;
        }

        public static void main(String[] args) {
            int[] nums = {3, 1, 4, 2, 2, 1};
            int smallestSum = findSmallestSum(nums);
            System.out.println("Smallest sum of consecutive numbers: " + smallestSum);
        }
    }


