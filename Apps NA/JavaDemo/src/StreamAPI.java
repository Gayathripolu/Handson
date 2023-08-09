import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(31,34,542,4,6,4);
        num.stream()
                .filter(n->n%2==0)
                .sorted()
                .forEach(n -> System.out.println(n));


//       int result= num.stream()
//                .filter(n->n%2==0)
//                .sorted()
//                .map(n->n*2)
//                .reduce(0,(a,b)->a+b);
//         System.out.println(result);
//                .map(n->n*2) .forEach(n -> System.out.println(n));
//         Stream<Integer>Sorteddata=data.sorted();
//        Stream<Integer> mappedDate=data.map(n->n*2);
//
//         mappedDate .forEach(n -> System.out.println(n));
//   for(int n:num){
//       System.out.println(n*2);
//   }
    }

    }
