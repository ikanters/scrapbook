import java.io.File;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author kanteriv
 * @since 25/04/16.
 */
public class Venkat03 {



    public static void main(String[] args) {

        File dir = new File("/opt");

        File[] childeren = dir.listFiles();

        if(childeren != null) {

            System.out.println(
                    Stream.of(childeren)
                    .map(File::getName)
                    .map(String::toUpperCase)
                    .collect(Collectors.joining(", ")));

        }
    }
}
