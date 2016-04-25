/**
 * @author kanteriv
 * @since 25/04/16.
 */
public class Venkat06 {

    public static int expensive(int a) {
        System.out.println("expensive");
        return a;
    }

    public static int evaluate(int a) {
        return a;
    }
    // lazy evaluations
    // David Wheller

    public static void main(String[] args) {

        int x = 4;
        Lazy<Integer> temp = new Lazy<>(() ->expensive(5));

        if(x > 5 && temp.get() > 1) {
            System.out.println("result 1");
        } else {
            System.out.println("result 2");
        }

    }

}
