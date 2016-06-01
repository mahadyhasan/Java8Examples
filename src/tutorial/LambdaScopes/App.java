package tutorial.LambdaScopes;

/**
 * Created by mahady on 14/05/16.
 */
public class App {

    public static void main(String[] args) {

        /**
         * Accessing Local Variables
         */
        final int num = 1;
        Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);
        System.out.println(stringConverter.convert(2));



    }
}
