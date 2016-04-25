import java.util.function.Consumer;

/**
 * @author kanteriv
 * @since 25/04/16.
 */
public class Resource {

    private Resource() {
        System.out.println("Created...");
    }

    public Resource opt1() {
        System.out.println("opt1");
        return this;
    }

    public Resource opt2() {
        System.out.println("opt2");
        return this;
    }

    private void close() {
        System.out.println("Clean up");
    }

    public static void use(Consumer<Resource> block) {
        Resource resource = new Resource();
        try {
            block.accept(resource);
        } finally {
            resource.close();
        }

    }
}
