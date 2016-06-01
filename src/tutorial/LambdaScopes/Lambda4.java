package tutorial.LambdaScopes;

/**
 * Created by mahady on 14/05/16.
 */
public class Lambda4 {

    /**
     * Accessing fields and static variables
     */

    static int outerStaticNum;
    int outerNum;

    void testScopes() {
        Converter<Integer, String> stringConverter = (from) -> {
            outerNum = 23;
            return String.valueOf(from);
        };

        Converter<Integer, String> stringConverter1 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from);
        };
    }
}
