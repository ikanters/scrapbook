import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author kanteriv
 * @since 25/04/16.
 */
public class Venkat09 {

    public static void main(String[] args) {

        // infinite stream
        Stream.iterate(1, e -> e + 1);

        // random numbers
        IntStream intStream = new Random().ints();
        System.out.println(intStream.findFirst());



    }


}
