

import  java .lang.String;
public class String1 {
    public static void main(String[] args)

    {

//      String name = new String( "gayu");
//        String name ="gayu";
//      System.out.println("hello" +name);
//        System.out.println(name.hashCode());
//       System.out.println( name.charAt(index:0);
//        System.out.println( name.concat("Reddy"));


//        String mutable vs immutable
//        String name =" gAYU";
////         name = name + " reddy";
//     System.out.println( name);
//       String S1 = " GAYU";
//        String S2 = " GAYU";
//        System.out.println(S1== S2);
//        stringbuffer and stringbuilder


        StringBuffer sb= new StringBuffer("gayu");
//        System.out.println(sb.capacity());
//        System.out.println(sb.length());
//        sb.append("  reddy");
//        sb.deleteCharAt(2);(it is used to delete  char of give name by using index)
//      sb.insert(4,"java"); //(used to insert using index num)
//          sb.setLength(25);
     sb.ensureCapacity(100);
//        sb.substring(1,1);
        System.out.println(sb);
//        String str = sb.toString(); (it is used to convert string into stringbuffer by using toString()

    }
}
