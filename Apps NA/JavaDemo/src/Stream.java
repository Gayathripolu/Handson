import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(31,34,542,4,6,4);
        num.stream()
                .filter(n->n%2==0)
                .sorted()
                .forEach(n->System.out.println(n));
    }
}
