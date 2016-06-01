package tutorial.MethodAndConstructorReferences;

/**
 * Created by mahady on 14/05/16.
 */
@FunctionalInterface
public interface Converter<F, T> {

    T convert(F from);
}
