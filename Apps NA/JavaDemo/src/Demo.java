import java.security.PublicKey;

@FunctionalInterface
interface  A
{
    void  show();

}
//class B implements A{
//    public void show(){
//        System.out.println("i can do it");
//    }
//}
public class Demo  {
    public static void main(String[] args) {
        A obj=() ->System.out.println("i am understanding");


        obj.show();

    }
}
