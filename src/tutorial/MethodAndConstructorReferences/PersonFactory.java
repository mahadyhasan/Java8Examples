package tutorial.MethodAndConstructorReferences;

/**
 * Created by mahady on 14/05/16.
 */
public interface PersonFactory<P extends Person> {

    P create(String firstName, String lastName);
}
