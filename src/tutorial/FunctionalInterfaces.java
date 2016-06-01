package tutorial;

import tutorial.MethodAndConstructorReferences.Converter;

/**
 * Created by mahady on 14/05/16.
 */
public class FunctionalInterfaces {

    public static void main(String[] args) {

        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);
    }
}
