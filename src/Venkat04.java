import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

/**
 * @author kanteriv
 * @since 25/04/16.
 */
public class Venkat04 {

    public void printSorted(List<Person> people, Comparator<Person> comparator) {
        people.stream()
                .sorted(comparator)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {


        List<Person> people = Arrays.asList(
                new Person("Sara", 12),
                new Person("Mark", 10),
                new Person("Bob", 12),
                new Person("Jill", 64)
        );

        new Venkat04().printSorted(people, comparing(Person::getName));
        new Venkat04().printSorted(people, comparing(Person::getAge).reversed().thenComparing(Person::getName));

    }

}
