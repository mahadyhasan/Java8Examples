package tutorial.MethodAndConstructorReferences;

/**
 * Created by mahady on 14/05/16.
 */
public class MethodConstructorReferences {

    public static void main(String[] args) {

        Converter<String, Integer> converter = Integer::valueOf;
        Integer converted = converter.convert("123");
        System.out.println(converted);

        /**
         * How to reference object methods
         */
        Something something = new Something();
        Converter<String, String> converter1 = something::startsWith;
        String converted1 = converter1.convert("Java");
        System.out.println(converted1);

        /**
         * Demonstrate how the :: keyword works with constructors.
         * The Java compiler automatically chooses the right constructor by matching t
         * he signature of personFactory.create
         */
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");
    }
}
