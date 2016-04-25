import java.util.stream.IntStream;

/**
 * @author kanteriv
 * @since 25/04/16.
 */
public class Venkat02 {


    public boolean isPrime(int number) {

        return number > 1 &&
                IntStream.range(2, number)
                        .noneMatch(i -> number % i == 0);

    }

    public static void main(String[] args) {

        Venkat02 venkat02 = new Venkat02();

        venkat02.isPrime(15);


    }
}
