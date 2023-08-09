import java.util.Scanner;

public class Stringrev {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter the reverse string word");
//       String str = sc.next();
        StringBuffer str1 =new StringBuffer("java");
        str1.reverse();
        String str2 =str1.toString();//convert stringbuffer to string

        System.out.println(str2.equals(str1));
        System.out.println(str2.charAt(2));
        System.out.println(str2.length());
        System.out.println(str2.substring(0,3));
        System.out.println(str1);

    }
}
