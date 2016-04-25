import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author kanteriv
 * @since 25/04/16.
 */
public class Venkat07 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9);

        Stream<Integer> func = func(numbers);

//        func.findFirst();
        func.findAny();

        System.out.println("DONE");

    }

    private static Stream<Integer> func(List<Integer> numbers) {
        return numbers
                .parallelStream()
                .filter(Venkat07::isGT3)
                .filter(Venkat07::isEven)
                .map(Venkat07::doubleIt);
    }

    private static int doubleIt(Integer e) {
        System.out.println("doubleIt is called: " + e);
        return e * 2;
    }

    private static boolean isEven(Integer e) {
        System.out.println("isEven is called: " + e);
        return e % 2 == 0;
    }

    private static boolean isGT3(Integer e) {
        System.out.println("isGT3 is called: " + e);
        return e > 3;
    }


}
