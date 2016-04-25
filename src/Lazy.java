import java.util.function.Supplier;

/**
 * @author kanteriv
 * @since 25/04/16.
 */
public class Lazy<T> {

    private T ref;
    private Supplier<T> supplier;

    public Lazy(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    T get() {
        if (ref == null) {
            ref = supplier.get();
        }
        return ref;
    }
}
