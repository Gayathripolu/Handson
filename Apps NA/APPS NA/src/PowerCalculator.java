
    public class PowerCalculator {
        public static void main(String[] args) {
            int base = 2;
            int exponent = 5;

            long result = calculatePower(base, exponent);
            System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        }

        public static long calculatePower(int base, int exponent) {
            // Initialize the result to 1 as any number raised to the power of 0 is 1.
            long result = 1;

            // If the exponent is negative, invert the base and exponent to calculate the result.
            boolean isNegativeExponent = exponent < 0;
            if (isNegativeExponent) {
                base = 1 / base;
                exponent = -exponent;
            }

            // Multiply the base with itself 'exponent' times.
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }

            return result;
        }
    }


