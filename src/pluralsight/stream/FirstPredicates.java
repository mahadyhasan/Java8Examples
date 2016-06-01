package pluralsight.stream;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by mahady on 31/05/16.
 */
public class FirstPredicates {

    public static void main(String[] args) {


        Stream<String> stream = Stream.of("one", "two", "three", "four", "five");

        Predicate<String> p1 = s -> s.length() > 3;

        Predicate<String> p2 = Predicate.isEqual("two");

        Predicate<String> p3 = Predicate.isEqual("three");


        stream
                .filter(p2.or(p3)) //chaining
                .forEach(s -> System.out.println(s));

    }
}
