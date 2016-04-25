import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author kanteriv
 * @since 25/04/16.
 */
public class Venkat08 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3);

        int[] factor = new int[]{2};


        Stream<Integer> stream = numbers
                .stream()
                .map(e -> e * factor[0]);

        factor[0] = 0; // DONT'T DO THIS!!!!

        stream.forEach(System.out::println);

    }


}
