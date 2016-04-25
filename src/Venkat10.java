import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author kanteriv
 * @since 25/04/16.
 */
public class Venkat10 {


    public static boolean isPrime(int number) {

        return number > 1 &&
                IntStream.range(2, number)
                        .noneMatch(i -> number % i == 0);
    }

    public static int compute(int n, int k, int p) {
//        int total = 0;
//        int index = n;
//        int count = 0;
//        while (count < k) {
//            if (isPrime(index)) {
//                total += index;
//                count++;
//            }
//            index++;
//        }
//        return total;
        return Stream.iterate(n, e -> e + 1)
                .filter(Venkat10::isPrime)
                .skip(p)
                .limit(k)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {

        // infinite stream
        Stream.iterate(1, e -> e + 1);

        // random numbers
        IntStream intStream = new Random().ints();
        System.out.println(intStream.findFirst());

        // given a number n and count k, find the total of all
        // the k prime numbers starting from n
        // not including the first p primes

        int n = 42;
        int k = 628;
        int p = 77;
        System.out.println(compute(n, k, p));


        Random random = new Random();

        random
                .ints()
                .limit(10)
                .forEach(System.out::println);

    }
}
