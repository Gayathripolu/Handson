//public class StrongNumber {
//    public static void main(String[] args) {
//        int number = 145;
//
//        if (isStrongNumber(number)) {
//            System.out.println(number + " is a Strong number.");
//        } else {
//            System.out.println(number + " is not a Strong number.");
//        }
//    }
//
//    public static boolean isStrongNumber(int num) {
//        int originalNumber = num;
//        int sumOfFactorials = 0;
//
//        while (num > 0) {
//            int digit = num % 10;
//            sumOfFactorials += factorial(digit);
//            num /= 10;
//        }
//
//        return sumOfFactorials == originalNumber;
//    }
//
//    public static int factorial(int n) {
//        if (n == 0) {
//            return 1;
//        }
//
//        int result = 1;
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//
//        return result;
//    }
//}
//
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;
        for (int i=0;i<10;i++){
            sum+=num;
        }
        System.out.println("sum of ten numbers :" +sum);
    }
}
