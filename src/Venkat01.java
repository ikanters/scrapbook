import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * @author kanteriv
 * @since 25/04/16.
 */
public class Venkat01 {


    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        IntStream.range(0,10)
                .forEach(i -> executorService.submit(() -> System.out.println("Running task " + i)));

        executorService.shutdown();
    }
}
