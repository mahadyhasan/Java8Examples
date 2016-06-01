package pluralsight.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by mahady on 31/05/16.
 */


public class ReductionExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList();

        Optional<Integer> red =
                list.stream()
                        .reduce(Integer::max);

        System.out.println("red = " + red);

    }
}
