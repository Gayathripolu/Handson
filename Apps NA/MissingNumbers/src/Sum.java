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
